/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import sistema.dados.VerificarDAO;
import sistema.model.Grupo;
import sistema.model.Organizador;

/**
 *
 * @author raiote
 */
public class Start {
    public static void main(String[] args) {
        VerificarDAO.validarUsername(new Grupo());
//        //objeto da tela de login
//        TelaLogin telaLogin = new TelaLogin();
//        
//        //retorno da tela de login, onde o elemento 1 do vetor equivale ao id entrado
//        //pelo usuario e o elemento 2 equivale a senha
//        String[] login;
//        
//        //retorno do metodo que valida o login digitado pelo usuario
//        int validadeLogin;
//
//        do {
//            //coleta o login do usuario
//            login = telaLogin.coletarLogin();
//            //valida o login
//            validadeLogin = Validar.validarLogin(login);
//
//            switch (validadeLogin) {
//                //caso o login seja invalido, exibe uma mensagem informando o erro e reinicia o metodo
//                case 0:
//                    break;
//                    
//                //caso a validade seja 1, significa que o login eh valido e eh de um grupo 
//                case 1:
//                    //chama o metodo de controle/processos de um grupo, passando o id digitado pelo usuario
//                    ControleGrupo.controle(login[0]);
//                    break;
//                    
//                //caso a validade seja 2, significa que o login eh valido e eh de um organizador 
//                case 2:
//                    //chama o metodo de controle/processos de um organizador, passando o id digitado pelo usuario
//                    ControleOrganizador.controle(login[0]);
//                    break;
//                    
//                //caso a validade seja 3, significa que o login eh valido e eh de um comissario
//                case 3:
//                    //chama o metodo de controle/processos de um comissario, passando o id digitado pelo usuario
//                    ControleComissao.controle(login[0]);
//                    break;
//                
//                //caso a validade seja 4, significa que o login eh valido e eh de um tutor 
//                case 4:
//                    //chama o metodo de controle/processos de um tutor, passando o id digitado pelo usuario
//                    ControleTutor.controle(login[0]);
//                    break;
//            }
//        //caso a validade seja -1, significa q o usuario desejou finalizar o programa
//        }while(validadeLogin !=-1);
        
        
    
    }
}
