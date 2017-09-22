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
public class Resolucao {

    private int codigoResolucao; // numero da resolucao no sistema
    private Exercicio exercicio; //exercicio ao qual se propoe a resolver
    private Grupo grupo; // grupo desenvolvedor
    private String resolucao; // texto da resolucao - codigo - em si
    private ArrayList<Integer> pontuacoes; //vetor de inteiros, contendo os 
    private boolean Avaliado;                                       //valores das avaliacoes de todos os comissionados para esta resolucao

    public Resolucao(Exercicio exercicio, Grupo grupo) {
        this.exercicio = exercicio;
        this.grupo = grupo;
        pontuacoes = new ArrayList<>();
    }

    public int getCodigo() {
        return codigoResolucao;
    }

    public void setCodigo(int codigoResolucao) {
        this.codigoResolucao = codigoResolucao;
    }

    public void addPontuacao(int pontuacao) {
        pontuacoes.add(pontuacao);
    }
    
}
