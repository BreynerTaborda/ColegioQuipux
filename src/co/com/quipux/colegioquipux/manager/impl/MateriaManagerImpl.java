/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.manager.impl;

import co.com.quipux.colegioquipux.dao.impl.MateriaDaoImpl;
import co.com.quipux.colegioquipux.manager.MateriaManager;
import co.com.quipux.colegioquipux.models.dto.MateriaConsultaSimpleDTO;
import co.com.quipux.colegioquipux.models.dto.MateriaDTO;
import co.com.quipux.colegioquipux.models.entity.MateriaEntity;

/**
 *
 * @author BREINER
 */
public class MateriaManagerImpl implements MateriaManager {
   
    MateriaDaoImpl materiaDao = new MateriaDaoImpl();

    @Override
    public MateriaConsultaSimpleDTO consultaSimpleMateria(String idMateria) {
        
        MateriaConsultaSimpleDTO materiaSimpleDto = new MateriaConsultaSimpleDTO();
        MateriaEntity materiaEntity = materiaDao.consultarMateria(idMateria);
        
         materiaSimpleDto.setNombreMateria(materiaEntity.getNombreMateria());
         materiaSimpleDto.setDescripcion(materiaEntity.getDescripcion());
          
         return materiaSimpleDto;
    }

     MateriaEntity materiaEntity = new MateriaEntity(null, null, null);
    @Override
    public void registrarMateria(MateriaDTO materia) {

         MateriaDaoImpl profesorDaoImpl = new MateriaDaoImpl();
        
        materiaEntity.setIdmateria(materia.getIdmateria());
        materiaEntity.setNombreMateria(materia.getNombreMateria());
        materiaEntity.setDescripcion(materia.getDescripcion());
        
        materiaDao.registrarMateria(materiaEntity);
    }
    
    
}
