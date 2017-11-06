package br.ifirst.cemec.view.pesquisa;

import br.ifirst.cemec.entidades.Usuario;
import br.ifirst.cemec.operacoes.UsuarioOperacao;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Iagho
 */
public class PesquisarUsuario extends javax.swing.JDialog {

    private List<Usuario> usuarios;
    private Usuario usuario;
    int box = 0;
    String pesq = "%%%";

    public PesquisarUsuario(JDialog aThis, boolean b) {
        super(aThis, b);
        initComponents();
        setLocationRelativeTo(null);
        carregaTable(box, pesq);
    }

    public PesquisarUsuario(JFrame aThis, boolean b) {
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
        txtPesqFunc = new javax.swing.JTextField();
        butPesq = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableFuncionario = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setForeground(new java.awt.Color(0, 102, 255));
        jLabel2.setText("Campos/Ordenação");

        jLabel3.setForeground(new java.awt.Color(0, 51, 255));
        jLabel3.setText("Consulta");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nome", "CPF" }));

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
                "Cod.Usuário", "Nome"
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
        jTableFuncionario.getColumnModel().getColumn(0).setMinWidth(90);
        jTableFuncionario.getColumnModel().getColumn(0).setPreferredWidth(90);
        jTableFuncionario.getColumnModel().getColumn(0).setMaxWidth(90);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 411, Short.MAX_VALUE)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(txtPesqFunc, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
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
                    .addComponent(txtPesqFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        if (butPesq.getText().length() > 2) {
            box = jComboBox1.getSelectedIndex();
            pesq = txtPesqFunc.getText();
            carregaTable(box, pesq);
        }
    }//GEN-LAST:event_butPesqActionPerformed

    private void jTableFuncionarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableFuncionarioKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            usuario = usuarios.get(jTableFuncionario.getSelectedRow());
            dispose();
        }
    }//GEN-LAST:event_jTableFuncionarioKeyPressed

    private void txtPesqFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesqFuncActionPerformed
        if (txtPesqFunc.getText().length() > 2) {
            box = jComboBox1.getSelectedIndex();
            pesq = txtPesqFunc.getText();
            carregaTable(box, pesq);
        }
    }//GEN-LAST:event_txtPesqFuncActionPerformed

    private void jTableFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableFuncionarioMouseClicked
        usuario = usuarios.get(jTableFuncionario.getSelectedRow());
        dispose();
    }//GEN-LAST:event_jTableFuncionarioMouseClicked
    public Usuario getUsuario() {
        return usuario;
    }

    private void carregaTable(int box, String pesq) {

        DefaultTableModel model = (DefaultTableModel) jTableFuncionario.getModel();
        model.getDataVector().removeAllElements();
        jTableFuncionario.revalidate();

        usuarios = UsuarioOperacao.PesquisaUsuarios(box, pesq);

        for (Usuario usu : usuarios) {
            model.addRow(new Object[]{
                usu.getCodigoUsu(),
                usu.getNmUsu()
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
    private javax.swing.JTable jTableFuncionario;
    private javax.swing.JTextField txtPesqFunc;
    // End of variables declaration//GEN-END:variables
}