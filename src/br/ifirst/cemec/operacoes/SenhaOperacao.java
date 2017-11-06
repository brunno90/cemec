package br.ifirst.cemec.operacoes;

import br.ifirst.cemec.connections.Conexao;
import br.ifirst.cemec.daos.SenhaDao;
import br.ifirst.cemec.entidades.Senha;
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author Iagho
 */
public class SenhaOperacao {

    public static boolean Salvar(Senha s) {
        boolean r = false;
        Senha u = null;
        try {
            Connection c = Conexao.getConnection();

            SenhaDao senhaDao = new SenhaDao(c);
            r = senhaDao.Salvar(s);
            Conexao.setCommitTran();
        } catch (Exception ex) {
            Conexao.setRollbackTran();
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return r;
    }

    public static boolean Update(Senha s) {
        boolean r = false;
        Senha u = null;
        try {
            Connection c = Conexao.getConnection();

            SenhaDao senhaDao = new SenhaDao(c);
            r = senhaDao.Update(s);
            Conexao.setCommitTran();
        } catch (Exception ex) {
            Conexao.setRollbackTran();
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return r;
    }

    public static Senha buscarSenha(int cdTrat, int pref) {
        Senha u = null;
        try {
            Connection c = Conexao.getConnection();
            SenhaDao senhaDao = new SenhaDao(c);

            u = senhaDao.getSenha(cdTrat, pref);
            Conexao.setCommitTran();

        } catch (Exception ex) {
            Conexao.setRollbackTran();
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return u;
    }

    public static boolean SalvarSenhaMov(Senha s) {
        boolean r = false;
        try {
            Connection c = Conexao.getConnection();

            SenhaDao senhaDao = new SenhaDao(c);
            r = senhaDao.SalvarSenhaMov(s);
            Conexao.setCommitTran();
        } catch (Exception ex) {
            Conexao.setRollbackTran();
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return r;
    }
}