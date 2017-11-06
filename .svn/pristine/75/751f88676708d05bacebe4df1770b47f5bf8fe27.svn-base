package br.ifirst.cemec.daos;

import br.ifirst.cemec.connections.ObjetoDao;
import br.ifirst.cemec.entidades.Permissao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Iagho
 */
public class PermissaoDao extends ObjetoDao {

    public PermissaoDao(Connection conexao) {
        super(conexao);
    }

    public boolean Salvar(Permissao permi) {
        PreparedStatement ps = null;
        boolean result = false;
        try {
            ps = conexao.prepareStatement("INSERT INTO permissoes_usu(cd_per, cd_usu, visul, incluir, alterar, excluir) "
                    + "VALUES (?, ?, ?, ?, ?, ?)");

            ps.setInt(1, permi.getCdPer());
            ps.setInt(2, permi.getCdUsu());
            ps.setInt(3, permi.isVisul() == true ? 1 : 0);
            ps.setInt(4, permi.isIncluir() == true ? 1 : 0);
            ps.setInt(5, permi.isAlter() == true ? 1 : 0);
            ps.setInt(6, permi.isExcluir() == true ? 1 : 0);

            result = ps.execute();


        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            fecharCursores(null, ps);
        }

        return result;

    }

    public Permissao ReturnPermi(int cod, int cdUsu) {
        ResultSet rs = null;
        PreparedStatement ps = null;
        Permissao c = null;

        try {

            ps = conexao.prepareStatement("select * from permissoes_usu where cd_per = ? and cd_usu =?");

            ps.setInt(1, cod);
            ps.setInt(2, cdUsu);

            rs = ps.executeQuery();

            c = setObjetoPermi(rs);

        } catch (SQLException ex) {
        } finally {
            fecharCursores(rs, ps);
        }

        return c;
    }

    private Permissao setObjetoPermi(ResultSet rs) throws SQLException {
        Permissao m = null;
        if (rs.next()) {
            m = new Permissao();
            m.setCdUsu(rs.getInt("cd_usu"));
            m.setVisul(rs.getInt("visul") == 1 ? true : false);
            m.setIncluir(rs.getInt("incluir") == 1 ? true : false);
            m.setAlter(rs.getInt("alterar") == 1 ? true : false);
            m.setAlter(rs.getInt("excluir") == 1 ? true : false);
        }

        return m;
    }

    public List<Permissao> buscPermi(int cod) throws SQLException {

        String sql = "select permissoes_telas.cd_per, permissoes_telas.descricao, coalesce(permissoes_usu.cd_usu, ?), coalesce(visul, 0) as visul, "
                + "coalesce(incluir, 0) as incluir, coalesce(alterar, 0) as alterar, coalesce(excluir,0) as excluir  from permissoes_telas "
                + "left join permissoes_usu on permissoes_usu.cd_per = permissoes_telas.cd_per and permissoes_usu.cd_usu = ?";

        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setInt(1, cod);
        stmt.setInt(2, cod);
        ResultSet rs = stmt.executeQuery();

        List<Permissao> permiList = new ArrayList<Permissao>();

        while (rs.next()) {
            Permissao permi = new Permissao();

            permi.setCdPer(rs.getInt("cd_per"));
            permi.setDescricao(rs.getString("descricao"));
            permi.setVisul(rs.getInt("visul") == 1 ? true : false);
            permi.setIncluir(rs.getInt("incluir") == 1 ? true : false);
            permi.setAlter(rs.getInt("alterar") == 1 ? true : false);
            permi.setExcluir(rs.getInt("excluir") == 1 ? true : false);
            permiList.add(permi);
        }

        rs.close();
        stmt.close();

        return permiList;
    }

    public Permissao ValidarPermi(int cdUsu, int cdPer) {
        ResultSet rs = null;

        PreparedStatement ps = null;
        Permissao u = null;
        try {

            ps = conexao.prepareStatement("select * from permissoes_usu where cd_usu = ? and cd_per = ?");

            ps.setInt(1, cdUsu);
            ps.setInt(2, cdPer);

            rs = ps.executeQuery();

            u = ValidarVisulTelas(rs);

        } catch (SQLException ex) {
        } finally {
            fecharCursores(rs, ps);
        }

        return u;

    }

    private Permissao ValidarVisulTelas(ResultSet rs) throws SQLException {

        Permissao u = null;

        if (rs.next()) {
            u = new Permissao();

            u.setVisul(rs.getInt("visul") == 1 ? true : false);
            u.setIncluir(rs.getInt("incluir") == 1 ? true : false);
            u.setAlter(rs.getInt("alterar") == 1 ? true : false);
            u.setExcluir(rs.getInt("excluir") == 1 ? true : false);

        }
        return u;
    }

    public boolean excluirPermissoes(int codigoUsu) {
        PreparedStatement ps = null;
        boolean result = false;
        try {

            ps = conexao.prepareStatement("DELETE from permissoes_usu WHERE cd_usu = ?");

            ps.setInt(1, codigoUsu);

            result = ps.execute();


        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao deletar!");
            ex.printStackTrace();
        } finally {
            fecharCursores(null, ps);
        }

        return result;
    
    }
}