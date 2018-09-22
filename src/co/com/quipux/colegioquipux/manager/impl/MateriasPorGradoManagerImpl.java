/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.manager.impl;

import co.com.quipux.colegioquipux.dao.impl.GradoDaoImpl;
import co.com.quipux.colegioquipux.dao.impl.MateriaDaoImpl;
import co.com.quipux.colegioquipux.dao.impl.MateriasPorGradoDaoImpl;
import co.com.quipux.colegioquipux.manager.MateriasPorGradoManager;
import co.com.quipux.colegioquipux.models.dto.MateriasPorGradoConsultaSimpleDTO;
import co.com.quipux.colegioquipux.models.dto.MateriasPorGradoDTO;
import co.com.quipux.colegioquipux.models.entity.GradoEntity;
import co.com.quipux.colegioquipux.models.entity.MateriaEntity;
import co.com.quipux.colegioquipux.models.entity.MateriasPorGradoEntity;

/**
 *
 * @author BREINER
 */
public class MateriasPorGradoManagerImpl implements MateriasPorGradoManager {
    
    MateriasPorGradoDaoImpl materiasPorGradoDao = new MateriasPorGradoDaoImpl();
    MateriaDaoImpl materiaDao = new MateriaDaoImpl();
    GradoDaoImpl gradoDao = new GradoDaoImpl();
    @Override
    public MateriasPorGradoConsultaSimpleDTO consultaSimpleMateriasPorGrado(String idMateria) {
      
        MateriasPorGradoConsultaSimpleDTO materiasPorGradoSimpleDto = new MateriasPorGradoConsultaSimpleDTO();
        MateriasPorGradoEntity materiasPorGradoEntity = materiasPorGradoDao.consultarMateriasPorGrado(idMateria);
        GradoEntity gradoEntity = gradoDao.consultarGrado(0);
        MateriaEntity materiaEntity = materiaDao.consultarMateria(null);
        
        
         materiasPorGradoSimpleDto.setNombreMateria(materiaEntity.getNombreMateria());
         materiasPorGradoSimpleDto.setNombreGrado(gradoEntity.getNombreGrado());
          
         return materiasPorGradoSimpleDto;
    }
    MateriasPorGradoEntity materiasPorGradoEntity = new MateriasPorGradoEntity(0, null);
    @Override
    public void registrarMateriasPorGrado(MateriasPorGradoDTO materiasPorGrado) {
        
        materiasPorGradoEntity.setIdgrado(materiasPorGrado.getIdgrado());
        materiasPorGradoEntity.setIdmateria(materiasPorGrado.getIdmateria());
      
        materiasPorGradoDao.registrarMateriasPorGrado(materiasPorGradoEntity);

        
    }
    
}
