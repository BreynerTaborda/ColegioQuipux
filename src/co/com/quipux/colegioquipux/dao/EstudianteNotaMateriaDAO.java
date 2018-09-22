/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.dao;

import co.com.quipux.colegioquipux.models.entity.EstudianteNotaMateriaEntity;

/**
 *
 * @author BREINER
 */
public interface EstudianteNotaMateriaDAO {
  
 public void registrarEstudianteNotaMateria (EstudianteNotaMateriaEntity estudianteNotaMateria);
 
 public  EstudianteNotaMateriaEntity consultarEstudianteNotaMateria (String idmateria);
    
}
