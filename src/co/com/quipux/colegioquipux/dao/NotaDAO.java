/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.dao;

import co.com.quipux.colegioquipux.models.entity.NotaEntity;

/**
 *
 * @author BREINER
 */
public interface NotaDAO {
 
 public void registrarNota (NotaEntity nota);
 
 public NotaEntity consultarNota (int idNota);
 
}
