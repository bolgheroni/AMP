/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.dados;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
;
import sistema.model.Logavel;

/**
 *
 * @author aluno
 */


public class VerificarDAO {

    public static boolean validarCadastro(Logavel login) {
        String tabela = login.toString();
        try {
            String sql = "SELECT userName FROM " + tabela + " WHERE ? = username";
            PreparedStatement ps = Conexao.abrir().prepareStatement(sql);
            ps.setString(1, login.getUserName());
            ResultSet rs = ps.executeQuery();
            return rs.next();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
}
