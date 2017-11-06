package br.ifirst.cemec.util;

import br.ifirst.cemec.entidades.ResultConsulta;
import br.ifirst.cemec.entidades.ResultadoConsulta;
import br.ifirst.cemec.entidades.ResultadoLinha;
import java.awt.event.KeyEvent;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Iagho
 */
public class FuncoesSystem {

    public static String fmtText(String v, String f) {
        String retorno = "";
        String texto = "";
        int i = 0;
        int j = 0;
        while ((texto = f.substring(i)).length() > 0 && j < v.length()) {
            if (!texto.substring(0, 1).equals("#")) {
                retorno += texto.substring(0, 1);
            } else {
                retorno += v.substring(j, j + 1);
                j++;
            }
            i++;
        }

        return retorno;
    }

    public FuncoesSystem() {
    }

    public static String cryptMD5(String texto) throws Exception {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(texto.getBytes());
            String senha = "";
            for (byte a : md.digest()) {
                if ((0xff & a) < 0x10) {
                    senha += "0" + Integer.toHexString(0xFF & a);
                } else {
                    senha += Integer.toHexString(0xFF & a);
                }
            }
            return senha;
        } catch (NoSuchAlgorithmException e) {
            throw e;
        }
    }

    public static Date getDateFromString(String data, String pattern) throws ParseException, Exception {
        Pattern p = Pattern.compile("^(([0-2]\\d|[3][0-1])[/|-|.]([0]\\d|[1][0-2])[/|-|.][2][0]\\d{2})$|^(([0-2]\\d|[3][0-1])[/|-|.]([0]\\d|[1][0-2])[/|-|.][2][0]\\d{2}\\s([0-1]\\d|[2][0-3])\\:[0-5]\\d\\:[0-5]\\d)$");
        Matcher m = p.matcher(data);
        if (!m.find()) {
            throw new Exception("Data informada não é válida");
        }
        return new SimpleDateFormat(pattern).parse(data);
    }

    public static boolean isKeyPressedEnterOrTab(KeyEvent event) {
        if (event.getKeyCode() == KeyEvent.VK_ENTER || event.getKeyCode() == KeyEvent.VK_TAB) {
            return true;
        }
        return false;
    }

    public static DefaultTableModel montarGrid(List<ResultConsulta> listConsulta) {
        DefaultTableModel modelo = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int rowIndex, int mColIndex) {
                return false;
            }
        };
        ResultConsulta resultConsulta = new ResultConsulta();
        boolean cabecalho = true;

        Iterator<ResultConsulta> it = null;
        it = listConsulta.iterator();

        while (it.hasNext()) {
            resultConsulta = it.next();
            if (cabecalho) {
                if (resultConsulta.getQtCampos() == 2) {
                    modelo.addColumn(resultConsulta.getCampo1());
                    modelo.addColumn(resultConsulta.getCampo2());
                    cabecalho = false;
                } else if (resultConsulta.getQtCampos() == 3) {
                    modelo.addColumn(resultConsulta.getCampo1());
                    modelo.addColumn(resultConsulta.getCampo2());
                    modelo.addColumn(resultConsulta.getCampo3());
                    cabecalho = false;
                } else if (resultConsulta.getQtCampos() == 4) {
                    modelo.addColumn(resultConsulta.getCampo1());
                    modelo.addColumn(resultConsulta.getCampo2());
                    modelo.addColumn(resultConsulta.getCampo3());
                    modelo.addColumn(resultConsulta.getCampo4());
                    cabecalho = false;
                } else if (resultConsulta.getQtCampos() == 5) {
                    modelo.addColumn(resultConsulta.getCampo1());
                    modelo.addColumn(resultConsulta.getCampo2());
                    modelo.addColumn(resultConsulta.getCampo3());
                    modelo.addColumn(resultConsulta.getCampo4());
                    modelo.addColumn(resultConsulta.getCampo5());
                    cabecalho = false;
                } else if (resultConsulta.getQtCampos() == 6) {
                    modelo.addColumn(resultConsulta.getCampo1());
                    modelo.addColumn(resultConsulta.getCampo2());
                    modelo.addColumn(resultConsulta.getCampo3());
                    modelo.addColumn(resultConsulta.getCampo4());
                    modelo.addColumn(resultConsulta.getCampo5());
                    modelo.addColumn(resultConsulta.getCampo6());
                    cabecalho = false;
                } else if (resultConsulta.getQtCampos() == 7) {
                    modelo.addColumn(resultConsulta.getCampo1());
                    modelo.addColumn(resultConsulta.getCampo2());
                    modelo.addColumn(resultConsulta.getCampo3());
                    modelo.addColumn(resultConsulta.getCampo4());
                    modelo.addColumn(resultConsulta.getCampo5());
                    modelo.addColumn(resultConsulta.getCampo6());
                    modelo.addColumn(resultConsulta.getCampo7());
                    cabecalho = false;
                }

            } else {
                if (resultConsulta.getQtCampos() == 2) {
                    modelo.addRow(new Object[]{resultConsulta.getCampo1(), resultConsulta.getCampo2()});
                } else if (resultConsulta.getQtCampos() == 3) {
                    modelo.addRow(new Object[]{resultConsulta.getCampo1(), resultConsulta.getCampo2(), resultConsulta.getCampo3()});
                } else if (resultConsulta.getQtCampos() == 4) {
                    modelo.addRow(new Object[]{resultConsulta.getCampo1(), resultConsulta.getCampo2(), resultConsulta.getCampo3(), resultConsulta.getCampo4()});
                } else if (resultConsulta.getQtCampos() == 5) {
                    modelo.addRow(new Object[]{resultConsulta.getCampo1(), resultConsulta.getCampo2(), resultConsulta.getCampo3(), resultConsulta.getCampo4(), resultConsulta.getCampo5()});
                } else if (resultConsulta.getQtCampos() == 6) {
                    modelo.addRow(new Object[]{resultConsulta.getCampo1(), resultConsulta.getCampo2(), resultConsulta.getCampo3(), resultConsulta.getCampo4(), resultConsulta.getCampo5(), resultConsulta.getCampo6()});
                } else if (resultConsulta.getQtCampos() == 7) {
                    modelo.addRow(new Object[]{resultConsulta.getCampo1(), resultConsulta.getCampo2(), resultConsulta.getCampo3(), resultConsulta.getCampo4(), resultConsulta.getCampo5(), resultConsulta.getCampo6(), resultConsulta.getCampo7()});
                }
            }
        }

        return modelo;
    }

    public static DefaultTableModel montarGridForStringArray(ResultadoConsulta dataArray) {

        DefaultTableModel modelo = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int rowIndex, int mColIndex) {
                return false;
            }
        };

        ResultadoLinha cabecalho = dataArray.getCabecalho();
        List<ResultadoLinha> dados = dataArray.getDados();

        for (int i = 0; i < cabecalho.size(); i++) {
            modelo.addColumn(cabecalho.get(i));
        }

        for (int i = 0; i < dados.size(); i++) {
            modelo.addRow(dados.get(i).getData().toArray());
        }

        return modelo;
    }

    public String criptografar(String texto) {

        String alfabeto = " <abcdefghijklmnopqrstuvwxyzçéáíúóãõABCDEFGHIJKLMNOPQRSTUVWXYZÇÁÉÓÍÚÃÕ1234567890.;:?,º]}§[{ª!@#$%&*()_+-=\\/|\'\">";

        char[] t = texto.toCharArray();

        String palavra = "";

        for (int i = 0; i < t.length; i++) {

            int posicao = alfabeto.indexOf(t[i]) + 5;

            if (alfabeto.length() <= posicao) {

                posicao = posicao - alfabeto.length();

            }//Criando um método de Criptografia  

            palavra = palavra + alfabeto.charAt(posicao);

        }

        return palavra;

    }
}