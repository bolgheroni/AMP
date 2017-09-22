/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.servicos;

import sistema.dados.GrupoDAO;
import sistema.model.Grupo;
import sistema.model.Tutor;

public class GrupoServico implements GrupoServicoInterface {

    @Override
    public void cadastrar(String userName, String senha, Tutor tutor) {
        try {
            GrupoDAO.cadastrarGrupo(new Grupo(tutor, userName, senha));
        } catch (Exception e) {
        }
    }

    @Override
    public boolean Logar(Grupo grupo) {
        try {
        return GrupoDAO.logar(grupo);
        } catch (Exception e) {
            throw  new RuntimeException(e);
        }
    }

}
