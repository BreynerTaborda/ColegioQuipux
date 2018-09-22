/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.manager;

import co.com.quipux.colegioquipux.models.dto.MateriaConsultaSimpleDTO;
import co.com.quipux.colegioquipux.models.dto.MateriaDTO;

/**
 *
 * @author BREINER
 */
public interface MateriaManager {
    
    public MateriaConsultaSimpleDTO consultaSimpleMateria(String idMateria);
   
   public void registrarMateria(MateriaDTO materia);
}
