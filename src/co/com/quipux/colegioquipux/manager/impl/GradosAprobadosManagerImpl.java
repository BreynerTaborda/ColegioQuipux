/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.manager.impl;

import co.com.quipux.colegioquipux.dao.impl.EstudianteDaoImpl;
import co.com.quipux.colegioquipux.dao.impl.GradosAprobadosDaoImpl;
import co.com.quipux.colegioquipux.manager.GradosAprobadosManager;
import co.com.quipux.colegioquipux.models.dto.GradosAprobadosConsultaSimpleDTO;
import co.com.quipux.colegioquipux.models.dto.GradosAprobadosDTO;
import co.com.quipux.colegioquipux.models.entity.EstudianteEntity;
import co.com.quipux.colegioquipux.models.entity.GradosAprobadosEntity;

/**
 *
 * @author BREINER
 */
public class GradosAprobadosManagerImpl implements GradosAprobadosManager{
   
    GradosAprobadosDaoImpl gradosAprobadosDao = new GradosAprobadosDaoImpl();
    EstudianteDaoImpl estudianteDao = new EstudianteDaoImpl();
    @Override
    public GradosAprobadosConsultaSimpleDTO consultaSimpleGradosAprobados(int idestudiante) {

        GradosAprobadosConsultaSimpleDTO gradosAprobadosSimpleDto = new GradosAprobadosConsultaSimpleDTO();
        GradosAprobadosEntity gradosAprobadosEntity = gradosAprobadosDao.consultarGradosAprobados(idestudiante);
        EstudianteEntity estudianteEntity = estudianteDao.consultarEstudiante(idestudiante);

         gradosAprobadosSimpleDto.setIdestudiante(gradosAprobadosEntity.getIdestudiante());
         gradosAprobadosSimpleDto.setNombeEstudiante(estudianteEntity.getNombre());
        
         
         return gradosAprobadosSimpleDto;
    }

    GradosAprobadosEntity gradosAprobadosEntity = new GradosAprobadosEntity(0, 0, null);
    @Override
    public void registrarGradosAprobados(GradosAprobadosDTO gradosAprobados) {
    
        gradosAprobadosEntity.setIdestudiante(gradosAprobados.getIdestudiante());
        gradosAprobadosEntity.setGrado(gradosAprobados.getGrado());
        gradosAprobadosEntity.setDescripcion(gradosAprobados.getDescripcion());
        
        
        gradosAprobadosDao.registrarGradosAprobados(gradosAprobadosEntity);
    }
    
}
