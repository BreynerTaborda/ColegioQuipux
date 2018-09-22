/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.dao.impl;

import co.com.quipux.colegioquipux.dao.EstudianteDAO;
import co.com.quipux.colegioquipux.models.entity.EstudianteEntity;
import java.util.ArrayList;

/**
 *
 * @author BREINER
 */
public class EstudianteDaoImpl implements EstudianteDAO {
  
  ArrayList<EstudianteEntity> listaEstudiante = new ArrayList<EstudianteEntity>();
   
   EstudianteEntity profesorEntity = new EstudianteEntity(0, null, null, null, null, null, null, null, null, null, 0, 0);
   
    @Override
    public void registrarEstudiante(EstudianteEntity estudiante) {
        listaEstudiante.add(estudiante);
    }
     
    @Override
    public EstudianteEntity consultarEstudiante(int idestudiante) {
       for (EstudianteEntity estudiante : listaEstudiante) {
            if (estudiante.getIdetudiante()== idestudiante) {
                return estudiante;
            }
        }
        return null;
    }
}
