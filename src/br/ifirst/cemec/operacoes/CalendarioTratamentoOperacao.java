package br.ifirst.cemec.operacoes;

import br.ifirst.cemec.connections.Conexao;
import br.ifirst.cemec.daos.CalendarioTratamentoDao;
import br.ifirst.cemec.entidades.CalendarioTratamento;
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author Iagho
 */
public class CalendarioTratamentoOperacao {

    public static boolean Salvar(CalendarioTratamento ct) {
         boolean r = false;
        try {
            Connection c = Conexao.getConnection();

            CalendarioTratamentoDao calendarioTratamentoDao = new CalendarioTratamentoDao(c);

            r = calendarioTratamentoDao.Salvar(ct);

            Conexao.setCommitTran();
        } catch (Exception ex) {
            Conexao.setRollbackTran();
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return r;
    }

    public static boolean Alterar(CalendarioTratamento ct) {
        boolean r = false;
        try {
            Connection c = Conexao.getConnection();

            CalendarioTratamentoDao calendarioTratamentoDao = new CalendarioTratamentoDao(c);

            r = calendarioTratamentoDao.Alterar(ct);

            Conexao.setCommitTran();
        } catch (Exception ex) {
            Conexao.setRollbackTran();
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return r;
    }

    public static CalendarioTratamento ConferiTratamento(int cdTratamento) {
        CalendarioTratamento u = null;
        try {
            Connection c = Conexao.getConnection();
            CalendarioTratamentoDao calendarioTratamentoDao = new CalendarioTratamentoDao(c);

            u = calendarioTratamentoDao.ConferiTratamento(cdTratamento);

            Conexao.setCommitTran();

        } catch (Exception ex) {
            Conexao.setRollbackTran();
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }

        return u;
    }
}
