package sistema.model;

import java.util.ArrayList;
import java.util.List;

public class Prova {

    private String codigoProva;
    private String descricaoProva;
    private List<Exercicio> exercicios;

    public Prova(String codigoProva, String descricaoProva) {
        this.codigoProva = codigoProva;
        this.descricaoProva = descricaoProva;
        exercicios = new ArrayList<>();
    }

    public Prova(String codigoProva) {
        this.codigoProva = codigoProva;
        this.exercicios = new ArrayList<>();
    }

    
    public String getCodigoProva() {
        return codigoProva;
    }

    public void setCodigoProva(String codigoProva) {
        this.codigoProva = codigoProva;
    }

    public void addExercicio(Exercicio exercicio) {
        exercicios.add(exercicio);
    }

    public List<Exercicio> getExercicios() {
        return exercicios;
    }

    public void setExercicios(List<Exercicio> exercicios) {
        this.exercicios = exercicios;
    }

}
