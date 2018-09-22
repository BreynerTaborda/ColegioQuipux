/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.manager.impl;

import co.com.quipux.colegioquipux.dao.impl.MateriaDaoImpl;
import co.com.quipux.colegioquipux.dao.impl.NotaDaoImpl;
import co.com.quipux.colegioquipux.manager.NotaManager;
import co.com.quipux.colegioquipux.models.dto.NotaConsultaSimpleDTO;
import co.com.quipux.colegioquipux.models.dto.NotaDTO;
import co.com.quipux.colegioquipux.models.entity.MateriaEntity;
import co.com.quipux.colegioquipux.models.entity.NotaEntity;

/**
 *
 * @author BREINER
 */
public class NotaManagerImpl implements NotaManager{
    
    NotaDaoImpl notaDao = new NotaDaoImpl();
    MateriaDaoImpl materiaDao = new MateriaDaoImpl();

    @Override
    public NotaConsultaSimpleDTO consultaSimpleNota(int idNota) {
        NotaConsultaSimpleDTO notaSimpleDto = new NotaConsultaSimpleDTO();
        NotaEntity notaEntity = notaDao.consultarNota(idNota);
        
        MateriaEntity materiaEntity = materiaDao.consultarMateria(null);
        
        
         notaSimpleDto.setNombreMateria(materiaEntity.getNombreMateria());
         notaSimpleDto.setPeriodo(notaEntity.getPeriodo());
          
         return notaSimpleDto;

    }
     NotaEntity notaEntity = new NotaEntity(0, 0, 0, null);
    @Override
    public void registrarNota(NotaDTO nota) {
        
        notaEntity.setIdnota(nota.getIdnota());
        notaEntity.setNota(nota.getNota());
        notaEntity.setNota(nota.getNota());
        notaEntity.setPeriodo(nota.getPeriodo());
        notaEntity.setNombreMateria(nota.getNombreMateria());
      
        notaDao.registrarNota(notaEntity);
    }
    
   
}
