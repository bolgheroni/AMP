/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author Roberto Bolgheroni
 */
public class Maratona {

    private int codigo;
    private LocalDate data_Inicio;
    private LocalDateTime hora_Inicio;
    private LocalDate data_Fim;
    private LocalDateTime hora_Fim;
    private Prova prova;
}
