package br.ifirst.cemec.view;

import br.ifirst.cemec.connections.Conexao;
import java.net.URL;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Iagho
 */
public class ConsultaTratFreq extends javax.swing.JDialog {

    public ConsultaTratFreq(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        GregorianCalendar gc = new GregorianCalendar();
        txtDateIni.setDate(gc.getTime());
        txtDateFin.setDate(gc.getTime());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtDateIni = new com.toedter.calendar.JDateChooser("dd/MM/yyyy", "##/##/#####", '_');
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtDateFin = new com.toedter.calendar.JDateChooser("dd/MM/yyyy", "##/##/#####", '_');
        butConsultar = new javax.swing.JButton();
        butExcluir11 = new javax.swing.JButton();
        jRadioDesob = new javax.swing.JRadioButton();
        jRadioPovoF = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta de frequentador por tratamento");
        setModalityType(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel4.setText("Tratamento:");

        txtDateIni.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel5.setText("Data inicial:");

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel6.setText("Data final:");

        txtDateFin.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        butConsultar.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        butConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ifirst/cemec/resources/relatorio.png"))); // NOI18N
        butConsultar.setText("Consultar");
        butConsultar.setToolTipText("");
        butConsultar.setFocusable(false);
        butConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butConsultarActionPerformed(evt);
            }
        });

        butExcluir11.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        butExcluir11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ifirst/cemec/resources/sair.png"))); // NOI18N
        butExcluir11.setText("Fechar");
        butExcluir11.setFocusable(false);
        butExcluir11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butExcluir11ActionPerformed(evt);
            }
        });

        jRadioDesob.setSelected(true);
        jRadioDesob.setText("DESOBSESSAO");
        jRadioDesob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioDesobActionPerformed(evt);
            }
        });

        jRadioPovoF.setText("POVO DO FOGO");
        jRadioPovoF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioPovoFActionPerformed(evt);
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
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(butConsultar)
                                .addGap(157, 157, 157)
                                .addComponent(butExcluir11)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jRadioDesob)
                            .addComponent(txtDateIni, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel6))
                            .addComponent(jRadioPovoF)
                            .addComponent(txtDateFin, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(62, 62, 62))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jRadioDesob)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDateIni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jRadioPovoF)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDateFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butConsultar)
                    .addComponent(butExcluir11))
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

    private void butConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butConsultarActionPerformed
        if (jRadioDesob.isSelected() == true) {
            buscarTratDesob();
        } else if (jRadioPovoF.isSelected() == true) {
            buscarTratPovoF();
        }
    }//GEN-LAST:event_butConsultarActionPerformed

    private void butExcluir11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butExcluir11ActionPerformed
        this.dispose();
    }//GEN-LAST:event_butExcluir11ActionPerformed

    private void jRadioDesobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioDesobActionPerformed
        jRadioDesob.setSelected(true);
        jRadioPovoF.setSelected(false);
    }//GEN-LAST:event_jRadioDesobActionPerformed

    private void jRadioPovoFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioPovoFActionPerformed
        jRadioDesob.setSelected(false);
        jRadioPovoF.setSelected(true);
    }//GEN-LAST:event_jRadioPovoFActionPerformed
    public void buscarTratDesob() {
        Date dtIni = txtDateIni.getDate();
        Date dtFin = txtDateFin.getDate();
        try {
            URL arquivo = getClass().getResource("/br/ifirst/cemec/relatorios/TratFreqDesobsessao.jasper");
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("dtIni", dtIni); //Filtro
            map.put("dtFin", dtFin); //Filtro
            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(arquivo);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, map, Conexao.getConnection());
            JasperViewer jrviewer = new JasperViewer(jasperPrint, false);
            jrviewer.setVisible(true);
            jrviewer.toFront();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível imprimir");
        }
    }

    public void buscarTratPovoF() {
        Date dtIni = txtDateIni.getDate();
        Date dtFin = txtDateFin.getDate();
        try {
            URL arquivo = getClass().getResource("/br/ifirst/cemec/relatorios/TratFreqPovoFogo.jasper");
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("dtIni", dtIni); //Filtro
            map.put("dtFin", dtFin); //Filtro
            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(arquivo);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, map, Conexao.getConnection());
            JasperViewer jrviewer = new JasperViewer(jasperPrint, false);
            jrviewer.setVisible(true);
            jrviewer.toFront();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível imprimir");
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butConsultar;
    private javax.swing.JButton butExcluir11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioDesob;
    private javax.swing.JRadioButton jRadioPovoF;
    private com.toedter.calendar.JDateChooser txtDateFin;
    private com.toedter.calendar.JDateChooser txtDateIni;
    // End of variables declaration//GEN-END:variables
}
