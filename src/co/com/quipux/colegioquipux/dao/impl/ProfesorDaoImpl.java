/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.com.quipux.colegioquipux.dao.impl;

import co.com.quipux.colegioquipux.dao.ProfesorDAO;
import co.com.quipux.colegioquipux.models.entity.ProfesorEntity;
import java.util.ArrayList;

/**
 *
 * @author Verde
 */
public class ProfesorDaoImpl implements ProfesorDAO {
    
    public static ArrayList<ProfesorEntity> listaProfesor = new ArrayList<ProfesorEntity>();
    
    ProfesorEntity profesorEntity = new ProfesorEntity(0,null,null,null,null,0);
    @Override
    public void registrarProfesor(ProfesorEntity profesor) {
        listaProfesor.add(profesor);
    }
    
    @Override
    public ProfesorEntity consultarProfesor(int idprofesor) {
        
        for (ProfesorEntity profesor : listaProfesor) {
            if (profesor.getIdprofesor() == idprofesor) {
                return profesor;
            }
        }
        return null;
    }
    
}
