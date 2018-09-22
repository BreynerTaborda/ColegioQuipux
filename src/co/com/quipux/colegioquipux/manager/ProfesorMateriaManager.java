/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.manager;

import co.com.quipux.colegioquipux.models.dto.ProfesorMateriaConsultaSimpleDTO;
import co.com.quipux.colegioquipux.models.dto.ProfesorMateriaDTO;

/**
 *
 * @author BREINER
 */
public interface ProfesorMateriaManager {
    
  public ProfesorMateriaConsultaSimpleDTO consultaSimpleProfesorMateria (int idprofesor);
  
  public void registrarProfesorMateria(ProfesorMateriaDTO profesorMateria);


 }
