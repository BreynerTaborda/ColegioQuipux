/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.manager;

import co.com.quipux.colegioquipux.models.dto.DesarrolloPlanConsultaSimpleDTO;
import co.com.quipux.colegioquipux.models.dto.DesarrolloPlanDTO;

/**
 *
 * @author BREINER
 */
public interface DesarrolloPlanManager {
    
      public DesarrolloPlanConsultaSimpleDTO consultaSimpleDesarrolloPlan(int idDesarrollo);
   
   public void registrarDesarrolloPlan(DesarrolloPlanDTO desarrolloPlan);
}
