/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.manager.impl;

import co.com.quipux.colegioquipux.dao.impl.GradoDaoImpl;
import co.com.quipux.colegioquipux.dao.impl.GrupoDaoImpl;
import co.com.quipux.colegioquipux.dao.impl.MateriaDaoImpl;
import co.com.quipux.colegioquipux.dao.impl.PlanDaoImpl;
import co.com.quipux.colegioquipux.manager.PlanManager;
import co.com.quipux.colegioquipux.models.dto.PlanConsultaSimpleDTO;
import co.com.quipux.colegioquipux.models.dto.PlanDTO;
import co.com.quipux.colegioquipux.models.entity.GrupoEntity;
import co.com.quipux.colegioquipux.models.entity.MateriaEntity;
import co.com.quipux.colegioquipux.models.entity.PlanEntity;

/**
 *
 * @author BREINER
 */
public class PlanManagerImpl implements PlanManager {
    
    PlanDaoImpl planDao = new PlanDaoImpl();
    GrupoDaoImpl grupoDao = new GrupoDaoImpl();
    MateriaDaoImpl materiaDao = new MateriaDaoImpl();
    @Override
    public PlanConsultaSimpleDTO consultaSimplePlan(int idPlan) {
         PlanConsultaSimpleDTO planSimpleDto = new PlanConsultaSimpleDTO();
        PlanEntity planEntity = planDao.consultarPlan(idPlan);
        GrupoEntity grupoEntity = grupoDao.consultarGrupo(idPlan);
        MateriaEntity materiaEntity = materiaDao.consultarMateria(null);
        
        planSimpleDto.setNombrePlan(planEntity.getNombrePlan());
        planSimpleDto.setFecha(planEntity.getFecha());
         planSimpleDto.setNombreMateria(materiaEntity.getNombreMateria());
        planSimpleDto.setNombreGrupo(grupoEntity.getNombreGrupo());
        planSimpleDto.setDescripcion(planEntity.getDescripcion());
        
        return planSimpleDto;
    }

     PlanEntity planEntity = new PlanEntity(0, null, null, null, 0, null);
    @Override
    public void registrarPlan(PlanDTO plan) {
        
        planEntity.setIdplan(plan.getIdplan());
       planEntity.setNombrePlan(plan.getNombrePlan());
       planEntity.setIdplan(plan.getIdplan());
       planEntity.setIdmateria(plan.getIdmateria());
       planEntity.setIdgrupo(plan.getIdgrupo());
       planEntity.setDescripcion(plan.getDescripcion());
       
       planDao.registrarPlan(planEntity);

    }
    
    
}
