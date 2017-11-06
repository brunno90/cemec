package br.ifirst.cemec.view;

import br.ifirst.cemec.entidades.DataDefinida;
import br.ifirst.cemec.entidades.Frequentador;
import br.ifirst.cemec.entidades.Tratamento;
import br.ifirst.cemec.entidades.TratamentoStatic;
import br.ifirst.cemec.operacoes.TratamentoOperacao;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Iagho
 */
public class PainelTpTratamento2 extends javax.swing.JDialog {

    Date dtIni, dtIniCalTrat, dtFinCalTrat, dtFin;
    int pediodico, seg, ter, qua, qui, sex, sab, dom, quant, cdFreq, todosDias, cdMov;
    private List<DataDefinida> dts;
    private GregorianCalendar gc = new GregorianCalendar();
    int[] vet;
    Date[] vetDate;

    public PainelTpTratamento2(JDialog aThis, boolean b, Tratamento t) {
        super(aThis, b);
        initComponents();
        setLocationRelativeTo(null);
        txtCodTrat.setText(String.valueOf(t.getCdTratamento()));
        txtTratamento.setText(t.getDsTratamento());
        if (t.getCdMov() > 0) {
            carregaTela(t);
        } else {
            txtDateIni.setDate(gc.getTime());
        }
        carregaVariaveis(t);
        if (t.getNaoRecPres() == 0) {
            jCheckTratDist.setEnabled(false);
        }
    }

    public PainelTpTratamento2(JFrame aThis, boolean b, Tratamento t) {
        super(aThis, b);
        initComponents();
        setLocationRelativeTo(null);
        txtCodTrat.setText(String.valueOf(t.getCdTratamento()));
        txtTratamento.setText(t.getDsTratamento());
        if (t.getCdMov() > 0) {
            carregaTela(t);
        } else {
            txtDateIni.setDate(gc.getTime());
        }
        carregaVariaveis(t);
        if (t.getNaoRecPres() == 0) {
            jCheckTratDist.setEnabled(false);
        }
    }

    private void carregaTela(Tratamento t) {
        txtDateIni.setDate(t.getDtInicial());
        txtDateFin.setDate(t.getDtFinal());
        txtQuant.setText(String.valueOf(t.getQtDias()));
        jCheckTratDist.setSelected(t.getTratDistancia());
        boxTpPeriodo.setSelectedIndex(t.getTpPeriodo());
    }

    private void carregaVariaveis(Tratamento t) {

        dtIniCalTrat = t.getCalendarioTratamento().getDtIni();
        dtFinCalTrat = t.getCalendarioTratamento().getDtFin();
        cdMov = t.getCdMov();
        seg = t.getCalendarioTratamento().getSeg();
        ter = t.getCalendarioTratamento().getTer();
        qua = t.getCalendarioTratamento().getQua();
        qui = t.getCalendarioTratamento().getQui();
        sex = t.getCalendarioTratamento().getSex();
        sab = t.getCalendarioTratamento().getSab();
        dom = t.getCalendarioTratamento().getDom();
        todosDias = t.getCalendarioTratamento().getTodosDias();
        cdFreq = t.getFrequentador().getCdFrequentador();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtTratamento = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDateIni = new com.toedter.calendar.JDateChooser("dd/MM/yyyy", "##/##/#####", '_');
        jCheckTratDist = new javax.swing.JCheckBox();
        butSalvar = new javax.swing.JButton();
        butFechar = new javax.swing.JButton();
        txtCodTrat = new javax.swing.JFormattedTextField();
        boxTpPeriodo = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        txtDateFin = new com.toedter.calendar.JDateChooser("dd/MM/yyyy", "##/##/#####", '_');
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtQuant = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Movimentação de Tratamentos");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        jLabel4.setText("Tratamento:");

        txtTratamento.setDocument(new br.ifirst.cemec.util.FieldLimit(50, true));
        txtTratamento.setEditable(false);
        txtTratamento.setFont(new java.awt.Font("Trebuchet MS", 0, 12));
        txtTratamento.setFocusable(false);

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        jLabel5.setText("Data inicial:");

        txtDateIni.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        jCheckTratDist.setSelected(true);
        jCheckTratDist.setText("Tratamento a distância");

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

        butFechar.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        butFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ifirst/cemec/resources/sair.png"))); // NOI18N
        butFechar.setText("Cancelar");
        butFechar.setFocusable(false);
        butFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butFecharActionPerformed(evt);
            }
        });

        txtCodTrat.setEditable(false);
        txtCodTrat.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtCodTrat.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtCodTrat.setText("0");
        txtCodTrat.setFocusable(false);
        txtCodTrat.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N

        boxTpPeriodo.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        boxTpPeriodo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "(Selecione)", "Dias", "Semanas", "Meses", "Vezes", "Luas", "Luinhas", "Indeterminado" }));

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        jLabel7.setText("Tipo de Periodo:");

        txtDateFin.setEnabled(false);
        txtDateFin.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        jLabel6.setText("Data final:");

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        jLabel8.setText("Quantidade:");

        txtQuant.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtQuant.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtQuant.setText("0");
        txtQuant.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtQuant.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtQuantKeyPressed(evt);
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
                        .addComponent(butSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(butFechar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel4))
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtCodTrat, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTratamento, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(boxTpPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtQuant, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtDateFin, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtDateIni, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jCheckTratDist)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTratamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodTrat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boxTpPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtQuant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(11, 11, 11))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(txtDateIni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDateFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckTratDist)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(butSalvar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(butFechar, javax.swing.GroupLayout.Alignment.TRAILING))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butSalvarActionPerformed
        int tpPeriodo = boxTpPeriodo.getSelectedIndex();

        switch (tpPeriodo) {
            case 1:
                Dias();
                break;
            case 2:
                SemanasMesesLuas(7);
                break;
            case 3:
                SemanasMesesLuas(30);
                break;
            case 4:
                Vezes();
                break;
            case 5:
                SemanasMesesLuas(28);
                break;
            case 6:
                SemanasMesesLuas(7);
                break;
            case 7:
                Indeterminado();
                break;
        }
        salvar();
    }//GEN-LAST:event_butSalvarActionPerformed

    private void butFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butFecharActionPerformed
        TratamentoStatic.setTratamento(null);
        this.dispose();
    }//GEN-LAST:event_butFecharActionPerformed

    private void txtQuantKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQuantKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_TAB) {
            int tpPeriodo = boxTpPeriodo.getSelectedIndex();

            switch (tpPeriodo) {
                case 1:
                    Dias();
                    break;
                case 2:
                    SemanasMesesLuas(7);
                    break;
                case 3:
                    SemanasMesesLuas(30);
                    break;
                case 4:
                    Vezes();
                    break;
                case 5:
                    SemanasMesesLuas(28);
                    break;
                case 6:
                    SemanasMesesLuas(7);
                    break;
                case 7:
                    Indeterminado();
                    break;
            }
        }
    }//GEN-LAST:event_txtQuantKeyPressed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox boxTpPeriodo;
    private javax.swing.JButton butFechar;
    private javax.swing.JButton butSalvar;
    private javax.swing.JCheckBox jCheckTratDist;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JFormattedTextField txtCodTrat;
    private com.toedter.calendar.JDateChooser txtDateFin;
    private com.toedter.calendar.JDateChooser txtDateIni;
    private javax.swing.JFormattedTextField txtQuant;
    private javax.swing.JTextField txtTratamento;
    // End of variables declaration//GEN-END:variables

    private void salvar() {
        if (boxTpPeriodo.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Por favor selecione um tipo de período!");
            return;
        }

        Tratamento t = new Tratamento();
        t.setCdTratamento(Integer.parseInt(txtCodTrat.getText().equals("") ? "0" : txtCodTrat.getText()));
        t.setDsTratamento(txtTratamento.getText());
        dtIni = txtDateIni.getDate();
        dtFin = txtDateFin.getDate();
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
        t.setTpPeriodo(boxTpPeriodo.getSelectedIndex());
        t.setTratDistancia(jCheckTratDist.isSelected());
        t.setDtCad(gc.getTime());
        t.setQtDias(Integer.parseInt(txtQuant.getText()));
        if (jCheckTratDist.isSelected() == true) {
            t.setPresenca(true);
        } else {
            t.setPresenca(false);
        }
        Frequentador f = new Frequentador();
        f.setCdFrequentador(cdFreq);
        t.setFrequentador(f);
        t.setDataDefinida(dts);
        t.setCdMov(cdMov);

        if (cdMov == 0) {
            if (!TratamentoOperacao.SalvarMovTrat(t)) {
                JOptionPane.showMessageDialog(null, "Movimento salvo!");
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao salvar movimento!");
            }
        } else if (cdMov > 0) {
            if (!TratamentoOperacao.UpdateMovTrat(t)) {
                JOptionPane.showMessageDialog(null, "Movimento salvo!");
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao salvar movimento!");
            }
        }
    }

    private void Dias() {
        dtIni = txtDateIni.getDate();
        quant = Integer.parseInt(txtQuant.getText().equals("") ? "0" : txtQuant.getText());
        if (quant == 0) {
            quant = 1;
        }
        int cont = 1;
        Date data;

        dts = new ArrayList<DataDefinida>();

        data = dtIni;
        for (cont = 1; cont < quant; cont++) {
            Calendar calc = Calendar.getInstance(); // cria um calendar e atribui a data atual
            calc.setTime(data); // seta a data ao calendar, new date() é a data atual mas pode vir de outro lugar
            calc.add(Calendar.DAY_OF_MONTH, 1); // aqui adiciona ao dia do mês 1 dia para reduziar coloca -1 por exemplo
            data = calc.getTime();
        }
        txtDateFin.setDate(data);

        data = dtIni;
        while (data.before(txtDateFin.getDate()) || data.equals(txtDateFin.getDate())) {
            DataDefinida dt = new DataDefinida();
            dt.setCdFreq(cdFreq);
            dt.setCdTrat(Integer.parseInt(txtCodTrat.getText()));
            dt.setData(data);
            dts.add(dt);

            Calendar calc = Calendar.getInstance(); // cria um calendar e atribui a data atual
            calc.setTime(data); // seta a data ao calendar, new date() é a data atual mas pode vir de outro lugar
            calc.add(Calendar.DAY_OF_MONTH, 1); // aqui adiciona ao dia do mês 1 dia para reduziar coloca -1 por exemplo
            data = calc.getTime();
        }

    }

    private void SemanasMesesLuas(int dias) {
        dtIni = txtDateIni.getDate();
        quant = Integer.parseInt(txtQuant.getText().equals("") ? "0" : txtQuant.getText());
        if (quant == 0) {
            quant = 1;
        }
        quant = quant * dias;
        Date data;
        dts = new ArrayList<DataDefinida>();
        data = dtIni;
        for (int i = 1; i < quant; i++) {
            Calendar calc = Calendar.getInstance(); // cria um calendar e atribui a data atual
            calc.setTime(data); // seta a data ao calendar, new date() é a data atual mas pode vir de outro lugar
            calc.add(Calendar.DAY_OF_MONTH, 1); // aqui adiciona ao dia do mês 1 dia para reduziar coloca -1 por exemplo
            data = calc.getTime();
        }
        txtDateFin.setDate(data);

        data = dtIni;
        while (data.before(txtDateFin.getDate()) || data.equals(txtDateFin.getDate())) {
            DataDefinida dt = new DataDefinida();
            dt.setCdFreq(cdFreq);
            dt.setCdTrat(Integer.parseInt(txtCodTrat.getText()));
            dt.setData(data);
            dts.add(dt);

            Calendar calc = Calendar.getInstance(); // cria um calendar e atribui a data atual
            calc.setTime(data); // seta a data ao calendar, new date() é a data atual mas pode vir de outro lugar
            calc.add(Calendar.DAY_OF_MONTH, 1); // aqui adiciona ao dia do mês 1 dia para reduziar coloca -1 por exemplo
            data = calc.getTime();
        }
    }

    private void Vezes() {
        dtIni();
        dtFin();
    }

    private void Indeterminado() {
        txtDateFin.setDate(null);
    }

    private void dtIni() {
        dtIni = txtDateIni.getDate();
        if (dtIni != null) {
            if (dtIni.before(dtIniCalTrat)) {
                JOptionPane.showMessageDialog(null, "A data informada e inferior da data inicial do tratamento! \n verifique no cadastro do tratamento!");
                txtDateIni.setDate(gc.getTime());
            } else if (dtIni.after(dtFinCalTrat)) {
                JOptionPane.showMessageDialog(null, "A data informada e superior da data final do tratamento! \n verifique no cadastro do tratamento!");
                txtDateIni.setDate(gc.getTime());
            }
            if (todosDias == 1) {
                return;
            }
            GregorianCalendar gc = new GregorianCalendar();
            gc.setTime(dtIni);
            int numDiaSemana, i = 0;

            vet = new int[7];

            numDiaSemana = gc.get(GregorianCalendar.DAY_OF_WEEK);

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
            int dif = 0, aux, dia;
            for (i = 0; i < 7; i++) {
                if (vet[i] != numDiaSemana && vet[i] != 0) {
                    if (numDiaSemana > vet[i]) {
                        aux = vet[i] - numDiaSemana;

                        if (aux < dif || dif == 0) {
                            dif = aux;
                        }
                    } else {
                        aux = vet[i] - numDiaSemana;

                        if (aux <= -(dif) || dif == 0) {
                            dif = aux;
                        }
                    }
                } else if (vet[i] == numDiaSemana) {
                    dtIni = txtDateIni.getDate();
                    return;
                }
            }
            dia = dif + numDiaSemana;
            if (numDiaSemana < dia) {
                gc.add(GregorianCalendar.DAY_OF_MONTH, dif);
                dtIni = gc.getTime();
                txtDateIni.setDate(gc.getTime());
            } else {
                gc.add(GregorianCalendar.DAY_OF_MONTH, dif + 7);
                dtIni = gc.getTime();
                txtDateIni.setDate(gc.getTime());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor informe a data inicial!");
        }

    }

    private void dtFin() {
        int i;
        vet = new int[7];
        quant = Integer.parseInt(txtQuant.getText().equals("") ? "0" : txtQuant.getText());
        if (quant == 0) {
            quant = 1;
        }
        Date auxDate = txtDateIni.getDate();

        dts = new ArrayList<DataDefinida>();
        for (i = 0; i <= quant - 1; i++) {
            DataDefinida dt = new DataDefinida();
            dt.setData(auxDate);
            dt.setCdFreq(cdFreq);
            dt.setCdTrat(Integer.parseInt(txtCodTrat.getText()));
            dts.add(dt);
            if (i < quant - 1) {
                auxDate = buscaDateFinal(auxDate);
            }
        }
        txtDateFin.setDate(auxDate);
    }

    private Date buscaDateFinal(Date auxDate) {

        if (auxDate != null) {
            GregorianCalendar gc = new GregorianCalendar();
            gc.setTime(auxDate);
            int numDiaSemana, i = 0;

            vet = new int[7];

            numDiaSemana = gc.get(GregorianCalendar.DAY_OF_WEEK);

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
            int dif = 0, aux, dia;

            for (i = 0; i < 7; i++) {
                if (vet[i] != numDiaSemana && vet[i] != 0) {
                    if (numDiaSemana > vet[i]) {
                        aux = vet[i] - numDiaSemana;

                        if (aux < dif || dif == 0) {
                            dif = aux;
                        }
                    } else {
                        aux = vet[i] - numDiaSemana;

                        if (aux <= -(dif) || dif == 0) {
                            dif = aux;
                        }
                    }
                }
            }
            dia = dif + numDiaSemana;
            if (numDiaSemana < dia) {
                gc.add(GregorianCalendar.DAY_OF_MONTH, dif);
                auxDate = gc.getTime();
            } else {
                gc.add(GregorianCalendar.DAY_OF_MONTH, dif + 7);
                auxDate = gc.getTime();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor informe a data inicial!");
        }
        return auxDate;
    }
}
