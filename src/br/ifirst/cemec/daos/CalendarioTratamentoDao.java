package br.ifirst.cemec.daos;

import br.ifirst.cemec.connections.ObjetoDao;
import br.ifirst.cemec.entidades.CalendarioTratamento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Iagho
 */
public class CalendarioTratamentoDao extends ObjetoDao {

    public CalendarioTratamentoDao(Connection conexao) {
        super(conexao);
    }

    public boolean Salvar(CalendarioTratamento ct) {
        PreparedStatement ps = null;
        boolean result = false;
        try {
            ps = conexao.prepareStatement("INSERT INTO calendar_tratamento(cd_tratamento, dt_ini, dt_fin, segunda, terca, quarta, quinta, sexta, "
                    + "sabado, domingo, todos_dias) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            ps.setInt(1, ct.getCdTratamento());
            ps.setDate(2, super.toSqlDate(ct.getDtIni()));
            ps.setDate(3, super.toSqlDate(ct.getDtFin()));
            ps.setInt(4, ct.getSeg());
            ps.setInt(5, ct.getTer());
            ps.setInt(6, ct.getQua());
            ps.setInt(7, ct.getQui());
            ps.setInt(8, ct.getSex());
            ps.setInt(9, ct.getSab());
            ps.setInt(10, ct.getDom());
            ps.setInt(11, ct.getTodosDias());

            result = ps.execute();


        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            fecharCursores(null, ps);
        }

        return result;
    }

    public boolean Alterar(CalendarioTratamento ct) {
        PreparedStatement ps = null;
        boolean result = false;
        try {

            ps = conexao.prepareStatement("UPDATE calendar_tratamento SET dt_ini=?, dt_fin=?, segunda=?, terca=?, quarta=?, "
                    + " quinta=?, sexta=?, sabado=?, domingo=?, todos_dias=? WHERE cd_tratamento=?");

            ps.setDate(1, super.toSqlDate(ct.getDtIni()));
            ps.setDate(2, super.toSqlDate(ct.getDtFin()));
            ps.setInt(3, ct.getSeg());
            ps.setInt(4, ct.getTer());
            ps.setInt(5, ct.getQua());
            ps.setInt(6, ct.getQui());
            ps.setInt(7, ct.getSex());
            ps.setInt(8, ct.getSab());
            ps.setInt(9, ct.getDom());
            ps.setInt(10, ct.getTodosDias());
            ps.setInt(11, ct.getCdTratamento());

            result = ps.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            fecharCursores(null, ps);
        }

        return result;
    }

    public CalendarioTratamento ConferiTratamento(int cdTratamento) {
        ResultSet rs = null;

        PreparedStatement ps = null;
        CalendarioTratamento u = null;
        try {

            ps = conexao.prepareStatement("SELECT * FROM calendar_tratamento where cd_tratamento = ?");

            ps.setInt(1, cdTratamento);

            rs = ps.executeQuery();

            u = setObjetoCalendarioTratamento(rs);

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            fecharCursores(rs, ps);
        }
        return u;
    }

    private CalendarioTratamento setObjetoCalendarioTratamento(ResultSet rs) throws SQLException {
        CalendarioTratamento u = null;
        if (rs.next()) {
            u = new CalendarioTratamento();
            u.setCdTratamento(rs.getInt("cd_tratamento"));
            u.setDtIni(rs.getDate("dt_ini"));
            u.setDtFin(rs.getDate("dt_fin"));
            u.setSeg(rs.getInt("segunda"));
            u.setTer(rs.getInt("terca"));
            u.setQua(rs.getInt("quarta"));
            u.setQui(rs.getInt("quinta"));
            u.setSex(rs.getInt("sexta"));
            u.setSab(rs.getInt("sabado"));
            u.setDom(rs.getInt("domingo"));
            u.setTodosDias(rs.getInt("todos_dias"));
        }
        return u;
    }
}
