package br.ifirst.cemec.operacoes;

import br.ifirst.cemec.connections.Conexao;
import br.ifirst.cemec.daos.FrequentadorDao;
import br.ifirst.cemec.daos.TelefoneDao;
import br.ifirst.cemec.entidades.Frequentador;
import br.ifirst.cemec.entidades.Telefone;
import br.ifirst.cemec.entidades.Tratamento;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Iagho
 */
public class FrequentadorOperacao {

    public static int Salvar(Frequentador frequentador) {
        int r = 0;
        Frequentador u = null;
        try {
            Connection c = Conexao.getConnection();

            FrequentadorDao frequentadorDao = new FrequentadorDao(c);
            r = frequentadorDao.Salvar(frequentador);
            TelefoneDao telDao = new TelefoneDao(c);

            if (r > 0) {
                for (Telefone tel : frequentador.getTelefones()) {
                    tel.setCodigoPessoa(r);
                    telDao.addTelefone(tel);
                }
            }
            Conexao.setCommitTran();
        } catch (Exception ex) {
            Conexao.setRollbackTran();
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return r;
    }

    public static boolean Alterar(Frequentador frequentador) {
        boolean r = false;
        try {
            Connection c = Conexao.getConnection();

            FrequentadorDao frequentadorDao = new FrequentadorDao(c);

            r = frequentadorDao.Alterar(frequentador);

            TelefoneDao foneDao = new TelefoneDao(c);
            foneDao.excluirTelefone(frequentador.getCdFrequentador(), 1);

            if (frequentador.getTelefones() != null && frequentador.getTelefones().size() > 0) {
                for (Telefone tel : frequentador.getTelefones()) {
                    tel.setCodigoPessoa(frequentador.getCdFrequentador());
                    foneDao.addTelefone(tel);
                }
            }
            Conexao.setCommitTran();
        } catch (Exception ex) {
            Conexao.setRollbackTran();
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return r;
    }

    public static Frequentador getFrequentador(int cdFreq) {
        Frequentador u = null;
        try {
            Connection c = Conexao.getConnection();
            FrequentadorDao ud = new FrequentadorDao(c);

            u = ud.getFrequentadorCod(cdFreq);

            TelefoneDao foneDao = new TelefoneDao(c);
            List<Telefone> telefones = new ArrayList<Telefone>(foneDao.getTelefones(u.getCdFrequentador(), 1));
            if (telefones != null && telefones.size() > 0) {
                u.setTelefones(telefones);
            }
            List<Tratamento> t = new ArrayList<Tratamento>(ud.getMovTratamentos(u.getCdFrequentador()));
            if (t != null && t.size() > 0) {
                u.setTratamentos(t);
            }
            Conexao.setCommitTran();

        } catch (Exception ex) {
            Conexao.setRollbackTran();
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }

        return u;
    }

    public static Frequentador getMedium(int cdFreq) {
        Frequentador u = null;
        try {
            Connection c = Conexao.getConnection();
            FrequentadorDao ud = new FrequentadorDao(c);

            u = ud.getMediumCod(cdFreq);

            Conexao.setCommitTran();

        } catch (Exception ex) {
            Conexao.setRollbackTran();
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }

        return u;
    }

    public static List<Frequentador> PesquisaFrequentador(int campo, String valor) {

        List<Frequentador> frequentadors = new ArrayList<Frequentador>();
        try {
            Connection c = Conexao.getConnection();

            FrequentadorDao frequentadorDao = new FrequentadorDao(c);

            frequentadors = frequentadorDao.PesquisaFrequentador(campo, valor);

            Conexao.setCommitTran();

        } catch (Exception ex) {
            Conexao.setRollbackTran();
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return frequentadors;
    }

    public static List<Frequentador> PesquisaMedium(int campo, String valor) {

        List<Frequentador> frequentadors = new ArrayList<Frequentador>();
        try {
            Connection c = Conexao.getConnection();

            FrequentadorDao frequentadorDao = new FrequentadorDao(c);

            frequentadors = frequentadorDao.PesquisaMedium(campo, valor);

            Conexao.setCommitTran();

        } catch (Exception ex) {
            Conexao.setRollbackTran();
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return frequentadors;
    }

    public static boolean Excluir(int codigo) {
        boolean r = false;
        try {
            Connection c = Conexao.getConnection();

            FrequentadorDao frequentadorDao = new FrequentadorDao(c);

            r = frequentadorDao.Excluir(codigo);

            TelefoneDao foneDao = new TelefoneDao(c);

            foneDao.excluirTelefone(codigo, 1);

            Conexao.setCommitTran();

        } catch (Exception ex) {
            Conexao.setRollbackTran();
            JOptionPane.showMessageDialog(null, "Erro ao deletar!");
        }
        return r;
    }

    public static boolean MarcaPresenca(int cdFreq) {
        boolean r = false;
        try {
            Connection c = Conexao.getConnection();

            FrequentadorDao frequentadorDao = new FrequentadorDao(c);

            r = frequentadorDao.MarcaPresenca(cdFreq);

            Conexao.setCommitTran();

        } catch (Exception ex) {
            Conexao.setRollbackTran();
            JOptionPane.showMessageDialog(null, "Erro ao marca presença!");
        }
        return r;
    }

    public static boolean RetirarPresenca(int cdFreq) {
        boolean r = false;
        try {
            Connection c = Conexao.getConnection();

            FrequentadorDao frequentadorDao = new FrequentadorDao(c);

            r = frequentadorDao.RetirarPresenca(cdFreq);

            Conexao.setCommitTran();

        } catch (Exception ex) {
            Conexao.setRollbackTran();
            JOptionPane.showMessageDialog(null, "Erro ao marca presença!");
        }
        return r;
    }
}