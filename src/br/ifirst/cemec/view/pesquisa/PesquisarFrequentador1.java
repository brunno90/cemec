package br.ifirst.cemec.view.pesquisa;

import br.ifirst.cemec.entidades.DataDefinida;
import br.ifirst.cemec.entidades.Frequentador;
import br.ifirst.cemec.entidades.Senha;
import br.ifirst.cemec.entidades.Tratamento;
import br.ifirst.cemec.operacoes.FrequentadorOperacao;
import br.ifirst.cemec.operacoes.SenhaOperacao;
import br.ifirst.cemec.operacoes.TratamentoOperacao;
import br.ifirst.cemec.view.TelaFrequentador;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Iagho
 */
public class PesquisarFrequentador1 extends javax.swing.JDialog {

    private List<Frequentador> frequentadors;
    private Frequentador frequentador;
    int box = 0;
    String pesq = "%%%";

    public PesquisarFrequentador1(JDialog aThis, boolean b) {
        super(aThis, b);
        initComponents();
        setLocationRelativeTo(null);
        txtPesqFunc.grabFocus();
    }

    public PesquisarFrequentador1(JFrame aThis, boolean b) {
        super(aThis, b);
        initComponents();
        setLocationRelativeTo(null);
        txtPesqFunc.grabFocus();
    }

    public PesquisarFrequentador1(JInternalFrame aThis, boolean b) {
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
        jTableFreq = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        butPresenca = new javax.swing.JButton();
        butFechar1 = new javax.swing.JButton();
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

        jTableFreq.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod.Frequentador", "Nome", "Presença"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableFreq.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableFreqMouseClicked(evt);
            }
        });
        jTableFreq.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTableFreqKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTableFreq);
        jTableFreq.getColumnModel().getColumn(0).setMinWidth(90);
        jTableFreq.getColumnModel().getColumn(0).setPreferredWidth(90);
        jTableFreq.getColumnModel().getColumn(0).setMaxWidth(90);
        jTableFreq.getColumnModel().getColumn(2).setMinWidth(70);
        jTableFreq.getColumnModel().getColumn(2).setPreferredWidth(70);
        jTableFreq.getColumnModel().getColumn(2).setMaxWidth(70);

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        butPresenca.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        butPresenca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ifirst/cemec/resources/fazer2.png"))); // NOI18N
        butPresenca.setText("Presença");
        butPresenca.setFocusable(false);
        butPresenca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butPresencaActionPerformed(evt);
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

        butPesq1.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        butPesq1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ifirst/cemec/resources/Aluno.png"))); // NOI18N
        butPesq1.setText("Novo");
        butPesq1.setFocusable(false);
        butPesq1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butPesq1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(butPesq1)
                .addGap(18, 18, 18)
                .addComponent(butPresenca, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(butFechar1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {butFechar1, butPesq1, butPresenca});

        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butPresenca)
                    .addComponent(butFechar1)
                    .addComponent(butPesq1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 613, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 476, Short.MAX_VALUE)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(txtPesqFunc, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(butPesq)))
                .addContainerGap())
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butPesq)
                    .addComponent(txtPesqFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
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

    private void jTableFreqKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableFreqKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_F9) {
            Tratamento t;
            t = salvar();
            gerarSenha(t);
        }
    }//GEN-LAST:event_jTableFreqKeyPressed

    private void butPesq1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butPesq1ActionPerformed
        this.dispose();
        TelaFrequentador cadFrequentador = new TelaFrequentador();
        cadFrequentador.setVisible(true);
    }//GEN-LAST:event_butPesq1ActionPerformed

    private void butPresencaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butPresencaActionPerformed
        Tratamento t;
        t = salvar();
        gerarSenha(t);
    }//GEN-LAST:event_butPresencaActionPerformed

    private void butFechar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butFechar1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_butFechar1ActionPerformed

    private void jTableFreqMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableFreqMouseClicked
        boolean presenca = Boolean.parseBoolean(jTableFreq.getValueAt(jTableFreq.getSelectedRow(), 2).toString());
        if (presenca == true) {
            Tratamento t;
            t = salvar();
            gerarSenha(t);
        }
    }//GEN-LAST:event_jTableFreqMouseClicked

    private void txtPesqFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesqFuncActionPerformed
        box = jComboBox1.getSelectedIndex();
        pesq = txtPesqFunc.getText();

        if (txtPesqFunc.getText().length() > 2) {
            carregaTable(box, pesq);
        }
    }//GEN-LAST:event_txtPesqFuncActionPerformed
    private Frequentador BuscarFrequentador(int codFreq) {

        Frequentador u;
        u = FrequentadorOperacao.getFrequentador(codFreq);
        if (u == null) {
            JOptionPane.showMessageDialog(null, "Frequentador não encontrado!");
            return null;
        }
        return u;

    }

    private void gerarSenha(Tratamento t) {
        int cdTrat = t.getCdTratamento();
        int cdMov = t.getCdMov();
        int cdFreq = Integer.parseInt(jTableFreq.getValueAt(jTableFreq.getSelectedRow(), 0).toString());
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
        txtPesqFunc.setText("");
    }

    private Tratamento salvar() {

        GregorianCalendar gc = new GregorianCalendar();
        Tratamento t = new Tratamento();

        t.setCdTratamento(6);
        t.setDsTratamento("CONSULTA ESPIRITUALIDADE");
        t.setNmMedium("");
        Date dtIni = gc.getTime();
        Date dtFin = gc.getTime();
        if (dtIni != null) {
            java.sql.Date datIni = new java.sql.Date(dtIni.getTime());
            t.setDtInicial(datIni);
        } else {
            t.setDtInicial(null);
        }
        if (dtFin != null) {
            java.sql.Date datFin = new java.sql.Date(dtFin.getTime());
            t.setDtFinal(datFin);
        } else {
            t.setDtFinal(null);
        }

        t.setQtDias(1);
        t.setTratDistancia(false);
        t.setTpPeriodo(0);
        t.setDtCad(gc.getTime());
        Frequentador f = new Frequentador();

        f.setCdFrequentador(Integer.parseInt(jTableFreq.getValueAt(jTableFreq.getSelectedRow(), 0).toString()));

        t.setFrequentador(f);
        List<DataDefinida> dts;
        dts = new ArrayList<DataDefinida>();
        DataDefinida d = new DataDefinida();
        d.setCdTrat(6);
        d.setCdFreq(Integer.parseInt(jTableFreq.getValueAt(jTableFreq.getSelectedRow(), 0).toString()));
        d.setData(gc.getTime());
        d.setPresenca(0);

        dts.add(d);

        t.setDataDefinida(dts);

        if (!TratamentoOperacao.SalvarMovTrat(t)) {
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao gerar movimento!");
        }

        return t;
    }

    public Frequentador getFrequentador() {
        return frequentador;
    }

    private void carregaTable(int box, String pesq) {

        DefaultTableModel model = (DefaultTableModel) jTableFreq.getModel();
        model.getDataVector().removeAllElements();
        jTableFreq.revalidate();

        frequentadors = FrequentadorOperacao.PesquisaFrequentador(box, pesq);

        for (Frequentador f : frequentadors) {

            model.addRow(new Object[]{
                f.getCdFrequentador(),
                f.getNmFrequentador(),
                f.getTratamento().getPresenca(),
                ""
            });
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butFechar1;
    private javax.swing.JButton butPesq;
    private javax.swing.JButton butPesq1;
    private javax.swing.JButton butPresenca;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableFreq;
    private javax.swing.JTextField txtPesqFunc;
    // End of variables declaration//GEN-END:variables
}