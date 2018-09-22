/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.dao.impl;

import co.com.quipux.colegioquipux.dao.MateriasPorGradoDAO;
import static co.com.quipux.colegioquipux.dao.impl.ProfesorDaoImpl.listaProfesor;
import co.com.quipux.colegioquipux.models.entity.MateriasPorGradoEntity;
import java.util.ArrayList;

/**
 *
 * @author BREINER
 */
public class MateriasPorGradoDaoImpl implements MateriasPorGradoDAO {
 ArrayList<MateriasPorGradoEntity> listaMateriasPorGrado = new ArrayList<MateriasPorGradoEntity>();

    MateriasPorGradoEntity materiasPorGradoEntity = new MateriasPorGradoEntity(0,null);
    @Override
    public void registrarMateriasPorGrado(MateriasPorGradoEntity materiasPorGrado) {
        listaMateriasPorGrado.add(materiasPorGrado);
    }

    @Override
    public MateriasPorGradoEntity consultarMateriasPorGrado(String idMateria) {
        for (MateriasPorGradoEntity materiasPorGrado : listaMateriasPorGrado) {
            if (materiasPorGrado.getIdmateria()== idMateria) {
                return materiasPorGrado;
            }
        }
        return null;
     
    }
    
 
}
