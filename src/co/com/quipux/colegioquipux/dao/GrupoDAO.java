/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.dao;

import co.com.quipux.colegioquipux.models.entity.GrupoEntity;

/**
 *
 * @author BREINER
 */
public interface GrupoDAO {
 
  public void registrarGrupo (GrupoEntity grupo);
  
  public GrupoEntity consultarGrupo (int idGrupo);
}
