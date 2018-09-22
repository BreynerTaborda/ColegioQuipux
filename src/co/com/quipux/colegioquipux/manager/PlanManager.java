/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.manager;

import co.com.quipux.colegioquipux.models.dto.PlanConsultaSimpleDTO;
import co.com.quipux.colegioquipux.models.dto.PlanDTO;

/**
 *
 * @author BREINER
 */
public interface PlanManager {
    public PlanConsultaSimpleDTO consultaSimplePlan(int idPlan);
   
   public void registrarPlan(PlanDTO plan);
}
