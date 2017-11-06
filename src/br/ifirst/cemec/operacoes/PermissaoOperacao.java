package br.ifirst.cemec.operacoes;

import br.ifirst.cemec.connections.Conexao;
import br.ifirst.cemec.daos.PermissaoDao;
import br.ifirst.cemec.entidades.Permissao;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Iagho
 */
public class PermissaoOperacao {

    public static boolean add(Permissao permi) {
        boolean r = false;
        try {
            Connection c = Conexao.getConnection();

            PermissaoDao permiDao = new PermissaoDao(c);

            r = permiDao.Salvar(permi);

            Conexao.setCommitTran();

        } catch (Exception ex) {
            Conexao.setRollbackTran();
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }
        return r;
    }

    public static Permissao ReturnPermi(int cod, int cdUsu) {
        Permissao u = null;
        try {
            Connection c = Conexao.getConnection();
            PermissaoDao ud = new PermissaoDao(c);

            u = ud.ReturnPermi(cod, cdUsu);

            Conexao.setCommitTran();

        } catch (Exception ex) {
            Conexao.setRollbackTran();
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }

        return u;
    }

    public static List<Permissao> buscPermi(int cod) {
        List<Permissao> permi = new ArrayList<Permissao>();
        try {
            Connection c = Conexao.getConnection();

            PermissaoDao permiDao = new PermissaoDao(c);

            permi = permiDao.buscPermi(cod);

            Conexao.setCommitTran();

        } catch (Exception ex) {
            Conexao.setRollbackTran();
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }

        return permi;
    }


    public static Permissao ValidarPermi(int cdUsu, int cdPer) {
        Permissao u = null;
        try {
            Connection c = Conexao.getConnection();
            PermissaoDao ud = new PermissaoDao(c);

            u = ud.ValidarPermi(cdUsu, cdPer);

            Conexao.setCommitTran();

        } catch (Exception ex) {
            Conexao.setRollbackTran();
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }

        return u;
    }
}
