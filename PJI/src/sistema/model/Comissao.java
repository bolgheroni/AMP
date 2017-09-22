/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gay
 */
public class Comissao extends Logavel{
    private List<Avaliacao> resolucoesAvaliadas;     //atributo que reune todos as resolucoes que este comissario

    public Comissao(String userName, String senha) {
        super(userName, senha);
        resolucoesAvaliadas = new ArrayList<>();
    }

    public List<Avaliacao> getResolucoesAvaliadas() {
        return resolucoesAvaliadas;
    }

    public void setResolucoesAvaliadas(List<Avaliacao> resolucoesAvaliadas) {
        this.resolucoesAvaliadas = resolucoesAvaliadas;
    }
    
    public void addResolucaoAvaliada(Avaliacao resolucaoAvaliada){
        resolucoesAvaliadas.add(resolucaoAvaliada);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Comissao";
    }

    
    

}
