package br.ifirst.cemec.daos;

import br.ifirst.cemec.connections.ObjetoDao;
import br.ifirst.cemec.entidades.DataDefinida;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Iagho
 */
public class DataDefinidaDao extends ObjetoDao {

    public DataDefinidaDao(Connection conexao) {
        super(conexao);
    }

    public boolean Salvar(DataDefinida t) {
        PreparedStatement ps = null;
        boolean result = false;
        try {

            ps = conexao.prepareStatement("INSERT INTO datas_definidas(cd_trat, data) VALUES (?, ?)");

            ps.setInt(1, t.getCdTrat());
            ps.setDate(2, super.toSqlDate(t.getData()));

            result = ps.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            fecharCursores(null, ps);
        }

        return result;
    }

    public boolean excluirDatas(int codigo) {

        PreparedStatement ps = null;
        boolean excluir = false;
        try {
            ps = conexao.prepareStatement("DELETE FROM datas_definidas WHERE cd_trat = ?");

            ps.setInt(1, codigo);

            excluir = ps.execute();


        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            fecharCursores(null, ps);
        }

        return excluir;
    }

    public boolean excluirDatasTrat(int cdMov) {

        PreparedStatement ps = null;
        boolean excluir = false;
        try {
            ps = conexao.prepareStatement("DELETE FROM datas_tratamento WHERE cd_mov = ?");

            ps.setInt(1, cdMov);

            excluir = ps.execute();


        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            fecharCursores(null, ps);
        }

        return excluir;
    }

    public List<DataDefinida> getDataDefinida(int cod) throws SQLException {
        PreparedStatement ps = null;
        ResultSet resultSet = null;

        try {
            ps = conexao.prepareStatement("select * from datas_definidas where cd_trat = ?");

            ps.setInt(1, cod);

            resultSet = ps.executeQuery();

            return setObjetoDataDefinida(resultSet);

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            super.fecharCursores(resultSet, ps);
        }
        return setObjetoDataDefinida(resultSet);
    }

    private List<DataDefinida> setObjetoDataDefinida(ResultSet rs) throws SQLException {

        List<DataDefinida> datas = new ArrayList<DataDefinida>();
        while (rs.next()) {
            DataDefinida u = new DataDefinida();
            u.setCdTrat(rs.getInt("cd_trat"));
            u.setData(rs.getDate("data"));
            u.setCdCtr(rs.getInt("cd_ctr"));

            datas.add(u);
        }
        return datas;
    }

    public boolean SalvarDatasTratamento(DataDefinida t) {
        PreparedStatement ps = null;
        boolean result = false;
        try {

            ps = conexao.prepareStatement("INSERT INTO datas_tratamento(cd_freq, cd_trat, data, cd_mov, presenca) VALUES (?, ?, ?, ?, ?)");

            ps.setInt(1, t.getCdFreq());
            ps.setInt(2, t.getCdTrat());
            ps.setDate(3, super.toSqlDate(t.getData()));
            ps.setInt(4, t.getCdMov());
            ps.setInt(5, t.getPresenca());

            result = ps.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            fecharCursores(null, ps);
        }

        return result;
    }

    public boolean excluirDatasTratamento(int codigo) {

        PreparedStatement ps = null;
        boolean excluir = false;
        try {
            ps = conexao.prepareStatement("DELETE FROM datas_tratamento WHERE cd_trat = ?");

            ps.setInt(1, codigo);

            excluir = ps.execute();


        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            fecharCursores(null, ps);
        }

        return excluir;
    }

    public List<DataDefinida> getDatasTratamento(int cdMov) throws SQLException {
        PreparedStatement ps = null;
        ResultSet resultSet = null;

        try {
            ps = conexao.prepareStatement("select * from datas_tratamento where cd_mov = ? order by data");

            ps.setInt(1, cdMov);

            resultSet = ps.executeQuery();

            return setObjetoDatasTratamento(resultSet);

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            super.fecharCursores(resultSet, ps);
        }
        return setObjetoDataDefinida(resultSet);
    }

    private List<DataDefinida> setObjetoDatasTratamento(ResultSet rs) throws SQLException {

        List<DataDefinida> datas = new ArrayList<DataDefinida>();
        while (rs.next()) {
            DataDefinida u = new DataDefinida();
            u.setCdFreq(rs.getInt("cd_freq"));
            u.setData(rs.getDate("data"));
            u.setCdTrat(rs.getInt("cd_trat"));
            u.setCdMov(rs.getInt("cd_mov"));

            datas.add(u);
        }
        return datas;
    }

    public List<DataDefinida> getDatasTratamentoDate(Date date, int cdTrat) throws SQLException {
        PreparedStatement ps = null;
        ResultSet resultSet = null;

        try {
            ps = conexao.prepareStatement("select * from mov_tratamento where dt_final <= ? and tp_periodo != 7 and cd_trat = ?");

            ps.setDate(1, super.toSqlDate(date));
            ps.setInt(2, cdTrat);

            resultSet = ps.executeQuery();

            return getDatasTratamentoDate(resultSet);

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            super.fecharCursores(resultSet, ps);
        }
        return setObjetoDataDefinida(resultSet);
    }

    private List<DataDefinida> getDatasTratamentoDate(ResultSet rs) throws SQLException {

        List<DataDefinida> datas = new ArrayList<DataDefinida>();
        while (rs.next()) {
            DataDefinida u = new DataDefinida();
            u.setCdMov(rs.getInt("cd_mov"));

            datas.add(u);
        }
        return datas;
    }
}
