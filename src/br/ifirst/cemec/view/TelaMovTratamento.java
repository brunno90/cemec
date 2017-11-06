package br.ifirst.cemec.view;

import br.com.gynti.emailsender.api.Destinatario;
import br.com.gynti.emailsender.api.Email;
import br.com.gynti.emailsender.api.Remetente;
import br.com.gynti.emailsender.servico.EnviarEmails;
import br.ifirst.cemec.connections.Conexao;
import br.ifirst.cemec.entidades.DataDefinida;
import br.ifirst.cemec.entidades.Frequentador;
import br.ifirst.cemec.entidades.Senha;
import br.ifirst.cemec.entidades.Tratamento;
import br.ifirst.cemec.operacoes.DataDefinidaOperacao;
import br.ifirst.cemec.operacoes.FrequentadorOperacao;
import br.ifirst.cemec.operacoes.SenhaOperacao;
import br.ifirst.cemec.operacoes.TratamentoOperacao;
import br.ifirst.cemec.util.Utils;
import br.ifirst.cemec.util.WindowModal;
import br.ifirst.cemec.view.pesquisa.PesquisarFrequentador;
import br.ifirst.cemec.view.pesquisa.PesquisarTratamentos;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import org.apache.commons.mail.EmailException;

public class TelaMovTratamento extends WindowModal implements KeyListener {

    String dtNasc, datCad;
    Date dtIni, dtIniCalTrat, dtFinCalTrat;
    int naoRequerPres, periodico, seg, ter, qua, qui, sex, sab, dom, todosDias, codFreq;
    private Frequentador frequentador;

    public TelaMovTratamento(Frequentador f) {
        initComponents();
        super.limparCampos();
        super.ativarSelecaoValor();
        super.ativarEnter();
        setLocationRelativeTo(null);
        txtCodFreq.grabFocus();
        if (f != null) {
            BuscarFrequentador(f.getCdFrequentador());
            txtCodFreq.setText(String.valueOf(f.getCdFrequentador()));
        }
        codFreq = Integer.parseInt(txtCodFreq.getText().equals("") ? "0" : txtCodFreq.getText());
        if (codFreq > 0) {
            BuscarFrequentador(codFreq);
        }
        butPesq();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtFreq = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        butSalvar = new javax.swing.JButton();
        butLimpar = new javax.swing.JButton();
        butFechar = new javax.swing.JButton();
        butGerar = new javax.swing.JButton();
        butGerar1 = new javax.swing.JButton();
        butFechar1 = new javax.swing.JButton();
        txtCodFreq = new javax.swing.JFormattedTextField();
        butPesqFreq = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        butPesqTrat = new javax.swing.JButton();
        txtTratamento = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTratamentos = new javax.swing.JTable();
        txtCodTrat = new javax.swing.JTextField();
        butRemovTel = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Movimentações de Tratamentos");
        setIconImage(null);
        setModalityType(null);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        jLabel4.setText("Frequentador:");

        txtFreq.setDocument(new br.ifirst.cemec.util.FieldLimit(50, true));
        txtFreq.setEditable(false);
        txtFreq.setFont(new java.awt.Font("Trebuchet MS", 0, 12));
        txtFreq.setFocusable(false);

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

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

        butLimpar.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        butLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ifirst/cemec/resources/arquivo.png"))); // NOI18N
        butLimpar.setText("Novo");
        butLimpar.setFocusable(false);
        butLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butLimparActionPerformed(evt);
            }
        });

        butFechar.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        butFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ifirst/cemec/resources/mail.jpg"))); // NOI18N
        butFechar.setText("Email");
        butFechar.setFocusable(false);
        butFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butFecharActionPerformed(evt);
            }
        });

        butGerar.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        butGerar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ifirst/cemec/resources/relatorio.png"))); // NOI18N
        butGerar.setText("Gerar");
        butGerar.setFocusable(false);
        butGerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butGerarActionPerformed(evt);
            }
        });

        butGerar1.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        butGerar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ifirst/cemec/resources/imprimir.jpg"))); // NOI18N
        butGerar1.setText("Imprimir");
        butGerar1.setFocusable(false);
        butGerar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butGerar1ActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(butSalvar)
                .addGap(18, 18, 18)
                .addComponent(butLimpar)
                .addGap(18, 18, 18)
                .addComponent(butGerar)
                .addGap(18, 18, 18)
                .addComponent(butGerar1)
                .addGap(18, 18, 18)
                .addComponent(butFechar)
                .addGap(18, 18, 18)
                .addComponent(butFechar1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {butFechar, butGerar, butLimpar, butSalvar});

        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butSalvar)
                    .addComponent(butLimpar)
                    .addComponent(butFechar)
                    .addComponent(butGerar)
                    .addComponent(butGerar1)
                    .addComponent(butFechar1))
                .addContainerGap())
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {butLimpar, butSalvar});

        txtCodFreq.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtCodFreq.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtCodFreq.setText("0");
        txtCodFreq.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtCodFreq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodFreqActionPerformed(evt);
            }
        });
        txtCodFreq.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCodFreqFocusLost(evt);
            }
        });

        butPesqFreq.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        butPesqFreq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ifirst/cemec/resources/http-__iconesbr.oficinadanet.com_7715_16x16.png"))); // NOI18N
        butPesqFreq.setFocusable(false);
        butPesqFreq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butPesqFreqActionPerformed(evt);
            }
        });

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

        txtTratamento.setDocument(new br.ifirst.cemec.util.FieldLimit(50, true));
        txtTratamento.setEditable(false);
        txtTratamento.setFont(new java.awt.Font("Trebuchet MS", 0, 12));
        txtTratamento.setFocusable(false);

        jTableTratamentos.setAutoCreateRowSorter(true);
        jTableTratamentos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTableTratamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CdMov", "Cd.Trat", "Frequentador", "Tratamento", "Data Inicio", "Data Final", "Trat. Distancia", "Quantidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableTratamentos.setFocusable(false);
        jTableTratamentos.getTableHeader().setResizingAllowed(false);
        jTableTratamentos.getTableHeader().setReorderingAllowed(false);
        jTableTratamentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableTratamentosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableTratamentos);
        jTableTratamentos.getColumnModel().getColumn(0).setMinWidth(0);
        jTableTratamentos.getColumnModel().getColumn(0).setPreferredWidth(0);
        jTableTratamentos.getColumnModel().getColumn(0).setMaxWidth(0);
        jTableTratamentos.getColumnModel().getColumn(1).setMinWidth(0);
        jTableTratamentos.getColumnModel().getColumn(1).setPreferredWidth(0);
        jTableTratamentos.getColumnModel().getColumn(1).setMaxWidth(0);
        jTableTratamentos.getColumnModel().getColumn(4).setMinWidth(75);
        jTableTratamentos.getColumnModel().getColumn(4).setPreferredWidth(75);
        jTableTratamentos.getColumnModel().getColumn(4).setMaxWidth(75);
        jTableTratamentos.getColumnModel().getColumn(5).setMinWidth(75);
        jTableTratamentos.getColumnModel().getColumn(5).setPreferredWidth(75);
        jTableTratamentos.getColumnModel().getColumn(5).setMaxWidth(75);
        jTableTratamentos.getColumnModel().getColumn(6).setMinWidth(70);
        jTableTratamentos.getColumnModel().getColumn(6).setPreferredWidth(70);
        jTableTratamentos.getColumnModel().getColumn(6).setMaxWidth(70);
        jTableTratamentos.getColumnModel().getColumn(7).setMinWidth(70);
        jTableTratamentos.getColumnModel().getColumn(7).setPreferredWidth(70);
        jTableTratamentos.getColumnModel().getColumn(7).setMaxWidth(70);

        txtCodTrat.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtCodTrat.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtCodTrat.setText("0");
        txtCodTrat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodTratKeyPressed(evt);
            }
        });

        butRemovTel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ifirst/cemec/resources/Lixeira2.png"))); // NOI18N
        butRemovTel.setToolTipText("Remove telefone selecionado");
        butRemovTel.setFocusable(false);
        butRemovTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butRemovTelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(butRemovTel)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCodTrat)
                    .addComponent(txtCodFreq, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(butPesqFreq, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butPesqTrat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtFreq, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                    .addComponent(txtTratamento))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCodFreq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtFreq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(butPesqFreq, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(txtCodTrat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(butPesqTrat, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTratamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(butRemovTel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtFreq, txtTratamento});

        jMenu1.setText("Arquivo");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ifirst/cemec/resources/save1.png"))); // NOI18N
        jMenuItem1.setText("Salvar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ifirst/cemec/resources/arquivo.png"))); // NOI18N
        jMenuItem2.setText("Novo");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ifirst/cemec/resources/fazer2.png"))); // NOI18N
        jMenuItem3.setText("Senha");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ifirst/cemec/resources/Colar.jpg"))); // NOI18N
        jMenuItem4.setText("Lista de Presença");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ifirst/cemec/resources/sair.png"))); // NOI18N
        jMenuItem5.setText("Fechar");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setText("Imprimir tratamentos do Frequentador");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butSalvarActionPerformed
        try {
            SalvarMovTratamento();
        } catch (ParseException ex) {
            Logger.getLogger(TelaMovTratamento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_butSalvarActionPerformed

    private void butLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butLimparActionPerformed
        LimparTela();
    }//GEN-LAST:event_butLimparActionPerformed

    private void butPesqFreqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butPesqFreqActionPerformed
        butPesq();
    }//GEN-LAST:event_butPesqFreqActionPerformed

    private void txtCodFreqFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodFreqFocusLost
        int cod = Integer.parseInt(txtCodFreq.getText().equals("") ? "0" : txtCodFreq.getText());
        if (cod > 0) {
            BuscarFrequentador(cod);
        }

    }//GEN-LAST:event_txtCodFreqFocusLost

    private void butFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butFecharActionPerformed
        EnviarEmail();
    }//GEN-LAST:event_butFecharActionPerformed

    private void butPesqTratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butPesqTratActionPerformed
        PesquisarTratamentos pesquisarTratamentos = new PesquisarTratamentos(this, true);
        pesquisarTratamentos.setVisible(true);
        Tratamento tratamento = pesquisarTratamentos.getTratamento();

        if (tratamento != null) {
            Tratamento t;
            int cod = tratamento.getCdTratamento();
            t = BuscarTratamento(cod);
            if (t != null) {
                if (t.getPeriodico() == 1) {
                    TratamentosTipo2(t);
                } else {
                    TratamentosTipo1(t);
                }
                BuscarFrequentador(Integer.parseInt(txtCodFreq.getText()));
            }
        }
    }//GEN-LAST:event_butPesqTratActionPerformed

    private void butGerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butGerarActionPerformed
//        Frequentador f = new Frequentador();
//        f.setCdFrequentador("".equals(txtCodFreq.getText()) ? 0 : Integer.parseInt(txtCodFreq.getText()));
//        f.setNmFrequentador(txtFreq.getText());
//        ConsultaMovTratamento cmt = new ConsultaMovTratamento(this, true, f);
//        cmt.setVisible(true);

        Imprimir();
    }//GEN-LAST:event_butGerarActionPerformed

    private void butRemovTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butRemovTelActionPerformed
        if (jTableTratamentos.getSelectedRowCount() > 0) {
            int codMov = Integer.parseInt(jTableTratamentos.getValueAt(jTableTratamentos.getSelectedRow(), 0).toString());
            excluirMovTratamento(codMov);
        }
    }//GEN-LAST:event_butRemovTelActionPerformed

    private void txtCodTratKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodTratKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_TAB) {
            int cod = Integer.parseInt(txtCodTrat.getText().equals("") ? "0" : txtCodTrat.getText());
            if (cod == 0) {
                txtCodTrat.transferFocus();
            }
            Tratamento t;
            t = BuscarTratamento(cod);
            if (t != null) {
                if (t.getPeriodico() == 1) {
                    TratamentosTipo2(t);
                } else {
                    TratamentosTipo1(t);
                }
                BuscarFrequentador(Integer.parseInt(txtCodFreq.getText()));
            }
        }
    }//GEN-LAST:event_txtCodTratKeyPressed

    private void jTableTratamentosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTratamentosMouseClicked
        if (evt.getClickCount() == 2) {
            if (jTableTratamentos.getSelectedRowCount() > 0) {
                int codMov = Integer.parseInt(jTableTratamentos.getValueAt(jTableTratamentos.getSelectedRow(), 0).toString());
                int cdTrat = Integer.parseInt(jTableTratamentos.getValueAt(jTableTratamentos.getSelectedRow(), 1).toString());
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
                    BuscarFrequentador(Integer.parseInt(txtCodFreq.getText()));
                }
            }
        }
    }//GEN-LAST:event_jTableTratamentosMouseClicked

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        gerarSenha();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        try {
            SalvarMovTratamento();
        } catch (ParseException ex) {
            Logger.getLogger(TelaMovTratamento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        TelaPresenca tp = new TelaPresenca(this, true);
        tp.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        LimparTela();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void txtCodFreqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodFreqActionPerformed
        txtCodFreq.transferFocus();
    }//GEN-LAST:event_txtCodFreqActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        int cd_freq = Integer.parseInt(txtCodFreq.getText().equals("") ? "0" : txtCodFreq.getText());
        try {
            URL arquivo = getClass().getResource("/br/ifirst/cemec/relatorios/TratamentoFrequentador.jasper");
            Map<String, Object> datIni = new HashMap<String, Object>();
            datIni.put("cd_freq", cd_freq); //Filtro
            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(arquivo);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, datIni, Conexao.getConnection());
            JasperViewer jrviewer = new JasperViewer(jasperPrint, false);
            jrviewer.setVisible(true);
            jrviewer.toFront();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível imprimir");
        }
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void butGerar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butGerar1ActionPerformed
        int cd_freq = Integer.parseInt(txtCodFreq.getText().equals("") ? "0" : txtCodFreq.getText());
        try {
            URL arquivo = getClass().getResource("/br/ifirst/cemec/relatorios/TratamentoFrequentador.jasper");
            Map<String, Object> datIni = new HashMap<String, Object>();
            datIni.put("cd_freq", cd_freq); //Filtro
            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(arquivo);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, datIni, Conexao.getConnection());
//            JasperViewer jrviewer = new JasperViewer(jasperPrint, false);
//            jrviewer.setVisible(true);
//            jrviewer.toFront();
            JasperExportManager.exportReportToPdfFile(jasperPrint, "C:\\NovaPasta\\movTratamento.pdf");
            Runtime.getRuntime().exec("cmd /c start C:\\NovaPasta\\movTratamento.pdf");
            File file = new File("C:\\NovaPasta\\movTratamento.pdf");
            file.deleteOnExit();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível imprimir");
        }
    }//GEN-LAST:event_butGerar1ActionPerformed

    private void butFechar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butFechar1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_butFechar1ActionPerformed
    private void butPesq() {
        PesquisarFrequentador pesquisarFrequentador = new PesquisarFrequentador(this, true);
        pesquisarFrequentador.setVisible(true);
        frequentador = pesquisarFrequentador.getFrequentador();

        if (frequentador != null) {
            txtCodFreq.setText(String.valueOf(frequentador.getCdFrequentador()));
            if (frequentador.getCdFrequentador() > 0) {
                BuscarFrequentador(frequentador.getCdFrequentador());
            }
        }
    }

    private void Imprimir() {
        int cd_freq = Integer.parseInt(txtCodFreq.getText().equals("") ? "0" : txtCodFreq.getText());
        int cd_trat = Integer.parseInt(jTableTratamentos.getValueAt(jTableTratamentos.getSelectedRow(), 1).toString());
        int cd_mov = Integer.parseInt(jTableTratamentos.getValueAt(jTableTratamentos.getSelectedRow(), 0).toString());

        List<DataDefinida> datas;

        datas = DataDefinidaOperacao.BuscarDatasTrat(cd_mov);
        String dt = "";
        if (datas != null && datas.size() > 0) {

            for (Iterator<DataDefinida> it = datas.iterator(); it.hasNext();) {
                DataDefinida t = it.next();
                Date data = t.getData();
                GregorianCalendar gc = new GregorianCalendar();
                gc.setTime(data);
                int numDiaSemana, i = 0;

                numDiaSemana = gc.get(GregorianCalendar.DAY_OF_WEEK);

                dt = dt + " " + Utils.formatoDataSimples.format(t.getData()) + " ";

                switch (numDiaSemana) {
                    case 1:
                        dt = dt + "DOMINGO \n";
                        break;
                    case 2:
                        dt = dt + "SEGUNDA-FEIRA \n";
                        break;
                    case 3:
                        dt = dt + "TERÇA-FEIRA \n";
                        break;
                    case 4:
                        dt = dt + "QUARTA-FEIRA \n";
                        break;
                    case 5:
                        dt = dt + "QUINTA-FEIRA \n";
                        break;
                    case 6:
                        dt = dt + "SEXTA-FEIRA \n";
                        break;
                    case 7:
                        dt = dt + "SÁBADO \n";
                        break;
                }
            }
        }
        try {
            Tratamento t = new Tratamento();
            Frequentador f = new Frequentador();
            if (cd_freq > 0 && cd_trat > 0) {
                t.setCdTratamento(cd_trat);
                f.setCdFrequentador(cd_freq);
                t.setFrequentador(f);
            } else {
                JOptionPane.showMessageDialog(null, "Frequentador ou Tratamento não informados!");
                return;
            }
            URL arquivo = getClass().getResource("/br/ifirst/cemec/relatorios/MovTratamento.jasper");
            Map<String, Object> datIni = new HashMap<String, Object>();
            datIni.put("cd_trat", t.getCdTratamento()); //Filtro
            datIni.put("cd_freq", t.getFrequentador().getCdFrequentador()); //Filtro
            datIni.put("data", dt);
            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(arquivo);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, datIni, Conexao.getConnection());
            JasperViewer jrviewer = new JasperViewer(jasperPrint, false);
            jrviewer.setVisible(true);
            jrviewer.toFront();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível imprimir");
        }
    }

    private void gerarSenha() {
        int cdTrat = Integer.parseInt(jTableTratamentos.getValueAt(jTableTratamentos.getSelectedRow(), 1).toString());
        int cdMov = Integer.parseInt(jTableTratamentos.getValueAt(jTableTratamentos.getSelectedRow(), 0).toString());
        int pref = 0, senha;

        if (frequentador != null) {
            if (frequentador.getEspecial() == 1 || frequentador.getIdade() >= 60 || frequentador.getIdade() <= 12) {
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
        if (pref == 0) {
            JOptionPane.showMessageDialog(null, "Senha: " + s.getSenha());
        } else {
            JOptionPane.showMessageDialog(null, "Senha Preferêncial: " + s.getSenha());
        }
        senha = s.getSenha();
        s.setCdMov(cdMov);
        s.setPresenca(1);
        s.setPreferencial(pref);
        GregorianCalendar gc = new GregorianCalendar();
        s.setData(gc.getTime());
        s.setSenha(senha);
        SenhaOperacao.SalvarSenhaMov(s);

        s.setSenha(s.getSenha() + 1);
        SenhaOperacao.Update(s);
    }

    private Tratamento EditarMov(int cdMov) {
        Tratamento t;
        t = TratamentoOperacao.getMovTratamento(cdMov);
        return t;
    }

    public void TratamentosTipo1(Tratamento tr) {

        Frequentador f = new Frequentador();
        f.setCdFrequentador(Integer.parseInt(txtCodFreq.getText().equals("") ? "0" : txtCodFreq.getText()));
        tr.setFrequentador(f);
        PainelTpTratamento1 tpTratamento1 = new PainelTpTratamento1(this, true, tr);
        tpTratamento1.setVisible(true);
        txtCodTrat.setText("0");
        txtTratamento.setText("");
    }

    public void TratamentosTipo2(Tratamento tr) {

        Frequentador f = new Frequentador();
        f.setCdFrequentador(Integer.parseInt(txtCodFreq.getText().equals("") ? "0" : txtCodFreq.getText()));
        tr.setFrequentador(f);
        PainelTpTratamento2 tpTratamento = new PainelTpTratamento2(this, true, tr);
        tpTratamento.setVisible(true);
        txtCodTrat.setText("0");
        txtTratamento.setText("");
    }

    private Tratamento BuscarTratamento(int cod) {
        Tratamento u = null;

        if (cod != 0) {
            u = TratamentoOperacao.getTratamentoCalendar(cod);
            if (u == null || u.getNaoRequerCalendario() == 0 && u.getCalendarioTratamento() == null) {
                JOptionPane.showMessageDialog(null, "Tratamento não cadastrado ou não possui calendario de tratamento! \n "
                        + "Por favor verifique!");
                txtCodTrat.setText("");
                txtTratamento.setText("");
                return null;
            }

            txtCodTrat.setText(String.valueOf(u.getCdTratamento()));
            txtTratamento.setText(u.getDsTratamento());

            naoRequerPres = u.getNaoRecPres();
            periodico = u.getPeriodico();
            dtIniCalTrat = u.getCalendarioTratamento().getDtIni();
            dtFinCalTrat = u.getCalendarioTratamento().getDtFin();
            seg = u.getCalendarioTratamento().getSeg();
            ter = u.getCalendarioTratamento().getTer();
            qua = u.getCalendarioTratamento().getQua();
            qui = u.getCalendarioTratamento().getQui();
            sex = u.getCalendarioTratamento().getSex();
            sab = u.getCalendarioTratamento().getSab();
            dom = u.getCalendarioTratamento().getDom();
            todosDias = u.getCalendarioTratamento().getTodosDias();
        }
        return u;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
            this.dispose();
        }
        if (e.getKeyCode() == KeyEvent.VK_F3) {
            LimparTela();
        }
        if (e.getKeyCode() == KeyEvent.VK_F2) {
            try {
                SalvarMovTratamento();
            } catch (ParseException ex) {
                Logger.getLogger(TelaMovTratamento.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (e.getKeyCode() == KeyEvent.VK_DELETE) {
//            DeleteFrequentador();
        }
        if (e.getKeyCode() == KeyEvent.VK_F6) {
        }
    }

    private void BuscarFrequentador(int codFreq) {
        if (codFreq != 0) {
            frequentador = FrequentadorOperacao.getFrequentador(codFreq);
            if (frequentador == null) {
                JOptionPane.showMessageDialog(null, "Frequentador não encontrado!");
                limparCampos();
                return;
            }
            txtFreq.setText(frequentador.getNmFrequentador());
            txtCodFreq.setEditable(false);

            DefaultTableModel modelTelefone = (DefaultTableModel) jTableTratamentos.getModel();
            modelTelefone.getDataVector().removeAllElements();
            jTableTratamentos.revalidate();

            if (frequentador.getTratamentos() != null && frequentador.getTratamentos().size() > 0) {

                for (Iterator<Tratamento> it = frequentador.getTratamentos().iterator(); it.hasNext();) {
                    Tratamento t = it.next();

                    modelTelefone.addRow(new Object[]{
                        t.getCdMov(),
                        t.getCdTratamento(),
                        t.getFrequentador().getNmFrequentador(),
                        t.getDsTratamento(),
                        t.getDtInicial() == null ? "" : Utils.formatoDataSimples.format(t.getDtInicial()),
                        t.getDtFinal() == null ? "" : Utils.formatoDataSimples.format(t.getDtFinal()),
                        t.getTratDistancia(),
                        t.getQtDias()
                    });
                }
            }
            txtCodFreq.transferFocus();

        }
    }

    private void SalvarMovTratamento() throws ParseException {
        int rowCountTratamento = jTableTratamentos.getModel().getRowCount();
        List<Tratamento> trat = new ArrayList<Tratamento>();
        if (rowCountTratamento > 0) {
            for (int i = 0; i < rowCountTratamento; i++) {

                String dtIni = "".equals(jTableTratamentos.getValueAt(i, 3).toString()) ? null : jTableTratamentos.getValueAt(i, 3).toString().replaceAll("_", "");
                String dtFin = "".equals(jTableTratamentos.getValueAt(i, 4).toString()) ? null : jTableTratamentos.getValueAt(i, 4).toString().replaceAll("_", "");

                Tratamento t = new Tratamento();
                t.setCdTratamento(Integer.parseInt(jTableTratamentos.getValueAt(i, 1).toString()));

                t.setDsTratamento(jTableTratamentos.getValueAt(i, 1).toString().replaceAll(" ", ""));
                t.setTratDistancia(Boolean.parseBoolean(jTableTratamentos.getValueAt(i, 5).toString()));
                t.setQtDias(Integer.parseInt(jTableTratamentos.getValueAt(i, 6).toString()));

                if (!dtIni.equals("")) {
                    java.sql.Date dtInicial = new java.sql.Date(Utils.formatoDataSimples.parse(jTableTratamentos.getValueAt(i, 3).toString()).getTime());
                    t.setDtInicial(dtInicial);
                } else {
                    t.setDtInicial(null);
                }
                if (!dtFin.equals("")) {
                    java.sql.Date dtFinal = new java.sql.Date(Utils.formatoDataSimples.parse(jTableTratamentos.getValueAt(i, 4).toString()).getTime());
                    t.setDtFinal(dtFinal);
                } else {
                    t.setDtFinal(null);
                }
                t.setTpPeriodo(0);
                Frequentador f = new Frequentador();
                f.setCdFrequentador(Integer.parseInt(txtCodFreq.getText()));
                t.setFrequentador(f);
                trat.add(t);
            }
        }
        Object[] options = {"Sim", "Não"};
        int i = JOptionPane.showOptionDialog(null,
                "Deseja salvar ?",
                "Movimento de Tratamento",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

        if (i != JOptionPane.YES_OPTION) {
            return;

        }
        Frequentador freq = new Frequentador();
        freq.setTratamentos(trat);
        freq.setCdFrequentador(Integer.parseInt(txtCodFreq.getText()));

        if (!TratamentoOperacao.SalvarMovTrat(freq)) {
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao salvar!");
        }
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
        if (!TratamentoOperacao.ExcluirMov(codMov)) {
            JOptionPane.showMessageDialog(null, "Movimento do tratamento excluido!");
            codFreq = Integer.parseInt(txtCodFreq.getText().equals("") ? "0" : txtCodFreq.getText());
            BuscarFrequentador(codFreq);
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao excluir o movimento do tratamento!");
            BuscarFrequentador(codFreq);
        }
    }

    private void EnviarEmail() {
        if (frequentador.getEmail().length() > 3) {
            EnviarEmail enviarEmail = new EnviarEmail();
            Thread tEnviaEmail = new Thread(enviarEmail);
            tEnviaEmail.start();
        } else {
            JOptionPane.showConfirmDialog(null, "Frenquentador nao possui email cadastro. \n"
                    + "Por favor casdastrar um email.");
        }
    }

    class EnviarEmail implements Runnable {

        @Override
        public void run() {
            Email email = new Email();
            Remetente remetente = new Remetente();

            remetente.setEmailRemetente("mensageirosdacaridade@gmail.com");
            remetente.setRemetente("Mensageiros da Caridade");
            remetente.setSenhaEmail("mensageiros01");
            remetente.setHostName("smtp.gmail.com");
            remetente.setPortaSmtp(587);
            remetente.setUsaSSL(true);
            remetente.setUsaTLS(true);
            email.setRemetente(remetente);

            if (frequentador.getCdFrequentador() == 0) {
                JOptionPane.showMessageDialog(null, "Por favor informe o frequentador!");
                return;
            }
            List<Destinatario> destinatarios = new ArrayList<Destinatario>();
            Destinatario destinatario = new Destinatario();
            if (frequentador.getEmail() == null || frequentador.getEmail().isEmpty()) {
                JOptionPane.showMessageDialog(null, "O frequentador não possui email cadastrado!");
                return;
            } else {
                destinatario.setEmail(frequentador.getEmail());
            }
            destinatario.setNome(frequentador.getNmFrequentador());
            destinatarios.add(destinatario);
            email.setDestinatarios(destinatarios);

            Tratamento tratamento;
            int cdTrat = Integer.parseInt(jTableTratamentos.getValueAt(jTableTratamentos.getSelectedRow(), 1).toString());
            if (cdTrat > 0) {
                tratamento = TratamentoOperacao.getTratamento(cdTrat);
            } else {
                JOptionPane.showMessageDialog(null, "Por favor selecione o tratamento!");
                return;
            }
            int cd_mov = Integer.parseInt(jTableTratamentos.getValueAt(jTableTratamentos.getSelectedRow(), 0).toString());
            List<DataDefinida> datas;

            datas = DataDefinidaOperacao.BuscarDatasTrat(cd_mov);
            String dt = "";
            if (datas != null && datas.size() > 0) {

                for (Iterator<DataDefinida> it = datas.iterator(); it.hasNext();) {
                    DataDefinida t = it.next();
                    Date data = t.getData();
                    GregorianCalendar gc = new GregorianCalendar();
                    gc.setTime(data);
                    int numDiaSemana, i = 0;

                    numDiaSemana = gc.get(GregorianCalendar.DAY_OF_WEEK);

                    dt = dt + " " + Utils.formatoDataSimples.format(t.getData()) + " ";

                    switch (numDiaSemana) {
                        case 1:
                            dt = dt + "DOMINGO \n";
                            break;
                        case 2:
                            dt = dt + "SEGUNDA-FEIRA \n";
                            break;
                        case 3:
                            dt = dt + "TERÇA-FEIRA \n";
                            break;
                        case 4:
                            dt = dt + "QUARTA-FEIRA \n";
                            break;
                        case 5:
                            dt = dt + "QUINTA-FEIRA \n";
                            break;
                        case 6:
                            dt = dt + "SEXTA-FEIRA \n";
                            break;
                        case 7:
                            dt = dt + "SÁBADO \n";
                            break;
                    }
                }
            }
            email.setAssunto("Mensageiros da caridade");
            //email.setMensagemTextoEmail(tratamento.getDsTratamento() + "\n" + tratamento.getRecTratamento() + "\n" + dt);
            email.setMensagemHtmlEmail(tratamento.getDsTratamento() + "\n" + tratamento.getRecTratamento() + "\n" + dt);
            try {
                try {
                    EnviarEmails.EnviarEmail(email);
                    JOptionPane.showMessageDialog(null, "E-mail enviado com sucesso!");
                } catch (EmailException ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao enviar o e-mail!");
                    Logger.getLogger(TelaMovTratamento.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (MalformedURLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao enviar o e-mail!");
                Logger.getLogger(TelaMovTratamento.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void LimparTela() {
        txtCodFreq.setText("0");
        txtCodFreq.setEditable(true);
        txtFreq.setText("");
        txtCodTrat.setText("0");
        txtTratamento.setText("");

        jTableTratamentos.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "CdMov", "Cd.Trat", "Frequentador", "Tratamento", "Data Inicio", "Data Final", "Trat. Distancia", "Quantidade"
                }) {
                    Class[] types = new Class[]{
                        java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Integer.class
                    };
                    boolean[] canEdit = new boolean[]{
                        false, false, false, false, false, false, false, false
                    };

                    public Class getColumnClass(int columnIndex) {
                        return types[columnIndex];
                    }

                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit[columnIndex];
                    }
                });

        jTableTratamentos.setFocusable(false);

        jTableTratamentos.getTableHeader().setResizingAllowed(false);
        jTableTratamentos.getTableHeader().setReorderingAllowed(false);

        jTableTratamentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableTratamentosMouseClicked(evt);
            }
        });

        jScrollPane1.setViewportView(jTableTratamentos);

        jTableTratamentos.getColumnModel().getColumn(0).setMinWidth(0);
        jTableTratamentos.getColumnModel().getColumn(0).setPreferredWidth(0);
        jTableTratamentos.getColumnModel().getColumn(0).setMaxWidth(0);
        jTableTratamentos.getColumnModel().getColumn(1).setMinWidth(0);
        jTableTratamentos.getColumnModel().getColumn(1).setPreferredWidth(0);
        jTableTratamentos.getColumnModel().getColumn(1).setMaxWidth(0);
        jTableTratamentos.getColumnModel().getColumn(4).setMinWidth(75);
        jTableTratamentos.getColumnModel().getColumn(4).setPreferredWidth(75);
        jTableTratamentos.getColumnModel().getColumn(4).setMaxWidth(75);
        jTableTratamentos.getColumnModel().getColumn(5).setMinWidth(75);
        jTableTratamentos.getColumnModel().getColumn(5).setPreferredWidth(75);
        jTableTratamentos.getColumnModel().getColumn(5).setMaxWidth(75);
        jTableTratamentos.getColumnModel().getColumn(6).setMinWidth(70);
        jTableTratamentos.getColumnModel().getColumn(6).setPreferredWidth(70);
        jTableTratamentos.getColumnModel().getColumn(6).setMaxWidth(70);
        jTableTratamentos.getColumnModel().getColumn(7).setMinWidth(70);
        jTableTratamentos.getColumnModel().getColumn(7).setPreferredWidth(70);
        jTableTratamentos.getColumnModel().getColumn(7).setMaxWidth(70);

        txtCodFreq.grabFocus();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butFechar;
    private javax.swing.JButton butFechar1;
    private javax.swing.JButton butGerar;
    private javax.swing.JButton butGerar1;
    private javax.swing.JButton butLimpar;
    private javax.swing.JButton butPesqFreq;
    private javax.swing.JButton butPesqTrat;
    private javax.swing.JButton butRemovTel;
    private javax.swing.JButton butSalvar;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableTratamentos;
    private javax.swing.JFormattedTextField txtCodFreq;
    private javax.swing.JTextField txtCodTrat;
    private javax.swing.JTextField txtFreq;
    private javax.swing.JTextField txtTratamento;
    // End of variables declaration//GEN-END:variables
}
