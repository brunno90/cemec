package br.ifirst.cemec.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Iagho
 */
public class Utils {

    public static DecimalFormat formatoNR = new DecimalFormat("#,##0.00");
    public static DateFormat formatoData = DateFormat.getDateInstance(DateFormat.LONG, Locale.UK);
    public static SimpleDateFormat formatoDataSimples = new SimpleDateFormat("dd/MM/yyyy");
    public static SimpleDateFormat formatoDataDDmm = new SimpleDateFormat("dd/MM");
    public static DecimalFormat formatoNR4 = new DecimalFormat("#,##0.0000");
    private static MaskFormatter fmtCpf;
    private static MaskFormatter fmtData;
    private static MaskFormatter fmtCep;
    private static MaskFormatter fmtTelefone;
    private static MaskFormatter fmtCnpj;
    private static MaskFormatter fmtPlacaVeiculo;
    private static MaskFormatter fmtChaveSerial;

    public static String fmtValor(String valor) {

        valor = valor.replace(".", "");
        valor = valor.replaceAll(",", ".");

        return valor;
    }

    public static String tamString(String texto, int tamanho) {
        String aux = "                                                 ";
        String result;

        result = texto + aux.substring(1, tamanho - texto.length());

        return result;
    }

    public static String tamStringD(String texto, int tamanho) {
        String aux = "                                                 ";
        String result;

        result = aux.substring(1, tamanho - texto.length()) + texto;

        return result;
    }

    public static String preencheCom(String linha_a_preencher, String letra, int tamanho, int direcao) {

        //Checa se Linha a preencher é nula ou branco
        if (linha_a_preencher.trim() == null ? "" == null : linha_a_preencher.trim().equals("")) {
            linha_a_preencher = "";
        }

        //Enquanto Linha a preencher possuir 2 espaços em branco seguidos, substitui por 1 espaço apenas
        while (linha_a_preencher.contains(" ")) {
            linha_a_preencher = linha_a_preencher.replaceAll(" ", " ").trim();
        }

        //Retira caracteres estranhos
        linha_a_preencher = linha_a_preencher.replaceAll("[./-]", "");
        StringBuilder sb = new StringBuilder(linha_a_preencher);

        if (direcao == 1) { //a Esquerda
            for (int i = sb.length(); i < tamanho; i++) {
                sb.insert(0, letra);
            }
        } else if (direcao == 2) {//a Direita
            for (int i = sb.length(); i < tamanho; i++) {
                sb.append(letra);
            }
        }
        return sb.toString();
    }

    /**
     * Converte uma string para o formato CamelCase
     *
     * @param str
     * @param sp
     * @return
     */
    public static String getCamelCase(String str, String sp) {
        String[] words = str.toLowerCase().split(sp);
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            char[] chs = word.toCharArray();
            chs[0] = (char) (chs[0] - 32);
            String newWord = new String(chs);
            sb.append(newWord);
        }
        char[] chs = sb.toString().toCharArray();
        chs[0] = (char) (chs[0] + 32);
        return new String(chs);
    }

    public static Method getSetMetodo(String nomeParametro, Class clazz, Class type) throws Exception {
        String fChar = String.valueOf(nomeParametro.charAt(0));
        String sChar = fChar.toUpperCase();
        nomeParametro = nomeParametro.replaceFirst(fChar, sChar);
        return clazz.getMethod("set".concat(nomeParametro), type);
    }

    public static Method getGetMetodo(String nomeParametro, Class clazz) throws Exception {
        String fChar = String.valueOf(nomeParametro.charAt(0));
        String sChar = fChar.toUpperCase();
        nomeParametro = nomeParametro.replaceFirst(fChar, sChar);
        return clazz.getMethod("get".concat(nomeParametro));
    }

    public static Object cast(Class clazz, String value) {
        if (clazz == Integer.class) {
            return Integer.valueOf(value);
        } else if (clazz == int.class) {
            return Integer.valueOf(value);
        } else if (clazz == String.class) {
            return value;
        } else if (clazz == Boolean.class) {
            return (Integer.valueOf(value) != 0);
        } else if (clazz == boolean.class) {
            return (Integer.valueOf(value) != 0);
        } else if (clazz == double.class) {
            if (value.indexOf(",") > 0) {
                value = value.replaceAll("[.]", "").replaceAll(",", ".");
            }
            return Double.parseDouble(value);
        } else if (clazz == Double.class) {
            if (value.indexOf(",") > 0) {
                value = value.replaceAll("[.]", "").replaceAll(",", ".");
            }
            return Double.parseDouble(value);
        } else if (clazz == long.class) {
            return Long.valueOf(value);
        } else if (clazz == Long.class) {
            return Long.valueOf(value);
        }
        return value;
    }

    public static double round(double d, int decimalPlace) {
        // see the Javadoc about why we use a String in the constructor
        // http://java.sun.com/j2se/1.5.0/docs/api/java/math/BigDecimal.html#BigDecimal(double)
        BigDecimal bd = new BigDecimal(Double.toString(d));
        bd = bd.setScale(decimalPlace, BigDecimal.ROUND_HALF_UP);
        return bd.doubleValue();
    }

    public static int ran() {
        Random aRandom = new Random();
        return aRandom.nextInt(8);
    }

    /**
     *
     * @param i interacao
     * @param n numero a ser formatado
     * @return string formatada
     */
    public static String padLeftDouble(int i, double n) {
        return String.format("%0" + i + ".0f", n);
    }

    /**
     *
     * @param i interacao
     * @param n numero a ser formatado
     * @return string formatada
     */
    public static String padLeft(int i, int n) {
        return String.format("%0" + i + "d", n);
    }

    /**
     * calcula modulo de 10.
     *
     * @return String
     */
    public static int modulo10(String numero) {

        int multi, posicao1, posicao2, acumula, resultado, dac;
        dac = 0;
        posicao1 = numero.length() - 1;
        multi = 2;
        acumula = 0;

        while (posicao1 >= 0) {
            resultado = Integer.parseInt(numero.substring(posicao1, posicao1 + 1)) * multi;
            posicao2 = Integer.toString(resultado).length() - 1;
            while (posicao2 >= 0) {
                acumula += Integer.parseInt(Integer.toString(resultado).substring(posicao2, posicao2 + 1));
                posicao2--;
            }
            if (multi == 2) {
                multi = 1;
            } else {
                multi = 2;
            }
            posicao1--;
        }
        dac = acumula % 10;
        dac = 10 - dac;
        if (dac == 10) {
            dac = 0;
        }
        return dac;
    }

    /**
     * calcula modulo de 11.
     *
     * @return int
     */
    public static int modulo11(String numero) {
        int peso, total, contador, modulo, digito;
        digito = 0;
        peso = 2;
        total = 0;
        contador = numero.length() - 1;

        while (contador >= 0) {
            total += Integer.parseInt(numero.substring(contador, 1)) * peso;
            contador--;
            peso++;
        }
        if (total >= 11) {
            modulo = total % 11;
            if (modulo > 1) {
                digito = 11 - modulo;
            } else {
                if (modulo == 1) {
                    digito = 0;
                } else {
                    if (modulo == 0) {
                        digito = 1;
                    }
                }
            }
        } else {
            digito = 11 - total;
        }
        return digito;
    }

    public static String arrayToString(String[] a, String separator) {
        StringBuilder result = new StringBuilder();
        if (a.length > 0) {
            result.append(a[0]);
            for (int i = 1; i < a.length; i++) {
                result.append(separator);
                result.append(a[i]);
            }
        }
        return result.toString();
    }

    public static String arrayToString(int[] a, String separator) {
        StringBuilder result = new StringBuilder();
        if (a.length > 0) {
            result.append(a[0]);
            for (int i = 1; i < a.length; i++) {
                result.append(separator);
                result.append(a[i]);
            }
        }
        return result.toString();
    }

    /**
     * captura propriedades
     *
     * @param prop Nome do arquivo de propriedade
     * @return
     */
    public static Properties getProperties(String prop) {
        // o arquivo encontra-se no mesmo diretório //da aplicação
        File file = null;
        Properties props = new Properties();
        FileInputStream fis = null;
        try {
            file = Utils.getConfigFile(prop);
            fis = new FileInputStream(file);
            //lê os dados que estão no arquivo
            props.load(fis);
            fis.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return props;
    }

    public static File getConfigFile(String properties) throws Exception {
        String directoryAddress = System.getProperty("user.home");
        if (!directoryAddress.endsWith(File.separator)) {
            directoryAddress = directoryAddress.concat(File.separator);
        }
        directoryAddress = directoryAddress.concat("itecgyn");
        File directoryFile = new File(directoryAddress);
        if (!directoryFile.exists()) {
            directoryFile.mkdir();
        }
        File file = new File(directoryAddress.concat(File.separator).concat(properties + ".properties"));
        if (!file.exists()) {
            file.createNewFile();
        }
        return file;
    }

    /**
     * Grava propriedades
     *
     * @param prop Nome do arquivo de propriedade
     * @param p Objeto Properties
     * @param titulo Titulo acima no arquivo propriedades
     */
    public static void setProperties(String prop, Properties p, String titulo) {
        //o arquivo encontra-se no mesmo diretório da aplicação
        File file = null;
        FileOutputStream fos = null;


        try {
            file = Utils.getConfigFile(prop);
            fos = new FileOutputStream(file);
            //grava os dados  no arquivo
            p.store(fos, titulo);
            fos.close();


        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static DefaultTableModel clearTable(JTable table) {
        DefaultTableModel modelo = (DefaultTableModel) table.getModel();
        if (modelo.getDataVector() != null) {
            modelo.getDataVector().removeAllElements();
            table.revalidate();
        }

        return modelo;
    }

    public static boolean parsedToIntegerOrDoubleOrLong(String value, Class type) {
        try {
            if (type.equals(Integer.class)) {
                int x = Integer.parseInt(value);
            } else {
                if (type.equals(Double.class)) {
                    double x = Double.parseDouble(value);
                } else {
                    if (type.equals(Long.class)) {
                        long x = Long.parseLong(value);
                    }
                }
            }

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    // new javax.swing.DefaultComboBoxModel(AutoProgram.Utils.getListaEstados())
    public static String[] getListaEstados() {

        String[] estados = {"AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES",
            "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ",
            "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO"};

        return estados;

    }

    public static MaskFormatter mascaraCnpj() {
        try {
            fmtCnpj = new MaskFormatter("##.###.###/####-##");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return fmtCnpj;
    }

    public static MaskFormatter mascaraData() {
        try {
            fmtData = new MaskFormatter("##/##/####");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return fmtData;
    }

    public static MaskFormatter mascaraCep() {
        try {
            fmtCep = new MaskFormatter("##.###-###");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return fmtCep;
    }

    public static MaskFormatter mascaraTelefone() {
        try {
            fmtTelefone = new MaskFormatter("(##) ####-####");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return fmtTelefone;
    }

    public static MaskFormatter MTelefone() {
        try {
            fmtTelefone = new MaskFormatter("#####-####");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return fmtTelefone;
    }
  public static MaskFormatter MCelular() {
        try {
            fmtTelefone = new MaskFormatter("#####-####");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return fmtTelefone;
    }

    public static MaskFormatter mascaraPlacaVeiculo() {
        try {
            fmtPlacaVeiculo = new MaskFormatter("UUU-####");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return fmtPlacaVeiculo;
    }

    public static MaskFormatter mascaraChaveSerial() {
        try {
            fmtChaveSerial = new MaskFormatter("########-########-########-########");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return fmtChaveSerial;
    }

    public static Date dataUtil(Date data) {
        Calendar calendar = Calendar.getInstance();
        Date dataUtil = new Date();
        int diaDaSemana;

        calendar.setTime(data);
        int ano = calendar.get(Calendar.YEAR);
        int mes = calendar.get(Calendar.MONTH);
        int dia = calendar.get(Calendar.DAY_OF_MONTH);

        diaDaSemana = calendar.get(Calendar.DAY_OF_WEEK);

        if (diaDaSemana != 1 && diaDaSemana != 7) {
            return data;
        } else {

            if (diaDaSemana == 1) {
                calendar.set(ano, mes, dia + 1);
            } else if (diaDaSemana == 7) {
                calendar.set(ano, mes, dia + 2);
            }
            dataUtil = (calendar.getTime());
        }

        return dataUtil;
    }

    public static String[] getTipoTelefone() {
        String[] tipoTelefone = {"Residencial", "Celular", "Comercial", "Fax", "Recado"};
        return tipoTelefone;
    }

    public static String getIp() {

        Enumeration nis = null;
        try {
            nis = NetworkInterface.getNetworkInterfaces();
        } catch (SocketException e) {
            return e.getMessage();
        }

        while (nis.hasMoreElements()) {
            NetworkInterface ni = (NetworkInterface) nis.nextElement();
            Enumeration ias = ni.getInetAddresses();
            if (ni.getName().indexOf("eth") > -1 || ni.getName().indexOf("net") > -1) {

                while (ias.hasMoreElements()) {
                    InetAddress ia = (InetAddress) ias.nextElement();
                    if (ia.getHostAddress().indexOf(":") < 0) {
                        return ia.getHostAddress();
                    }
                }
            }
        }
        return "Sistema fora da rede";
    }
    private static String encryptionKey = "chave-secreta121";
    private static Cipher cipher;
    private static SecretKeySpec key;

//    public static String encrypt(String plainText) throws Exception {
//        cipher = Cipher.getInstance("AES/CBC/PKCS5Padding", "SunJCE");
//        key = new SecretKeySpec(encryptionKey.getBytes("UTF-8"), "AES");
//        cipher.init(Cipher.ENCRYPT_MODE, key, new IvParameterSpec(new byte[cipher.getBlockSize()]));
//        BASE64Encoder b64e = new BASE64Encoder();
//        return b64e.encode(cipher.doFinal(plainText.getBytes("UTF-8")));
//    }
//
//    public static String decrypt(String cipherText) throws Exception {
//        BASE64Decoder b64d = new BASE64Decoder();
//        byte[] descodificado = b64d.decodeBuffer(cipherText);
//        cipher = Cipher.getInstance("AES/CBC/PKCS5Padding", "SunJCE");
//        key = new SecretKeySpec(encryptionKey.getBytes("UTF-8"), "AES");
//        cipher.init(Cipher.DECRYPT_MODE, key, new IvParameterSpec(new byte[cipher.getBlockSize()]));
//        return new String(cipher.doFinal(descodificado), "UTF-8");
//    }
}
