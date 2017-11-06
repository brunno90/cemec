package br.ifirst.cemec.util;

import br.ifirst.cemec.entidades.ConfigBanco;
import br.ifirst.cemec.exceptions.ArquivoConfigException;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Iagho
 */
public class ArquivoInicializacao {

    private static File getConfigFile() throws Exception {
        String directoryAddress = System.getProperty("user.home");
        if (!directoryAddress.endsWith(File.separator)) {
            directoryAddress = directoryAddress.concat(File.separator);
        }
        directoryAddress = directoryAddress.concat("Cemec");
        File directoryFile = new File(directoryAddress);
        if (!directoryFile.exists()) {
            directoryFile.mkdir();
        }
        File file = new File(directoryAddress.concat(File.separator).concat("config.xml"));
        if (!file.exists()) {
            file.createNewFile();
        }
        return file;
    }

    public static void gravarArquivoConfiguracao(ConfigBanco arquivoConfiguracao) throws Exception {
        FileOutputStream fileOutputStream = new FileOutputStream(getConfigFile());
        XStream xStream = new XStream(new DomDriver());
        xStream.toXML(arquivoConfiguracao, fileOutputStream);
        fileOutputStream.close();
    }

    public static ConfigBanco lerArquivoConfiguracao() throws ArquivoConfigException {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(getConfigFile());
            XStream xStream = new XStream(new DomDriver());
            ConfigBanco arquivoConfiguracao = (ConfigBanco) xStream.fromXML(fileInputStream);
            fileInputStream.close();
            return arquivoConfiguracao;
        } catch (Exception ex) {
            throw new ArquivoConfigException("Não foi possível ler o arquivo");
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException ex) {
            }
        }

    }
}