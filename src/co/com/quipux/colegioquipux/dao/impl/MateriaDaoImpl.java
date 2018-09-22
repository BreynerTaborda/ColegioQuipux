/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.dao.impl;

import co.com.quipux.colegioquipux.dao.MateriaDAO;
import co.com.quipux.colegioquipux.models.entity.MateriaEntity;
import java.util.ArrayList;

/**
 *
 * @author BREINER
 */
public class MateriaDaoImpl implements MateriaDAO {

    public static  ArrayList<MateriaEntity> listaMateria = new ArrayList<MateriaEntity>();
 
     MateriaEntity MateriaEntity = new MateriaEntity(null,null,null);
    @Override
    public void registrarMateria(MateriaEntity materia) {
        listaMateria.add(materia);
    }

    @Override
    public MateriaEntity consultarMateria(String idMateria) {
        for (MateriaEntity materia : listaMateria) {
            if ((materia.getIdmateria()) == idMateria) {
                return materia;
            }
        }
        return null;
    }

}
