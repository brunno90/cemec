package br.ifirst.cemec.view.pesquisa;

import br.ifirst.cemec.entidades.Frequentador;
import br.ifirst.cemec.operacoes.FrequentadorOperacao;
import br.ifirst.cemec.view.TelaFrequentador;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Iagho
 */
public class PesquisarFrequentador extends javax.swing.JDialog {

    private List<Frequentador> frequentadors;
    private Frequentador frequentador;
    int box = 0;
    String pesq = "%%%";

    public PesquisarFrequentador(JDialog aThis, boolean b) {
        super(aThis, b);
        initComponents();
        setLocationRelativeTo(null);
        txtPesqFunc.grabFocus();
    }

    public PesquisarFrequentador(JFrame aThis, boolean b) {
        super(aThis, b);
        initComponents();
        setLocationRelativeTo(null);
        txtPesqFunc.grabFocus();
    }

    public PesquisarFrequentador(JInternalFrame aThis, boolean b) {
        initComponents();
        setLocationRelativeTo(null);
        txtPesqFunc.grabFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        txtPesqFunc = new javax.swing.JTextField();
        butPesq = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableFuncionario = new javax.swing.JTable();
        butPesq1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pesquisa de Frequentador");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setForeground(new java.awt.Color(0, 102, 255));
        jLabel2.setText("Campos/Ordenação");

        jLabel3.setForeground(new java.awt.Color(0, 51, 255));
        jLabel3.setText("Consulta");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nome", "Nome Mãe" }));

        txtPesqFunc.setDocument(new br.ifirst.cemec.util.FieldLimit(50, true));
        txtPesqFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesqFuncActionPerformed(evt);
            }
        });

        butPesq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ifirst/cemec/resources/http-__iconesbr.oficinadanet.com_7715_16x16.png"))); // NOI18N
        butPesq.setText("Pesquisar");
        butPesq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butPesqActionPerformed(evt);
            }
        });

        jTableFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod.Frequentador", "Nome", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableFuncionario.setColumnSelectionAllowed(false);
        jTableFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableFuncionarioMouseClicked(evt);
            }
        });
        jTableFuncionario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTableFuncionarioKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTableFuncionario);
        if (jTableFuncionario.getColumnModel().getColumnCount() > 0) {
            jTableFuncionario.getColumnModel().getColumn(0).setMinWidth(90);
            jTableFuncionario.getColumnModel().getColumn(0).setPreferredWidth(90);
            jTableFuncionario.getColumnModel().getColumn(0).setMaxWidth(90);
        }

        butPesq1.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        butPesq1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ifirst/cemec/resources/Aluno.png"))); // NOI18N
        butPesq1.setText("Novo");
        butPesq1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butPesq1ActionPerformed(evt);
            }
        });

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
                        .addComponent(txtPesqFunc, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(butPesq))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(butPesq1)
                        .addGap(0, 0, Short.MAX_VALUE)))
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
                    .addComponent(txtPesqFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(butPesq1, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butPesqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butPesqActionPerformed
        box = jComboBox1.getSelectedIndex();
        pesq = txtPesqFunc.getText();

        if (txtPesqFunc.getText().length() > 2) {
            carregaTable(box, pesq);
        }
    }//GEN-LAST:event_butPesqActionPerformed

    private void jTableFuncionarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableFuncionarioKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            frequentador = frequentadors.get(jTableFuncionario.getSelectedRow());
            dispose();
        }
    }//GEN-LAST:event_jTableFuncionarioKeyPressed

    private void jTableFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableFuncionarioMouseClicked
        frequentador = frequentadors.get(jTableFuncionario.getSelectedRow());
        dispose();
    }//GEN-LAST:event_jTableFuncionarioMouseClicked

    private void butPesq1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butPesq1ActionPerformed
        this.dispose();
        TelaFrequentador cadFrequentador = new TelaFrequentador();
        cadFrequentador.setVisible(true);
    }//GEN-LAST:event_butPesq1ActionPerformed

    private void txtPesqFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesqFuncActionPerformed
        box = jComboBox1.getSelectedIndex();
        pesq = txtPesqFunc.getText();

        if (txtPesqFunc.getText().length() > 2) {
            carregaTable(box, pesq);
        }
    }//GEN-LAST:event_txtPesqFuncActionPerformed
    public Frequentador getFrequentador() {
        return frequentador;
    }

    private void carregaTable(int box, String pesq) {

        DefaultTableModel model = (DefaultTableModel) jTableFuncionario.getModel();
        model.getDataVector().removeAllElements();
        jTableFuncionario.revalidate();

        frequentadors = FrequentadorOperacao.PesquisaFrequentador(box, pesq);

        for (Frequentador freq : frequentadors) {
            model.addRow(new Object[]{
                freq.getCdFrequentador(),
                freq.getNmFrequentador(),
                freq.getEmail()
                
            });
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butPesq;
    private javax.swing.JButton butPesq1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableFuncionario;
    private javax.swing.JTextField txtPesqFunc;
    // End of variables declaration//GEN-END:variables
}