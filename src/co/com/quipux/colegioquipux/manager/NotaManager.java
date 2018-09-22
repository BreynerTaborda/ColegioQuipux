/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.manager;

import co.com.quipux.colegioquipux.models.dto.NotaConsultaSimpleDTO;
import co.com.quipux.colegioquipux.models.dto.NotaDTO;

/**
 *
 * @author BREINER
 */
public interface NotaManager {
    
    public NotaConsultaSimpleDTO consultaSimpleNota(int idNota);
   
   public void registrarNota(NotaDTO nota);
}
