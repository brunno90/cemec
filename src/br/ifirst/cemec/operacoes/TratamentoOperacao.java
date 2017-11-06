package br.ifirst.cemec.operacoes;

import br.ifirst.cemec.connections.Conexao;
import br.ifirst.cemec.daos.DataDefinidaDao;
import br.ifirst.cemec.daos.TratamentoDao;
import br.ifirst.cemec.entidades.DataDefinida;
import br.ifirst.cemec.entidades.Frequentador;
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
public class TratamentoOperacao {

    public static int Salvar(Tratamento t) {
        int r = 0;
        Tratamento u = null;
        try {
            Connection c = Conexao.getConnection();

            TratamentoDao tratamentoDao = new TratamentoDao(c);
            r = tratamentoDao.Salvar(t);
            Conexao.setCommitTran();
        } catch (Exception ex) {
            Conexao.setRollbackTran();
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return r;
    }

    public static boolean Alterar(Tratamento t) {
        boolean r = false;
        try {
            Connection c = Conexao.getConnection();

            TratamentoDao tratamentoDao = new TratamentoDao(c);

            r = tratamentoDao.Alterar(t);

            Conexao.setCommitTran();
        } catch (Exception ex) {
            Conexao.setRollbackTran();
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return r;
    }

    public static Tratamento getTratamento(int cod) {
        Tratamento u = null;
        try {
            Connection c = Conexao.getConnection();
            TratamentoDao ud = new TratamentoDao(c);

            u = ud.getTratamento(cod);
            Conexao.setCommitTran();

        } catch (Exception ex) {
            Conexao.setRollbackTran();
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return u;
    }

    public static Tratamento getTratamentoCalendar(int cod) {
        Tratamento u = null;
        try {
            Connection c = Conexao.getConnection();
            TratamentoDao ud = new TratamentoDao(c);

            u = ud.getTratamentoCalendar(cod);
            Conexao.setCommitTran();

        } catch (Exception ex) {
            Conexao.setRollbackTran();
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return u;
    }

    public static List<Tratamento> PesquisaTratamento(int box, String pesq) {
        List<Tratamento> tratamentos = new ArrayList<Tratamento>();
        try {
            Connection c = Conexao.getConnection();

            TratamentoDao tratamentoDao = new TratamentoDao(c);

            tratamentos = tratamentoDao.PesquisaTratamento(box, pesq);

            Conexao.setCommitTran();

        } catch (Exception ex) {
            Conexao.setRollbackTran();
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return tratamentos;
    }

    public static boolean Excluir(int codigo) {
        boolean r = false;
        try {
            Connection c = Conexao.getConnection();

            TratamentoDao tratamentoDao = new TratamentoDao(c);

            r = tratamentoDao.Excluir(codigo);

            Conexao.setCommitTran();

        } catch (Exception ex) {
            Conexao.setRollbackTran();
            JOptionPane.showMessageDialog(null, "Erro ao deletar!");
        }
        return r;
    }

    public static boolean SalvarMovTrat(Frequentador freq) {
        boolean r = false;
        try {
            Connection c = Conexao.getConnection();

            TratamentoDao dao = new TratamentoDao(c);

            dao.excluirMovTratamentos(freq.getCdFrequentador());

            if (freq.getTratamentos() != null && freq.getTratamentos().size() > 0) {
                for (Tratamento t : freq.getTratamentos()) {
                    dao.SalvarMovTrat(t);
                }
            }
            Conexao.setCommitTran();
        } catch (Exception ex) {
            Conexao.setRollbackTran();
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return r;
    }

    public static boolean SalvarMovTrat(Tratamento trat) {
        boolean r = false;
        int codMov;
        try {
            Connection c = Conexao.getConnection();

            TratamentoDao dao = new TratamentoDao(c);

            codMov = dao.SalvarMovTrat(trat);

            DataDefinidaDao dataDefinidaDao = new DataDefinidaDao(c);
//            dataDefinidaDao.excluirDatas(trat.getCdTratamento());

            if (trat.getDataDefinida() != null && trat.getDataDefinida().size() > 0) {
                for (DataDefinida t : trat.getDataDefinida()) {
                    t.setCdMov(codMov);
                    t.getData();
                    r = dataDefinidaDao.SalvarDatasTratamento(t);
                }
            }

            Conexao.setCommitTran();
        } catch (Exception ex) {
            Conexao.setRollbackTran();
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return r;
    }

    public static List<Tratamento> PesquisaMovTratamentos(int box, String pesq) {
        List<Tratamento> movTratamentos = new ArrayList<Tratamento>();
        try {
            Connection c = Conexao.getConnection();

            TratamentoDao tratamentoDao = new TratamentoDao(c);

            movTratamentos = tratamentoDao.PesquisaMovTratamentos(box, pesq);

            Conexao.setCommitTran();

        } catch (Exception ex) {
            Conexao.setRollbackTran();
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return movTratamentos;
    }
    
    public static List<Tratamento> PesquisaMovTratamentos(int box, String pesq, String data) {
        List<Tratamento> movTratamentos = new ArrayList<Tratamento>();
        try {
            Connection c = Conexao.getConnection();

            TratamentoDao tratamentoDao = new TratamentoDao(c);

            movTratamentos = tratamentoDao.PesquisaMovTratamentosComData(box, pesq, data);

            Conexao.setCommitTran();

        } catch (Exception ex) {
            Conexao.setRollbackTran();
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return movTratamentos;
    }

    public static boolean ExcluirMov(int cdMov) {
        boolean r = false;
        try {
            Connection c = Conexao.getConnection();

            TratamentoDao tratamentoDao = new TratamentoDao(c);

            r = tratamentoDao.excluirDatasMov(cdMov);
            r = tratamentoDao.excluirMovimento(cdMov);

            Conexao.setCommitTran();

        } catch (Exception ex) {
            Conexao.setRollbackTran();
            JOptionPane.showMessageDialog(null, "Erro ao deletar!");
        }
        return r;
    }
    
    public static boolean ExcluirDataMovDia(int cdMov) {
        boolean r = false;
        try {
            Connection c = Conexao.getConnection();

            TratamentoDao tratamentoDao = new TratamentoDao(c);

            r = tratamentoDao.excluirDatasMovDia(cdMov);

            Conexao.setCommitTran();

        } catch (Exception ex) {
            Conexao.setRollbackTran();
            JOptionPane.showMessageDialog(null, "Erro ao deletar!");
        }
        return r;
    }

    public static Tratamento getMovTratamento(int cdMov) {
        Tratamento u = null;
        try {
            Connection c = Conexao.getConnection();
            TratamentoDao ud = new TratamentoDao(c);

            u = ud.getMovTratamento(cdMov);
            Conexao.setCommitTran();

        } catch (Exception ex) {
            Conexao.setRollbackTran();
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return u;
    }

    public static boolean UpdateMovTrat(Tratamento t) {
        boolean r = false;
        try {
            Connection c = Conexao.getConnection();

            TratamentoDao dao = new TratamentoDao(c);

            r = dao.UpdateMovTrat(t);
            if (r == false) {
                DataDefinidaDao dataDefinidaDao = new DataDefinidaDao(c);
                dataDefinidaDao.excluirDatasTrat(t.getCdMov());

                if (t.getDataDefinida() != null && t.getDataDefinida().size() > 0) {
                    for (DataDefinida tr : t.getDataDefinida()) {
                        tr.setCdMov(t.getCdMov());
                        tr.getData();
                        r = dataDefinidaDao.SalvarDatasTratamento(tr);
                    }
                }
            }

            Conexao.setCommitTran();
        } catch (Exception ex) {
            Conexao.setRollbackTran();
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return r;
    }

    public static boolean LimpezaTratamento(Date datIni, Date datFin) {
        boolean r = false;
        try {
            Connection c = Conexao.getConnection();

            TratamentoDao tratamentoDao = new TratamentoDao(c);

            r = tratamentoDao.LimpezaTratamento(datIni, datFin);

            Conexao.setCommitTran();
        } catch (Exception ex) {
            Conexao.setRollbackTran();
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return r;
    }
}