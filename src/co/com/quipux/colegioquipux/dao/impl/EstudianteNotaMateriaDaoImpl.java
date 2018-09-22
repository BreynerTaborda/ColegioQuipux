/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.dao.impl;

import co.com.quipux.colegioquipux.dao.EstudianteDAO;
import co.com.quipux.colegioquipux.dao.EstudianteNotaMateriaDAO;
import co.com.quipux.colegioquipux.models.entity.EstudianteEntity;
import co.com.quipux.colegioquipux.models.entity.EstudianteNotaMateriaEntity;
import java.util.ArrayList;

/**
 *
 * @author BREINER
 */
public class EstudianteNotaMateriaDaoImpl implements EstudianteNotaMateriaDAO {

    ArrayList<EstudianteNotaMateriaEntity> listaEstudianteNotaMateria = new ArrayList<EstudianteNotaMateriaEntity>();

    EstudianteNotaMateriaEntity estudianteNotaMateria = new EstudianteNotaMateriaEntity(0,null, 0, 0);

    @Override
    public void registrarEstudianteNotaMateria(EstudianteNotaMateriaEntity estudianteNotaMateria) {
        listaEstudianteNotaMateria.add(estudianteNotaMateria);
    }

    @Override
    public EstudianteNotaMateriaEntity consultarEstudianteNotaMateria(String idmateria) {
        for (EstudianteNotaMateriaEntity estudianteNotaMateria : listaEstudianteNotaMateria) {
            if (estudianteNotaMateria.getIdmateria()== idmateria) {
                return estudianteNotaMateria;
            }
        }
        return null;
    }

}
