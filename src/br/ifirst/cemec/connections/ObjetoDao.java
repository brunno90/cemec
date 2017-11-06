package br.ifirst.cemec.connections;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

/**
 *
 * @author iagho
 */
public class ObjetoDao {

    protected Connection conexao;

    public ObjetoDao(Connection conexao) {
        this.conexao = conexao;
    }

    protected void fecharCursores(ResultSet resultSet, PreparedStatement pstmt) {
        try {
            if (resultSet != null) {
                resultSet.close();
            }
            if (pstmt != null) {
                pstmt.close();
            }

        } catch (SQLException ex) {
        }
    }

    protected java.sql.Date toSqlDate(Date data) {
        if (data == null) {
            return null;
        }
        return new java.sql.Date(data.getTime());
    }
}