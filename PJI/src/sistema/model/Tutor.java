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
 * @author Roberto Bolgheroni
 */
public class Tutor extends Logavel {

    private List<Grupo> gruposTutorados;

    public Tutor(String userName, String senha) {
        super(userName, senha);
        gruposTutorados = new ArrayList<>();
    }

    public void addGrupoTutorado(Grupo grupo) {
        gruposTutorados.add(grupo);
    }

    public List<Grupo> getGruposTutorados() {
        return gruposTutorados;
    }

    public void setGruposTutorados(List<Grupo> gruposTutorados) {
        this.gruposTutorados = gruposTutorados;
    }

    @Override
    public String getUserName() {
        return userName;
    }

    @Override
    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String getSenha() {
        return senha;
    }

    @Override
    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Tutor";
    }

}
