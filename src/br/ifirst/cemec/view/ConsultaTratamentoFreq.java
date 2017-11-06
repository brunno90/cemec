package br.ifirst.cemec.view;

import br.ifirst.cemec.connections.Conexao;
import br.ifirst.cemec.entidades.Frequentador;
import br.ifirst.cemec.operacoes.FrequentadorOperacao;
import br.ifirst.cemec.view.pesquisa.PesquisarFrequentador;
import java.io.File;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
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
public class ConsultaTratamentoFreq extends javax.swing.JDialog {

    public ConsultaTratamentoFreq(JDialog aThis, boolean b) {
        super(aThis, b);
        initComponents();
        setLocationRelativeTo(null);
    }

    public ConsultaTratamentoFreq(JFrame aThis, boolean b) {
        super(aThis, b);
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtCodFreq = new javax.swing.JFormattedTextField();
        txtFreq = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        butPesqFreq = new javax.swing.JButton();
        jRadioTodos = new javax.swing.JRadioButton();
        jRadioFreq = new javax.swing.JRadioButton();
        butConsult = new javax.swing.JButton();
        butFechar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jRadioOrderFreq = new javax.swing.JRadioButton();
        jRadioOrderTrat = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Busca de Tratamento de Frequentador");
        setModalityType(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtCodFreq.setEditable(false);
        txtCodFreq.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtCodFreq.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtCodFreq.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtCodFreq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodFreqActionPerformed(evt);
            }
        });
        txtCodFreq.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCodFreqFocusLost(evt);
            }
        });

        txtFreq.setDocument(new br.ifirst.cemec.util.FieldLimit(50, true));
        txtFreq.setEditable(false);
        txtFreq.setFont(new java.awt.Font("Trebuchet MS", 0, 12));
        txtFreq.setFocusable(false);

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        jLabel4.setText("Frequentador:");

        butPesqFreq.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        butPesqFreq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ifirst/cemec/resources/http-__iconesbr.oficinadanet.com_7715_16x16.png"))); // NOI18N
        butPesqFreq.setFocusable(false);
        butPesqFreq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butPesqFreqActionPerformed(evt);
            }
        });

        jRadioTodos.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jRadioTodos.setSelected(true);
        jRadioTodos.setText("Todos");
        jRadioTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioTodosActionPerformed(evt);
            }
        });

        jRadioFreq.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jRadioFreq.setText("Frequendador");
        jRadioFreq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioFreqActionPerformed(evt);
            }
        });

        butConsult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ifirst/cemec/resources/imprimir.jpg"))); // NOI18N
        butConsult.setText("Consultar");
        butConsult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butConsultActionPerformed(evt);
            }
        });

        butFechar.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        butFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ifirst/cemec/resources/sair.png"))); // NOI18N
        butFechar.setText("Fechar");
        butFechar.setFocusable(false);
        butFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butFecharActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        jLabel5.setText("Ordernar por:");

        jRadioOrderFreq.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jRadioOrderFreq.setSelected(true);
        jRadioOrderFreq.setText("Frequentador");
        jRadioOrderFreq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioOrderFreqActionPerformed(evt);
            }
        });

        jRadioOrderTrat.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jRadioOrderTrat.setText("Tratamento");
        jRadioOrderTrat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioOrderTratActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(butConsult)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(butFechar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioOrderFreq)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jRadioTodos))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioFreq)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtCodFreq, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jRadioOrderTrat)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(butPesqFreq, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtFreq, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addComponent(jLabel5))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioFreq)
                    .addComponent(jRadioTodos))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCodFreq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtFreq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(butPesqFreq, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioOrderFreq)
                    .addComponent(jRadioOrderTrat))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(butFechar)
                    .addComponent(butConsult))
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
            txtFreq.setText(frequentador.getNmFrequentador());
        }
    }//GEN-LAST:event_butPesqFreqActionPerformed

    private void butConsultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butConsultActionPerformed
        if (jRadioTodos.isSelected() == true) {
            consultarTodos();
        } else if (jRadioFreq.isSelected() == true) {
            consultarFreq();
        }
    }//GEN-LAST:event_butConsultActionPerformed

    private void butFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_butFecharActionPerformed

    private void jRadioTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioTodosActionPerformed
        jRadioFreq.setSelected(false);
        txtCodFreq.setEditable(false);
    }//GEN-LAST:event_jRadioTodosActionPerformed

    private void jRadioFreqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioFreqActionPerformed
        jRadioTodos.setSelected(false);
        txtCodFreq.setEditable(true);
    }//GEN-LAST:event_jRadioFreqActionPerformed

    private void txtCodFreqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodFreqActionPerformed
        txtCodFreq.transferFocus();
    }//GEN-LAST:event_txtCodFreqActionPerformed

    private void jRadioOrderFreqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioOrderFreqActionPerformed
        jRadioOrderTrat.setSelected(false);
        jRadioOrderFreq.setSelected(true);
    }//GEN-LAST:event_jRadioOrderFreqActionPerformed

    private void jRadioOrderTratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioOrderTratActionPerformed
        jRadioOrderFreq.setSelected(false);
        jRadioOrderTrat.setSelected(true);
    }//GEN-LAST:event_jRadioOrderTratActionPerformed
    private void consultarTodos() {
        try {
            URL arquivo;

            if (jRadioOrderFreq.isSelected() == true) {
                arquivo = getClass().getResource("/br/ifirst/cemec/relatorios/TratamentoFrequentadorTodos.jasper");
            } else {
                arquivo = getClass().getResource("/br/ifirst/cemec/relatorios/TratamentoFrequentadorTodosT.jasper");
            }

            Map<String, Object> datIni = new HashMap<String, Object>();
            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(arquivo);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, datIni, Conexao.getConnection());
//            JasperViewer jrviewer = new JasperViewer(jasperPrint, false);
//            jrviewer.setVisible(true);
//            jrviewer.toFront();
            JasperExportManager.exportReportToPdfFile(jasperPrint, "C:\\NovaPasta\\ConsultaTratamentoFred.pdf");
            Runtime.getRuntime().exec("cmd /c start C:\\NovaPasta\\ConsultaTratamentoFred.pdf");
            File file = new File("C:\\NovaPasta\\ConsultaTratamentoFred.pdf");
            file.deleteOnExit();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível imprimir");
        }

    }

    private void consultarFreq() {
        int cd_freq = Integer.parseInt(txtCodFreq.getText().equals("") ? "0" : txtCodFreq.getText());
        try {
            URL arquivo = getClass().getResource("/br/ifirst/cemec/relatorios/TratamentoFrequentador.jasper");
            Map<String, Object> datIni = new HashMap<String, Object>();
            datIni.put("cd_freq", cd_freq); //Filtro
            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(arquivo);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, datIni, Conexao.getConnection());
//            JasperViewer jrviewer = new JasperViewer(jasperPrint, false);
//            jrviewer.setVisible(true);
//            jrviewer.toFront();
            JasperExportManager.exportReportToPdfFile(jasperPrint, "C:\\NovaPasta\\TratamentoFrequentador.pdf");
            Runtime.getRuntime().exec("cmd /c start C:\\NovaPasta\\TratamentoFrequentador.pdf");
            File file = new File("C:\\NovaPasta\\TratamentoFrequentador.pdf");
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
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butConsult;
    private javax.swing.JButton butFechar;
    private javax.swing.JButton butPesqFreq;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioFreq;
    private javax.swing.JRadioButton jRadioOrderFreq;
    private javax.swing.JRadioButton jRadioOrderTrat;
    private javax.swing.JRadioButton jRadioTodos;
    private javax.swing.JFormattedTextField txtCodFreq;
    private javax.swing.JTextField txtFreq;
    // End of variables declaration//GEN-END:variables
}
