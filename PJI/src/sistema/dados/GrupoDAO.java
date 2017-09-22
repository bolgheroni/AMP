/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.dados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import sistema.model.Grupo;

/**
 *
 * @author aluno
 */
public class GrupoDAO {
    
    Connection conexao;
    
    public void cadastrarGrupo(Grupo grupo) {
        if (!VerificarDAO.validarCadastro(grupo)) {
            try {
                conexao = Conexao.abrir();
                String sql = "INSERT INTO Grupo"; //TODO: Adicionar statement
                PreparedStatement ps = conexao.prepareStatement(sql);
                ps.executeUpdate();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        }
    }
    
    public boolean logarGrupo(Grupo grupo){
        return VerificarDAO.validarPassword(grupo);
    }
    

}
