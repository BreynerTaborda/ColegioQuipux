/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.dao.impl;


import co.com.quipux.colegioquipux.dao.ProfesorMateriaDAO;
import co.com.quipux.colegioquipux.models.entity.ProfesorMateriaEntity;
import java.util.ArrayList;

/**
 *
 * @author BREINER
 */
public class ProfesorMateriaDaoImpl implements ProfesorMateriaDAO {
  public ArrayList<ProfesorMateriaEntity> listaProfesorMateria = new ArrayList<ProfesorMateriaEntity>();

  ProfesorMateriaEntity profesorMateriaEntity = new ProfesorMateriaEntity(null, 0);
    @Override
    public void registrarProfesorMateria(ProfesorMateriaEntity profesorMateria) {
        listaProfesorMateria.add(profesorMateria);
    }

    @Override
    public ProfesorMateriaEntity consultarProfesorMateria(int ProfesorMateria) {
        for (ProfesorMateriaEntity profesorMateria : listaProfesorMateria) {
            if (profesorMateria.getIdProfesor()== ProfesorMateria) {
                return profesorMateria;
            }
        }
        return null;
    }
 
 
}
