/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.manager.impl;

import co.com.quipux.colegioquipux.dao.impl.EstudianteNotaMateriaDaoImpl;
import co.com.quipux.colegioquipux.dao.impl.MateriaDaoImpl;
import co.com.quipux.colegioquipux.manager.EstudianteNotaMateriaManager;
import co.com.quipux.colegioquipux.models.dto.EstudianteNotaMateriaConsultaSimpleDTO;
import co.com.quipux.colegioquipux.models.dto.EstudianteNotaMateriaDTO;
import co.com.quipux.colegioquipux.models.entity.EstudianteNotaMateriaEntity;
import co.com.quipux.colegioquipux.models.entity.MateriaEntity;

/**
 *
 * @author BREINER
 */
public class EstudianteNotaMateriaManagerImpl implements EstudianteNotaMateriaManager  {
    
    EstudianteNotaMateriaDaoImpl estudianteNotaMateriaDao = new EstudianteNotaMateriaDaoImpl();
    MateriaDaoImpl materiaDao = new MateriaDaoImpl();
    @Override
    public EstudianteNotaMateriaConsultaSimpleDTO consultaSimpleEstudianteNotaMateria(String idmateria) {
        
        EstudianteNotaMateriaConsultaSimpleDTO estudianteNotaMateriaSimpleDTO = new EstudianteNotaMateriaConsultaSimpleDTO();
        EstudianteNotaMateriaEntity estudianteNotaMateriaEntity = estudianteNotaMateriaDao.consultarEstudianteNotaMateria(idmateria);
        MateriaEntity materiaEntity = materiaDao.consultarMateria(idmateria);

         estudianteNotaMateriaSimpleDTO.setIdmateria(estudianteNotaMateriaEntity.getIdmateria());
         estudianteNotaMateriaSimpleDTO.setNombreMateria(materiaEntity.getNombreMateria());
         
         return estudianteNotaMateriaSimpleDTO;
    }
      EstudianteNotaMateriaEntity estudianteNotaMateriaEntity = new EstudianteNotaMateriaEntity(0, null, 0, 0);
    @Override
    public void registrarEstudianteNotaMateria(EstudianteNotaMateriaDTO estudianteNotaMateria) {
       estudianteNotaMateriaEntity.setIdestudiante(estudianteNotaMateria.getIdestudiante());
       estudianteNotaMateriaEntity.setIdmateria(estudianteNotaMateria.getIdmateria());
       estudianteNotaMateriaEntity.setIdDesarrolloPlan(estudianteNotaMateria.getIdDesarrolloPlan());
       estudianteNotaMateriaEntity.setIdnota(estudianteNotaMateria.getIdnota());
        
        estudianteNotaMateriaDao.registrarEstudianteNotaMateria(estudianteNotaMateriaEntity);
    }
    
    
}
