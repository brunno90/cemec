package br.ifirst.cemec.view;

import br.ifirst.cemec.entidades.Tratamento;
import br.ifirst.cemec.operacoes.TratamentoOperacao;
import br.ifirst.cemec.view.pesquisa.PesquisarTratamentos;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Iagho
 */
public class TeleCadTratamento extends javax.swing.JDialog {

    public TeleCadTratamento(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        butSalvar2 = new javax.swing.JButton();
        butLimpar2 = new javax.swing.JButton();
        butExcluir8 = new javax.swing.JButton();
        butExcluir9 = new javax.swing.JButton();
        butExcluir11 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtCodTratamento = new javax.swing.JFormattedTextField();
        txtTratamento = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jCheckPed = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jCheckNaoRecPres = new javax.swing.JCheckBox();
        jCheckNaoRecCal = new javax.swing.JCheckBox();
        jCheckDatDef = new javax.swing.JCheckBox();
        jCheckMedium = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        butSalvar2.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        butSalvar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ifirst/cemec/resources/save1.png"))); // NOI18N
        butSalvar2.setText("Salvar");
        butSalvar2.setToolTipText("");
        butSalvar2.setFocusable(false);
        butSalvar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butSalvar2ActionPerformed(evt);
            }
        });

        butLimpar2.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        butLimpar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ifirst/cemec/resources/arquivo.png"))); // NOI18N
        butLimpar2.setText("Novo");
        butLimpar2.setFocusable(false);
        butLimpar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butLimpar2ActionPerformed(evt);
            }
        });

        butExcluir8.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        butExcluir8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ifirst/cemec/resources/Lixeira2.png"))); // NOI18N
        butExcluir8.setText("Excluir");
        butExcluir8.setFocusable(false);
        butExcluir8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butExcluir8ActionPerformed(evt);
            }
        });

        butExcluir9.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        butExcluir9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ifirst/cemec/resources/http-__iconesbr.oficinadanet.com_7715_16x16.png"))); // NOI18N
        butExcluir9.setText("Buscar");
        butExcluir9.setFocusable(false);
        butExcluir9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butExcluir9ActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(butSalvar2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(butLimpar2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(butExcluir9)
                .addGap(14, 14, 14)
                .addComponent(butExcluir8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(butExcluir11)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        jPanel6Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {butExcluir11, butExcluir8, butExcluir9, butLimpar2, butSalvar2});

        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butSalvar2)
                    .addComponent(butLimpar2)
                    .addComponent(butExcluir8)
                    .addComponent(butExcluir11)
                    .addComponent(butExcluir9))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {butExcluir11, butExcluir8, butExcluir9, butLimpar2, butSalvar2});

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        jLabel4.setText("Código:");

        txtCodTratamento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtCodTratamento.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtCodTratamento.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtCodTratamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodTratamentoActionPerformed(evt);
            }
        });
        txtCodTratamento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCodTratamentoFocusLost(evt);
            }
        });
        txtCodTratamento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodTratamentoKeyPressed(evt);
            }
        });

        txtTratamento.setDocument(new br.ifirst.cemec.util.FieldLimit(50, true));
        txtTratamento.setFont(new java.awt.Font("Trebuchet MS", 0, 12));
        txtTratamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTratamentoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        jLabel5.setText("Recomendações do Tratamento:");

        jCheckPed.setText("Periódico");
        jCheckPed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckPedActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        jLabel6.setText("Descrição:");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jCheckNaoRecPres.setText("Não requer presença");

        jCheckNaoRecCal.setText("Não requer calendario");
        jCheckNaoRecCal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckNaoRecCalActionPerformed(evt);
            }
        });

        jCheckDatDef.setText("Datas definidas");
        jCheckDatDef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckDatDefActionPerformed(evt);
            }
        });

        jCheckMedium.setText("Exige Medium");
        jCheckMedium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckMediumActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodTratamento, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTratamento))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckDatDef)
                                    .addComponent(jCheckPed))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckNaoRecPres)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jCheckNaoRecCal)
                                        .addGap(18, 18, 18)
                                        .addComponent(jCheckMedium)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCodTratamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(txtTratamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckNaoRecCal)
                    .addComponent(jCheckDatDef)
                    .addComponent(jCheckMedium))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckPed)
                    .addComponent(jCheckNaoRecPres))
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

    private void butSalvar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butSalvar2ActionPerformed
        try {
            SalvarTratamento();
        } catch (ParseException ex) {
            Logger.getLogger(TeleCadTratamento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_butSalvar2ActionPerformed

    private void butLimpar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butLimpar2ActionPerformed
        LimparTela();
    }//GEN-LAST:event_butLimpar2ActionPerformed

    private void butExcluir8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butExcluir8ActionPerformed
        int cod = Integer.parseInt(txtCodTratamento.getText().equals("") ? "0" : txtCodTratamento.getText());
        if (cod == 0) {
            txtCodTratamento.transferFocus();
        }
        boolean result = TratamentoOperacao.Excluir(cod);
        if (result == false) {
            JOptionPane.showMessageDialog(null, "Tratamento excluido!");
        } else {
            JOptionPane.showMessageDialog(null, "erro ao excluir");
        }
    }//GEN-LAST:event_butExcluir8ActionPerformed

    private void butExcluir9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butExcluir9ActionPerformed
        PesquisarTratamentos pesquisarTratamentos = new PesquisarTratamentos(this, true);
        pesquisarTratamentos.setVisible(true);
        Tratamento tratamento = pesquisarTratamentos.getTratamento();

        if (tratamento != null) {
            txtCodTratamento.setText(String.valueOf(tratamento.getCdTratamento()));
            BuscarTratamento(tratamento.getCdTratamento());
        }
    }//GEN-LAST:event_butExcluir9ActionPerformed

    private void butExcluir11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butExcluir11ActionPerformed
        this.dispose();
    }//GEN-LAST:event_butExcluir11ActionPerformed

    private void txtCodTratamentoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodTratamentoFocusLost
        int cod = Integer.parseInt(txtCodTratamento.getText().equals("") ? "0" : txtCodTratamento.getText());
        if (cod == 0) {
            txtCodTratamento.transferFocus();
        }
        BuscarTratamento(cod);
    }//GEN-LAST:event_txtCodTratamentoFocusLost

    private void txtCodTratamentoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodTratamentoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_TAB) {
            int cod = Integer.parseInt(txtCodTratamento.getText().equals("") ? "0" : txtCodTratamento.getText());
            if (cod == 0) {
                txtCodTratamento.transferFocus();
            }
            BuscarTratamento(cod);
        }
    }//GEN-LAST:event_txtCodTratamentoKeyPressed

    private void jCheckNaoRecCalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckNaoRecCalActionPerformed
        jCheckDatDef.setSelected(false);
        jCheckPed.setSelected(false);
    }//GEN-LAST:event_jCheckNaoRecCalActionPerformed

    private void jCheckPedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckPedActionPerformed
        if (jCheckNaoRecCal.isSelected() == true) {
            jCheckNaoRecCal.setSelected(false);
        }
    }//GEN-LAST:event_jCheckPedActionPerformed

    private void jCheckDatDefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckDatDefActionPerformed
        if (jCheckNaoRecCal.isSelected() == true) {
            jCheckNaoRecCal.setSelected(false);
        }
    }//GEN-LAST:event_jCheckDatDefActionPerformed

    private void jCheckMediumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckMediumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckMediumActionPerformed

    private void txtCodTratamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodTratamentoActionPerformed
        txtCodTratamento.transferFocus();
    }//GEN-LAST:event_txtCodTratamentoActionPerformed

    private void txtTratamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTratamentoActionPerformed
        txtTratamento.transferFocus();
    }//GEN-LAST:event_txtTratamentoActionPerformed
    private void BuscarTratamento(int cod) {
        if (cod != 0) {
            Tratamento u;
            u = TratamentoOperacao.getTratamento(cod);
            if (u == null) {
                JOptionPane.showMessageDialog(null, "Tratamento não encontrado!");
                LimparTela();
                return;
            }
            txtTratamento.setText(u.getDsTratamento());
            jTextArea1.setText(u.getRecTratamento());
            jCheckNaoRecPres.setSelected(u.getNaoRecPres() == 1 ? true : false);
            jCheckPed.setSelected(u.getPeriodico() == 1 ? true : false);
            jCheckNaoRecCal.setSelected(u.getNaoRequerCalendario() == 1 ? true : false);
            jCheckDatDef.setSelected(u.getDataDef() == 1 ? true : false);
            jCheckMedium.setSelected(u.getMedium() == 1 ? true : false);

        }
    }

    private void SalvarTratamento() throws ParseException {

        Object[] options = {"Sim", "Não"};
        int i = JOptionPane.showOptionDialog(null,
                "Deseja salvar o cadatro ?",
                "Cadastro de Tratamentos",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

        if (i != JOptionPane.YES_OPTION) {
            return;

        }
        Tratamento t = new Tratamento();

        t.setCdTratamento(Integer.parseInt(txtCodTratamento.getText().equals("") ? "0" : txtCodTratamento.getText()));
        t.setDsTratamento(txtTratamento.getText());
        t.setRecTratamento(jTextArea1.getText());
        t.setNaoRecPres(jCheckNaoRecPres.isSelected() == true ? 1 : 0);
        t.setPeriodico(jCheckPed.isSelected() == true ? 1 : 0);
        t.setNaoRequerCalendario(jCheckNaoRecCal.isSelected() == true ? 1 : 0);
        t.setDataDef(jCheckDatDef.isSelected() == true ? 1 : 0);
        t.setMedium(jCheckMedium.isSelected()== true ? 1 : 0);

        if (t.getCdTratamento() == 0) {
            if (TratamentoOperacao.Salvar(t) != 0) {
                JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso");
                txtCodTratamento.setText(String.valueOf(t.getCdTratamento()));
            } else {
                JOptionPane.showMessageDialog(null, "erro no cadastro");
            }
        } else if (t.getCdTratamento() > 0) {
            if (!TratamentoOperacao.Alterar(t)) {
                JOptionPane.showMessageDialog(null, "Cadastro alterado com sucesso");
            } else {
                JOptionPane.showMessageDialog(null, "erro ao alterar");
            }
        }
    }

    private void LimparTela() {
        txtCodTratamento.setText("0");
        txtTratamento.setText("");
        jTextArea1.setText("");
        jCheckNaoRecPres.setSelected(false);
        jCheckPed.setSelected(false);
        jCheckNaoRecCal.setSelected(false);
        jCheckDatDef.setSelected(false);
        jCheckMedium.setSelected(false);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butExcluir11;
    private javax.swing.JButton butExcluir8;
    private javax.swing.JButton butExcluir9;
    private javax.swing.JButton butLimpar2;
    private javax.swing.JButton butSalvar2;
    private javax.swing.JCheckBox jCheckDatDef;
    private javax.swing.JCheckBox jCheckMedium;
    private javax.swing.JCheckBox jCheckNaoRecCal;
    private javax.swing.JCheckBox jCheckNaoRecPres;
    private javax.swing.JCheckBox jCheckPed;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JFormattedTextField txtCodTratamento;
    private javax.swing.JTextField txtTratamento;
    // End of variables declaration//GEN-END:variables
}