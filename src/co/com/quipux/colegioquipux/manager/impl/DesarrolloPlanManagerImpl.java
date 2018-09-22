/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.manager.impl;

import co.com.quipux.colegioquipux.dao.impl.DesarrolloPlanDaoImpl;
import co.com.quipux.colegioquipux.dao.impl.MateriaDaoImpl;
import co.com.quipux.colegioquipux.dao.impl.PlanDaoImpl;
import co.com.quipux.colegioquipux.manager.DesarrolloPlanManager;
import co.com.quipux.colegioquipux.models.dto.DesarrolloPlanConsultaSimpleDTO;
import co.com.quipux.colegioquipux.models.dto.DesarrolloPlanDTO;
import co.com.quipux.colegioquipux.models.entity.DesarrolloPlanEntity;
import co.com.quipux.colegioquipux.models.entity.MateriaEntity;
import co.com.quipux.colegioquipux.models.entity.PlanEntity;

/**
 *
 * @author BREINER
 */
public class DesarrolloPlanManagerImpl implements DesarrolloPlanManager {
    
    DesarrolloPlanDaoImpl desarrolloPlanDao = new DesarrolloPlanDaoImpl();
    MateriaDaoImpl materiaDao = new MateriaDaoImpl();
    PlanDaoImpl planDao = new PlanDaoImpl();
    @Override
    public DesarrolloPlanConsultaSimpleDTO consultaSimpleDesarrolloPlan(int idDesarrollo) {
        
        DesarrolloPlanConsultaSimpleDTO desarrolloPlanSimpleDTO = new DesarrolloPlanConsultaSimpleDTO();
        DesarrolloPlanEntity desarrolloPlanEntity = desarrolloPlanDao.consultarDesarrolloPlan(idDesarrollo);
        MateriaEntity materiaEntity = materiaDao.consultarMateria(null);
        PlanEntity planEntity = planDao.consultarPlan(0);
        
         desarrolloPlanSimpleDTO.setNombreMateria(materiaEntity.getNombreMateria());
         desarrolloPlanSimpleDTO.setNombrePlan(planEntity.getNombrePlan());
         desarrolloPlanSimpleDTO.setDescripcion(desarrolloPlanEntity.getDescripcion());
         
         return desarrolloPlanSimpleDTO;
    }

     DesarrolloPlanEntity desarrolloPlanEntity = new DesarrolloPlanEntity(0, 0, null);
    @Override
    public void registrarDesarrolloPlan(DesarrolloPlanDTO desarrolloPlan) {
       desarrolloPlanEntity.setIdDesarrolloPlan(desarrolloPlan.getIdDesarrolloPlan());
       desarrolloPlanEntity.setIdplan(desarrolloPlan.getIdplan());
       desarrolloPlanEntity.setDescripcion(desarrolloPlan.getDescripcion());
       
        
        desarrolloPlanDao.registrarDesarrolloPlan(desarrolloPlanEntity);
    }
    
    
}
