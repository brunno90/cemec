package br.ifirst.cemec.view;

import br.ifirst.cemec.entidades.Permissao;
import br.ifirst.cemec.entidades.Usuario;
import br.ifirst.cemec.operacoes.UsuarioOperacao;
import br.ifirst.cemec.util.Utils;
import br.ifirst.cemec.view.pesquisa.PesquisarUsuario;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CadastroUsuario extends javax.swing.JDialog {

    int cod, cdPer;
    String senha, data, nomeUsu;
    int cdUsu, cdFilial;

    public CadastroUsuario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        Utils.mascaraData().install(txtdata);

        GregorianCalendar gc = new GregorianCalendar();
        txtdata.setText(Utils.formatoDataSimples.format(gc.getTime()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jTextField8 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        Senha = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCodUsu = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        ConfSenha = new javax.swing.JLabel();
        txtConf = new javax.swing.JPasswordField();
        jPanel16 = new javax.swing.JPanel();
        jButton66 = new javax.swing.JButton();
        jButton72 = new javax.swing.JButton();
        jButton73 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        boxSitu = new javax.swing.JComboBox();
        jButton74 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        boxCargo = new javax.swing.JComboBox();
        Senha1 = new javax.swing.JLabel();
        txtdata = new javax.swing.JFormattedTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenuSalvar = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem4 = new javax.swing.JMenuItem();

        jLabel8.setText("jLabel8");

        jButton4.setText("jButton4");

        jTextField8.setText("jTextField8");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Cadastro Usuarios");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Senha.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Senha.setText("Senha:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Situação:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Dt. Cad :");

        txtCodUsu.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtCodUsu.setText("0");
        txtCodUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodUsuActionPerformed(evt);
            }
        });
        txtCodUsu.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCodUsuFocusLost(evt);
            }
        });

        txtNome.setDocument(new br.ifirst.cemec.util.FieldLimit(50, true));

        ConfSenha.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ConfSenha.setText("Confirmar senha :");

        jPanel16.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton66.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        jButton66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ifirst/cemec/resources/save1.png"))); // NOI18N
        jButton66.setText("Salvar");
        jButton66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton66ActionPerformed(evt);
            }
        });

        jButton72.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        jButton72.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ifirst/cemec/resources/sair.png"))); // NOI18N
        jButton72.setText("Sair");
        jButton72.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton72ActionPerformed(evt);
            }
        });

        jButton73.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        jButton73.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ifirst/cemec/resources/limpar.png"))); // NOI18N
        jButton73.setText("Limpar");
        jButton73.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton73ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton66)
                .addGap(18, 18, 18)
                .addComponent(jButton73)
                .addGap(18, 18, 18)
                .addComponent(jButton72)
                .addContainerGap(204, Short.MAX_VALUE))
        );

        jPanel16Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton66, jButton72, jButton73});

        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton66, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton73, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton72, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("Usuário:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("Email:");

        boxSitu.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ativado", "Desativado" }));

        jButton74.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        jButton74.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ifirst/cemec/resources/http-__iconesbr.oficinadanet.com_7715_16x16.png"))); // NOI18N
        jButton74.setFocusable(false);
        jButton74.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton74ActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Permissões", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 14), new java.awt.Color(0, 0, 204))); // NOI18N

        jTable1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CodPer", "Tela", "Visualizar", "Incluir", "Alterar", "Excluir"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getColumn(0).setMinWidth(0);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(0);
        jTable1.getColumnModel().getColumn(0).setMaxWidth(0);
        jTable1.getColumnModel().getColumn(2).setMinWidth(55);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(55);
        jTable1.getColumnModel().getColumn(2).setMaxWidth(55);
        jTable1.getColumnModel().getColumn(3).setMinWidth(50);
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(50);
        jTable1.getColumnModel().getColumn(3).setMaxWidth(50);
        jTable1.getColumnModel().getColumn(4).setMinWidth(50);
        jTable1.getColumnModel().getColumn(4).setPreferredWidth(50);
        jTable1.getColumnModel().getColumn(4).setMaxWidth(50);
        jTable1.getColumnModel().getColumn(5).setMinWidth(50);
        jTable1.getColumnModel().getColumn(5).setPreferredWidth(50);
        jTable1.getColumnModel().getColumn(5).setMaxWidth(50);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                .addContainerGap())
        );

        boxCargo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Administrador", "Atendente" }));

        Senha1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Senha1.setText("Cargo:");

        txtdata.setEditable(false);
        txtdata.setFocusable(false);
        txtdata.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Senha, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton74, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCodUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtdata, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                                            .addComponent(txtSenha))
                                        .addGap(155, 155, 155)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ConfSenha, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(Senha1, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtConf, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(boxCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(boxSitu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtCodUsu, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton74, javax.swing.GroupLayout.Alignment.LEADING, 0, 0, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boxSitu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Senha)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ConfSenha)
                                .addComponent(txtConf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtdata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boxCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Senha1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenu1.setText("Arquivo");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        MenuSalvar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        MenuSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ifirst/cemec/resources/save1.png"))); // NOI18N
        MenuSalvar.setText("Salvar");
        MenuSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuSalvarActionPerformed(evt);
            }
        });
        jMenu1.add(MenuSalvar);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ifirst/cemec/resources/limpar.png"))); // NOI18N
        jMenuItem2.setText("Limpar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);
        jMenu1.add(jSeparator1);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ifirst/cemec/resources/sair.png"))); // NOI18N
        jMenuItem4.setText("Sair");
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton73ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton73ActionPerformed
        LimparTela();
}//GEN-LAST:event_jButton73ActionPerformed

    private void jButton72ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton72ActionPerformed
        this.dispose();
}//GEN-LAST:event_jButton72ActionPerformed

    private void jButton66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton66ActionPerformed
        try {
            finalizar();
            SalvarUsu();
        } catch (ParseException ex) {
            Logger.getLogger(CadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton66ActionPerformed

    private void jButton74ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton74ActionPerformed
        PesquisarUsuario pesUsu = new PesquisarUsuario(this, true);
        pesUsu.setVisible(true);
        Usuario u = pesUsu.getUsuario();
        buscaUsuario(u.getCodigoUsu());
    }//GEN-LAST:event_jButton74ActionPerformed

    private void txtCodUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodUsuActionPerformed
        cdUsu = Integer.parseInt(txtCodUsu.getText().equals("") ? "0" : txtCodUsu.getText());
        buscaUsuario(cdUsu);
    }//GEN-LAST:event_txtCodUsuActionPerformed

    private void txtCodUsuFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodUsuFocusLost
        cdUsu = Integer.parseInt(txtCodUsu.getText().equals("") ? "0" : txtCodUsu.getText());
        buscaUsuario(cdUsu);
    }//GEN-LAST:event_txtCodUsuFocusLost

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        LimparTela();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void MenuSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuSalvarActionPerformed
        try {
            SalvarUsu();
        } catch (ParseException ex) {
            Logger.getLogger(CadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_MenuSalvarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

        int resposta = JOptionPane.showConfirmDialog(null, "Deseja fechar a tela?", "Cadastro de usuario",
                JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            dispose();
        }

    }//GEN-LAST:event_formWindowClosing
    public String validarSenha() {
        String senhaDigitada = String.valueOf(txtSenha.getPassword());
        String senhaConfirmada = String.valueOf(txtConf.getPassword());
        if (senhaDigitada.equals(senhaConfirmada)) {
            try {
                return senhaConfirmada;//validar os campos para retorno da senha criptograda.
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Senha confirmada incorreta!\nRedigite sua senha !");
                return "";
            }
        } else {
            JOptionPane.showMessageDialog(null, "Senha confirmada incorreta!\nRedigite sua senha !");
            return "";
        }

    }

    private void finalizar() {
        if (txtNome.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Nome em branco. Necessario preenchimento deste campo.", "Atenção", JOptionPane.INFORMATION_MESSAGE);
        } else {
            if (txtNome.getText().length() > 25) {
                JOptionPane.showMessageDialog(null, "Nome excede o limite de caracteres que é de 40.", "Atenção", JOptionPane.INFORMATION_MESSAGE);
            } else {
                nomeUsu = txtNome.getText();
            }
        }

    }

    private void SalvarUsu() throws ParseException {
        int rowCount = jTable1.getModel().getRowCount();
        List<Permissao> per = new ArrayList<Permissao>();
        if (rowCount > 0) {
            for (int i = 0; i < rowCount; i++) {
                Permissao t = new Permissao();
                t.setCdPer(Integer.parseInt(jTable1.getValueAt(i, 0).toString()));
                t.setDescricao(jTable1.getValueAt(i, 1).toString());
                t.setVisul(Boolean.parseBoolean(jTable1.getValueAt(i, 2).toString()));
                t.setIncluir(Boolean.parseBoolean(jTable1.getValueAt(i, 3).toString()));
                t.setAlter(Boolean.parseBoolean(jTable1.getValueAt(i, 4).toString()));
                t.setExcluir(Boolean.parseBoolean(jTable1.getValueAt(i, 5).toString()));
                per.add(t);
            }
        }
        Object[] options = {"Sim", "Não"};


        int i = JOptionPane.showOptionDialog(null,
                "Deseja Salvar o Cadastro?",
                "Cadastro de Usuario",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);


        if (i != JOptionPane.YES_OPTION) {
            return;

        }
        cdUsu = Integer.parseInt(txtCodUsu.getText().equals("") ? "0" : txtCodUsu.getText());
        data = txtdata.getText().replaceAll("\\D", "");

        Usuario usuario = new Usuario();

        usuario.setCodigoUsu(cdUsu);
        usuario.setNmUsu(txtNome.getText());
        usuario.setEmail(txtEmail.getText());
        usuario.setSituacao(boxSitu.getSelectedIndex());
        usuario.setSenha(validarSenha());
        usuario.setCargo(boxCargo.getSelectedIndex());
        if (!data.equals("")) {
            Date dataCad = new java.sql.Date(Utils.formatoDataSimples.parse(txtdata.getText()).getTime());
            usuario.setDtCad(dataCad);
        } else {
            usuario.setDtCad(null);
        }
        usuario.setPermissao(per);
        if (cdUsu < 0) {
            int cod = UsuarioOperacao.Salvar(usuario);
            if (cod > 0) {
                txtCodUsu.setText(String.valueOf(cod));
                JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso");
            } else {
                JOptionPane.showMessageDialog(null, "erro no cadastro");
            }
        } else {
            if (!UsuarioOperacao.AtualUsu(usuario)) {
                JOptionPane.showMessageDialog(null, "Cadastro atualizado com sucesso");
            } else {
                JOptionPane.showMessageDialog(null, "erro ao atualizar");
            }
        }
    }
//
//    public Permissao getPermi() {
//        return permissao;
//    }

    private void buscaUsuario(int cdUsu) {
        if (cdUsu > 0) {

            Usuario u;
            u = UsuarioOperacao.getUsuario(cdUsu);

            if (u == null) {
                JOptionPane.showMessageDialog(null, "Funcionario não encontrado!");
            } else {
                txtNome.setText(u.getNmUsu());
                txtEmail.setText(u.getEmail());
                boxSitu.setSelectedIndex(u.getSituacao());
                txtSenha.setText(u.getSenha());
                txtConf.setText(u.getSenha());
                boxCargo.setSelectedIndex(u.getCargo());
                GregorianCalendar gc = new GregorianCalendar();
                txtdata.setText(u.getDtCad() == null ? Utils.formatoDataSimples.format(gc.getTime()) : Utils.formatoDataSimples.format(u.getDtCad()));
                
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                model.getDataVector().removeAllElements();
                jTable1.revalidate();

                if (u.getPermissao() != null && u.getPermissao().size() > 0) {

                    for (Iterator<Permissao> it = u.getPermissao().iterator(); it.hasNext();) {
                        Permissao permi = it.next();

                        model.addRow(new Object[]{
                                    permi.getCdPer(),
                                    permi.getDescricao(),
                                    permi.isVisul(),
                                    permi.isIncluir(),
                                    permi.isAlter(),
                                    permi.isExcluir(),
                                    ""
                                });
                    }

                }
            }
        }
    }

    private void LimparTela() {
        txtCodUsu.setText("0");
        txtNome.setText("");
        txtEmail.setText("");
        txtConf.setText("");
        txtSenha.setText("");
        boxSitu.setSelectedIndex(0);
        boxCargo.setSelectedIndex(0);

        GregorianCalendar gc = new GregorianCalendar();
        txtdata.setText(Utils.formatoDataSimples.format(gc.getTime()));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "CodPer", "Tela", "Visualizar", "Incluir", "Alterar", "Excluir"
                }) {
            Class[] types = new Class[]{
                java.lang.Integer.class, java.lang.String.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean[]{
                false, false, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });

        jScrollPane1.setViewportView(jTable1);

        jTable1.getColumnModel().getColumn(0).setMinWidth(0);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(0);
        jTable1.getColumnModel().getColumn(0).setMaxWidth(0);
        jTable1.getColumnModel().getColumn(2).setMinWidth(55);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(55);
        jTable1.getColumnModel().getColumn(2).setMaxWidth(55);
        jTable1.getColumnModel().getColumn(3).setMinWidth(50);
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(50);
        jTable1.getColumnModel().getColumn(3).setMaxWidth(50);
        jTable1.getColumnModel().getColumn(4).setMinWidth(50);
        jTable1.getColumnModel().getColumn(4).setPreferredWidth(50);
        jTable1.getColumnModel().getColumn(4).setMaxWidth(50);
        jTable1.getColumnModel().getColumn(5).setMinWidth(50);
        jTable1.getColumnModel().getColumn(5).setPreferredWidth(50);
        jTable1.getColumnModel().getColumn(5).setMaxWidth(50);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ConfSenha;
    private javax.swing.JMenuItem MenuSalvar;
    private javax.swing.JLabel Senha;
    private javax.swing.JLabel Senha1;
    private javax.swing.JComboBox boxCargo;
    private javax.swing.JComboBox boxSitu;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton66;
    private javax.swing.JButton jButton72;
    private javax.swing.JButton jButton73;
    private javax.swing.JButton jButton74;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField txtCodUsu;
    private javax.swing.JPasswordField txtConf;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JFormattedTextField txtdata;
    // End of variables declaration//GEN-END:variables
}
