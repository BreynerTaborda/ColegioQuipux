/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.com.quipux.colegioquipux.manager.impl;

import co.com.quipux.colegioquipux.dao.impl.ProfesorDaoImpl;
import co.com.quipux.colegioquipux.manager.ProfesorManager;
import co.com.quipux.colegioquipux.models.dto.ProfesorConsultaSimpleDTO;
import co.com.quipux.colegioquipux.models.dto.ProfesorDTO;
import co.com.quipux.colegioquipux.models.entity.ProfesorEntity;

/**
 *
 * @author Verde
 */
public class ProfesorManagerImpl implements ProfesorManager {

    ProfesorDaoImpl profesorDao= new ProfesorDaoImpl();
    
     @Override
    public ProfesorConsultaSimpleDTO consultaSimpleProfesor(int idProfesor) {
         ProfesorConsultaSimpleDTO profesorSimpleDto = new ProfesorConsultaSimpleDTO();
        ProfesorEntity profesorEntity = profesorDao.consultarProfesor(idProfesor);
        
        profesorSimpleDto.setNombre(profesorEntity.getNombre());
        profesorSimpleDto.setApellidos(profesorEntity.getApellidos());
        profesorSimpleDto.setCorreo(profesorEntity.getCorreo());
        
        return profesorSimpleDto;
    }

    ProfesorEntity profesorEntity = new ProfesorEntity(0,null,null,null,null,0);
    @Override
    public void registrarProfesor(ProfesorDTO profesor) {
       ProfesorDaoImpl profesorDaoImpl = new ProfesorDaoImpl();
       
       
       profesorEntity.setApellidos(profesor.getApellidos());
       profesorEntity.setCorreo(profesor.getCorreo());
       profesorEntity.setNombre(profesor.getNombre());
       profesorEntity.setIdDocumento(profesor.getIdDocumento());
       profesorEntity.setDocumento(profesor.getDocumento());
       
       
       profesorDao.registrarProfesor(profesorEntity);
    }

   
    
}
