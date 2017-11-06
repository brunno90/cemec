package br.ifirst.cemec.view;

import br.ifirst.cemec.entidades.Frequentador;
import br.ifirst.cemec.entidades.Telefone;
import br.ifirst.cemec.operacoes.FrequentadorOperacao;
import br.ifirst.cemec.util.Utils;
import br.ifirst.cemec.util.WindowModal;
import br.ifirst.cemec.view.pesquisa.PesquisarFrequentador;
import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaFrequentador extends WindowModal implements KeyListener {

    String dtNasc, datCad;
    int cod;

    public TelaFrequentador() {
        initComponents();
        super.ativarSelecaoValor();
        super.ativarEnter();
        setLocationRelativeTo(null);
        formatarCampos();

        GregorianCalendar gc = new GregorianCalendar();
        txtDatCad.setText(Utils.formatoDataSimples.format(gc.getTime()));
    }

    private void formatarCampos() {
        Utils.mascaraData().install(txtDatCad);
        Utils.mascaraData().install(txtDatNasc);
        Utils.MTelefone().install(txtTel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtFreq = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDatNasc = new javax.swing.JFormattedTextField();
        jLabel25 = new javax.swing.JLabel();
        txtIdade = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        txtDatCad = new javax.swing.JFormattedTextField();
        txtTel = new javax.swing.JFormattedTextField();
        jLabel54 = new javax.swing.JLabel();
        txtDDD = new javax.swing.JTextField();
        butAddTel = new javax.swing.JButton();
        butRemovTel = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTelefone = new javax.swing.JTable();
        jLabel41 = new javax.swing.JLabel();
        boxTel = new javax.swing.JComboBox();
        txtNmMae = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jCheckEqCemec = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        butSalvar = new javax.swing.JButton();
        butLimpar = new javax.swing.JButton();
        butExcluir = new javax.swing.JButton();
        butExcluir1 = new javax.swing.JButton();
        butExcluir3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jCheckNesEsp = new javax.swing.JCheckBox();
        txtCodFreq = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Frequentador");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        jLabel3.setText("Código:");

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        jLabel4.setText("Frequentador:");

        txtFreq.setDocument(new br.ifirst.cemec.util.FieldLimit(50, true));
        txtFreq.setFont(new java.awt.Font("Trebuchet MS", 0, 12));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        jLabel5.setText("E-mail:");

        txtEmail.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        jLabel6.setText("Data de Nasc:");

        txtDatNasc.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtDatNasc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDatNascFocusLost(evt);
            }
        });
        txtDatNasc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDatNascKeyReleased(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel25.setText("Idade :");

        txtIdade.setEditable(false);
        txtIdade.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtIdade.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtIdade.setText("0");
        txtIdade.setFocusable(false);

        jLabel46.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel46.setText("Data Cadastro :");

        txtDatCad.setEditable(false);
        txtDatCad.setFocusable(false);
        txtDatCad.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N

        txtTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelActionPerformed(evt);
            }
        });

        jLabel54.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel54.setText("DDD:");

        txtDDD.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtDDD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDDDActionPerformed(evt);
            }
        });
        txtDDD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDDDKeyReleased(evt);
            }
        });

        butAddTel.setText("+");
        butAddTel.setToolTipText("Adiciona novo telefone");
        butAddTel.setFocusable(false);
        butAddTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butAddTelActionPerformed(evt);
            }
        });

        butRemovTel.setText("-");
        butRemovTel.setToolTipText("Remove telefone selecionado");
        butRemovTel.setFocusable(false);
        butRemovTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butRemovTelActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setText("Telefone:");

        jTableTelefone.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTableTelefone.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DDD", "Telefone", "Tipo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class
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
        jTableTelefone.setFocusable(false);
        jTableTelefone.getTableHeader().setResizingAllowed(false);
        jTableTelefone.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTableTelefone);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
        );

        jLabel41.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel41.setText("Tipo Tel:");

        boxTel.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        boxTel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Celular", "Residencial", "Comercial", "Outros" }));
        boxTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxTelActionPerformed(evt);
            }
        });
        boxTel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                boxTelKeyPressed(evt);
            }
        });

        txtNmMae.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtNmMae.setDocument(new br.ifirst.cemec.util.FieldLimit(50, true));

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        jLabel7.setText("Nome da Mãe:");

        jCheckEqCemec.setText("Equipe CEMEC");

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

        butExcluir.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        butExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ifirst/cemec/resources/Lixeira2.png"))); // NOI18N
        butExcluir.setText("Excluir");
        butExcluir.setFocusable(false);
        butExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butExcluirActionPerformed(evt);
            }
        });

        butExcluir1.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        butExcluir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ifirst/cemec/resources/http-__iconesbr.oficinadanet.com_7715_16x16.png"))); // NOI18N
        butExcluir1.setText("Buscar");
        butExcluir1.setFocusable(false);
        butExcluir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butExcluir1ActionPerformed(evt);
            }
        });

        butExcluir3.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        butExcluir3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ifirst/cemec/resources/sair.png"))); // NOI18N
        butExcluir3.setText("Fechar");
        butExcluir3.setFocusable(false);
        butExcluir3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butExcluir3ActionPerformed(evt);
            }
        });

        jButton1.setText("Alterar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(butSalvar)
                .addGap(12, 12, 12)
                .addComponent(butLimpar)
                .addGap(18, 18, 18)
                .addComponent(butExcluir1)
                .addGap(18, 18, 18)
                .addComponent(butExcluir)
                .addGap(18, 18, 18)
                .addComponent(butExcluir3)
                .addGap(13, 13, 13)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {butExcluir, butExcluir1, butExcluir3, butLimpar, butSalvar});

        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(butSalvar)
                            .addComponent(butLimpar)
                            .addComponent(butExcluir1)
                            .addComponent(butExcluir)
                            .addComponent(butExcluir3))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {butExcluir, butExcluir1, butLimpar, butSalvar});

        jCheckNesEsp.setText("Necessidades especiais");

        txtCodFreq.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtCodFreq.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtCodFreq.setText("0");
        txtCodFreq.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCodFreqMouseClicked(evt);
            }
        });
        txtCodFreq.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCodFreqFocusLost(evt);
            }
        });
        txtCodFreq.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodFreqKeyPressed(evt);
            }
        });

        jRadioButton1.setLabel("Sim");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setText("Não");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Frequentador");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtDatNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel25)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNmMae, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel46)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDatCad, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtCodFreq, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFreq, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(jLabel41))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(butAddTel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(butRemovTel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel1))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boxTel, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(txtDDD, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addGap(10, 10, 10)
                                .addComponent(jRadioButton2))
                            .addComponent(jCheckEqCemec))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jCheckNesEsp, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(txtFreq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodFreq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDatCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel46))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtDatNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25)
                    .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtNmMae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(boxTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDDD)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckNesEsp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(butAddTel)
                            .addComponent(butRemovTel)
                            .addComponent(jCheckEqCemec))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton2)
                            .addComponent(jLabel1)))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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

    private void txtTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelActionPerformed
        AddTel();
    }//GEN-LAST:event_txtTelActionPerformed

    private void txtDDDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDDDActionPerformed
        txtDDD.transferFocus();
    }//GEN-LAST:event_txtDDDActionPerformed

    private void txtDDDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDDDKeyReleased
        if (txtDDD.getText().trim().replaceAll("\\D", "").length() == 2) {
            txtDDD.transferFocus();
        }
    }//GEN-LAST:event_txtDDDKeyReleased

    private void butAddTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butAddTelActionPerformed
        AddTel();
    }//GEN-LAST:event_butAddTelActionPerformed

    private void butRemovTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butRemovTelActionPerformed
        if (jTableTelefone.getSelectedRowCount() > 0) {
            ((DefaultTableModel) jTableTelefone.getModel()).removeRow(jTableTelefone.getSelectedRow());
            jTableTelefone.revalidate();
        }
    }//GEN-LAST:event_butRemovTelActionPerformed

    private void boxTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxTelActionPerformed
        boxTel.transferFocus();
        
        if(boxTel.getSelectedItem().toString().equals("Celular")){
        Utils.MCelular();}
    }//GEN-LAST:event_boxTelActionPerformed

    private void boxTelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_boxTelKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            boxTel.transferFocus();
        }
    }//GEN-LAST:event_boxTelKeyPressed

    private void butSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butSalvarActionPerformed
        try {
            SalvarFrequentador();
        } catch (ParseException ex) {
            Logger.getLogger(TelaFrequentador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_butSalvarActionPerformed

    private void butLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butLimparActionPerformed
        LimparTela();
    }//GEN-LAST:event_butLimparActionPerformed

    private void butExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butExcluirActionPerformed
        int cod = Integer.parseInt(txtCodFreq.getText().equals("") ? "0" : txtCodFreq.getText());
        if (cod == 0) {
            txtCodFreq.grabFocus();
        } else {
            DeleteFrequentador();
        }
    }//GEN-LAST:event_butExcluirActionPerformed

    private void butExcluir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butExcluir1ActionPerformed
        PesquisarFrequentador pesquisarFrequentador = new PesquisarFrequentador(this, true);
        pesquisarFrequentador.setVisible(true);
        Frequentador frequentador = pesquisarFrequentador.getFrequentador();

        if (frequentador != null) {
            txtCodFreq.setText(String.valueOf(frequentador.getCdFrequentador()));
            BuscarFrequentador(frequentador.getCdFrequentador());
        }
    }//GEN-LAST:event_butExcluir1ActionPerformed

    private void butExcluir3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butExcluir3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_butExcluir3ActionPerformed

    private void txtDatNascKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDatNascKeyReleased
        if (txtDatNasc.getText().trim().replaceAll("\\D", "").length() == 8) {
            txtDatNasc.transferFocus();
        }
    }//GEN-LAST:event_txtDatNascKeyReleased

    private void txtDatNascFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDatNascFocusLost
        String dataNascimento = txtDatNasc.getText().replaceAll("\\D", "");
        if (!dataNascimento.equals("") && dataNascimento.length() == 8) {
            CalcIdade();
        }
    }//GEN-LAST:event_txtDatNascFocusLost

    private void txtCodFreqFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodFreqFocusLost
        int cod = Integer.parseInt(txtCodFreq.getText().equals("") ? "0" : txtCodFreq.getText());
        if (cod == 0) {
            txtCodFreq.transferFocus();
        } else {
            BuscarFrequentador(cod);
        }
    }//GEN-LAST:event_txtCodFreqFocusLost

    private void txtCodFreqKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodFreqKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_TAB) {
            int cod = Integer.parseInt(txtCodFreq.getText().equals("") ? "0" : txtCodFreq.getText());
            if (cod == 0) {
                txtCodFreq.transferFocus();
            }
            BuscarFrequentador(cod);
        }
    }//GEN-LAST:event_txtCodFreqKeyPressed

    private void txtCodFreqMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCodFreqMouseClicked
        txtCodFreq.selectAll();
    }//GEN-LAST:event_txtCodFreqMouseClicked

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        if(jRadioButton1.isSelected()){
            jRadioButton2.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
         if(jRadioButton2.isSelected()){
            jRadioButton1.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(!txtCodFreq.getText().equals("0"))  {
            int rowCountTelefone = jTableTelefone.getModel().getRowCount();
            List<Telefone> tel = new ArrayList<Telefone>();
            if (rowCountTelefone > 0) {
                for (int i = 0; i < rowCountTelefone; i++) {
                    Telefone t = new Telefone();
                    t.setTipoTelefone(jTableTelefone.getValueAt(i, 2).toString().replaceAll(" ", ""));
                    t.setDdd(jTableTelefone.getValueAt(i, 0).toString().replaceAll("_", ""));
                    t.setTelefone(jTableTelefone.getValueAt(i, 1).toString().replaceAll("[-]", "").trim());
                    t.setTipoPessoa(1);
                    tel.add(t);
                }
            }

            Frequentador f = new Frequentador();

            f.setCdFrequentador(Integer.parseInt(txtCodFreq.getText().equals("") ? "0" : txtCodFreq.getText()));
            f.setNmFrequentador(txtFreq.getText());
            f.setEmail(txtEmail.getText());
            f.setIdade(Integer.parseInt(txtIdade.getText().equals("") ? "0" : txtIdade.getText()));
            f.setNmMae(txtNmMae.getText());
            f.setEqCemec(jCheckEqCemec.isSelected() == true ? 1 : 0);
            f.setEspecial(jCheckNesEsp.isSelected() == true ? 1 : 0);
            f.setTelefones(tel);
            f.setSituacao(jRadioButton1.isSelected() == true ? 1 : 0);
            if (!FrequentadorOperacao.Alterar(f)) {
                    JOptionPane.showMessageDialog(null, "Cadastro alterado com sucesso");
                } else {
                    JOptionPane.showMessageDialog(null, "erro ao alterar");
                }
        } else {
             JOptionPane.showMessageDialog(null, "Busque um frequentador para alterar !");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            Component c = this.getFocusOwner();
            c.transferFocus();
        }
        if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
            this.dispose();
        }
        if (e.getKeyCode() == KeyEvent.VK_F3) {
            LimparTela();
        }
        if (e.getKeyCode() == KeyEvent.VK_F2) {
            try {
                SalvarFrequentador();
            } catch (ParseException ex) {
                Logger.getLogger(TelaFrequentador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (e.getKeyCode() == KeyEvent.VK_DELETE) {
            DeleteFrequentador();
        }
        if (e.getKeyCode() == KeyEvent.VK_F6) {
        }
    }

    private void DeleteFrequentador() {
        Object[] options = {"Sim", "Não"};

        int i = JOptionPane.showOptionDialog(null,
                "Deseja deletar este cadatro ?",
                "Cadastro de Frequentador",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

        if (i != JOptionPane.YES_OPTION) {
            return;
        }
        int codigo;
        codigo = Integer.parseInt(txtCodFreq.getText().equals("") ? "0" : txtCodFreq.getText());

        if (!FrequentadorOperacao.Excluir(codigo)) {
            JOptionPane.showMessageDialog(null, "Cadastro deletado!");
            LimparTela();
        }
    }

    private void BuscarFrequentador(int codFreq) {
        if (codFreq != 0) {
            Frequentador u;
            u = FrequentadorOperacao.getFrequentador(codFreq);
            if (u == null) {
                JOptionPane.showMessageDialog(null, "Frequentador não encontrado!");
                limparCampos();
                return;
            }

            txtFreq.setText(u.getNmFrequentador());
            txtEmail.setText(u.getEmail());
            txtIdade.setText(String.valueOf(u.getIdade()));
            txtNmMae.setText(u.getNmMae());
            jCheckNesEsp.setSelected(u.getEspecial() == 1 ? true : false);
            jCheckEqCemec.setSelected(u.getEqCemec() == 1 ? true : false);

            if (u.getDtNasc() != null) {
                txtDatNasc.setText(Utils.formatoDataSimples.format(u.getDtNasc()));
            } else {
                txtDatNasc.setText(null);
            }
            if (u.getDtCad() != null) {
                txtDatCad.setText(Utils.formatoDataSimples.format(u.getDtCad()));
            } else {
                txtDatCad.setText("");
            }
            DefaultTableModel modelTelefone = (DefaultTableModel) jTableTelefone.getModel();
            modelTelefone.getDataVector().removeAllElements();
            jTableTelefone.revalidate();

            if (u.getTelefones() != null && u.getTelefones().size() > 0) {

                for (Iterator<Telefone> it = u.getTelefones().iterator(); it.hasNext();) {
                    Telefone telefone = it.next();

                    modelTelefone.addRow(new Object[]{
                                telefone.getDdd(),
                                telefone.getTelefone(),
                                telefone.getTipoTelefone()
                            });
                }
            }
        }
    }

    private void SalvarFrequentador() throws ParseException {
        int rowCountTelefone = jTableTelefone.getModel().getRowCount();
        List<Telefone> tel = new ArrayList<Telefone>();
        if (rowCountTelefone > 0) {
            for (int i = 0; i < rowCountTelefone; i++) {
                Telefone t = new Telefone();
                t.setTipoTelefone(jTableTelefone.getValueAt(i, 2).toString().replaceAll(" ", ""));
                t.setDdd(jTableTelefone.getValueAt(i, 0).toString().replaceAll("_", ""));
                t.setTelefone(jTableTelefone.getValueAt(i, 1).toString().replaceAll("[-]", "").trim());
                t.setTipoPessoa(1);
                tel.add(t);
            }
        }
        Object[] options = {"Sim", "Não"};
        int i = JOptionPane.showOptionDialog(null,
                "Deseja salvar o cadatro ?",
                "Cadastro de Frequentador",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

        if (i != JOptionPane.YES_OPTION) {
            return;

        }
        datCad = txtDatCad.getText().replaceAll("\\D", "");
        dtNasc = txtDatNasc.getText().replaceAll("\\D", "");

        Frequentador f = new Frequentador();

        f.setCdFrequentador(Integer.parseInt(txtCodFreq.getText().equals("") ? "0" : txtCodFreq.getText()));
        f.setNmFrequentador(txtFreq.getText());
        f.setEmail(txtEmail.getText());
        f.setIdade(Integer.parseInt(txtIdade.getText().equals("") ? "0" : txtIdade.getText()));
        f.setNmMae(txtNmMae.getText());
        f.setEqCemec(jCheckEqCemec.isSelected() == true ? 1 : 0);
        f.setEspecial(jCheckNesEsp.isSelected() == true ? 1 : 0);
        f.setTelefones(tel);
        f.setSituacao(jRadioButton1.isSelected() == true ? 1 : 0);

        Date dtCad = new java.sql.Date(Utils.formatoDataSimples.parse(txtDatCad.getText()).getTime());
        Calendar c1 = new GregorianCalendar();
        c1.setTime(dtCad);
        f.setDtCad(dtCad);
        if (!dtNasc.equals("")) {
            Date dtNasc = new java.sql.Date(Utils.formatoDataSimples.parse(txtDatNasc.getText()).getTime());
            f.setDtNasc(dtNasc);
        } else {
            JOptionPane.showMessageDialog(null, "Por favor informe a Data de Nascimento");
        }
        if (f.getCdFrequentador() == 0) {
            if (FrequentadorOperacao.Salvar(f) != 0) {
                JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso");
                txtCodFreq.setText(String.valueOf(f.getCdFrequentador()));
            } else {
                JOptionPane.showMessageDialog(null, "erro no cadastro");
            }
        } else if (f.getCdFrequentador() > 0) {
            if (!FrequentadorOperacao.Alterar(f)) {
                JOptionPane.showMessageDialog(null, "Cadastro alterado com sucesso");
            } else {
                JOptionPane.showMessageDialog(null, "erro ao alterar");
            }
        }
    }

    private void AddTel() {
        DefaultTableModel model = (DefaultTableModel) jTableTelefone.getModel();

        if (txtDDD.getText().replaceAll("", "").trim().equals("")
                || txtDDD.getText().replaceAll("", "").trim().length() < 2) {
            JOptionPane.showMessageDialog(null, "DDD telefone não informado ou informado incorretamente");
            return;
        } else {
            if (txtTel.getText().replaceAll("[-]", "").trim().equals("")
                    || (txtTel.getText().replaceAll("[-]", "").trim().length() < 9 && boxTel.getSelectedItem().toString().equals("Celular")) || 
                    (txtTel.getText().replaceAll("[-]", "").trim().length() < 8 && !boxTel.getSelectedItem().toString().equals("Celular")) ) {
                JOptionPane.showMessageDialog(null, "Telefone não informado ou informado incorretamente");
                return;
            }
        }
        model.addRow(new Object[]{txtDDD.getText(), txtTel.getText(),
                    boxTel.getSelectedItem().toString(), boxTel.getSelectedIndex()});

        txtTel.setText("");
        txtDDD.setText("");
        boxTel.setSelectedIndex(0);
    }

    //Metodo para calcular idade
    private void CalcIdade() {
        dtNasc = txtDatNasc.getText();
        String data = dtNasc;
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        df.setLenient(false); //somente cria a data se a formação da mesma for correta
        java.util.Date d = null;
        try {
            d = (java.util.Date) df.parse(data);
        } catch (ParseException ex) {
            Logger.getLogger(TelaFrequentador.class.getName()).log(Level.SEVERE, null, ex);
        }

        Calendar dataAtual = Calendar.getInstance();
        dataAtual.setTime(new java.util.Date());

        Calendar dataNascimento = Calendar.getInstance();
        dataNascimento.setTime(d);

        Integer idade = dataAtual.get(Calendar.YEAR) - dataNascimento.get(Calendar.YEAR);

        if (dataAtual.get(Calendar.MONTH) < dataNascimento.get(Calendar.MONTH)) {
            idade = idade - 1;
        } else if ((dataAtual.get(Calendar.MONTH) == dataNascimento.get(Calendar.MONTH)) && (dataAtual.get(Calendar.DAY_OF_MONTH)
                <= dataNascimento.get(Calendar.DAY_OF_MONTH))) {
            idade = idade - 1;
        }
        txtIdade.setText(String.valueOf(idade));
    }

    private void LimparTela() {
        txtCodFreq.setText("0");
        txtFreq.setText("");
        txtEmail.setText("");
        GregorianCalendar gc = new GregorianCalendar();
        txtDatCad.setText(Utils.formatoDataSimples.format(gc.getTime()));
        txtDatNasc.setText("");
        txtIdade.setText("0");
        txtNmMae.setText("");
        boxTel.setSelectedIndex(0);
        txtDDD.setText("");
        txtTel.setText("");
        jCheckNesEsp.setSelected(false);
        jCheckEqCemec.setSelected(false);

        jTableTelefone.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "DDD", "Telefone", "Tipo"
                }));
        txtCodFreq.grabFocus();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox boxTel;
    private javax.swing.JButton butAddTel;
    private javax.swing.JButton butExcluir;
    private javax.swing.JButton butExcluir1;
    private javax.swing.JButton butExcluir3;
    private javax.swing.JButton butLimpar;
    private javax.swing.JButton butRemovTel;
    private javax.swing.JButton butSalvar;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckEqCemec;
    private javax.swing.JCheckBox jCheckNesEsp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableTelefone;
    private javax.swing.JTextField txtCodFreq;
    private javax.swing.JTextField txtDDD;
    private javax.swing.JFormattedTextField txtDatCad;
    private javax.swing.JFormattedTextField txtDatNasc;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFreq;
    private javax.swing.JTextField txtIdade;
    private javax.swing.JTextField txtNmMae;
    private javax.swing.JFormattedTextField txtTel;
    // End of variables declaration//GEN-END:variables
}
