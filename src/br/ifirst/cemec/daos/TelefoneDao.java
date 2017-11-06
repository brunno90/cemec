package br.ifirst.cemec.daos;

import br.ifirst.cemec.connections.ObjetoDao;
import br.ifirst.cemec.entidades.Telefone;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Iagho
 */
public class TelefoneDao extends ObjetoDao {

    public TelefoneDao(Connection conexao) {
        super(conexao);
    }

    public boolean addTelefone(Telefone telefone) {
        PreparedStatement ps = null;
        boolean result = false;
        try {

            ps = conexao.prepareStatement("INSERT INTO telefone(tp_pessoa, cd_pessoa, tp_tel, ddd, fone ) "
                    + " VALUES (?, ?, ?, ?, ?)");


            ps.setInt(1, telefone.getTipoPessoa());
            ps.setInt(2, telefone.getCodigoPessoa());
            ps.setString(3, telefone.getTipoTelefone());
            ps.setString(4, telefone.getDdd());
            ps.setString(5, telefone.getTelefone());

            result = ps.execute();


        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            fecharCursores(null, ps);
        }

        return result;
    }

    public Collection<Telefone> getTelefones(int codPessoa, int tipoPessoa) throws SQLException {

        Collection<Telefone> telefones = null;
        PreparedStatement ps = null;
        StringBuilder sql = null;

        try {

            sql = new StringBuilder("SELECT * FROM telefone WHERE tp_pessoa = ? AND cd_pessoa = ?");

            PreparedStatement stmt = conexao.prepareStatement(sql.toString());
            stmt.setInt(1, tipoPessoa);
            stmt.setInt(2, codPessoa);

            ResultSet rs = stmt.executeQuery();

            telefones = new ArrayList<Telefone>();

            while (rs.next()) {
                Telefone fone = new Telefone();
                fone.setTipoPessoa(rs.getInt("tp_pessoa"));
                fone.setCodigoPessoa(rs.getInt("cd_pessoa"));
                fone.setTipoTelefone(rs.getString("tp_tel"));
                fone.setDdd(rs.getString("ddd"));
                fone.setTelefone(rs.getString("fone"));
                telefones.add(fone);
            }

            return telefones;

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            fecharCursores(null, ps);
        }

        return telefones;

    }

    public void alterarTelefone(int cdPessoa, int tipoPessoa, List<Telefone> telefones) throws SQLException {

        excluirTelefone(cdPessoa, tipoPessoa);

        if (telefones != null && telefones.size() > 0) {
            for (Telefone tel : telefones) {
                tel.setCodigoPessoa(cdPessoa);
                addTelefone(tel);
            }
        }

    }

    public boolean excluirTelefone(int cdPessoa, int tipoPessoa) {
        PreparedStatement ps = null;
        boolean result = false;
        try {

            ps = conexao.prepareStatement("DELETE from telefone WHERE cd_pessoa = ? AND tp_pessoa = ?");


            ps.setInt(1, cdPessoa);
            ps.setInt(2, tipoPessoa);

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
