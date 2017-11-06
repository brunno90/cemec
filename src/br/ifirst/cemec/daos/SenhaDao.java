package br.ifirst.cemec.daos;

import br.ifirst.cemec.connections.ObjetoDao;
import br.ifirst.cemec.entidades.Senha;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Iagho
 */
public class SenhaDao extends ObjetoDao {

    public SenhaDao(Connection conexao) {
        super(conexao);
    }

    public boolean Salvar(Senha s) {
        PreparedStatement ps = null;
        boolean result = false;
        try {
            ps = conexao.prepareStatement("INSERT INTO senha(cd_trat, nr_senha, preferencial) VALUES (?, ?, ?)");

            ps.setInt(1, s.getCdTrat());
            ps.setInt(2, s.getSenha());
            ps.setInt(3, s.getPreferencial());
            result = ps.execute();

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            fecharCursores(null, ps);
        }
        return result;
    }

    public boolean Update(Senha s) {
        PreparedStatement ps = null;
        boolean result = false;
        try {
            ps = conexao.prepareStatement("UPDATE senha SET nr_senha=? WHERE cd_trat=? and preferencial=?");

            ps.setInt(1, s.getSenha());
            ps.setInt(2, s.getCdTrat());
            ps.setInt(3, s.getPreferencial());
            result = ps.execute();

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            fecharCursores(null, ps);
        }
        return result;
    }

    public Senha getSenha(int cdTrat, int pref) {
        ResultSet rs = null;

        PreparedStatement ps = null;
        Senha u = null;
        try {

            ps = conexao.prepareStatement("select * from senha where cd_trat = ? and preferencial = ?");

            ps.setInt(1, cdTrat);
            ps.setInt(2, pref);

            rs = ps.executeQuery();

            u = setObjetoSenha(rs);

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            fecharCursores(rs, ps);
        }
        return u;
    }

    private Senha setObjetoSenha(ResultSet rs) throws SQLException {
        Senha u = null;
        if (rs.next()) {
            u = new Senha();
            u.setCdTrat(rs.getInt("cd_trat"));
            u.setSenha(rs.getInt("nr_senha"));
            u.setPreferencial(rs.getInt("preferencial"));
        }
        return u;
    }

    public boolean SalvarSenhaMov(Senha s) {
        PreparedStatement ps = null;
        boolean result = false;
        try {
            ps = conexao.prepareStatement("UPDATE datas_tratamento SET presenca=?, senha=?, preferencial=? WHERE data=? and cd_mov=?");

            ps.setInt(1, s.getPresenca());
            ps.setInt(2, s.getSenha());
            ps.setInt(3, s.getPreferencial());
            ps.setDate(4, super.toSqlDate(s.getData()));
            ps.setInt(5, s.getCdMov());
            result = ps.execute();

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            fecharCursores(null, ps);
        }
        return result;
    }
}
