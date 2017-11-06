package br.ifirst.cemec.view;

import br.ifirst.cemec.connections.Conexao;
import br.ifirst.cemec.entidades.DataDefinida;
import br.ifirst.cemec.entidades.Frequentador;
import br.ifirst.cemec.entidades.Tratamento;
import br.ifirst.cemec.operacoes.DataDefinidaOperacao;
import br.ifirst.cemec.operacoes.FrequentadorOperacao;
import br.ifirst.cemec.util.Utils;
import br.ifirst.cemec.view.pesquisa.PesquisarFrequentador;
import java.io.File;
import java.net.URL;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Iagho
 */
public class ConsultaMovTratamento extends javax.swing.JDialog {

    public ConsultaMovTratamento(JDialog aThis, boolean b, Frequentador f) {
        super(aThis, b);
        initComponents();
        setLocationRelativeTo(null);
        txtCodFreq.setText(String.valueOf(f.getCdFrequentador()));
        BuscarFrequentador(f.getCdFrequentador());
    }

    public ConsultaMovTratamento(JFrame aThis, boolean b, Frequentador f) {
        super(aThis, b);
        initComponents();
        setLocationRelativeTo(null);
        txtCodFreq.setText(String.valueOf(f.getCdFrequentador()));
        BuscarFrequentador(f.getCdFrequentador());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtFreq = new javax.swing.JTextField();
        txtCodFreq = new javax.swing.JFormattedTextField();
        butPesqFreq = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTratamentos = new javax.swing.JTable();
        butGerar = new javax.swing.JButton();
        butExcluir3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerar Movimentação de Tratamentos");
        setModalityType(null);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        jLabel4.setText("Frequentador:");

        txtFreq.setDocument(new br.ifirst.cemec.util.FieldLimit(50, true));
        txtFreq.setEditable(false);
        txtFreq.setFont(new java.awt.Font("Trebuchet MS", 0, 12));
        txtFreq.setFocusable(false);

        txtCodFreq.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtCodFreq.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtCodFreq.setText("0");
        txtCodFreq.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtCodFreq.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCodFreqFocusLost(evt);
            }
        });

        butPesqFreq.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        butPesqFreq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ifirst/cemec/resources/http-__iconesbr.oficinadanet.com_7715_16x16.png"))); // NOI18N
        butPesqFreq.setFocusable(false);
        butPesqFreq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butPesqFreqActionPerformed(evt);
            }
        });

        jTableTratamentos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTableTratamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Tratamento", "cdMov", "Data Inicial", "Data Final"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableTratamentos.setColumnSelectionAllowed(true);
        jTableTratamentos.setFocusable(false);
        jTableTratamentos.getTableHeader().setResizingAllowed(false);
        jTableTratamentos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTableTratamentos);
        jTableTratamentos.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jTableTratamentos.getColumnModel().getColumn(0).setMinWidth(50);
        jTableTratamentos.getColumnModel().getColumn(0).setPreferredWidth(50);
        jTableTratamentos.getColumnModel().getColumn(0).setMaxWidth(50);
        jTableTratamentos.getColumnModel().getColumn(2).setMinWidth(0);
        jTableTratamentos.getColumnModel().getColumn(2).setPreferredWidth(0);
        jTableTratamentos.getColumnModel().getColumn(2).setMaxWidth(0);
        jTableTratamentos.getColumnModel().getColumn(3).setMinWidth(70);
        jTableTratamentos.getColumnModel().getColumn(3).setPreferredWidth(70);
        jTableTratamentos.getColumnModel().getColumn(3).setMaxWidth(70);
        jTableTratamentos.getColumnModel().getColumn(4).setMinWidth(70);
        jTableTratamentos.getColumnModel().getColumn(4).setPreferredWidth(70);
        jTableTratamentos.getColumnModel().getColumn(4).setMaxWidth(70);

        butGerar.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        butGerar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ifirst/cemec/resources/relatorio.png"))); // NOI18N
        butGerar.setText("Gerar");
        butGerar.setFocusable(false);
        butGerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butGerarActionPerformed(evt);
            }
        });

        butExcluir3.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        butExcluir3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ifirst/cemec/resources/sair.png"))); // NOI18N
        butExcluir3.setText("Fechar");
        butExcluir3.setFocusable(false);
        butExcluir3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butExcluir3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(butGerar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(butExcluir3))
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodFreq, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(butPesqFreq, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFreq, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCodFreq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtFreq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(butPesqFreq, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butExcluir3)
                    .addComponent(butGerar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butExcluir3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butExcluir3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_butExcluir3ActionPerformed

    private void butGerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butGerarActionPerformed
        Imprimir();
    }//GEN-LAST:event_butGerarActionPerformed

    private void txtCodFreqFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodFreqFocusLost
        int cod = Integer.parseInt(txtCodFreq.getText().equals("") ? "0" : txtCodFreq.getText());
        if (cod > 0) {
            BuscarFrequentador(cod);
        }
    }//GEN-LAST:event_txtCodFreqFocusLost

    private void butPesqFreqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butPesqFreqActionPerformed
        PesquisarFrequentador pesquisarFrequentador = new PesquisarFrequentador(this, true);
        pesquisarFrequentador.setVisible(true);
        Frequentador frequentador = pesquisarFrequentador.getFrequentador();

        if (frequentador != null) {
            txtCodFreq.setText(String.valueOf(frequentador.getCdFrequentador()));
            BuscarFrequentador(frequentador.getCdFrequentador());
        }
    }//GEN-LAST:event_butPesqFreqActionPerformed
    private void Imprimir() {
        int cd_freq = Integer.parseInt(txtCodFreq.getText());
        int cd_trat = Integer.parseInt(jTableTratamentos.getValueAt(jTableTratamentos.getSelectedRow(), 0).toString());
        int cd_mov = Integer.parseInt(jTableTratamentos.getValueAt(jTableTratamentos.getSelectedRow(), 2).toString());

        List<DataDefinida> datas;

        datas = DataDefinidaOperacao.BuscarDatasTrat(cd_mov);
        String dt = "";
        if (datas != null && datas.size() > 0) {

            for (Iterator<DataDefinida> it = datas.iterator(); it.hasNext();) {
                DataDefinida t = it.next();
                Date data = t.getData();
                GregorianCalendar gc = new GregorianCalendar();
                gc.setTime(data);
                int numDiaSemana, i = 0;

                numDiaSemana = gc.get(GregorianCalendar.DAY_OF_WEEK);

                dt = dt + " " + Utils.formatoDataSimples.format(t.getData()) + " ";

                switch (numDiaSemana) {
                    case 1:
                        dt = dt + "DOMINGO \n";
                        break;
                    case 2:
                        dt = dt + "SEGUNDA-FEIRA \n";
                        break;
                    case 3:
                        dt = dt + "TERÇA-FEIRA \n";
                        break;
                    case 4:
                        dt = dt + "QUARTA-FEIRA \n";
                        break;
                    case 5:
                        dt = dt + "QUINTA-FEIRA \n";
                        break;
                    case 6:
                        dt = dt + "SEXTA-FEIRA \n";
                        break;
                    case 7:
                        dt = dt + "SÁBADO \n";
                        break;
                }
            }
        }
        try {
            Tratamento t = new Tratamento();
            Frequentador f = new Frequentador();
            if (cd_freq > 0 && cd_trat > 0) {
                t.setCdTratamento(cd_trat);
                f.setCdFrequentador(cd_freq);
                t.setFrequentador(f);
            } else {
                JOptionPane.showMessageDialog(null, "Frequentador ou Tratamento não informados!");
                return;
            }
            String caminhoRel = "/br/ifirst/cemec/relatorios/MovTratamento.jasper";
            URL arquivo = getClass().getResource(caminhoRel);
            Map<String, Object> datIni = new HashMap<String, Object>();
            datIni.put("cd_trat", t.getCdTratamento()); //Filtro
            datIni.put("cd_freq", t.getFrequentador().getCdFrequentador()); //Filtro
            datIni.put("data", dt);
            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(arquivo);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, datIni, Conexao.getConnection());
//            JasperViewer jrviewer = new JasperViewer(jasperPrint, false);
//            jrviewer.setVisible(true);
//            jrviewer.toFront();
            JasperExportManager.exportReportToPdfFile(jasperPrint, "C:\\NovaPasta\\ConsultaTratamento.pdf");
            Runtime.getRuntime().exec("cmd /c start C:\\NovaPasta\\ConsultaTratamento.pdf");
            File file = new File("C:\\NovaPasta\\ConsultaTratamento.pdf");
            file.deleteOnExit();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível imprimir");
        }
    }

    private void BuscarFrequentador(int codFreq) {
        if (codFreq != 0) {
            Frequentador u;
            u = FrequentadorOperacao.getFrequentador(codFreq);
            if (u == null) {
                JOptionPane.showMessageDialog(null, "Frequentador não encontrado!");
                return;
            }
            txtFreq.setText(u.getNmFrequentador());
            txtCodFreq.setEditable(false);

            DefaultTableModel modelTelefone = (DefaultTableModel) jTableTratamentos.getModel();
            modelTelefone.getDataVector().removeAllElements();
            jTableTratamentos.revalidate();

            if (u.getTratamentos() != null && u.getTratamentos().size() > 0) {

                for (Iterator<Tratamento> it = u.getTratamentos().iterator(); it.hasNext();) {
                    Tratamento t = it.next();

                    modelTelefone.addRow(new Object[]{
                        t.getCdTratamento(),
                        t.getDsTratamento(),
                        t.getCdMov(),
                        t.getDtInicial() == null ? "" : Utils.formatoDataSimples.format(t.getDtInicial()),
                        t.getDtFinal() == null ? "" : Utils.formatoDataSimples.format(t.getDtFinal()),});
                }
            }
            txtCodFreq.transferFocus();
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butExcluir3;
    private javax.swing.JButton butGerar;
    private javax.swing.JButton butPesqFreq;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableTratamentos;
    private javax.swing.JFormattedTextField txtCodFreq;
    private javax.swing.JTextField txtFreq;
    // End of variables declaration//GEN-END:variables
}
