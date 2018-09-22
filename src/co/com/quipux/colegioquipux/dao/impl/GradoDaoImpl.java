/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.dao.impl;

import co.com.quipux.colegioquipux.dao.GradoDAO;
import co.com.quipux.colegioquipux.models.entity.GradoEntity;
import java.util.ArrayList;

/**
 *
 * @author BREINER
 */
public class GradoDaoImpl implements GradoDAO {
 ArrayList<GradoEntity> listaGrado = new ArrayList<GradoEntity>();

   GradoEntity gradoEntity = new GradoEntity(0, null);
    @Override
    public void registrarGrado(GradoEntity grado) {
        listaGrado.add(grado);
    }

    @Override
    public GradoEntity consultarGrado(int idGrado) {
        for (GradoEntity grado : listaGrado) {
            if (grado.getIdgrado()== idGrado) {
                return grado;
            }
        }
        return null;
    }
 
 
}
