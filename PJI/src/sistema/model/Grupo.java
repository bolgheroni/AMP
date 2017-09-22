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
 * @author Doente
 */
public class Grupo extends Logavel {

    private Tutor tutor;
    private List<Resolucao> resolucao;

    public Grupo() {
        
    }

    public Grupo(Tutor tutor, String userName, String senha) {
        super(userName, senha);
        this.tutor = tutor;
        resolucao = new ArrayList<>();
    }

    public Tutor getTutor() {
        return tutor;
    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }

    public List<Resolucao> getResolucao() {
        return resolucao;
    }

    public void setResolucao(List<Resolucao> resolucao) {
        this.resolucao = resolucao;
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
        return "Grupo";
    }

}
