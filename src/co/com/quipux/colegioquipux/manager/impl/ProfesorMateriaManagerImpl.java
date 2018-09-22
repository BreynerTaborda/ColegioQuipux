/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.manager.impl;

import co.com.quipux.colegioquipux.dao.impl.MateriaDaoImpl;
import co.com.quipux.colegioquipux.dao.impl.ProfesorDaoImpl;
import co.com.quipux.colegioquipux.dao.impl.ProfesorMateriaDaoImpl;
import co.com.quipux.colegioquipux.manager.ProfesorMateriaManager;
import co.com.quipux.colegioquipux.models.dto.ProfesorMateriaConsultaSimpleDTO;
import co.com.quipux.colegioquipux.models.dto.ProfesorMateriaDTO;
import co.com.quipux.colegioquipux.models.entity.MateriaEntity;
import co.com.quipux.colegioquipux.models.entity.ProfesorEntity;
import co.com.quipux.colegioquipux.models.entity.ProfesorMateriaEntity;

/**
 *
 * @author BREINER
 */
public class ProfesorMateriaManagerImpl implements ProfesorMateriaManager {
    
    ProfesorMateriaDaoImpl profesorMateriaDao = new ProfesorMateriaDaoImpl();
    MateriaDaoImpl materiaDaoImpl = new MateriaDaoImpl();
    ProfesorDaoImpl profesorDaoImpl = new ProfesorDaoImpl();

    @Override
    public ProfesorMateriaConsultaSimpleDTO consultaSimpleProfesorMateria(int idprofesor) {
       ProfesorMateriaConsultaSimpleDTO profesorMateriaSimpleDto = new ProfesorMateriaConsultaSimpleDTO();
        ProfesorMateriaEntity profesorMateriaEntity = profesorMateriaDao.consultarProfesorMateria(idprofesor);
        ProfesorEntity profesorEntity = profesorDaoImpl.consultarProfesor(idprofesor);
        MateriaEntity materiaEntity = materiaDaoImpl.consultarMateria(null);
        
        profesorMateriaSimpleDto.setNombreMateria(profesorEntity.getNombre());
        profesorMateriaSimpleDto.setNombreProfesor(materiaEntity.getNombreMateria());
        
        
        return profesorMateriaSimpleDto;
    }

     ProfesorMateriaEntity profesorMateriaEntity = new ProfesorMateriaEntity(null,0);
    @Override
    public void registrarProfesorMateria(ProfesorMateriaDTO profesorMateria) {
        
       ProfesorMateriaDaoImpl profesorMateriaDaoImpl = new ProfesorMateriaDaoImpl();
       
       profesorMateriaEntity.setIdMateria(profesorMateria.getIdmateria());
       profesorMateriaEntity.setIdProfesor(profesorMateria.getIdprofesor());
       
       profesorMateriaDao.registrarProfesorMateria(profesorMateriaEntity);
    }
    
    
}
