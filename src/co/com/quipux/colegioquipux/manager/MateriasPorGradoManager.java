/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.manager;

import co.com.quipux.colegioquipux.models.dto.MateriasPorGradoConsultaSimpleDTO;
import co.com.quipux.colegioquipux.models.dto.MateriasPorGradoDTO;

/**
 *
 * @author BREINER
 */
public interface MateriasPorGradoManager {
    
    public MateriasPorGradoConsultaSimpleDTO consultaSimpleMateriasPorGrado(String idMateria);
   
   public void registrarMateriasPorGrado(MateriasPorGradoDTO materiasPorGrado);
}
