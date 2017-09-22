/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.dados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import sistema.model.Grupo;

/**
 *
 * @author aluno
 */
public class GrupoDAO {
    
    private static Connection conexao;
    
    public static void cadastrarGrupo(Grupo grupo) {
        if (!VerificarDAO.validarCadastro(grupo)) {
            try {
                conexao = Conexao.abrir();
                String sql = ""; //TODO: Adicionar statement PEPE
                PreparedStatement ps = conexao.prepareStatement(sql);
                ps.executeUpdate();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        }     
    }
    
    public static boolean logar(Grupo login){
        String tabela = login.toString();
        try {
            String sql = "SELECT userName, senha FROM " + tabela + " WHERE ? = username AND senha = ?";
            PreparedStatement ps = Conexao.abrir().prepareStatement(sql);
            ps.setString(1, login.getUserName());
            ps.setString(2, login.getSenha());
            ResultSet rs = ps.executeQuery();
            return rs.next();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

}
