package br.ifirst.cemec.view;

import br.ifirst.cemec.connections.Conexao;
import br.ifirst.cemec.entidades.Tratamento;
import br.ifirst.cemec.operacoes.TratamentoOperacao;
import br.ifirst.cemec.view.pesquisa.PesquisarTratamentos;
import java.awt.event.KeyEvent;
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
public class ConsultaCalendarioTrat extends javax.swing.JDialog {

    public ConsultaCalendarioTrat(JDialog aThis, boolean b) {
        super(aThis, b);
        initComponents();
        setLocationRelativeTo(null);
    }

    public ConsultaCalendarioTrat(JFrame aThis, boolean b) {
        super(aThis, b);
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        butPesqTrat = new javax.swing.JButton();
        txtTratamento = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCodTrat = new javax.swing.JTextField();
        butPesqTrat1 = new javax.swing.JButton();
        txtTratamento1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtCodTrat1 = new javax.swing.JTextField();
        butGerar = new javax.swing.JButton();
        butFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta de Calendario de Tratamento");
        setModalityType(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        butPesqTrat.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        butPesqTrat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ifirst/cemec/resources/http-__iconesbr.oficinadanet.com_7715_16x16.png"))); // NOI18N
        butPesqTrat.setFocusable(false);
        butPesqTrat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butPesqTratActionPerformed(evt);
            }
        });

        txtTratamento.setDocument(new br.ifirst.cemec.util.FieldLimit(50, true));
        txtTratamento.setEditable(false);
        txtTratamento.setFont(new java.awt.Font("Trebuchet MS", 0, 12));
        txtTratamento.setFocusable(false);

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        jLabel8.setText("Tratamento Inicial:");

        txtCodTrat.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtCodTrat.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtCodTrat.setText("0");
        txtCodTrat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCodTratMouseClicked(evt);
            }
        });
        txtCodTrat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodTratActionPerformed(evt);
            }
        });
        txtCodTrat.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCodTratFocusLost(evt);
            }
        });

        butPesqTrat1.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        butPesqTrat1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ifirst/cemec/resources/http-__iconesbr.oficinadanet.com_7715_16x16.png"))); // NOI18N
        butPesqTrat1.setFocusable(false);
        butPesqTrat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butPesqTrat1ActionPerformed(evt);
            }
        });

        txtTratamento.setDocument(new br.ifirst.cemec.util.FieldLimit(50, true));
        txtTratamento1.setEditable(false);
        txtTratamento1.setFont(new java.awt.Font("Trebuchet MS", 0, 12));
        txtTratamento1.setFocusable(false);

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        jLabel9.setText("Tratamento Final:");

        txtCodTrat1.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtCodTrat1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtCodTrat1.setText("0");
        txtCodTrat1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCodTrat1MouseClicked(evt);
            }
        });
        txtCodTrat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodTrat1ActionPerformed(evt);
            }
        });
        txtCodTrat1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCodTrat1FocusLost(evt);
            }
        });

        butGerar.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        butGerar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ifirst/cemec/resources/relatorio.png"))); // NOI18N
        butGerar.setText("Gerar");
        butGerar.setFocusable(false);
        butGerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butGerarActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtCodTrat, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(butPesqTrat, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTratamento, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtCodTrat1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(butPesqTrat1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTratamento1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(butGerar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(butFechar)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(txtCodTrat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(butPesqTrat, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTratamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(txtCodTrat1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(butPesqTrat1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTratamento1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butFechar)
                    .addComponent(butGerar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butPesqTratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butPesqTratActionPerformed
        PesquisarTratamentos pesquisarTratamentos = new PesquisarTratamentos(this, true);
        pesquisarTratamentos.setVisible(true);
        Tratamento tratamento = pesquisarTratamentos.getTratamento();

        if (tratamento != null) {
            Tratamento t;
            int cod = tratamento.getCdTratamento();
            t = BuscarTratamento(cod);

        }
    }//GEN-LAST:event_butPesqTratActionPerformed

    private void butPesqTrat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butPesqTrat1ActionPerformed
        PesquisarTratamentos pesquisarTratamentos = new PesquisarTratamentos(this, true);
        pesquisarTratamentos.setVisible(true);
        Tratamento tratamento = pesquisarTratamentos.getTratamento();

        if (tratamento != null) {
            int cod = tratamento.getCdTratamento();
            BuscarTratamento2(cod);
        }
    }//GEN-LAST:event_butPesqTrat1ActionPerformed

    private void butGerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butGerarActionPerformed
        Imprimir();
    }//GEN-LAST:event_butGerarActionPerformed

    private void butFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_butFecharActionPerformed

    private void txtCodTrat1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodTrat1FocusLost
        int cod = Integer.parseInt(txtCodTrat1.getText().equals("") ? "0" : txtCodTrat1.getText());
        if (cod == 0) {
            txtCodTrat1.transferFocus();
        }
        BuscarTratamento2(cod);
    }//GEN-LAST:event_txtCodTrat1FocusLost

    private void txtCodTrat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodTrat1ActionPerformed
        txtCodTrat1.transferFocus();
    }//GEN-LAST:event_txtCodTrat1ActionPerformed

    private void txtCodTratFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodTratFocusLost
        int cod = Integer.parseInt(txtCodTrat.getText().equals("") ? "0" : txtCodTrat.getText());
        if (cod == 0) {
            txtCodTrat.transferFocus();
        }
        BuscarTratamento(cod);
    }//GEN-LAST:event_txtCodTratFocusLost

    private void txtCodTratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodTratActionPerformed
        txtCodTrat.transferFocus();
    }//GEN-LAST:event_txtCodTratActionPerformed

    private void txtCodTratMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCodTratMouseClicked
        txtCodTrat.selectAll();
    }//GEN-LAST:event_txtCodTratMouseClicked

    private void txtCodTrat1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCodTrat1MouseClicked
        txtCodTrat1.selectAll();
    }//GEN-LAST:event_txtCodTrat1MouseClicked
    private void Imprimir() {
        int cd_ini = Integer.parseInt(txtCodTrat.getText().equals("") ? "0" : txtCodTrat.getText());
        int cd_fin = Integer.parseInt(txtCodTrat1.getText().equals("") ? "0" : txtCodTrat1.getText());

        try {
            String caminhoRel = "/br/ifirst/cemec/relatorios/CalendarioTrat.jasper";
            URL arquivo = getClass().getResource(caminhoRel);
            Map<String, Object> datIni = new HashMap<String, Object>();
            datIni.put("cdIni", cd_ini); //Filtro
            datIni.put("cdFin", cd_fin); //Filtro
            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(arquivo);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, datIni, Conexao.getConnection());
//            JasperViewer jrviewer = new JasperViewer(jasperPrint, false);
//            jrviewer.setVisible(true);
//            jrviewer.toFront();
            JasperExportManager.exportReportToPdfFile(jasperPrint, "C:\\NovaPasta\\calendarioTratamento.pdf");
            Runtime.getRuntime().exec("cmd /c start C:\\NovaPasta\\calendarioTratamento.pdf");
            File file = new File("C:\\NovaPasta\\calendarioTratamento.pdf");
            file.deleteOnExit();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível imprimir");
        }
    }

    private Tratamento BuscarTratamento(int cod) {
        Tratamento u = null;

        if (cod != 0) {
            u = TratamentoOperacao.getTratamentoCalendar(cod);
            if (u == null) {
                JOptionPane.showMessageDialog(null, "Tratamento não cadastrado ou não possui calendario de tratamento! \n "
                        + "Por favor verifique!");
                txtCodTrat.setText("");
                txtTratamento.setText("");
                return null;
            }

            txtCodTrat.setText(String.valueOf(u.getCdTratamento()));
            txtTratamento.setText(u.getDsTratamento());
        }
        return u;
    }

    private Tratamento BuscarTratamento2(int cod) {
        Tratamento u = null;

        if (cod != 0) {
            u = TratamentoOperacao.getTratamentoCalendar(cod);
            if (u == null) {
                JOptionPane.showMessageDialog(null, "Tratamento não cadastrado ou não possui calendario de tratamento! \n "
                        + "Por favor verifique!");
                txtCodTrat1.setText("");
                txtTratamento1.setText("");
                return null;
            }

            txtCodTrat1.setText(String.valueOf(u.getCdTratamento()));
            txtTratamento1.setText(u.getDsTratamento());
        }
        return u;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butFechar;
    private javax.swing.JButton butGerar;
    private javax.swing.JButton butPesqTrat;
    private javax.swing.JButton butPesqTrat1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCodTrat;
    private javax.swing.JTextField txtCodTrat1;
    private javax.swing.JTextField txtTratamento;
    private javax.swing.JTextField txtTratamento1;
    // End of variables declaration//GEN-END:variables
}
