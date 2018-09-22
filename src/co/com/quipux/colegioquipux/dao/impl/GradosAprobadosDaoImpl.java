/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.dao.impl;

import co.com.quipux.colegioquipux.dao.GradosAprobadosDAO;
import co.com.quipux.colegioquipux.models.entity.GradosAprobadosEntity;
import java.util.ArrayList;

/**
 *
 * @author BREINER
 */
public class GradosAprobadosDaoImpl implements GradosAprobadosDAO {
    ArrayList<GradosAprobadosEntity> listaGradosAprobados = new ArrayList<GradosAprobadosEntity>();
 
    GradosAprobadosEntity gradosAprobadosEntity = new GradosAprobadosEntity(0,0,null);
    
    @Override
    public void registrarGradosAprobados(GradosAprobadosEntity GradosAprobados) {
      listaGradosAprobados.add(GradosAprobados);
    }

    @Override
    public GradosAprobadosEntity consultarGradosAprobados(int idestudiante) {
        for (GradosAprobadosEntity gradosAprobados : listaGradosAprobados) {
            if (gradosAprobados.getIdestudiante()== idestudiante) {
                return gradosAprobados;
            }
        }
        return null;
    }
    
    
}
