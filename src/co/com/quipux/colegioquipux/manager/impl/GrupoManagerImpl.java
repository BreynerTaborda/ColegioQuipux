/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.manager.impl;

import co.com.quipux.colegioquipux.dao.impl.GrupoDaoImpl;
import co.com.quipux.colegioquipux.manager.GrupoManager;
import co.com.quipux.colegioquipux.models.dto.GrupoConsultaSimpleDTO;
import co.com.quipux.colegioquipux.models.dto.GrupoDTO;
import co.com.quipux.colegioquipux.models.entity.GrupoEntity;

/**
 *
 * @author BREINER
 */
public class GrupoManagerImpl implements GrupoManager {
   
    GrupoDaoImpl grupoDao = new GrupoDaoImpl();

    @Override
    public GrupoConsultaSimpleDTO consultaSimpleGrupo(int idGrupo) {

       GrupoConsultaSimpleDTO grupoSimpleDto = new GrupoConsultaSimpleDTO();
        GrupoEntity grupoEntity = grupoDao.consultarGrupo(idGrupo);
        
         grupoSimpleDto.setNombreGrupo(grupoEntity.getNombreGrupo());
         grupoSimpleDto.setIdprofesor(grupoEntity.getIdprofesor());
         grupoSimpleDto.setJornada(grupoEntity.getJornada());
         
         return grupoSimpleDto;
    }

      GrupoEntity grupoEntity = new GrupoEntity(0, 0, null, 0, 0, null);
    @Override
    public void registrarGrupo(GrupoDTO grupo) {

        grupoEntity.setIdgrupo(grupo.getIdgrupo());
        grupoEntity.setNombreGrupo(grupo.getNombreGrupo());
        grupoEntity.setIdgrado(grupo.getIdgrado());
        grupoEntity.setIdestudiante(grupo.getIdestudiante());
        grupoEntity.setIdprofesor(grupo.getIdprofesor());
        grupoEntity.setJornada(grupo.getJornada());
        
        grupoDao.registrarGrupo(grupoEntity);

    }
    
    
}
