/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sistema.servicos;

import sistema.apresentacao.Tela;
import sistema.dados.Arquivo;
import sistema.model.Maratona;
import sistema.model.Organizador;
import java.util.ArrayList;

/**
 *
 * @author Roberto Bolgheroni
 */
public class OrganizadorServico implements LoginInterface {

    private Arquivo arquivo;
    private Tela tela;
    private Validar validar;
   
    public OrganizadorServico(Arquivo arquivo, Validar validar, Tela tela){
        this.arquivo = arquivo;
        this.validar = validar;
        this.tela = tela;
    }
    
    public void cadastrar(Organizador organizador, Maratona maratona){
        if(validar.validarCadastro(organizador)){
            arquivo.gravar(organizador);
        }else{
            tela.exibirErroCadastro(organizador);
        }
    }
    
    @Override
    public void logar(String id, String senha, Maratona maratona) {
        
    }
}
