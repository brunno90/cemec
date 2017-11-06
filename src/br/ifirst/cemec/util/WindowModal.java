package br.ifirst.cemec.util;

import java.awt.Component;
import java.awt.Container;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Iagho
 */
public class WindowModal extends javax.swing.JDialog implements KeyListener, FocusListener {

    public WindowModal() {
    }

    protected MaskFormatter createFormatter(String s) {
        MaskFormatter formatter = null;
        try {
            formatter = new MaskFormatter(s);
        } catch (java.text.ParseException exc) {
            System.err.println("formatter is bad: " + exc.getMessage());
            System.exit(-1);
        }
        return formatter;
    }

    public void ativarEnter() {
        addListenersKeyEnter(this);
    }

    public void ativarSelecaoValor() {
        addFocusListenerSelecao(this);
    }

    public void addFocusListenerSelecao(Container c) {
        Component cAtual = null;

        for (int i = 0; i < c.getComponents().length; i++) {
            cAtual = c.getComponents()[i]; // pegando o componente
            if (cAtual instanceof JTextField) {
                cAtual.addFocusListener(this); // adicionando o listener
            }
            if (cAtual instanceof Container) // se tiver subcomponentes
            {
                addFocusListenerSelecao((Container) cAtual);
            }
        }
    }

    private void addListenersKeyEnter(Container c) {
        Component cAtual = null;

        for (int i = 0; i < c.getComponents().length; i++) {
            cAtual = c.getComponents()[i]; // pegando o componente
            cAtual.addKeyListener(this); // adicionando o listener

            if (cAtual instanceof Container) // se tiver subcomponentes
            {
                addListenersKeyEnter((Container) cAtual);
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
//	if (e.getKeyCode() == e.VK_ENTER){
//	    Component c = this.getFocusOwner();
//	    c.transferFocus();
//	}
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    public void limparCampos() {
        limparCampos((Container) this);
    }

    private void limparCampos(Container cont) {

        for (int i = 0; i < cont.getComponentCount(); i++) {
            if (cont.getComponent(i) instanceof javax.swing.JTextField) {
                ((javax.swing.JTextField) cont.getComponent(i)).setText("");
            }
            if (cont.getComponent(i) instanceof javax.swing.JTextArea) {
                ((javax.swing.JTextArea) cont.getComponent(i)).setText("");
            }
            if (cont.getComponent(i) instanceof javax.swing.JTable) {
                ((DefaultTableModel) ((javax.swing.JTable) cont.getComponent(i)).getModel()).setRowCount(0);
            }

            // pegando os sub-controles
            if (cont.getComponent(i) instanceof Container) {
                limparCampos((Container) cont.getComponent(i));
            }

        }
    }

    @Override
    public void focusLost(FocusEvent evt) {
    }

    @Override
    public void focusGained(FocusEvent evt) {
        if (evt.getSource() instanceof JTextField) {
            ((JTextField) evt.getSource()).selectAll();
        }
    }
}
