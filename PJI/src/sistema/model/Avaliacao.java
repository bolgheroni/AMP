package sistema.model;

/**
 *
 * @author aluno
 */
public class Avaliacao {

    private Resolucao resolucao;
    private int nota_Resolucao;
    private Comissao avaliador_Resolucao;

    public Avaliacao(Resolucao resolucao, int nota_Resolucao, Comissao avaliador_Resolucao) {
        this.resolucao = resolucao;
        this.nota_Resolucao = nota_Resolucao;
        this.avaliador_Resolucao = avaliador_Resolucao;
    }

    public Resolucao getResolucao() {
        return resolucao;
    }

    public void setResolucao(Resolucao resolucao) {
        this.resolucao = resolucao;
    }

    public int getNota_Resolucao() {
        return nota_Resolucao;
    }

    public void setNota_Resolucao(int nota_Resolucao) {
        this.nota_Resolucao = nota_Resolucao;
    }

    public Comissao getAvaliador_Resolucao() {
        return avaliador_Resolucao;
    }

    public void setAvaliador_Resolucao(Comissao avaliador_Resolucao) {
        this.avaliador_Resolucao = avaliador_Resolucao;
    }
    
    
    
    
}
