/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.servicos;

import java.util.ArrayList;
import sistema.model.Exercicio;
import sistema.model.Prova;
import sistema.dados.ProvaDAO;

/**
 *
 * @author raiote
 */
public class ProvaServico {
    ProvaDAO provaDAO;
    
    public ProvaServico(){
        provaDAO = new ProvaDAO();
    }
    
    public void cadastrarProva(Prova prova){
        if(provaDAO.pesquisarPorCodigo(prova.getCodigoProva())==null){
            provaDAO.gravarProva(prova);
        }
    }
    
    public Prova pesquisarPorCodigo(String codigoProva){
        return provaDAO.pesquisarPorCodigo(codigoProva);
    }
    
    public ArrayList<Exercicio> listarExercicios(Prova prova){
        return provaDAO.getExercicios(prova);
    }
    
}
