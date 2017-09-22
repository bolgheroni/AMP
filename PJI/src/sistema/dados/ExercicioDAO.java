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
import sistema.model.Exercicio;

/**
 *
 * @author raiote
 */
public class ExercicioDAO {

    Connection conexao;

    public void gravarExercicio(Exercicio exercicio) {
        try {
            conexao = Conexao.abrir();
            String sql = "INSERT INTO Exercicio(Descricao_Exercicio, Codigo_Prova)VALUES(?,?)";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, exercicio.getDescricao());
            ps.setString(2, exercicio.getProva().getCodigoProva());
            ps.executeQuery();
        
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public Exercicio pesquisarPorCodigo(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void atualizarExercicio(Exercicio exercicio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void remover(Exercicio exercicio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
