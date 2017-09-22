/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sistema.servicos;

import sistema.model.Grupo;
import sistema.model.Maratona;
import sistema.model.Resolucao;
import sistema.model.Tutor;
import java.util.ArrayList;

/**
 *
 * @author Roberto Bolgheroni
 */
public class TutorServico implements LoginInterface {
    public void cadastrar(Tutor tutor, Maratona maratona){
        
    }
    public void lerMensagemDeGrupo(Tutor tutor, Grupo grupo, Maratona maratona){
        //Ler uma string e chamar um metodo da tela pra exibir
    }
    
    // metodo que, tendo obtido a mensagem do usuario, a envia para o tutor
    public void enviarMensagemAGrupo(Tutor tutor, String mensagem, Grupo grupo, Maratona maratona){
        
    }
    
    //metodo que, tendo coletado a avaliacao de um tutor sobre a resolucao de um grupo, cadastra toma as 
    //providencias corretas
    public void avaliarResolucaoGrupo(Grupo grupo, Tutor tutor, Resolucao resolucao, boolean isValida){
        //se isValida == true, envia uma mensagem ao grupo falando que a resolucao foi enviada a comissao, e entao a envia a comissao
        
        //se isValida != true, envia uma mensagem ao grupo falando que a resolucao nao foi enviada a comissao, e nao a envia
    }
    
    public void listarGruposResolucoesPendentes(Tutor tutor){
        //Ler uma String, correspondente a lista de grupos que enviaram resolucoes ao tutor e aguardam avaliacao, e chamar um metodo da tela para
        //exibir esta tal lista
    }
    
    public void resolucoesPendentes(Grupo grupo, Tutor tutor){
        //Ler uma ArrayList<Resolucao>, que corresponde as resolucoes de um grupo pendentes a um tutor avaliar, e chamar um metodo da tela pra a exibir
    }

       @Override
    public void logar(String id, String senha, Maratona maratona) {
    }
}
