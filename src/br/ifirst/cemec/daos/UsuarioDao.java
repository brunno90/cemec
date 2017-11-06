package br.ifirst.cemec.daos;

import br.ifirst.cemec.connections.ObjetoDao;
import br.ifirst.cemec.entidades.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Iagho
 */
public class UsuarioDao extends ObjetoDao {

    public UsuarioDao(Connection conexao) {
        super(conexao);
    }

    private String Crypt(String senha) {
        char aux[];
        int g = 0;
        int X1 = 0;
        int salasana = 0;
        int sana = 0;
        String resultado = "";

        for (int tt = 1; senha.length() >= tt; tt++) {

            aux = senha.substring(tt - 1, tt).toCharArray();
            sana = aux[0];

            g = g + 1;
            if (g == 6) {
                g = 0;
            }
            X1 = 0;
            if (g == 0) {
                X1 = sana - (salasana - 2);
            }
            if (g == 1) {
                X1 = sana + (salasana - 5);
            }
            if (g == 2) {
                X1 = sana - (salasana - 4);
            }
            if (g == 3) {
                X1 = sana + (salasana - 2);
            }
            if (g == 4) {
                X1 = sana - (salasana - 3);
            }
            if (g == 5) {
                X1 = sana + (salasana - 5);
            }

            X1 = X1 + g;
            resultado = resultado + (char) X1;

        }

        return resultado;
    }

    public String DeCrypt(String senha) {
        char aux[];
        int sana = 0;
        int salasana = 0;
        int G = 0;
        int X1 = 0;
        String resultado = "";

        for (int tt = 1; senha.length() >= tt; tt++) {
            aux = senha.substring(tt - 1, tt).toCharArray();
            sana = aux[0];
            G = G + 1;

            if (G == 6) {
                G = 0;
            }
            X1 = 0;
            if (G == 0) {
                X1 = sana + (salasana - 2);
            } else if (G == 1) {
                X1 = sana - (salasana - 5);
            } else if (G == 2) {
                X1 = sana + (salasana - 4);
            } else if (G == 3) {
                X1 = sana - (salasana - 2);
            } else if (G == 4) {
                X1 = sana + (salasana - 3);
            } else if (G == 5) {
                X1 = sana - (salasana - 5);
            }

            X1 = X1 - G;
            resultado = resultado + (char) X1;
        }

        return resultado;
    }

    public int nextUsuario() {
        Connection connection = null;
        StringBuffer sql = null;
        PreparedStatement pstmt = null;
        ResultSet resultSet = null;
        int cod;

        try {
            connection = this.conexao;

            sql = new StringBuffer();
            sql.append(" SELECT coalesce( Max(cd_usu), 0) + 1 as ultcod FROM usuario ");

            pstmt = connection.prepareStatement(sql.toString());
            resultSet = pstmt.executeQuery();

            cod = resultSet.next() ? resultSet.getInt("ultcod") : 1;
            return cod;

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            super.fecharCursores(resultSet, pstmt);
        }
        return 0;
    }

    public int Salvar(Usuario usuario) {

        PreparedStatement ps = null;
        boolean result = false;
        try {
            ps = conexao.prepareStatement("INSERT INTO usuario(cd_usu, nm_usu, email, senha, situacao, cargo, dt_cad) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?)");

            usuario.setCodigoUsu(nextUsuario());

            ps.setInt(1, usuario.getCodigoUsu());
            ps.setString(2, usuario.getNmUsu());
            ps.setString(3, usuario.getEmail());
            ps.setString(4, Crypt(usuario.getSenha()));
            ps.setInt(5, usuario.getSituacao());
            ps.setInt(6, usuario.getCargo());
            ps.setDate(7, usuario.getDtCad());

            result = ps.execute();


        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            fecharCursores(null, ps);
        }

        return usuario.getCodigoUsu();

    }

    public boolean isUsuarioLogin(Usuario usuario) {
        ResultSet rs = null;

        PreparedStatement ps = null;
        try {

            ps = conexao.prepareStatement("SELECT * FROM usuario WHERE cd_usu = ? AND senha= ?");

            ps.setLong(1, usuario.getId());
            ps.setString(2, Crypt(usuario.getSenha()));

            rs = ps.executeQuery();

            return rs.next();

        } catch (SQLException ex) {
        } finally {
            fecharCursores(rs, ps);
        }

        return false;
    }

    public Usuario getUsurioById(int id) {
        ResultSet rs = null;

        PreparedStatement ps = null;
        Usuario u = null;
        try {

            ps = conexao.prepareStatement("select * from usuario where cd_usu = ?");

            ps.setLong(1, id);

            rs = ps.executeQuery();

            u = setObjetoUsuario(rs);

        } catch (SQLException ex) {
        } finally {
            fecharCursores(rs, ps);
        }

        return u;

    }

    private Usuario setObjetoUsuario(ResultSet rs) throws SQLException {
        Usuario u = null;
        if (rs.next()) {
            u = new Usuario();
            u.setCodigoUsu(rs.getInt("cd_usu"));
            u.setNmUsu(rs.getString("nm_usu"));
            u.setCargo(rs.getInt("cargo"));
            u.setSituacao(rs.getInt("situacao"));
            u.setEmail(rs.getString("email"));
            u.setSenha(DeCrypt(rs.getString("senha")));
            u.setDtCad(rs.getDate("dt_cad"));
        }

        return u;
    }

    public Usuario PesquisaUsuario(int CodUsuario) throws Exception {

        Connection c = conexao;
        ResultSet rs = null;
        PreparedStatement ps;
        Usuario usuario = new Usuario();

        try {
            ps = conexao.prepareStatement("SELECT * FROM glb_usu where cd_usu = ?");
            ps.setInt(1, CodUsuario);

            rs = ps.executeQuery();

            if (rs.next()) {
                usuario.setId(rs.getInt("cd_usu"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return usuario;
    }

    public List<Usuario> PesquisarUsuarios(int campo, Object valor) throws SQLException {
        List<String> campos = new ArrayList<String>();
        campos.add("nm_usu");
        campos.add("email");

        String sql = "select * from usuario where " + campos.get(campo) + " ilike '" + valor + "%' order by 1";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();

        List<Usuario> usuarioList = new ArrayList<Usuario>();

        while (rs.next()) {
            Usuario usuario = new Usuario();
            usuario.setCodigoUsu(rs.getInt("cd_usu"));
            usuario.setNmUsu(rs.getString("nm_usu"));
            usuario.setSituacao(rs.getInt("situacao"));
            usuario.setEmail(rs.getString("email"));
            usuario.setSenha(DeCrypt(rs.getString("senha")));
            usuario.setSenha(rs.getString("senha"));
            usuario.setDtCad(rs.getDate("dt_cad"));
            usuarioList.add(usuario);
        }

        rs.close();
        stmt.close();

        return usuarioList;
    }

    public boolean UpdateUsu(Usuario u) {
        PreparedStatement ps = null;
        boolean result = false;
        try {
            ps = conexao.prepareStatement("UPDATE usuario SET nm_usu=?, email=?, senha=?, situacao=?, cargo=? WHERE cd_usu=?");

            ps.setString(1, u.getNmUsu());
            ps.setString(2, u.getEmail());
            ps.setString(3, Crypt(u.getSenha()));
            ps.setInt(4, u.getSituacao());
            ps.setInt(5, u.getCargo());
            ps.setInt(6, u.getCodigoUsu());

            result = ps.execute();


        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            fecharCursores(null, ps);
        }

        return result;
    }
//    public List<Usuario> buscaUsu() throws SQLException {
//
//
//        String sql = "select * from glb_usu where ";
//        PreparedStatement stmt = conexao.prepareStatement(sql);
//
//        ResultSet rs = stmt.executeQuery();
//
//        List<Usuario> consultarList = new ArrayList<Usuario>();
//
//        while (rs.next()) {
//            Usuario usuario = new Usuario();
//
//            usuario.setCodigoUsu(rs.getInt("cd_usu"));
//            usuario.setNmUsu(rs.getString("nm_usu"));
//            usuario.setSituacao(rs.getString("situacao"));
//
//
//            consultarList.add(usuario);
//        }
//        rs.close();
//        stmt.close();
//
//        return consultarList;
//    }
}
