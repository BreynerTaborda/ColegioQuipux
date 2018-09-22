/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.manager.impl;

import co.com.quipux.colegioquipux.dao.impl.GradoDaoImpl;
import co.com.quipux.colegioquipux.manager.GradoManager;
import co.com.quipux.colegioquipux.models.dto.GradoConsultaSimpleDTO;
import co.com.quipux.colegioquipux.models.dto.GradoDTO;
import co.com.quipux.colegioquipux.models.entity.GradoEntity;

/**
 *
 * @author BREINER
 */
public class GradoManagerImpl implements GradoManager {
    
    GradoDaoImpl gradoDao = new GradoDaoImpl();

    @Override
    public GradoConsultaSimpleDTO consultaSimpleGrado(int idgrado) {

        GradoConsultaSimpleDTO gradoSimpleDto = new GradoConsultaSimpleDTO();
        GradoEntity gradoEntity = gradoDao.consultarGrado(idgrado);

         gradoSimpleDto.setNombreGrado(gradoEntity.getNombreGrado());
         
         return gradoSimpleDto;
    }

     GradoEntity gradoEntity = new GradoEntity(0, null);
    @Override
    public void registrarGrado(GradoDTO grado) {

        gradoEntity.setIdgrado(grado.getIdgrado());
        gradoEntity.setNombreGrado(grado.getNombreGrado());
        
        gradoDao.registrarGrado(gradoEntity);
    }
    
}
