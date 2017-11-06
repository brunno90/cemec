package br.ifirst.cemec.view.pesquisa;

import br.ifirst.cemec.entidades.Tratamento;
import br.ifirst.cemec.operacoes.TratamentoOperacao;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Iagho
 */
public class PesquisarTratamentos extends javax.swing.JDialog {

    private List<Tratamento> tratamentos;
    private Tratamento tratamento;
    int box = 0;
    String pesq = "%%%";

    public PesquisarTratamentos(JDialog aThis, boolean b) {
        super(aThis, b);
        initComponents();
        setLocationRelativeTo(null);
        carregaTable(box, pesq);
    }

    public PesquisarTratamentos(JFrame aThis, boolean b) {
        super(aThis, b);
        initComponents();
        setLocationRelativeTo(null);
        carregaTable(box, pesq);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        txtPesqTrat = new javax.swing.JTextField();
        butPesq = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTratamentos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pesquisa de Tratamentos");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setForeground(new java.awt.Color(0, 102, 255));
        jLabel2.setText("Campos/Ordenação");

        jLabel3.setForeground(new java.awt.Color(0, 51, 255));
        jLabel3.setText("Consulta");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Descrição", "Código" }));

        txtPesqTrat.setDocument(new br.ifirst.cemec.util.FieldLimit(50, true));
        txtPesqTrat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesqTratActionPerformed(evt);
            }
        });

        butPesq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ifirst/cemec/resources/http-__iconesbr.oficinadanet.com_7715_16x16.png"))); // NOI18N
        butPesq.setText("Pesquisar");
        butPesq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butPesqActionPerformed(evt);
            }
        });

        jTableTratamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod.Tratamento", "Descrição"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableTratamentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableTratamentosMouseClicked(evt);
            }
        });
        jTableTratamentos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTableTratamentosKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTableTratamentos);
        jTableTratamentos.getColumnModel().getColumn(0).setMinWidth(90);
        jTableTratamentos.getColumnModel().getColumn(0).setPreferredWidth(90);
        jTableTratamentos.getColumnModel().getColumn(0).setMaxWidth(90);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 434, Short.MAX_VALUE)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(txtPesqTrat, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(butPesq)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butPesq)
                    .addComponent(txtPesqTrat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void butPesqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butPesqActionPerformed
        box = jComboBox1.getSelectedIndex();
        pesq = txtPesqTrat.getText();

        if (txtPesqTrat.getText().length() > 2) {
            carregaTable(box, pesq);
        }
    }//GEN-LAST:event_butPesqActionPerformed

    private void jTableTratamentosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableTratamentosKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            tratamento = tratamentos.get(jTableTratamentos.getSelectedRow());
            dispose();
        }
    }//GEN-LAST:event_jTableTratamentosKeyPressed

    private void jTableTratamentosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTratamentosMouseClicked
        tratamento = tratamentos.get(jTableTratamentos.getSelectedRow());
        dispose();
    }//GEN-LAST:event_jTableTratamentosMouseClicked

    private void txtPesqTratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesqTratActionPerformed
        box = jComboBox1.getSelectedIndex();
        pesq = txtPesqTrat.getText();

        if (txtPesqTrat.getText().length() > 2) {
            carregaTable(box, pesq);
        }
    }//GEN-LAST:event_txtPesqTratActionPerformed
    public Tratamento getTratamento() {
        return tratamento;
    }

    private void carregaTable(int box, String pesq) {

        DefaultTableModel model = (DefaultTableModel) jTableTratamentos.getModel();
        model.getDataVector().removeAllElements();
        jTableTratamentos.revalidate();

        tratamentos = TratamentoOperacao.PesquisaTratamento(box, pesq);

        for (Iterator<Tratamento> it = tratamentos.iterator(); it.hasNext();) {
            Tratamento t = it.next();

            model.addRow(new Object[]{
                t.getCdTratamento(),
                t.getDsTratamento(),
                ""
            });
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butPesq;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableTratamentos;
    private javax.swing.JTextField txtPesqTrat;
    // End of variables declaration//GEN-END:variables
}