package br.ifirst.cemec.view;

import br.ifirst.cemec.entidades.Frequentador;
import br.ifirst.cemec.entidades.Senha;
import br.ifirst.cemec.entidades.Tratamento;
import br.ifirst.cemec.operacoes.FrequentadorOperacao;
import br.ifirst.cemec.operacoes.SenhaOperacao;
import br.ifirst.cemec.operacoes.TratamentoOperacao;
import br.ifirst.cemec.util.Utils;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Iagho
 */
public class TelaPresenca extends javax.swing.JDialog {

    private List<Tratamento> movTratamentos;
    private Tratamento movTratamento;
    int box = 0;
    String pesq = "%%%";

    public TelaPresenca(JDialog aThis, boolean b) {
        super(aThis, b);
        initComponents();
        setLocationRelativeTo(null);
        carregaTable(box, pesq);
        formatarCampos();
    }

    public TelaPresenca(JFrame aThis, boolean b) {
        super(aThis, b);
        initComponents();
        setLocationRelativeTo(null);
        carregaTable(box, pesq);
        formatarCampos();
    }

    private void formatarCampos() {
        Utils.mascaraData().install(txtBuscaMov);

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        butPesq = new javax.swing.JButton();
        txtPesq = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox();
        jPanel4 = new javax.swing.JPanel();
        butAlterar = new javax.swing.JButton();
        butNovo = new javax.swing.JButton();
        butExcluir2 = new javax.swing.JButton();
        butFechar1 = new javax.swing.JButton();
        butGerar = new javax.swing.JButton();
        txtBuscaMov = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lista de Presença");
        setModalityType(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        butPesq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ifirst/cemec/resources/http-__iconesbr.oficinadanet.com_7715_16x16.png"))); // NOI18N
        butPesq.setText("Pesquisar");
        butPesq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butPesqActionPerformed(evt);
            }
        });

        txtPesq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesqActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "CodMov", "CdFreq", "Frequentador", "CdTrat", "Tratamento", "Data Inicial", "Data Final", "Presente"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(0);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(0);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(0);
            jTable1.getColumnModel().getColumn(1).setMinWidth(0);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(0);
            jTable1.getColumnModel().getColumn(1).setMaxWidth(0);
            jTable1.getColumnModel().getColumn(3).setMinWidth(0);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(0);
            jTable1.getColumnModel().getColumn(3).setMaxWidth(0);
            jTable1.getColumnModel().getColumn(5).setMinWidth(70);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(70);
            jTable1.getColumnModel().getColumn(5).setMaxWidth(70);
            jTable1.getColumnModel().getColumn(6).setMinWidth(70);
            jTable1.getColumnModel().getColumn(6).setPreferredWidth(70);
            jTable1.getColumnModel().getColumn(6).setMaxWidth(70);
            jTable1.getColumnModel().getColumn(7).setMinWidth(70);
            jTable1.getColumnModel().getColumn(7).setPreferredWidth(70);
            jTable1.getColumnModel().getColumn(7).setMaxWidth(70);
        }

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nome", "Tratamento" }));

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        butAlterar.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        butAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ifirst/cemec/resources/save1.png"))); // NOI18N
        butAlterar.setText("Alterar");
        butAlterar.setToolTipText("");
        butAlterar.setFocusable(false);
        butAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butAlterarActionPerformed(evt);
            }
        });

        butNovo.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        butNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ifirst/cemec/resources/arquivo.png"))); // NOI18N
        butNovo.setText("Novo");
        butNovo.setFocusable(false);
        butNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butNovoActionPerformed(evt);
            }
        });

        butExcluir2.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        butExcluir2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ifirst/cemec/resources/fazer2.png"))); // NOI18N
        butExcluir2.setText("Presença");
        butExcluir2.setFocusable(false);
        butExcluir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butExcluir2ActionPerformed(evt);
            }
        });

        butFechar1.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        butFechar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ifirst/cemec/resources/sair.png"))); // NOI18N
        butFechar1.setText("Fechar");
        butFechar1.setFocusable(false);
        butFechar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butFechar1ActionPerformed(evt);
            }
        });

        butGerar.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        butGerar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ifirst/cemec/resources/Lixeira2.png"))); // NOI18N
        butGerar.setText("Excluir");
        butGerar.setFocusable(false);
        butGerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butGerarActionPerformed(evt);
            }
        });

        txtBuscaMov.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtBuscaMov.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtBuscaMovFocusLost(evt);
            }
        });
        txtBuscaMov.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscaMovActionPerformed(evt);
            }
        });
        txtBuscaMov.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscaMovKeyReleased2(evt);
            }
        });

        jLabel1.setText("Data Movimentação :");

        jButton1.setText("Nova Busca");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(butAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(butNovo)
                    .addComponent(txtBuscaMov, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(butExcluir2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(butGerar)
                        .addGap(18, 18, 18)
                        .addComponent(butFechar1))
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {butAlterar, butExcluir2, butFechar1, butGerar, butNovo});

        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butAlterar)
                    .addComponent(butNovo)
                    .addComponent(butExcluir2)
                    .addComponent(butFechar1)
                    .addComponent(butGerar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscaMov, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(butPesq)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butPesq)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
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
        pesq = txtPesq.getText();

        if (txtPesq.getText().length() > 2) {
            carregaTable(box, pesq);
        }
    }//GEN-LAST:event_butPesqActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        if (jTable1.getSelectedColumn() == 7) {
            boolean presenca = Boolean.parseBoolean(jTable1.getValueAt(jTable1.getSelectedRow(), 7).toString());
            if (presenca == true) {
                gerarSenha();
            } else {
                Object[] options = {"Sim", "Não"};
                int i = JOptionPane.showOptionDialog(null,
                        "Deseja retirar a presença do frequentador ?",
                        "Movimento de Tratamento",
                        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

                if (i != JOptionPane.YES_OPTION) {
                    return;
                }
                tirarPresenca();
            }
            box = 0;
            pesq = "%%%";
            carregaTable(box, pesq);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void butAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butAlterarActionPerformed

        int codMov = Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
        int cdTrat = Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString());
        Tratamento t;
        t = BuscarTratamento(cdTrat);
        Tratamento edt;
        edt = EditarMov(codMov);
        t.setCdMov(edt.getCdMov());
        t.setCdTratamento(edt.getCdTratamento());
        t.setDtInicial(edt.getDtInicial());
        t.setDtFinal(edt.getDtFinal());
        t.setQtDias(edt.getQtDias());
        t.setTratDistancia(edt.getTratDistancia());
        t.setTpPeriodo(edt.getTpPeriodo());
        if (t != null) {
            if (t.getPeriodico() == 1) {
                TratamentosTipo2(t);
            } else {
                TratamentosTipo1(t);
            }
            box = 0;
            pesq = "%%%";
            carregaTable(box, pesq);
        }



    }//GEN-LAST:event_butAlterarActionPerformed

    private void butNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butNovoActionPerformed
        TelaMovTratamento movTratamento = new TelaMovTratamento(null);
        movTratamento.setVisible(true);
        movTratamento.toFront();
    }//GEN-LAST:event_butNovoActionPerformed

    private void butExcluir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butExcluir2ActionPerformed
        boolean presenca = Boolean.parseBoolean(jTable1.getValueAt(jTable1.getSelectedRow(), 7).toString());
        if (presenca == false) {
            gerarSenha();
        } else {
            Object[] options = {"Sim", "Não"};
            int i = JOptionPane.showOptionDialog(null,
                    "Deseja retirar a presença do frequentador ?",
                    "Movimento de Tratamento",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

            if (i != JOptionPane.YES_OPTION) {
                return;
            }
            tirarPresenca();
        }
        box = 0;
        pesq = "%%%";
        carregaTable(box, pesq);
    }//GEN-LAST:event_butExcluir2ActionPerformed

    private void butFechar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butFechar1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_butFechar1ActionPerformed

    private void butGerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butGerarActionPerformed
        int codMov = Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
        excluirMovTratamento(codMov);
    }//GEN-LAST:event_butGerarActionPerformed

    private void txtPesqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesqActionPerformed
        box = jComboBox1.getSelectedIndex();
        pesq = txtPesq.getText();

        if (txtPesq.getText().length() > 2) {
            carregaTable(box, pesq);
        }
    }//GEN-LAST:event_txtPesqActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String data = txtBuscaMov.getText();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.getDataVector().removeAllElements();
        jTable1.revalidate();

        movTratamentos = TratamentoOperacao.PesquisaMovTratamentos(box, pesq, data);

        for (Tratamento t : movTratamentos) {

            model.addRow(new Object[]{
                t.getCdMov(),
                t.getFrequentador().getCdFrequentador(),
                t.getFrequentador().getNmFrequentador(),
                t.getCdTratamento(),
                t.getDsTratamento(),
                t.getDtInicial() == null ? "" : Utils.formatoDataSimples.format(t.getDtInicial()),
                t.getDtFinal() == null ? "" : Utils.formatoDataSimples.format(t.getDtFinal()),
                t.getPresenca(),
                ""
            });
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void carregaTableData(int box, String pesq) {

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.getDataVector().removeAllElements();
        jTable1.revalidate();

        movTratamentos = TratamentoOperacao.PesquisaMovTratamentos(box, pesq);

        for (Tratamento t : movTratamentos) {

            model.addRow(new Object[]{
                t.getCdMov(),
                t.getFrequentador().getCdFrequentador(),
                t.getFrequentador().getNmFrequentador(),
                t.getCdTratamento(),
                t.getDsTratamento(),
                t.getDtInicial() == null ? "" : Utils.formatoDataSimples.format(t.getDtInicial()),
                t.getDtFinal() == null ? "" : Utils.formatoDataSimples.format(t.getDtFinal()),
                t.getPresenca(),
                ""
            });
        }
    }
        
    private void txtBuscaMovActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscaMovActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscaMovActionPerformed

    private void txtBuscaMovKeyReleased2(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaMovKeyReleased2
          if (txtBuscaMov.getText().trim().replaceAll("\\D", "").length() == 8) {
            txtBuscaMov.transferFocus();
        }
    }//GEN-LAST:event_txtBuscaMovKeyReleased2
    private void formatarData() {
        String data = txtBuscaMov.getText();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        df.setLenient(false); //somente cria a data se a formação da mesma for correta
        java.util.Date d = null;
        try {
            d = (java.util.Date) df.parse(data);
        } catch (ParseException ex) {
            Logger.getLogger(TelaPresenca.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void txtBuscaMovFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBuscaMovFocusLost
        String dataNascimento = txtBuscaMov.getText().replaceAll("\\D", "");
        if (!dataNascimento.equals("") && dataNascimento.length() == 8) {
            formatarData();
        }
     }//GEN-LAST:event_txtBuscaMovFocusLost
    private Tratamento BuscarTratamento(int cod) {
        Tratamento u = null;

        if (cod != 0) {
            u = TratamentoOperacao.getTratamentoCalendar(cod);
        }
        return u;
    }

    private Tratamento EditarMov(int cdMov) {
        Tratamento t;
        t = TratamentoOperacao.getMovTratamento(cdMov);
        return t;
    }

    public void TratamentosTipo1(Tratamento tr) {

        Frequentador f = new Frequentador();
        f.setCdFrequentador(Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString()));
        tr.setFrequentador(f);
        PainelTpTratamento1 tpTratamento1 = new PainelTpTratamento1(this, true, tr);
        tpTratamento1.setVisible(true);
    }

    public void TratamentosTipo2(Tratamento tr) {

        Frequentador f = new Frequentador();
        f.setCdFrequentador(Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString()));
        tr.setFrequentador(f);
        PainelTpTratamento2 tpTratamento = new PainelTpTratamento2(this, true, tr);
        tpTratamento.setVisible(true);
    }

    private void excluirMovTratamento(int codMov) {
        Object[] options = {"Sim", "Não"};
        int i = JOptionPane.showOptionDialog(null,
                "Deseja excluir o movimento ?",
                "Movimento de Tratamento",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

        if (i != JOptionPane.YES_OPTION) {
            return;
        }
        if (!TratamentoOperacao.ExcluirDataMovDia(codMov)) {
            JOptionPane.showMessageDialog(null, "Movimento do tratamento excluido!");
            box = 0;
            pesq = "%%%";
            carregaTable(box, pesq);
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao excluir o movimento do tratamento!");
            box = 0;
            pesq = "%%%";
            carregaTable(box, pesq);
        }
    }

    private void tirarPresenca() {
        int cdMov = Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
        int cdFreq = Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
        Senha s = new Senha();
        s.setCdMov(cdMov);
        s.setPresenca(0);
        GregorianCalendar gc = new GregorianCalendar();
        s.setData(gc.getTime());
        SenhaOperacao.SalvarSenhaMov(s);
        FrequentadorOperacao.RetirarPresenca(cdFreq);
    }

    private void gerarSenha() {
        int cdTrat = Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString());
        int cdMov = Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
        int cdFreq = Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
        int pref = 0, senha;
        Frequentador f;
        f = BuscarFrequentador(cdFreq);
        if (f != null) {
            if (f.getEspecial() == 1 || f.getIdade() >= 60 || f.getIdade() <= 12) {
                Object[] options = {"Sim", "Não"};
                int i = JOptionPane.showOptionDialog(null,
                        "Deseja senha preferêncial ?",
                        "Movimento de Tratamento",
                        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

                if (i == JOptionPane.YES_OPTION) {
                    pref = 1;
                }
            }
        }
        Senha s;
        s = SenhaOperacao.buscarSenha(cdTrat, pref);
        if (s == null) {
            JOptionPane.showMessageDialog(null, "Não foi definido senha inicial para este tratamento, por favor definir!");
            return;
        }

        senha = s.getSenha();
        s.setCdMov(cdMov);
        s.setPresenca(1);
        s.setPreferencial(pref);
        GregorianCalendar gc = new GregorianCalendar();
        s.setData(gc.getTime());
        s.setSenha(senha);
        SenhaOperacao.SalvarSenhaMov(s);
        FrequentadorOperacao.MarcaPresenca(cdFreq);

        if (pref == 0) {
            JOptionPane.showMessageDialog(null, "Senha: " + s.getSenha());
        } else {
            JOptionPane.showMessageDialog(null, "Senha Preferêncial: " + s.getSenha());
        }

        s.setSenha(s.getSenha() + 1);
        SenhaOperacao.Update(s);

        txtPesq.setText("");
    }

    private Frequentador BuscarFrequentador(int codFreq) {

        Frequentador u;
        u = FrequentadorOperacao.getFrequentador(codFreq);
        if (u == null) {
            JOptionPane.showMessageDialog(null, "Frequentador não encontrado!");
            return null;
        }
        return u;

    }

    public Tratamento getMovTratamento() {
        return movTratamento;
    }

    private void carregaTable(int box, String pesq) {

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.getDataVector().removeAllElements();
        jTable1.revalidate();

        movTratamentos = TratamentoOperacao.PesquisaMovTratamentos(box, pesq);

        for (Tratamento t : movTratamentos) {

            model.addRow(new Object[]{
                t.getCdMov(),
                t.getFrequentador().getCdFrequentador(),
                t.getFrequentador().getNmFrequentador(),
                t.getCdTratamento(),
                t.getDsTratamento(),
                t.getDtInicial() == null ? "" : Utils.formatoDataSimples.format(t.getDtInicial()),
                t.getDtFinal() == null ? "" : Utils.formatoDataSimples.format(t.getDtFinal()),
                t.getPresenca(),
                ""
            });
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butAlterar;
    private javax.swing.JButton butExcluir2;
    private javax.swing.JButton butFechar1;
    private javax.swing.JButton butGerar;
    private javax.swing.JButton butNovo;
    private javax.swing.JButton butPesq;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JFormattedTextField txtBuscaMov;
    private javax.swing.JTextField txtPesq;
    // End of variables declaration//GEN-END:variables
}
