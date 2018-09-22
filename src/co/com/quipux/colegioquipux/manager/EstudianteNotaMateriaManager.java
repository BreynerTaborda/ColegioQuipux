/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.manager;

import co.com.quipux.colegioquipux.manager.impl.EstudianteNotaMateriaManagerImpl;
import co.com.quipux.colegioquipux.models.dto.EstudianteNotaMateriaConsultaSimpleDTO;
import co.com.quipux.colegioquipux.models.dto.EstudianteNotaMateriaDTO;

/**
 *
 * @author BREINER
 */
public interface EstudianteNotaMateriaManager {
    
    public EstudianteNotaMateriaConsultaSimpleDTO consultaSimpleEstudianteNotaMateria(String idmateria);
   
   public void registrarEstudianteNotaMateria(EstudianteNotaMateriaDTO estudianteNotaMateria);
}
