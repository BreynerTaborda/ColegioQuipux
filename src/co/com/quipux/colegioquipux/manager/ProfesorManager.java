/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.com.quipux.colegioquipux.manager;

import co.com.quipux.colegioquipux.models.dto.ProfesorConsultaSimpleDTO;
import co.com.quipux.colegioquipux.models.dto.ProfesorDTO;

/**
 *
 * @author Verde
 */
public interface ProfesorManager {
    
   public ProfesorConsultaSimpleDTO consultaSimpleProfesor(int idProfesor);
   
   public void registrarProfesor(ProfesorDTO profesor);
    
}
