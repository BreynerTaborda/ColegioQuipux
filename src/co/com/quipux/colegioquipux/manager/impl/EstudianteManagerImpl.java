/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.manager.impl;

import co.com.quipux.colegioquipux.dao.impl.EstudianteDaoImpl;
import co.com.quipux.colegioquipux.manager.EstudianteManager;
import co.com.quipux.colegioquipux.models.dto.EstudianteConsultaSimpleDTO;
import co.com.quipux.colegioquipux.models.dto.EstudianteDTO;
import co.com.quipux.colegioquipux.models.entity.EstudianteEntity;

/**
 *
 * @author BREINER
 */
public class EstudianteManagerImpl implements EstudianteManager {

    EstudianteDaoImpl estudianteDao = new EstudianteDaoImpl();

    @Override
    public EstudianteConsultaSimpleDTO consultaSimpleEstudiante(int idestudiante) {

        EstudianteConsultaSimpleDTO estudianteSimpleDTO = new EstudianteConsultaSimpleDTO();
        EstudianteEntity estudianteEntity = estudianteDao.consultarEstudiante(idestudiante);
//        MateriaEntity materiaEntity = materiaDao.consultarMateria(idmateria);

        estudianteSimpleDTO.setNombre(estudianteEntity.getNombre());
        estudianteSimpleDTO.setApellidos(estudianteEntity.getApellidos());
        estudianteSimpleDTO.setCorreo(estudianteEntity.getCorreo());
        estudianteSimpleDTO.setDocumento(estudianteEntity.getDocumento());
        estudianteSimpleDTO.setTipoDocumento(estudianteEntity.getTipoDocumento());
        estudianteSimpleDTO.setSexo(estudianteEntity.getSexo());
        estudianteSimpleDTO.setFechaNacimineto(estudianteEntity.getFechaNacimineto());
        estudianteSimpleDTO.setCiudadResidencia(estudianteEntity.getCiudadResidencia());
        estudianteSimpleDTO.setDireccionResidencial(estudianteEntity.getDireccionResidencial());
        estudianteSimpleDTO.setTelefonoResidencial(estudianteEntity.getTelefonoResidencial());
        estudianteSimpleDTO.setTelefonoCelular(estudianteEntity.getTelefonoCelular());

        return estudianteSimpleDTO;
    }
    EstudianteEntity estudianteEntity = new EstudianteEntity(0, null, null, null, null, null, null, null, null, null, 0, 0);

    @Override
    public void registrarEstudiante(EstudianteDTO estudiante) {

        estudianteEntity.setIdetudiante(estudiante.getIdetudiante());
        estudianteEntity.setNombre(estudiante.getNombre());
        estudianteEntity.setApellidos(estudiante.getApellidos());
        estudianteEntity.setCorreo(estudiante.getCorreo());
        estudianteEntity.setDocumento(estudiante.getDocumento());
        estudianteEntity.setTipoDocumento(estudiante.getTipoDocumento());
        estudianteEntity.setSexo(estudiante.getSexo());
        estudianteEntity.setFechaNacimineto(estudiante.getFechaNacimineto());
        estudianteEntity.setCiudadResidencia(estudiante.getCiudadResidencia());
        estudianteEntity.setDireccionResidencial(estudiante.getDireccionResidencial());
        estudianteEntity.setTelefonoResidencial(estudiante.getTelefonoResidencial());
        estudianteEntity.setTelefonoCelular(estudiante.getTelefonoCelular());
       
                                       
        estudianteDao.registrarEstudiante(estudianteEntity);

    }

}
