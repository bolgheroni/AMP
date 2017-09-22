/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.servicos;

import sistema.model.Grupo;
import sistema.model.Tutor;

/**
 *
 * @author Eduardo
 */
public interface GrupoServicoInterface {

    public void cadastrar(String userName, String password, Tutor tutor);

    public boolean Logar(Grupo grupo);

}
