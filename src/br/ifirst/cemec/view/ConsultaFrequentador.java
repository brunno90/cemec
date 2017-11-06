package br.ifirst.cemec.view;

import br.ifirst.cemec.connections.Conexao;
import br.ifirst.cemec.entidades.Frequentador;
import br.ifirst.cemec.operacoes.FrequentadorOperacao;
import br.ifirst.cemec.view.pesquisa.PesquisarFrequentador;
import java.awt.Desktop;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
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
public class ConsultaFrequentador extends javax.swing.JDialog {

    public ConsultaFrequentador(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        butConsult = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtFreq = new javax.swing.JTextField();
        txtCodFreq = new javax.swing.JFormattedTextField();
        butPesqFreq = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtFreq1 = new javax.swing.JTextField();
        txtCodFreq1 = new javax.swing.JFormattedTextField();
        butPesqFreq1 = new javax.swing.JButton();
        butFechar = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Relatorio de Frequentadores");
        setModalityType(null);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        butConsult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ifirst/cemec/resources/imprimir.jpg"))); // NOI18N
        butConsult.setText("Consultar");
        butConsult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butConsultActionPerformed(evt);
            }
        });

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

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        jLabel5.setText("Frequentador:");

        txtFreq.setDocument(new br.ifirst.cemec.util.FieldLimit(50, true));
        txtFreq1.setEditable(false);
        txtFreq1.setFont(new java.awt.Font("Trebuchet MS", 0, 12));
        txtFreq1.setFocusable(false);

        txtCodFreq1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtCodFreq1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtCodFreq1.setText("0");
        txtCodFreq1.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtCodFreq1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCodFreq1FocusLost(evt);
            }
        });

        butPesqFreq1.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        butPesqFreq1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ifirst/cemec/resources/http-__iconesbr.oficinadanet.com_7715_16x16.png"))); // NOI18N
        butPesqFreq1.setFocusable(false);
        butPesqFreq1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butPesqFreq1ActionPerformed(evt);
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

        jCheckBox1.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jCheckBox1.setText("Todos");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(butConsult)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(butFechar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodFreq1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(butPesqFreq1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFreq1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCodFreq, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(butPesqFreq, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFreq, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCodFreq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtFreq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(butPesqFreq, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCodFreq1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtFreq1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(butPesqFreq1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(butFechar)
                    .addComponent(butConsult))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butConsultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butConsultActionPerformed
        consultar();
    }//GEN-LAST:event_butConsultActionPerformed

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

    private void txtCodFreq1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodFreq1FocusLost
        int cod = Integer.parseInt(txtCodFreq1.getText().equals("") ? "0" : txtCodFreq1.getText());
        if (cod > 0) {
            BuscarFrequentador2(cod);
        }
    }//GEN-LAST:event_txtCodFreq1FocusLost

    private void butPesqFreq1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butPesqFreq1ActionPerformed
        PesquisarFrequentador pesquisarFrequentador = new PesquisarFrequentador(this, true);
        pesquisarFrequentador.setVisible(true);
        Frequentador frequentador = pesquisarFrequentador.getFrequentador();

        if (frequentador != null) {
            txtCodFreq1.setText(String.valueOf(frequentador.getCdFrequentador()));
            txtFreq1.setText(frequentador.getNmFrequentador());
        }
    }//GEN-LAST:event_butPesqFreq1ActionPerformed

    private void butFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_butFecharActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if (jCheckBox1.isSelected() == true) {
            txtCodFreq.setEditable(false);
            txtCodFreq1.setEditable(false);
            butPesqFreq.setEnabled(false);
            butPesqFreq1.setEnabled(false);
        } else {
            txtCodFreq.setEditable(true);
            txtCodFreq1.setEditable(true);
            butPesqFreq.setEnabled(true);
            butPesqFreq1.setEnabled(true);
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed
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

    private void BuscarFrequentador2(int codFreq) {
        if (codFreq != 0) {
            Frequentador u;
            u = FrequentadorOperacao.getFrequentador(codFreq);
            if (u == null) {
                JOptionPane.showMessageDialog(null, "Frequentador não encontrado!");
                return;
            }
            txtFreq1.setText(u.getNmFrequentador());
        }
    }

    private void consultar() {
        int cd_ini = Integer.parseInt(txtCodFreq.getText().equals("") ? "0" : txtCodFreq.getText());
        int cd_fin = Integer.parseInt(txtCodFreq1.getText().equals("") ? "0" : txtCodFreq1.getText());
        try {
            InputStream arquivo;
            if (jCheckBox1.isSelected() == false) {
                String caminhoRel = "/br/ifirst/cemec/relatorios/frequentadores.jasper";
                arquivo = getClass().getResourceAsStream(caminhoRel);
            } else {
                String caminhoRel = "/br/ifirst/cemec/relatorios/frequentadores.jasper";
                arquivo = getClass().getResourceAsStream(caminhoRel);
            }
            Map<String, Object> datIni = new HashMap<String, Object>();
            datIni.put("cdIni", cd_ini); //Filtro
            datIni.put("cdFin", cd_fin); //Filtro
            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(arquivo);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, datIni, Conexao.getConnection());
//            JasperViewer jrviewer = new JasperViewer(jasperPrint, false);;
//            jrviewer.setVisible(true);
//            jrviewer.toFront();
              JasperExportManager.exportReportToPdfFile(jasperPrint, "C:\\NovaPasta\\TESTE.pdf");
              Desktop.getDesktop().open(new File("C:\\NovaPasta\\TESTE.pdf"));
//            JasperExportManager.exportReportToPdfFile(jasperPrint, "C:\\NovaPasta\\arquivo.pdf");
//            Runtime.getRuntime().exec("cmd /c start C:\\NovaPasta\\arquivo.pdf");
//            File file = new File("C:\\NovaPasta\\arquivo.pdf");
//            file.deleteOnExit();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível imprimir");
        }

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butConsult;
    private javax.swing.JButton butFechar;
    private javax.swing.JButton butPesqFreq;
    private javax.swing.JButton butPesqFreq1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JFormattedTextField txtCodFreq;
    private javax.swing.JFormattedTextField txtCodFreq1;
    private javax.swing.JTextField txtFreq;
    private javax.swing.JTextField txtFreq1;
    // End of variables declaration//GEN-END:variables
}
