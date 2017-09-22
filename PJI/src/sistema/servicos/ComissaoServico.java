/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sistema.servicos;

import sistema.apresentacao.Tela;
import sistema.dados.Arquivo;
import sistema.model.Comissao;
import sistema.model.Maratona;
import sistema.model.Resolucao;
import java.util.ArrayList;
import sistema.dados.ComissaoDAO;
import sistema.dados.VerificarDAO;

/**
 *
 * @author Roberto Bolgheroni
 */ 
public class ComissaoServico{
    
    private ComissaoDAO comissaoDAO;
    
    
    public void cadastrar(Comissao comissao){
        if(!VerificarDAO.validarCadastro(comissao)){
            comissaoDAO.gravarComissao(comissao);
        }
    }
    
    public void listarResolucoesPendentes(Comissao comissao){
        // Ler uma string e chamar um metodo da tela pra exibir
        
    }

}