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
public class ConsultaListPres extends javax.swing.JDialog {

    String ordernar;
    int periodico;

    public ConsultaListPres(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtCodTrat = new javax.swing.JTextField();
        txtTratamento = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        butPesqTrat = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        butConsult = new javax.swing.JButton();
        butFechar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jRadioNome = new javax.swing.JRadioButton();
        jRadiodtIni = new javax.swing.JRadioButton();
        jRadioSenha = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lista de Presença");
        setModalityType(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtCodTrat.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtCodTrat.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtCodTrat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodTratKeyPressed(evt);
            }
        });

        txtTratamento.setDocument(new br.ifirst.cemec.util.FieldLimit(50, true));
        txtTratamento.setEditable(false);
        txtTratamento.setFont(new java.awt.Font("Trebuchet MS", 0, 12));
        txtTratamento.setFocusable(false);

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        jLabel8.setText("Tratamento:");

        butPesqTrat.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        butPesqTrat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ifirst/cemec/resources/http-__iconesbr.oficinadanet.com_7715_16x16.png"))); // NOI18N
        butPesqTrat.setFocusable(false);
        butPesqTrat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butPesqTratActionPerformed(evt);
            }
        });

        jCheckBox1.setText("Tratamento a distância");

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

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Ordernar Por:"));

        jRadioNome.setText("Nome");
        jRadioNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioNomeActionPerformed(evt);
            }
        });

        jRadiodtIni.setText("Data Inicial");
        jRadiodtIni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadiodtIniActionPerformed(evt);
            }
        });

        jRadioSenha.setText("Senha");
        jRadioSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioSenhaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioNome)
                .addGap(39, 39, 39)
                .addComponent(jRadiodtIni)
                .addGap(18, 18, 18)
                .addComponent(jRadioSenha)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioNome)
                    .addComponent(jRadiodtIni)
                    .addComponent(jRadioSenha))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodTrat, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(butPesqTrat, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTratamento, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(butConsult)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(butFechar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jCheckBox1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGap(18, 18, 18)
                .addComponent(jCheckBox1)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodTratKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodTratKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_TAB) {
            int cod = Integer.parseInt(txtCodTrat.getText().equals("") ? "0" : txtCodTrat.getText());
            if (cod == 0) {
                txtCodTrat.transferFocus();
            }

            BuscarTratamento(cod);
        }
    }//GEN-LAST:event_txtCodTratKeyPressed

    private void butPesqTratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butPesqTratActionPerformed
        PesquisarTratamentos pesquisarTratamentos = new PesquisarTratamentos(this, true);
        pesquisarTratamentos.setVisible(true);
        Tratamento tratamento = pesquisarTratamentos.getTratamento();

        if (tratamento != null) {
            int cod = tratamento.getCdTratamento();
            BuscarTratamento(cod);

        }
    }//GEN-LAST:event_butPesqTratActionPerformed

    private void butConsultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butConsultActionPerformed
        consultar();
    }//GEN-LAST:event_butConsultActionPerformed

    private void butFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_butFecharActionPerformed

    private void jRadioNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioNomeActionPerformed
        jRadioNome.setSelected(true);
        jRadioSenha.setSelected(false);
        jRadiodtIni.setSelected(false);
        ordernar = "nm_freq";
    }//GEN-LAST:event_jRadioNomeActionPerformed

    private void jRadiodtIniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadiodtIniActionPerformed
        jRadiodtIni.setSelected(true);
        jRadioSenha.setSelected(false);
        jRadioNome.setSelected(false);
        ordernar = "dt_inicial";
    }//GEN-LAST:event_jRadiodtIniActionPerformed

    private void jRadioSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioSenhaActionPerformed
        jRadioSenha.setSelected(true);
        jRadioNome.setSelected(false);
        jRadiodtIni.setSelected(false);
        ordernar = "senha";
    }//GEN-LAST:event_jRadioSenhaActionPerformed
    private void consultar() {
        int cd_trat = Integer.parseInt(txtCodTrat.getText().equals("") ? "0" : txtCodTrat.getText());
        int trat_dist = jCheckBox1.isSelected() == true ? 1 : 0;
        int presenca = 1;
        if (trat_dist == 1) {
            presenca = 0;
        }
        try {
            URL arquivo = null;
            if (periodico == 0) {
                String caminhoRel = "/br/ifirst/cemec/relatorios/ListaPresenca.jasper";
                arquivo = getClass().getResource(caminhoRel);
            } else if (periodico == 1) {
                String caminhoRel = "/br/ifirst/cemec/relatorios/ListaPresencaDes.jasper";
                arquivo = getClass().getResource(caminhoRel);
            }
            Map<String, Object> datIni = new HashMap<String, Object>();
            datIni.put("cd_trat", cd_trat); //Filtro
            datIni.put("tratDist", trat_dist); //Filtro
            datIni.put("order", ordernar);
            datIni.put("presenca", presenca);
            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(arquivo);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, datIni, Conexao.getConnection());
//            JasperViewer jrviewer = new JasperViewer(jasperPrint, false);;
//            jrviewer.setVisible(true);
//            jrviewer.toFront();
            JasperExportManager.exportReportToPdfFile(jasperPrint, "C:\\NovaPasta\\consultaListaPres.pdf");
            Runtime.getRuntime().exec("cmd /c start C:\\NovaPasta\\consultaListaPres.pdf");
            File file = new File("C:\\NovaPasta\\consultaListaPres.pdf");
            file.deleteOnExit();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível imprimir");
        }

    }

    private void BuscarTratamento(int cod) {
        Tratamento u = null;

        if (cod != 0) {
            u = TratamentoOperacao.getTratamentoCalendar(cod);
            if (u == null || u.getNaoRequerCalendario() == 0 && u.getCalendarioTratamento() == null) {
                JOptionPane.showMessageDialog(null, "Tratamento não cadastrado ou não possui calendario de tratamento! \n "
                        + "Por favor verifique!");
                txtCodTrat.setText("");
                txtTratamento.setText("");
                return;
            }
            periodico = u.getPeriodico();
            txtCodTrat.setText(String.valueOf(u.getCdTratamento()));
            txtTratamento.setText(u.getDsTratamento());
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butConsult;
    private javax.swing.JButton butFechar;
    private javax.swing.JButton butPesqTrat;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioNome;
    private javax.swing.JRadioButton jRadioSenha;
    private javax.swing.JRadioButton jRadiodtIni;
    private javax.swing.JTextField txtCodTrat;
    private javax.swing.JTextField txtTratamento;
    // End of variables declaration//GEN-END:variables
}