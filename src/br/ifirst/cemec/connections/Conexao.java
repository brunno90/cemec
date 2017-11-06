package br.ifirst.cemec.connections;

import br.ifirst.cemec.entidades.ConfigBanco;
import br.ifirst.cemec.exceptions.ArquivoConfigException;
import br.ifirst.cemec.util.ArquivoInicializacao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Iagho
 */
public class Conexao {

    public static Connection c = null;

    public static Connection getConnection() throws SQLException, ArquivoConfigException {


        if (c == null) {
            String url = "jdbc:postgresql://%s:%s/%s";
            ConfigBanco cb = ArquivoInicializacao.lerArquivoConfiguracao();

            validaConfig(cb);

            try {
                Class.forName("org.postgresql.Driver");

                url = String.format(url, cb.getServidor(), cb.getPorta(), cb.getBanco());
                c = DriverManager.getConnection(url, cb.getUsuario(), cb.getSenha());
                c.setAutoCommit(false);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return c;
    }

    public static void setCommitTran() throws SQLException {
        c.commit();
    }

    public static void setRollbackTran() {
        try {

            c.rollback();
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static void validaConfig(ConfigBanco cb) throws ArquivoConfigException {
        if (cb.getBanco() == null || cb.getBanco().equals("")) {
            throw new ArquivoConfigException("Banco não informado nas configurações");
        }
    }
}