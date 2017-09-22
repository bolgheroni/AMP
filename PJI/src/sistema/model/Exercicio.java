/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sistema.model;

import java.util.ArrayList;

/**
 *
 * @author Roberto Bolgheroni
 */
public class Exercicio {
    private String codigo; // codigo do exercicio no sistema
    private String descricao; // descricao do exercicio, que sera, posteriormente, exibida na tela
    private Prova prova;

    public Exercicio(String codigo) {
        this.codigo = codigo;
    }

    public Exercicio(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public Exercicio(String codigo, String descricao, Prova prova) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.prova = prova;
    }
    

    public Prova getProva() {
        return prova;
    }

    public void setProva(Prova prova) {
        this.prova = prova;
    }

    
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
    
}
