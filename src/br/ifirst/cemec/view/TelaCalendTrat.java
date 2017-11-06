package br.ifirst.cemec.view;

import br.ifirst.cemec.entidades.CalendarioTratamento;
import br.ifirst.cemec.entidades.Tratamento;
import br.ifirst.cemec.operacoes.CalendarioTratamentoOperacao;
import br.ifirst.cemec.operacoes.TratamentoOperacao;
import br.ifirst.cemec.view.pesquisa.PesquisarTratamentos;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Iagho
 */
public class TelaCalendTrat extends javax.swing.JDialog {

    Date dtIni, dtFin;

    public TelaCalendTrat(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtCodTratamento = new javax.swing.JFormattedTextField();
        txtTratamento = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        butSalvar2 = new javax.swing.JButton();
        butLimpar2 = new javax.swing.JButton();
        butExcluir11 = new javax.swing.JButton();
        butDefDatas = new javax.swing.JButton();
        butExcluir10 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jCheckTodos = new javax.swing.JCheckBox();
        jCheckSeg = new javax.swing.JCheckBox();
        jCheckTer = new javax.swing.JCheckBox();
        jCheckQua = new javax.swing.JCheckBox();
        jCheckQui = new javax.swing.JCheckBox();
        jCheckSex = new javax.swing.JCheckBox();
        jCheckSab = new javax.swing.JCheckBox();
        jCheckDom = new javax.swing.JCheckBox();
        txtDateIni = new com.toedter.calendar.JDateChooser("dd/MM/yyyy", "##/##/#####", '_');
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtDateFin = new com.toedter.calendar.JDateChooser("dd/MM/yyyy", "##/##/#####", '_');

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Calendário de Tratamento");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        jLabel4.setText("Tratamento:");

        txtCodTratamento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtCodTratamento.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtCodTratamento.setText("0");
        txtCodTratamento.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
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
        txtTratamento.setEditable(false);
        txtTratamento.setFont(new java.awt.Font("Trebuchet MS", 0, 12));
        txtTratamento.setFocusable(false);

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

        butExcluir11.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        butExcluir11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ifirst/cemec/resources/sair.png"))); // NOI18N
        butExcluir11.setText("Fechar");
        butExcluir11.setFocusable(false);
        butExcluir11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butExcluir11ActionPerformed(evt);
            }
        });

        butDefDatas.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        butDefDatas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ifirst/cemec/resources/calendario.png"))); // NOI18N
        butDefDatas.setEnabled(false);
        butDefDatas.setFocusable(false);
        butDefDatas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butDefDatasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(butSalvar2)
                .addGap(18, 18, 18)
                .addComponent(butLimpar2)
                .addGap(18, 18, 18)
                .addComponent(butExcluir11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(butDefDatas)
                .addContainerGap())
        );

        jPanel6Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {butExcluir11, butLimpar2, butSalvar2});

        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(butDefDatas, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(butSalvar2)
                        .addComponent(butLimpar2)
                        .addComponent(butExcluir11)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {butExcluir11, butLimpar2, butSalvar2});

        butExcluir10.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        butExcluir10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ifirst/cemec/resources/http-__iconesbr.oficinadanet.com_7715_16x16.png"))); // NOI18N
        butExcluir10.setFocusable(false);
        butExcluir10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butExcluir10ActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Dias Semana", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 0, 14), new java.awt.Color(0, 0, 255))); // NOI18N

        jCheckTodos.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jCheckTodos.setSelected(true);
        jCheckTodos.setText("Todos");
        jCheckTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckTodosActionPerformed(evt);
            }
        });

        jCheckSeg.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jCheckSeg.setText("Segunda-Feira");
        jCheckSeg.setEnabled(false);

        jCheckTer.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jCheckTer.setText("Terça-Feira");
        jCheckTer.setEnabled(false);

        jCheckQua.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jCheckQua.setText("Quarta-Feira");
        jCheckQua.setEnabled(false);

        jCheckQui.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jCheckQui.setText("Quinta-Feira");
        jCheckQui.setEnabled(false);

        jCheckSex.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jCheckSex.setText("Sexta-Feira");
        jCheckSex.setEnabled(false);

        jCheckSab.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jCheckSab.setText("Sábado");
        jCheckSab.setEnabled(false);

        jCheckDom.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jCheckDom.setText("Domingo");
        jCheckDom.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckTodos)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckSeg)
                            .addComponent(jCheckTer))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckQua)
                            .addComponent(jCheckQui))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jCheckSex)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckDom))
                            .addComponent(jCheckSab))))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jCheckTodos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckSeg)
                    .addComponent(jCheckQua)
                    .addComponent(jCheckSex)
                    .addComponent(jCheckDom))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckTer)
                    .addComponent(jCheckQui)
                    .addComponent(jCheckSab)))
        );

        txtDateIni.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        jLabel5.setText("Data inicial:");

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        jLabel6.setText("Data final:");

        txtDateFin.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtCodTratamento, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(butExcluir10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTratamento, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtDateIni, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDateFin, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtTratamento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtCodTratamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(butExcluir10, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(txtDateIni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtDateFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {butExcluir10, txtCodTratamento});

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

    private void butSalvar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butSalvar2ActionPerformed
        try {
            salvarCalendario();
        } catch (ParseException ex) {
            Logger.getLogger(TelaCalendTrat.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_butSalvar2ActionPerformed

    private void butLimpar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butLimpar2ActionPerformed
        LimparTela();
    }//GEN-LAST:event_butLimpar2ActionPerformed

    private void butExcluir11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butExcluir11ActionPerformed
        this.dispose();
    }//GEN-LAST:event_butExcluir11ActionPerformed

    private void butExcluir10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butExcluir10ActionPerformed
        PesquisarTratamentos pesquisarTratamentos = new PesquisarTratamentos(this, true);
        pesquisarTratamentos.setVisible(true);
        Tratamento tratamento = pesquisarTratamentos.getTratamento();

        if (tratamento != null) {
            txtCodTratamento.setText(String.valueOf(tratamento.getCdTratamento()));
            txtTratamento.setText(tratamento.getDsTratamento());
        }
    }//GEN-LAST:event_butExcluir10ActionPerformed

    private void jCheckTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckTodosActionPerformed
        if (jCheckTodos.isSelected()) {

            jCheckSeg.setEnabled(false);
            jCheckTer.setEnabled(false);
            jCheckQua.setEnabled(false);
            jCheckQui.setEnabled(false);
            jCheckSex.setEnabled(false);
            jCheckSab.setEnabled(false);
            jCheckDom.setEnabled(false);

            jCheckSeg.setSelected(false);
            jCheckTer.setSelected(false);
            jCheckQua.setSelected(false);
            jCheckQui.setSelected(false);
            jCheckSex.setSelected(false);
            jCheckSab.setSelected(false);
            jCheckDom.setSelected(false);
        } else {
            jCheckSeg.setEnabled(true);
            jCheckTer.setEnabled(true);
            jCheckQua.setEnabled(true);
            jCheckQui.setEnabled(true);
            jCheckSex.setEnabled(true);
            jCheckSab.setEnabled(true);
            jCheckDom.setEnabled(true);
        }
    }//GEN-LAST:event_jCheckTodosActionPerformed

    private void butDefDatasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butDefDatasActionPerformed
        if (txtDateIni.getDate() != null || txtDateFin.getDate() != null) {
            Tratamento t = new Tratamento();
            t.setCdTratamento(Integer.parseInt(txtCodTratamento.getText().equals("") ? "0" : txtCodTratamento.getText()));
            t.setDsTratamento(txtTratamento.getText());
            t.setDtInicial(txtDateIni.getDate());
            t.setDtFinal(txtDateFin.getDate());
            CalendarioTratamento ct = new CalendarioTratamento();
            if (jCheckTodos.isSelected() == true) {
                ct.setDom(1);
                ct.setSeg(1);
                ct.setTer(1);
                ct.setQua(1);
                ct.setQui(1);
                ct.setSex(1);
                ct.setSab(1);
            } else {
                ct.setDom(jCheckDom.isSelected() == true ? 1 : 0);
                ct.setSeg(jCheckSeg.isSelected() == true ? 1 : 0);
                ct.setTer(jCheckTer.isSelected() == true ? 1 : 0);
                ct.setQua(jCheckQua.isSelected() == true ? 1 : 0);
                ct.setQui(jCheckQui.isSelected() == true ? 1 : 0);
                ct.setSex(jCheckSex.isSelected() == true ? 1 : 0);
                ct.setSab(jCheckSab.isSelected() == true ? 1 : 0);
            }
            t.setCalendarioTratamento(ct);

            TelaDefDatas dd = new TelaDefDatas(this, true, t);
            dd.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Por favor define a data inicial e a data final antes!");
        }
    }//GEN-LAST:event_butDefDatasActionPerformed
    private void salvarCalendario() throws ParseException {
        Object[] options = {"Sim", "Não"};
        int i = JOptionPane.showOptionDialog(null,
                "Deseja salvar o calendario do tratamento ?",
                "Cadastro de Calendario de tratamento",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

        if (i != JOptionPane.YES_OPTION) {
            return;

        }
        dtIni = txtDateIni.getDate();
        dtFin = txtDateFin.getDate();

        CalendarioTratamento ct = new CalendarioTratamento();

        ct.setCdTratamento(Integer.parseInt(txtCodTratamento.getText().equals("") ? "0" : txtCodTratamento.getText()));
        if (dtIni != null) {
            java.sql.Date datIni = new java.sql.Date(dtIni.getTime());
            ct.setDtIni(datIni);
        } else {
            ct.setDtIni(null);
        }
        if (dtFin != null) {
            java.sql.Date datFin = new java.sql.Date(dtFin.getTime());
            ct.setDtFin(datFin);
        } else {
            ct.setDtFin(null);
        }

        if (jCheckTodos.isSelected()) {
            ct.setTodosDias(1);
        } else {
            ct.setDom(jCheckDom.isSelected() == true ? 1 : 0);
            ct.setSeg(jCheckSeg.isSelected() == true ? 1 : 0);
            ct.setTer(jCheckTer.isSelected() == true ? 1 : 0);
            ct.setQua(jCheckQua.isSelected() == true ? 1 : 0);
            ct.setQui(jCheckQui.isSelected() == true ? 1 : 0);
            ct.setSex(jCheckSex.isSelected() == true ? 1 : 0);
            ct.setSab(jCheckSab.isSelected() == true ? 1 : 0);
        }
        CalendarioTratamento conferi;
        conferi = CalendarioTratamentoOperacao.ConferiTratamento(ct.getCdTratamento());
        if (conferi == null) {
            if (!CalendarioTratamentoOperacao.Salvar(ct)) {
                JOptionPane.showMessageDialog(null, "Calendario salvo com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "erro ao salvar");
            }
        } else {
            if (!CalendarioTratamentoOperacao.Alterar(ct)) {
                JOptionPane.showMessageDialog(null, "Calendario alterado!");
            } else {
                JOptionPane.showMessageDialog(null, "erro ao alterar");
            }
        }
    }

    private void LimparTela() {
        txtDateIni.setDate(null);
        txtDateFin.setDate(null);
        txtCodTratamento.setText("");
        txtTratamento.setText("");

        butDefDatas.setEnabled(false);

        jCheckSeg.setEnabled(false);
        jCheckTer.setEnabled(false);
        jCheckQua.setEnabled(false);
        jCheckQui.setEnabled(false);
        jCheckSex.setEnabled(false);
        jCheckSab.setEnabled(false);
        jCheckDom.setEnabled(false);

        jCheckSeg.setSelected(false);
        jCheckTer.setSelected(false);
        jCheckQua.setSelected(false);
        jCheckQui.setSelected(false);
        jCheckSex.setSelected(false);
        jCheckSab.setSelected(false);
        jCheckDom.setSelected(false);
        jCheckTodos.setSelected(true);
    }

    private void BuscarTratamento(int cod) {
        if (cod != 0) {
            Tratamento tratCal;
            tratCal = TratamentoOperacao.getTratamentoCalendar(cod);
            if (tratCal == null) {
                Tratamento t;
                t = TratamentoOperacao.getTratamento(cod);
                if (t == null) {
                    JOptionPane.showMessageDialog(null, "Tratamento não encontrado!");
                    LimparTela();
                    return;
                }
                LimparTela();
                txtCodTratamento.setText(String.valueOf(t.getCdTratamento()));
                txtTratamento.setText(t.getDsTratamento());
                return;
            }
            txtTratamento.setText(tratCal.getDsTratamento());
            txtDateIni.setDate(tratCal.getCalendarioTratamento().getDtIni());
            txtDateFin.setDate(tratCal.getCalendarioTratamento().getDtFin());

            if (tratCal.getDataDef() == 1) {
                butDefDatas.setEnabled(true);
            } else {
                butDefDatas.setEnabled(false);
            }
            if (tratCal.getCalendarioTratamento().getTodosDias() == 1) {
                jCheckTodos.setSelected(true);
                jCheckSeg.setEnabled(false);
                jCheckTer.setEnabled(false);
                jCheckQua.setEnabled(false);
                jCheckQui.setEnabled(false);
                jCheckSex.setEnabled(false);
                jCheckSab.setEnabled(false);
                jCheckDom.setEnabled(false);

                jCheckSeg.setSelected(false);
                jCheckTer.setSelected(false);
                jCheckQua.setSelected(false);
                jCheckQui.setSelected(false);
                jCheckSex.setSelected(false);
                jCheckSab.setSelected(false);
                jCheckDom.setSelected(false);
                jCheckTodos.setSelected(true);
            } else {
                jCheckSeg.setEnabled(true);
                jCheckTer.setEnabled(true);
                jCheckQua.setEnabled(true);
                jCheckQui.setEnabled(true);
                jCheckSex.setEnabled(true);
                jCheckSab.setEnabled(true);
                jCheckDom.setEnabled(true);
                jCheckTodos.setEnabled(true);

                jCheckSeg.setSelected(tratCal.getCalendarioTratamento().getSeg() == 1 ? true : false);
                jCheckTer.setSelected(tratCal.getCalendarioTratamento().getTer() == 1 ? true : false);
                jCheckQua.setSelected(tratCal.getCalendarioTratamento().getQua() == 1 ? true : false);
                jCheckQui.setSelected(tratCal.getCalendarioTratamento().getQui() == 1 ? true : false);
                jCheckSex.setSelected(tratCal.getCalendarioTratamento().getSex() == 1 ? true : false);
                jCheckSab.setSelected(tratCal.getCalendarioTratamento().getSab() == 1 ? true : false);
                jCheckDom.setSelected(tratCal.getCalendarioTratamento().getDom() == 1 ? true : false);
                jCheckTodos.setSelected(false);
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butDefDatas;
    private javax.swing.JButton butExcluir10;
    private javax.swing.JButton butExcluir11;
    private javax.swing.JButton butLimpar2;
    private javax.swing.JButton butSalvar2;
    private javax.swing.JCheckBox jCheckDom;
    private javax.swing.JCheckBox jCheckQua;
    private javax.swing.JCheckBox jCheckQui;
    private javax.swing.JCheckBox jCheckSab;
    private javax.swing.JCheckBox jCheckSeg;
    private javax.swing.JCheckBox jCheckSex;
    private javax.swing.JCheckBox jCheckTer;
    private javax.swing.JCheckBox jCheckTodos;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JFormattedTextField txtCodTratamento;
    private com.toedter.calendar.JDateChooser txtDateFin;
    private com.toedter.calendar.JDateChooser txtDateIni;
    private javax.swing.JTextField txtTratamento;
    // End of variables declaration//GEN-END:variables
}
