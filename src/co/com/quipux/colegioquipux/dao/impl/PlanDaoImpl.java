/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.dao.impl;

import co.com.quipux.colegioquipux.dao.PlanDAO;
import co.com.quipux.colegioquipux.models.entity.PlanEntity;
import java.util.ArrayList;

/**
 *
 * @author BREINER
 */
public class PlanDaoImpl implements PlanDAO {
  ArrayList<PlanEntity> listaPlan = new ArrayList<PlanEntity>();

   PlanEntity planEntity = new PlanEntity(0, null, null, null, 0, null);
    @Override
    public void registrarPlan(PlanEntity plan) {
        listaPlan.add(plan);
    }

    @Override
    public PlanEntity consultarPlan(int idPlan) {
        for (PlanEntity plan : listaPlan) {
            if (plan.getIdplan()== idPlan) {
                return plan;
            }
        }
        return null;
    }
  
  
}
