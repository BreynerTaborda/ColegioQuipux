/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.manager;

import co.com.quipux.colegioquipux.models.dto.GrupoConsultaSimpleDTO;
import co.com.quipux.colegioquipux.models.dto.GrupoDTO;

/**
 *
 * @author BREINER
 */
public interface GrupoManager {
    
    public GrupoConsultaSimpleDTO consultaSimpleGrupo(int idGrupo);
   
   public void registrarGrupo(GrupoDTO grupo);
}
