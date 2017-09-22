/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.servicos;

import sistema.apresentacao.Tela;
import sistema.dados.Arquivo;
import sistema.model.Maratona;
import java.util.ArrayList;

/**
 *
 * @author Roberto Bolgheroni
 */
public class MaratonaServico {

    private Arquivo arquivo;
    private Tela tela;
    private Validar validar;

    public MaratonaServico(Arquivo arquivo, Tela tela, Validar validar) {
        this.arquivo = arquivo;
        this.tela = tela;
        this.validar = validar;
    }

    public void cadastrar(Maratona maratona) {
        if (validar.validarCadastro(maratona)) {
            arquivo.gravar(maratona);
        }else{
            tela.exibirErroCadastro(maratona);
        }
    }

}
