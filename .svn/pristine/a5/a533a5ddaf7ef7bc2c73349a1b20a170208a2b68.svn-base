package br.ifirst.cemec.view;

import br.ifirst.cemec.entidades.ContadorSenha;
import br.ifirst.cemec.entidades.Senha;
import br.ifirst.cemec.entidades.Tratamento;
import br.ifirst.cemec.operacoes.SenhaOperacao;
import br.ifirst.cemec.operacoes.TratamentoOperacao;
import br.ifirst.cemec.view.pesquisa.PesquisarTratamentos;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Iagho
 */
public class InicializarSenha extends javax.swing.JDialog {

    public InicializarSenha(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        txtCodTrat.grabFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtTratamento = new javax.swing.JTextField();
        txtCodTrat = new javax.swing.JFormattedTextField();
        butPesqTrat = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtSenha = new javax.swing.JFormattedTextField();
        butSalvar = new javax.swing.JButton();
        butExcluir3 = new javax.swing.JButton();
        jCheckPref = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Inicializar Senha");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtTratamento.setDocument(new br.ifirst.cemec.util.FieldLimit(50, true));
        txtTratamento.setEditable(false);
        txtTratamento.setFont(new java.awt.Font("Trebuchet MS", 0, 12));
        txtTratamento.setFocusable(false);

        txtCodTrat.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtCodTrat.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtCodTrat.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
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
        txtCodTrat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodTratKeyPressed(evt);
            }
        });

        butPesqTrat.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        butPesqTrat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ifirst/cemec/resources/http-__iconesbr.oficinadanet.com_7715_16x16.png"))); // NOI18N
        butPesqTrat.setFocusable(false);
        butPesqTrat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butPesqTratActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        jLabel8.setText("Tratamento:");

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        jLabel9.setText("Senha:");

        txtSenha.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtSenha.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtSenha.setText("001");
        txtSenha.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });
        txtSenha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSenhaFocusGained(evt);
            }
        });

        butSalvar.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        butSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ifirst/cemec/resources/save1.png"))); // NOI18N
        butSalvar.setText("Salvar");
        butSalvar.setToolTipText("");
        butSalvar.setFocusable(false);
        butSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butSalvarActionPerformed(evt);
            }
        });

        butExcluir3.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        butExcluir3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ifirst/cemec/resources/sair.png"))); // NOI18N
        butExcluir3.setText("Cancelar");
        butExcluir3.setFocusable(false);
        butExcluir3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butExcluir3ActionPerformed(evt);
            }
        });

        jCheckPref.setText("Preferêncial");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtCodTrat, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(butPesqTrat, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTratamento, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCheckPref))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(butSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(butExcluir3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jCheckPref))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butSalvar)
                    .addComponent(butExcluir3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodTratFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodTratFocusLost
        int cod = Integer.parseInt(txtCodTrat.getText().equals("") ? "0" : txtCodTrat.getText());
        if (cod == 0) {
            txtCodTrat.transferFocus();
        }
        BuscarTratamento(cod);
    }//GEN-LAST:event_txtCodTratFocusLost

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
            txtCodTrat.setText(String.valueOf(tratamento.getCdTratamento()));
            txtTratamento.setText(tratamento.getDsTratamento());
        }
    }//GEN-LAST:event_butPesqTratActionPerformed

    private void butSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butSalvarActionPerformed
        SalvarSenhaInicial();
        int cdTrat = Integer.parseInt(txtCodTrat.getText().equals("") ? "0" : txtCodTrat.getText());
        int senha = Integer.parseInt(txtSenha.getText().equals("") ? "0" : txtSenha.getText());
        int pref = jCheckPref.isSelected() == true ? 1 : 0;
        
        Senha s = new Senha();
        s.setCdTrat(cdTrat);
        s.setSenha(senha);
        s.setPreferencial(jCheckPref.isSelected() == true ? 1 : 0);
        
        Senha senh;
        senh = SenhaOperacao.buscarSenha(cdTrat, pref);
        if (senh == null) {
            SenhaOperacao.Salvar(s);
        } else {
            SenhaOperacao.Update(s);
        }
    }//GEN-LAST:event_butSalvarActionPerformed

    private void butExcluir3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butExcluir3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_butExcluir3ActionPerformed

    private void txtCodTratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodTratActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodTratActionPerformed

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        txtSenha.transferFocus();
    }//GEN-LAST:event_txtSenhaActionPerformed

    private void txtSenhaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSenhaFocusGained
        txtSenha.selectAll();
    }//GEN-LAST:event_txtSenhaFocusGained
    private void BuscarTratamento(int cod) {
        if (cod != 0) {
            Tratamento u;
            u = TratamentoOperacao.getTratamento(cod);
            if (u == null) {
                JOptionPane.showMessageDialog(null, "Tratamento não encontrado!");
                return;
            }
            txtTratamento.setText(u.getDsTratamento());
        }
    }

    private void SalvarSenhaInicial() {

        int cdTrat = Integer.parseInt(txtCodTrat.getText().equals("") ? "0" : txtCodTrat.getText());
        int senha = Integer.parseInt(txtSenha.getText().equals("") ? "0" : txtSenha.getText());

        List<Tratamento> list = ContadorSenha.getContSenha();

        for (Iterator<Tratamento> it = list.iterator(); it.hasNext();) {
            Tratamento t = it.next();
            if (cdTrat == t.getCdTratamento()) {
                t.setContSenha(senha - 1);
                list.add(t);
                ContadorSenha.setAContSenha(list);
                JOptionPane.showMessageDialog(null, "Senha Inicial: " + senha);
                return;
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butExcluir3;
    private javax.swing.JButton butPesqTrat;
    private javax.swing.JButton butSalvar;
    private javax.swing.JCheckBox jCheckPref;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JFormattedTextField txtCodTrat;
    private javax.swing.JFormattedTextField txtSenha;
    private javax.swing.JTextField txtTratamento;
    // End of variables declaration//GEN-END:variables
}
