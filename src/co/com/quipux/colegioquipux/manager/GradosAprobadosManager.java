/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.manager;

import co.com.quipux.colegioquipux.models.dto.GradosAprobadosConsultaSimpleDTO;
import co.com.quipux.colegioquipux.models.dto.GradosAprobadosDTO;

/**
 *
 * @author BREINER
 */
public interface GradosAprobadosManager {
    
    public GradosAprobadosConsultaSimpleDTO consultaSimpleGradosAprobados(int idestudiante);
   
   public void registrarGradosAprobados(GradosAprobadosDTO gradosAprobados);
}
