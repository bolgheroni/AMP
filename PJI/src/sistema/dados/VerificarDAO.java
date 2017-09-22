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
        try {
            String sql = "SELECT username FROM ? WHERE ? = username";
            PreparedStatement ps = Conexao.abrir().prepareStatement(sql);
            ps.setString(1, login.toString());
            ps.setString(2, login.getUserName());
            ResultSet rs = ps.executeQuery();
            return rs.next();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public static boolean validarPassword(Logavel login) {
        try {
            String sql = "SELECT username FROM ? WHERE ? = username AND ? = password";
            PreparedStatement ps = Conexao.abrir().prepareStatement(sql);
            ps.setString(1, login.toString());
            ps.setString(2, login.getUserName());
            ps.setString(3, login.getSenha());
            ResultSet rs = ps.executeQuery();
            return rs.next();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        
    }

    public static String validarTipo(String tipo) {
        return new String();
    }

}
