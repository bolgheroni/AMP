/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sistema.dados;

import sistema.model.Comissao;
import sistema.model.Exercicio;
import sistema.model.Grupo;
import sistema.model.Maratona;
import sistema.model.Organizador;
import sistema.model.Resolucao;
import sistema.model.Tutor;

/**
 *
 * @author Roberto Bolgheroni
 */
public class Arquivo {

    //metodos de cadastro e insercao de registros
    
    public void gravar(Maratona maratona/*, Maratona maratona*/) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void gravar(Comissao comissao/*, Maratona maratona*/) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void gravar(Tutor tutor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void gravar(Grupo grupo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void gravar(Exercicio exercicio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void gravar(Resolucao resolucao) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void gravar(Organizador organizador) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    /**
     * Metodo que grava um registro na tabela de avaliacao, que relaciona comissao e resolucao com um atributo valor,
     * isto para que possa ser mantido quais comissarios ja avaliaram quais exercicios e a avaliacao dos mesmos.
     * @param comissao Representa o comissario que efetuou a avaliacao.
     * @param resolucao Representa a resolucao avaliada.
     * @param valor Representa o valor da avaliacao do comissario para com a resolucao.
     */
    public void gravar(Comissao comissao, Resolucao resolucao, String valor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //metodos de atualizacao
    
    public void atualizar(Resolucao resolucao, String campo, String valor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void atualizar(Exercicio exercicio, String campo, String valor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void atualizar(Organizador organizador, String campo, String valor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void atualizar(Grupo grupo, String campo, String valor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void atualizar(Tutor tutor, String campo, String valor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void atualizar(Comissao comissao, String campo, String valor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    //metodos de leitura
    /**
     * Metodo que recebe um objeto e uma string, que representam, respectivamente,
     * a tabela a ser consultada e o campo da tabela, e retorna a leitura de uma tupla(linha) ou campo especificos da tabela.
     * @param grupo Tanto especifica a tabela a ser lida quanto a linha especifica a ser pesquisada.
     * @param campo Especifica o campo da linha desejado a ser retornado pelo metodo.
     * @return Retorno da leitura de acordo com os parametros supracitados.
     */
    public String ler(Grupo grupo, String campo){
        String mensagem = /*leitura do campo definido da tabela grupo*/ "";
        
        return mensagem;
    }
    
    //metodo de insercao de querys
    // entao... nao tenho certeza sobre esse metodo e nem se deveria estar aqui, mas
    // estou colocando pra, no caso de estar certo, eu nao me esquecer dele
    public String inserirQuery(String query){
       String retorno = null;
       
       if(/*obtem sucesso ao inserir query*/Math.random()==0){
           retorno = /*retorno da query*/"";
       }
       
       return retorno;
    }
    
    //metodo de insercao de login e senha em uma tabela especifica
    
    public void gravarLogin(String id, String senha, Maratona maratona){
        
    }
    public boolean lerLogin(String id, String senha, Maratona maratona){
        if(/*login esta presente na tabela de login*/Math.round(Math.random())==0){
            return true;
        }else{
            return false;
        }
    }
    
    
}
