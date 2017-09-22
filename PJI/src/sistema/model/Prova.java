package sistema.model;

import java.util.ArrayList;
import java.util.List;

public class Prova {

    private List<Exercicio> exercicios;

    public Prova() {
        exercicios = new ArrayList<>();
    }

    public void addExercicio(Exercicio exercicio){
        exercicios.add(exercicio);
    }
    
    public List<Exercicio> getExercicios() {
        return exercicios;
    }

    public void setExercicios(List<Exercicio> exercicios) {
        this.exercicios = exercicios;
    }
    
    

}
