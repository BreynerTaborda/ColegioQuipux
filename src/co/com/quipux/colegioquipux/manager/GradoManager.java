/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.manager;

import co.com.quipux.colegioquipux.models.dto.GradoConsultaSimpleDTO;
import co.com.quipux.colegioquipux.models.dto.GradoDTO;

/**
 *
 * @author BREINER
 */
public interface GradoManager {
    
    public GradoConsultaSimpleDTO consultaSimpleGrado(int idgrado);
   
   public void registrarGrado(GradoDTO grado);
}
