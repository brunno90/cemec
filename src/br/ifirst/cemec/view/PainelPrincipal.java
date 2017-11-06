package br.ifirst.cemec.view;

import br.ifirst.cemec.entidades.DataDefinida;
import br.ifirst.cemec.entidades.Frequentador;
import br.ifirst.cemec.entidades.Permissao;
import br.ifirst.cemec.entidades.Senha;
import br.ifirst.cemec.entidades.Tratamento;
import br.ifirst.cemec.operacoes.FrequentadorOperacao;
import br.ifirst.cemec.operacoes.PermissaoOperacao;
import br.ifirst.cemec.operacoes.SenhaOperacao;
import br.ifirst.cemec.operacoes.TratamentoOperacao;
import br.ifirst.cemec.util.IFormComando;
import br.ifirst.cemec.util.UsuarioLogado;
import br.ifirst.cemec.view.pesquisa.PesquisarFrequentador1;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.Window;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Iagho
 */
public class PainelPrincipal extends javax.swing.JFrame implements IFormComando {

    private KeyboardFocusManager kfm;
    private static final long serialVersionUID = 1L;
    int cdPer, box = 0;
    String pesq = "%%%";
    private List<Frequentador> frequentadors;
    private Frequentador frequentador;

    public PainelPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        jLblUsuarioLogado.setText(UsuarioLogado.getUsuario().getNmUsu());
        ImageIcon icon = new ImageIcon(this.getClass().getResource("/br/ifirst/cemec/resources/logo3.jpg"));
        setIconImage(icon.getImage());
        this.setExtendedState(MAXIMIZED_BOTH);
        setKeyboardComandos();
    }

    public JDesktopPane getJDesktopPane1() {
        return mdiPrincipal;
    }

    private void setKeyboardComandos() {
        kfm = KeyboardFocusManager.getCurrentKeyboardFocusManager();
        kfm.addKeyEventDispatcher(new KeyEventDispatcher() {
            @Override
            public boolean dispatchKeyEvent(KeyEvent ke) {
                kfm.dispatchKeyEvent(ke);
                if (ke.getID() == KeyEvent.KEY_PRESSED) {
                    Window windowForComponent = SwingUtilities.windowForComponent(ke.getComponent());
                    if (windowForComponent instanceof JFrame) {
                        JInternalFrame f = mdiPrincipal.getSelectedFrame();
                        if (f != null && f instanceof IFormComando) {
                            IFormComando comando = (IFormComando) f;
                            comando.execComando(ke);
                            return true;
                        }
                    } else {
                        if (windowForComponent instanceof JDialog) {
                            kfm.redispatchEvent(windowForComponent, ke);
                            return true;
                        }
                    }
                }
                return false;
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mdiPrincipal = new javax.swing.JDesktopPane();
        jLabel15 = new javax.swing.JLabel();
        jLblUsuarioLogado = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        txtPesqFunc = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        butPesq = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableFreq = new javax.swing.JTable();
        jPAtalhos = new javax.swing.JPanel();
        butCadFreq = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        butCadCalendTrat = new javax.swing.JButton();
        butSenha = new javax.swing.JButton();
        butLimpezaTrat = new javax.swing.JButton();
        butMovTrat = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        butMovTrat1 = new javax.swing.JButton();
        jMenu = new javax.swing.JMenuBar();
        jMenuCad = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuCadFrec = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuMov = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuManu = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CASA ESPÍRITA MENSAGEIROS DA CARIDADE");

        mdiPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        jLabel15.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel15.setText("Usuario Logado:");
        jLabel15.setBounds(20, 10, 101, 20);
        mdiPrincipal.add(jLabel15, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLblUsuarioLogado.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLblUsuarioLogado.setFocusable(false);
        jLblUsuarioLogado.setBounds(130, 10, 304, 21);
        mdiPrincipal.add(jLblUsuarioLogado, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setForeground(new java.awt.Color(0, 102, 255));
        jLabel2.setText("Campos/Ordenação");
        jLabel2.setBounds(20, 30, 95, 14);
        mdiPrincipal.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nome", "Nome Mãe" }));
        jComboBox1.setBounds(20, 50, 140, 20);
        mdiPrincipal.add(jComboBox1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        txtPesqFunc.setDocument(new br.ifirst.cemec.util.FieldLimit(50, true));
        txtPesqFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesqFuncActionPerformed(evt);
            }
        });
        txtPesqFunc.setBounds(160, 50, 440, 20);
        mdiPrincipal.add(txtPesqFunc, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel3.setForeground(new java.awt.Color(0, 51, 255));
        jLabel3.setText("Consulta");
        jLabel3.setBounds(600, 30, 42, 14);
        mdiPrincipal.add(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        butPesq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ifirst/cemec/resources/http-__iconesbr.oficinadanet.com_7715_16x16.png"))); // NOI18N
        butPesq.setText("Pesquisar");
        butPesq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butPesqActionPerformed(evt);
            }
        });
        butPesq.setBounds(600, 50, 99, 30);
        mdiPrincipal.add(butPesq, javax.swing.JLayeredPane.DEFAULT_LAYER);

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
        jTableFreq.getColumnModel().getColumn(0).setMinWidth(100);
        jTableFreq.getColumnModel().getColumn(0).setPreferredWidth(100);
        jTableFreq.getColumnModel().getColumn(0).setMaxWidth(100);
        jTableFreq.getColumnModel().getColumn(2).setMinWidth(100);
        jTableFreq.getColumnModel().getColumn(2).setPreferredWidth(100);
        jTableFreq.getColumnModel().getColumn(2).setMaxWidth(100);

        jScrollPane1.setBounds(20, 80, 680, 410);
        mdiPrincipal.add(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jPAtalhos.setBackground(new java.awt.Color(102, 153, 255));
        jPAtalhos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, null));

        butCadFreq.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        butCadFreq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ifirst/cemec/resources/Aluno.png"))); // NOI18N
        butCadFreq.setText("Cadastro de Frequentador");
        butCadFreq.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(9, 105, 213), new java.awt.Color(9, 105, 213), new java.awt.Color(9, 105, 213), new java.awt.Color(9, 105, 213)));
        butCadFreq.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        butCadFreq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butCadFreqActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Atalhos");

        butCadCalendTrat.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        butCadCalendTrat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ifirst/cemec/resources/calendario.png"))); // NOI18N
        butCadCalendTrat.setText("Calendario de Tratamento");
        butCadCalendTrat.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(9, 105, 213), new java.awt.Color(9, 105, 213), new java.awt.Color(9, 105, 213), new java.awt.Color(9, 105, 213)));
        butCadCalendTrat.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        butCadCalendTrat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butCadCalendTratActionPerformed(evt);
            }
        });

        butSenha.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        butSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ifirst/cemec/resources/fazer2.png"))); // NOI18N
        butSenha.setText("Inicializar Senha");
        butSenha.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(9, 105, 213), new java.awt.Color(9, 105, 213), new java.awt.Color(9, 105, 213), new java.awt.Color(9, 105, 213)));
        butSenha.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        butSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butSenhaActionPerformed(evt);
            }
        });

        butLimpezaTrat.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        butLimpezaTrat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ifirst/cemec/resources/limpar.png"))); // NOI18N
        butLimpezaTrat.setText("Limpeza de Tratamentos");
        butLimpezaTrat.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(9, 105, 213), new java.awt.Color(9, 105, 213), new java.awt.Color(9, 105, 213), new java.awt.Color(9, 105, 213)));
        butLimpezaTrat.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        butLimpezaTrat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butLimpezaTratActionPerformed(evt);
            }
        });

        butMovTrat.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        butMovTrat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ifirst/cemec/resources/agenda.png"))); // NOI18N
        butMovTrat.setText("Movimentação de Tratamento");
        butMovTrat.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(9, 105, 213), new java.awt.Color(9, 105, 213), new java.awt.Color(9, 105, 213), new java.awt.Color(9, 105, 213)));
        butMovTrat.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        butMovTrat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butMovTratActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("NEXT SYSTEM ®");

        butMovTrat1.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        butMovTrat1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ifirst/cemec/resources/agenda.png"))); // NOI18N
        butMovTrat1.setText("Marcar Tratamento");
        butMovTrat1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(9, 105, 213), new java.awt.Color(9, 105, 213), new java.awt.Color(9, 105, 213), new java.awt.Color(9, 105, 213)));
        butMovTrat1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        butMovTrat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butMovTrat1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPAtalhosLayout = new javax.swing.GroupLayout(jPAtalhos);
        jPAtalhos.setLayout(jPAtalhosLayout);
        jPAtalhosLayout.setHorizontalGroup(
            jPAtalhosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPAtalhosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPAtalhosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPAtalhosLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(butSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(butMovTrat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(butCadFreq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(butLimpezaTrat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butCadCalendTrat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(butMovTrat1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPAtalhosLayout.setVerticalGroup(
            jPAtalhosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPAtalhosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(butCadFreq, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(butCadCalendTrat, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(butMovTrat, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(butLimpezaTrat, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(butSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(butMovTrat1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jMenuCad.setText("Cadastro");

        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ifirst/cemec/resources/Funcionario.png"))); // NOI18N
        jMenuItem10.setText("Cadastro de Usuários");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenuCad.add(jMenuItem10);

        jMenuCadFrec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ifirst/cemec/resources/Aluno.png"))); // NOI18N
        jMenuCadFrec.setText("Frequentador");
        jMenuCadFrec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCadFrecActionPerformed(evt);
            }
        });
        jMenuCad.add(jMenuCadFrec);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ifirst/cemec/resources/calendario.png"))); // NOI18N
        jMenuItem2.setText("Calendario de Tratamento");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenuCad.add(jMenuItem2);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ifirst/cemec/resources/agenda.png"))); // NOI18N
        jMenuItem3.setText("Tratamentos");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenuCad.add(jMenuItem3);
        jMenuCad.add(jSeparator1);

        jMenuItem15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ifirst/cemec/resources/fazer2.png"))); // NOI18N
        jMenuItem15.setText("Inicializar Senha");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenuCad.add(jMenuItem15);

        jMenu.add(jMenuCad);

        jMenuMov.setText("Movimentações");

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ifirst/cemec/resources/agenda.png"))); // NOI18N
        jMenuItem4.setText("Tratamentos");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenuMov.add(jMenuItem4);

        jMenu.add(jMenuMov);

        jMenu1.setText("Relatorios");

        jMenu3.setText("Cadastros");

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ifirst/cemec/resources/Aluno.png"))); // NOI18N
        jMenuItem5.setText("Frequentadores");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ifirst/cemec/resources/agenda.png"))); // NOI18N
        jMenuItem6.setText("Tratamentos");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ifirst/cemec/resources/calendario.png"))); // NOI18N
        jMenuItem7.setText("Calendarios de Tratamentos");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        jMenu1.add(jMenu3);

        jMenuItem8.setText("Lista de Presença");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem8);

        jMenuItem9.setText("Tratamentos dos Frequentadores");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem9);

        jMenuItem11.setText("Recomendação do tratamento");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem11);

        jMenuItem12.setText("Frequentadores por Tratamento");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem12);

        jMenu.add(jMenu1);

        jMenuManu.setText("Manutenção");

        jMenuItem13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ifirst/cemec/resources/limpar.png"))); // NOI18N
        jMenuItem13.setText("Limpeza dos Tratamentos");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenuManu.add(jMenuItem13);

        jMenu.add(jMenuManu);

        jMenu2.setText("Sair");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ifirst/cemec/resources/sair.png"))); // NOI18N
        jMenuItem1.setText("Sair");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenu.add(jMenu2);

        setJMenuBar(jMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPAtalhos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mdiPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 757, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mdiPrincipal)
            .addComponent(jPAtalhos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuCadFrecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCadFrecActionPerformed
        TelaFrequentador cadFrequentador = new TelaFrequentador();
        cadFrequentador.setVisible(true);
    }//GEN-LAST:event_jMenuCadFrecActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        TelaCalendTrat calendTrat = new TelaCalendTrat(this, true);
        calendTrat.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        TeleCadTratamento cadTratamento = new TeleCadTratamento(this, true);
        cadTratamento.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        TelaMovTratamento movTratamento = new TelaMovTratamento(null);
        movTratamento.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        InicializarSenha inicializarSenha = new InicializarSenha(this, true);
        inicializarSenha.setVisible(true);
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void butCadFreqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butCadFreqActionPerformed
        TelaFrequentador cadFrequentador = new TelaFrequentador();
        cadFrequentador.setVisible(true);
    }//GEN-LAST:event_butCadFreqActionPerformed

    private void butCadCalendTratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butCadCalendTratActionPerformed
        TelaCalendTrat calendTrat = new TelaCalendTrat(this, true);
        calendTrat.setVisible(true);
    }//GEN-LAST:event_butCadCalendTratActionPerformed

    private void butSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butSenhaActionPerformed
        InicializarSenha inicializarSenha = new InicializarSenha(this, true);
        inicializarSenha.setVisible(true);
    }//GEN-LAST:event_butSenhaActionPerformed

    private void butLimpezaTratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butLimpezaTratActionPerformed
        if (UsuarioLogado.getUsuario().getCargo() > 1) {
            cdPer = 12; // permissao 12 = tela limpeza de tratamento
            Permissao p;
            p = PermissaoOperacao.ValidarPermi(UsuarioLogado.getUsuario().getCodigoUsu(), cdPer);
            if (p == null) {
                JOptionPane.showMessageDialog(null, "Permissão não definida para este usuario");
                return;
            } else if (p.isVisul() == false) {
                JOptionPane.showMessageDialog(null, "Usuario não tem permissão para visualizar esta tela");
                return;
            }
        }

        LimpezaTratamento lt = new LimpezaTratamento(this, true);
        lt.setVisible(true);
    }//GEN-LAST:event_butLimpezaTratActionPerformed

    private void butMovTratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butMovTratActionPerformed
        TelaPresenca tp = new TelaPresenca(this, true);
        tp.setVisible(true);
        //        TelaMovTratamento movTratamento = new TelaMovTratamento(null);
//        movTratamento.setVisible(true);
    }//GEN-LAST:event_butMovTratActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        ConsultaFrequentador cf = new ConsultaFrequentador(this, true);
        cf.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        ConsultaCalendarioTrat cct = new ConsultaCalendarioTrat(this, true);
        cct.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        CadastroUsuario cd = new CadastroUsuario(this, true);
        cd.setVisible(true);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        ConsultaTratamento cd = new ConsultaTratamento(this, true);
        cd.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        ConsultaListPres ls = new ConsultaListPres(this, true);
        ls.setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        ConsultaTratamentoFreq ct = new ConsultaTratamentoFreq(this, true);
        ct.setVisible(true);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        ConsultaRecTratamento rt = new ConsultaRecTratamento(this, true);
        rt.setVisible(true);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        if (UsuarioLogado.getUsuario().getCargo() > 1) {
            cdPer = 12; // permissao 12 = tela limpeza de tratamento
            Permissao p;
            p = PermissaoOperacao.ValidarPermi(UsuarioLogado.getUsuario().getCodigoUsu(), cdPer);
            if (p == null) {
                JOptionPane.showMessageDialog(null, "Permissão não definida para este usuario");
                return;
            } else if (p.isVisul() == false) {
                JOptionPane.showMessageDialog(null, "Usuario não tem permissão para visualizar esta tela");
                return;
            }
        }

        LimpezaTratamento lt = new LimpezaTratamento(this, true);
        lt.setVisible(true);
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        ConsultaTratFreq ct = new ConsultaTratFreq(this, true);
        ct.setVisible(true);
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void txtPesqFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesqFuncActionPerformed
        box = jComboBox1.getSelectedIndex();
        pesq = txtPesqFunc.getText();

        if (txtPesqFunc.getText().length() > 2) {
            carregaTable(box, pesq);
        }
    }//GEN-LAST:event_txtPesqFuncActionPerformed

    private void butPesqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butPesqActionPerformed
        box = jComboBox1.getSelectedIndex();
        pesq = txtPesqFunc.getText();

        if (txtPesqFunc.getText().length() > 2) {
            carregaTable(box, pesq);
        }
    }//GEN-LAST:event_butPesqActionPerformed

    private void jTableFreqMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableFreqMouseClicked
        boolean presenca = Boolean.parseBoolean(jTableFreq.getValueAt(jTableFreq.getSelectedRow(), 2).toString());
        if (presenca == true) {
            Tratamento t;
            t = salvar();
            gerarSenha(t);
        }
    }//GEN-LAST:event_jTableFreqMouseClicked

    private void jTableFreqKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableFreqKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_F9) {
            Tratamento t;
            t = salvar();
            gerarSenha(t);
        }
    }//GEN-LAST:event_jTableFreqKeyPressed

    private void butMovTrat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butMovTrat1ActionPerformed
        TelaMovTratamento movTratamento = new TelaMovTratamento(null);
        movTratamento.setVisible(true);
    }//GEN-LAST:event_butMovTrat1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butCadCalendTrat;
    private javax.swing.JButton butCadFreq;
    private javax.swing.JButton butLimpezaTrat;
    private javax.swing.JButton butMovTrat;
    private javax.swing.JButton butMovTrat1;
    private javax.swing.JButton butPesq;
    private javax.swing.JButton butSenha;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLblUsuarioLogado;
    private javax.swing.JMenuBar jMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenuCad;
    private javax.swing.JMenuItem jMenuCadFrec;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenu jMenuManu;
    private javax.swing.JMenu jMenuMov;
    private javax.swing.JPanel jPAtalhos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTable jTableFreq;
    private javax.swing.JDesktopPane mdiPrincipal;
    private javax.swing.JTextField txtPesqFunc;
    // End of variables declaration//GEN-END:variables

    @Override
    public void execComando(KeyEvent evt) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void initForm() {
        throw new UnsupportedOperationException("Not supported yet.");
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

    public Frequentador getFrequentador() {
        return frequentador;
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
}