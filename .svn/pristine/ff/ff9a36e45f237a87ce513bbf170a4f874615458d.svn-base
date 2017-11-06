package br.ifirst.cemec.operacoes;

import br.ifirst.cemec.connections.Conexao;
import br.ifirst.cemec.daos.DataDefinidaDao;
import br.ifirst.cemec.daos.MovTratamentoDao;
import br.ifirst.cemec.daos.TratamentoDao;
import br.ifirst.cemec.entidades.DataDefinida;
import br.ifirst.cemec.entidades.Tratamento;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Iagho
 */
public class DataDefinidaOperacao {

    public static boolean Salvar(Tratamento t) {
        boolean r = false;
        try {
            Connection c = Conexao.getConnection();

            DataDefinidaDao dataDefinidaDao = new DataDefinidaDao(c);

            dataDefinidaDao.excluirDatas(t.getCdTratamento());

            if (t.getDataDefinida() != null && t.getDataDefinida().size() > 0) {
                for (DataDefinida dat : t.getDataDefinida()) {
                    r = dataDefinidaDao.Salvar(dat);
                }
            }
            Conexao.setCommitTran();
        } catch (Exception ex) {
            Conexao.setRollbackTran();
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return r;
    }

    public static List<DataDefinida> Buscar(int cod) {
        List<DataDefinida> u = new ArrayList<DataDefinida>();
        try {
            Connection c = Conexao.getConnection();
            DataDefinidaDao ud = new DataDefinidaDao(c);

            u = ud.getDataDefinida(cod);
            Conexao.setCommitTran();

        } catch (Exception ex) {
            Conexao.setRollbackTran();
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return u;
    }

    public static List<DataDefinida> BuscarDatasTrat(int cd_mov) {
        List<DataDefinida> u = new ArrayList<DataDefinida>();
        try {
            Connection c = Conexao.getConnection();
            DataDefinidaDao ud = new DataDefinidaDao(c);

            u = ud.getDatasTratamento(cd_mov);
            Conexao.setCommitTran();

        } catch (Exception ex) {
            Conexao.setRollbackTran();
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return u;
    }

    public static boolean Buscar(Date date, int cdTrat) {
        boolean r = false;
        List<DataDefinida> u = new ArrayList<DataDefinida>();
        try {
            Connection c = Conexao.getConnection();
            DataDefinidaDao ud = new DataDefinidaDao(c);

            u = ud.getDatasTratamentoDate(date, cdTrat);
            Tratamento t = new Tratamento();
            t.setDataDefinida(u);
            
            if (t.getDataDefinida() != null && t.getDataDefinida().size() > 0) {
                for (DataDefinida dat : t.getDataDefinida()) {
                    r = ud.excluirDatasTrat(dat.getCdMov());
                }
            }
            TratamentoDao movDao = new TratamentoDao(c);
            if (t.getDataDefinida() != null && t.getDataDefinida().size() > 0) {
                for (DataDefinida dat : t.getDataDefinida()) {
                    r = movDao.excluirMovimento(dat.getCdMov());
                }
            }
            Conexao.setCommitTran();

        } catch (Exception ex) {
            Conexao.setRollbackTran();
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return r;
        
    }
}
