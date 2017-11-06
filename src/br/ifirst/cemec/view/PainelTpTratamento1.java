package br.ifirst.cemec.view;

import br.ifirst.cemec.entidades.CalendarioTratamento;
import br.ifirst.cemec.entidades.DataDefinida;
import br.ifirst.cemec.entidades.Frequentador;
import br.ifirst.cemec.entidades.Tratamento;
import br.ifirst.cemec.entidades.TratamentoStatic;
import br.ifirst.cemec.operacoes.DataDefinidaOperacao;
import br.ifirst.cemec.operacoes.FrequentadorOperacao;
import br.ifirst.cemec.operacoes.TratamentoOperacao;
import br.ifirst.cemec.util.MediumStatic;
import br.ifirst.cemec.view.pesquisa.PesquisarMedium;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Iagho
 */
public class PainelTpTratamento1 extends javax.swing.JDialog {

    Date dtIni, dtIniCalTrat, dtFinCalTrat, dtFin;
    int pediodico, seg, ter, qua, qui, sex, sab, dom, qtdias, todosDias, codFreq, dataDef, cdMov = 0;
    private GregorianCalendar gc = new GregorianCalendar();
    int[] vet;
    Date[] vetDate;
    private List<DataDefinida> dts;

    public PainelTpTratamento1(JDialog aThis, boolean b, Tratamento t) {
        super(aThis, b);
        initComponents();
        setLocationRelativeTo(null);
        txtCodTrat.setText(String.valueOf(t.getCdTratamento()));
        codFreq = t.getFrequentador().getCdFrequentador();
        txtTratamento.setText(t.getDsTratamento());
        if (t.getCdMov() > 0) {
            carregaTela(t);
        } else {
            txtDateIni.setDate(gc.getTime());
        }
        if (t.getMedium() == 1) {
            txtCodFreq.setEditable(true);
        }
        carregaVariaveis(t);
        if (t.getNaoRecPres() == 0) {
            jCheckTratDist.setEnabled(false);
        }
        txtCodFreq.setText(String.valueOf(MediumStatic.getFrequentador().getCdFrequentador()));
        txtFreq.setText(MediumStatic.getFrequentador().getNmFrequentador());
    }

    public PainelTpTratamento1(JFrame aThis, boolean b, Tratamento t) {
        super(aThis, b);
        initComponents();
        setLocationRelativeTo(null);
        txtCodTrat.setText(String.valueOf(t.getCdTratamento()));
        codFreq = t.getFrequentador().getCdFrequentador();
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
        txtQtDias.setText(String.valueOf(t.getQtDias()));
        jCheckTratDist.setSelected(t.getTratDistancia());
    }

    private void carregaVariaveis(Tratamento t) {
        dataDef = t.getDataDef();
        CalendarioTratamento cal;
        cal = t.getCalendarioTratamento();
        if (cal.getDtIni() != null) {
            dtIniCalTrat = t.getCalendarioTratamento().getDtIni();
        } else {
            dtIniCalTrat = gc.getTime();
        }
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
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckEqCemec = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtTratamento = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDateIni = new com.toedter.calendar.JDateChooser("dd/MM/yyyy", "##/##/#####", '_');
        jLabel6 = new javax.swing.JLabel();
        jCheckTratDist = new javax.swing.JCheckBox();
        butSalvar = new javax.swing.JButton();
        butExcluir3 = new javax.swing.JButton();
        txtCodTrat = new javax.swing.JFormattedTextField();
        txtQtDias = new javax.swing.JTextField();
        txtDateFin = new com.toedter.calendar.JDateChooser("dd/MM/yyyy", "##/##/#####", '_');
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtFreq = new javax.swing.JTextField();
        txtCodFreq = new javax.swing.JFormattedTextField();
        butPesqFreq = new javax.swing.JButton();

        jCheckEqCemec.setText("Tratamento a distância");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Movimentação de tratamentos");

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
        txtDateIni.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtDateIniPropertyChange(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        jLabel6.setText("Quant. dias:");

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

        butExcluir3.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        butExcluir3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ifirst/cemec/resources/sair.png"))); // NOI18N
        butExcluir3.setText("Cancelar");
        butExcluir3.setFocusable(false);
        butExcluir3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butExcluir3ActionPerformed(evt);
            }
        });

        txtCodTrat.setEditable(false);
        txtCodTrat.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtCodTrat.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtCodTrat.setText("0");
        txtCodTrat.setFocusable(false);
        txtCodTrat.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N

        txtQtDias.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtQtDias.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtQtDias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtDiasActionPerformed(evt);
            }
        });
        txtQtDias.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtQtDiasFocusLost(evt);
            }
        });

        txtDateFin.setEnabled(false);
        txtDateFin.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        jLabel7.setText("Data final:");

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        jLabel8.setText("Medium:");

        txtFreq.setDocument(new br.ifirst.cemec.util.FieldLimit(50, true));
        txtFreq.setEditable(false);
        txtFreq.setFont(new java.awt.Font("Trebuchet MS", 0, 12));
        txtFreq.setFocusable(false);

        txtCodFreq.setEditable(false);
        txtCodFreq.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtCodFreq.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtCodFreq.setText("0");
        txtCodFreq.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(butSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(butExcluir3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jCheckTratDist))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtCodTrat, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtTratamento))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtDateIni, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtQtDias, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtDateFin, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCodFreq, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(butPesqFreq, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFreq, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtTratamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCodTrat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(txtDateIni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(txtQtDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7))))
                    .addComponent(txtDateFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckTratDist)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCodFreq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtFreq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(butPesqFreq, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butSalvar)
                    .addComponent(butExcluir3))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butSalvarActionPerformed
        qtdias = Integer.parseInt(txtQtDias.getText().equals("") ? "0" : txtQtDias.getText());
        if (qtdias == 0) {
            qtdias = 1;
        }
        if (dataDef == 1 && qtdias > 0) {
            buscaDatas();
        } else if (qtdias > 0) {
            dtIni();
            dtFin();
        }
        salvar();
    }//GEN-LAST:event_butSalvarActionPerformed

    private void butExcluir3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butExcluir3ActionPerformed
        TratamentoStatic.setTratamento(null);
        this.dispose();
    }//GEN-LAST:event_butExcluir3ActionPerformed

    private void txtQtDiasFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtQtDiasFocusLost
        qtdias = Integer.parseInt(txtQtDias.getText().equals("") ? "0" : txtQtDias.getText());
        if (dataDef == 1 && qtdias > 0) {
            buscaDatas();
        } else if (qtdias > 0) {
            dtIni();
            dtFin();
        }
    }//GEN-LAST:event_txtQtDiasFocusLost

    private void txtQtDiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtDiasActionPerformed
        txtQtDias.transferFocus();
    }//GEN-LAST:event_txtQtDiasActionPerformed

    private void txtDateIniPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtDateIniPropertyChange
        txtDateIni.transferFocus();
    }//GEN-LAST:event_txtDateIniPropertyChange

    private void txtCodFreqFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodFreqFocusLost
        int cod = Integer.parseInt(txtCodFreq.getText().equals("") ? "0" : txtCodFreq.getText());
        if (cod > 0) {
            BuscarMedium(cod);
        }
    }//GEN-LAST:event_txtCodFreqFocusLost

    private void butPesqFreqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butPesqFreqActionPerformed
        PesquisarMedium pesquisarFrequentador = new PesquisarMedium(this, true);
        pesquisarFrequentador.setVisible(true);
        Frequentador frequentador = pesquisarFrequentador.getFrequentador();

        if (frequentador != null) {
            txtCodFreq.setText(String.valueOf(frequentador.getCdFrequentador()));
            txtFreq.setText(frequentador.getNmFrequentador());
        }
    }//GEN-LAST:event_butPesqFreqActionPerformed
    private void BuscarMedium(int codFreq) {
        if (codFreq != 0) {
            Frequentador u;
            u = FrequentadorOperacao.getMedium(codFreq);
            if (u == null) {
                JOptionPane.showMessageDialog(null, "Frequentador não encontrado!");
                return;
            }
            txtFreq.setText(u.getNmFrequentador());
            MediumStatic.setFrequentador(u);
        }
    }

    private void salvar() {
        Tratamento t = new Tratamento();
        t.setCdTratamento(Integer.parseInt(txtCodTrat.getText().equals("") ? "0" : txtCodTrat.getText()));
        t.setDsTratamento(txtTratamento.getText());
        t.setNmMedium(txtFreq.getText());
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
        t.setQtDias(Integer.parseInt(txtQtDias.getText().equals("0") ? "1" : txtQtDias.getText()));
        t.setTratDistancia(jCheckTratDist.isSelected());
        t.setTpPeriodo(0);
        t.setDtCad(gc.getTime());
        Frequentador f = new Frequentador();
        f.setCdFrequentador(codFreq);
        t.setFrequentador(f);
        if (dts == null) {
            dts = new ArrayList<DataDefinida>();
            DataDefinida d = new DataDefinida();
            d.setCdTrat(Integer.parseInt(txtCodTrat.getText()));
            d.setCdFreq(codFreq);
            d.setData(txtDateIni.getDate());
            d.setPresenca(0);

            dts.add(d);
        }
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

    private void buscaDatas() {
        List<DataDefinida> dt;
        dt = DataDefinidaOperacao.Buscar(Integer.parseInt(txtCodTrat.getText().equals("") ? "0" : txtCodTrat.getText()));
        dtIni = txtDateIni.getDate();
        Date aux = null;
        int cont = Integer.parseInt(txtQtDias.getText());
        dts = new ArrayList<DataDefinida>();
        if (dt != null && dt.size() > 0) {
            for (Iterator<DataDefinida> it = dt.iterator(); it.hasNext();) {
                DataDefinida data = it.next();
                if (data.getData().equals(dtIni) || data.getData().after(dtIni)) {
                    if (cont > 0) {

                        for (int i = 0; i < 1; i++) {
                            DataDefinida t = new DataDefinida();
                            t.setCdTrat(Integer.parseInt(txtCodTrat.getText()));
                            t.setCdFreq(codFreq);
                            t.setData(data.getData());
                            dts.add(t);
                            txtDateFin.setDate(data.getData());
                            cont--;
                        }
                    }
                }
                aux = data.getData();
            }

            for (Iterator<DataDefinida> it = dts.iterator(); it.hasNext();) {
                DataDefinida data = it.next();
                if ((data.getData().before(aux))) {
                    aux = data.getData();
                    txtDateIni.setDate(aux);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Não exite data definida para este tratamento \n "
                    + "Por favor definir as datas no calendario de tratamento!");
        }
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
        qtdias = Integer.parseInt(txtQtDias.getText());
        Date auxDate = dtIni;
        dts = new ArrayList<DataDefinida>();
        for (i = 0; i < qtdias - 1; i++) {
            auxDate = buscaDateFinal(auxDate);
            DataDefinida dt = new DataDefinida();
            dt.setData(auxDate);
            dts.add(dt);
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
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butExcluir3;
    private javax.swing.JButton butPesqFreq;
    private javax.swing.JButton butSalvar;
    private javax.swing.JCheckBox jCheckEqCemec;
    private javax.swing.JCheckBox jCheckTratDist;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JFormattedTextField txtCodFreq;
    private javax.swing.JFormattedTextField txtCodTrat;
    private com.toedter.calendar.JDateChooser txtDateFin;
    private com.toedter.calendar.JDateChooser txtDateIni;
    private javax.swing.JTextField txtFreq;
    private javax.swing.JTextField txtQtDias;
    private javax.swing.JTextField txtTratamento;
    // End of variables declaration//GEN-END:variables
}
