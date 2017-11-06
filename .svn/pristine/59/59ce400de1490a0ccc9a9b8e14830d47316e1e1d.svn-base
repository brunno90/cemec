package br.ifirst.cemec.view;

import br.ifirst.cemec.entidades.DataDefinida;
import br.ifirst.cemec.entidades.Tratamento;
import br.ifirst.cemec.operacoes.DataDefinidaOperacao;
import br.ifirst.cemec.util.Utils;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
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
public class TelaDefDatas extends javax.swing.JDialog {

    Date dtini, dtFin;
    int pediodico, seg, ter, qua, qui, sex, sab, dom, qtdias, todosDias, codFreq;
    private GregorianCalendar gc = new GregorianCalendar();
    int[] vet;

    public TelaDefDatas(JDialog aThis, boolean b, Tratamento t) {
        super(aThis, b);
        initComponents();
        setLocationRelativeTo(null);
        carregaVariaveis(t);
        txtCodTratamento.setText(String.valueOf(t.getCdTratamento()));
        txtTratamento.setText(t.getDsTratamento());
        BuscarDatas();
    }

    public TelaDefDatas(JFrame aThis, boolean b, Tratamento t) {
        super(aThis, b);
        initComponents();
        setLocationRelativeTo(null);
        carregaVariaveis(t);
        txtCodTratamento.setText(String.valueOf(t.getCdTratamento()));
        txtTratamento.setText(t.getDsTratamento());
        BuscarDatas();
    }

    private void carregaVariaveis(Tratamento t) {
        dtini = t.getDtInicial();
        dtFin = t.getDtFinal();
        seg = t.getCalendarioTratamento().getSeg();
        ter = t.getCalendarioTratamento().getTer();
        qua = t.getCalendarioTratamento().getQua();
        qui = t.getCalendarioTratamento().getQui();
        sex = t.getCalendarioTratamento().getSex();
        sab = t.getCalendarioTratamento().getSab();
        dom = t.getCalendarioTratamento().getDom();
        todosDias = t.getCalendarioTratamento().getTodosDias();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtTratamento = new javax.swing.JTextField();
        txtCodTratamento = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        butExcluir11 = new javax.swing.JButton();
        butSalvar2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Datas definidas para o movimento");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Datas", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getColumn(1).setMinWidth(50);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(50);
        jTable1.getColumnModel().getColumn(1).setMaxWidth(50);

        txtTratamento.setDocument(new br.ifirst.cemec.util.FieldLimit(50, true));
        txtTratamento.setEditable(false);
        txtTratamento.setFont(new java.awt.Font("Trebuchet MS", 0, 12));
        txtTratamento.setFocusable(false);

        txtCodTratamento.setEditable(false);
        txtCodTratamento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtCodTratamento.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtCodTratamento.setText("0");
        txtCodTratamento.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        jLabel4.setText("Tratamento:");

        butExcluir11.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        butExcluir11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ifirst/cemec/resources/sair.png"))); // NOI18N
        butExcluir11.setText("Fechar");
        butExcluir11.setFocusable(false);
        butExcluir11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butExcluir11ActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(butSalvar2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(butExcluir11))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodTratamento, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTratamento))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCodTratamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTratamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butSalvar2)
                    .addComponent(butExcluir11))
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

    private void butExcluir11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butExcluir11ActionPerformed
        this.dispose();
    }//GEN-LAST:event_butExcluir11ActionPerformed

    private void butSalvar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butSalvar2ActionPerformed
        try {
            SalvarDatasDefinidas();
        } catch (ParseException ex) {
            Logger.getLogger(TelaDefDatas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_butSalvar2ActionPerformed
    private void SalvarDatasDefinidas() throws ParseException {
        int rowCount = jTable1.getModel().getRowCount();
        List<DataDefinida> datas = new ArrayList<DataDefinida>();
        boolean result;
        if (rowCount > 0) {
            for (int i = 0; i < rowCount; i++) {
                result = Boolean.parseBoolean(jTable1.getValueAt(i, 1).toString().replaceAll(" ", ""));
                if (result == true) {
                    DataDefinida d = new DataDefinida();
                    d.setCdTrat(Integer.parseInt(txtCodTratamento.getText()));
                    java.sql.Date data = new java.sql.Date(Utils.formatoDataSimples.parse(jTable1.getValueAt(i, 0).toString()).getTime());
                    d.setData(data);
                    datas.add(d);
                }
            }
        }
        Object[] options = {"Sim", "Não"};
        int i = JOptionPane.showOptionDialog(null,
                "Deseja salvar as datas ?",
                "Datas Definidas",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

        if (i != JOptionPane.YES_OPTION) {
            return;

        }
        Tratamento t = new Tratamento();
        t.setCdTratamento(Integer.parseInt(txtCodTratamento.getText()));
        t.setDataDefinida(datas);

        if (!DataDefinidaOperacao.Salvar(t)) {
            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao salvar");
        }
    }

    private void BuscarDatas() {
        Date data = dtini;

        GregorianCalendar gc = new GregorianCalendar();
        gc.setTime(data);
        int numDiaSemana;
        numDiaSemana = gc.get(GregorianCalendar.DAY_OF_WEEK);

        int i = 0;
        vet = new int[7];

        if (dom == 1) {
            vet[i] = 1;
            i++;
        }
        if (seg == 1) {
            vet[i] = 2;
            i++;
        }
        if (ter == 1) {
            vet[i] = 3;
            i++;
        }
        if (qua == 1) {
            vet[i] = 4;
            i++;
        }
        if (qui == 1) {
            vet[i] = 5;
            i++;
        }
        if (sex == 1) {
            vet[i] = 6;
            i++;
        }
        if (sab == 1) {
            vet[i] = 7;
            i++;
        }
        while (data.before(dtFin)) {
            for (i = 0; i < 7; i++) {
                if (numDiaSemana == vet[i] && vet[i] != 0) {
                    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                    model.addRow(new Object[]{Utils.formatoDataSimples.format(data), false});
                }
            }

            Calendar dt = Calendar.getInstance();
            dt.setTime(data);
            dt.add(Calendar.DAY_OF_MONTH, 1);
            data = dt.getTime();

            gc.setTime(data);
            numDiaSemana = gc.get(GregorianCalendar.DAY_OF_WEEK);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butExcluir11;
    private javax.swing.JButton butSalvar2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JFormattedTextField txtCodTratamento;
    private javax.swing.JTextField txtTratamento;
    // End of variables declaration//GEN-END:variables
}
