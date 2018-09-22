/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.dao.impl;

import co.com.quipux.colegioquipux.dao.DesarrolloPlanDAO;
import co.com.quipux.colegioquipux.models.entity.DesarrolloPlanEntity;
import java.util.ArrayList;

/**
 *
 * @author BREINER
 */
public class DesarrolloPlanDaoImpl implements DesarrolloPlanDAO {
 ArrayList<DesarrolloPlanEntity> listaDesarrolloPlan = new ArrayList<DesarrolloPlanEntity>();

 DesarrolloPlanEntity profesorEntity = new DesarrolloPlanEntity(0,0,null);
    @Override
    public void registrarDesarrolloPlan(DesarrolloPlanEntity desarrolloPlan) {
       listaDesarrolloPlan.add(desarrolloPlan);
    }

    @Override
    public DesarrolloPlanEntity consultarDesarrolloPlan(int idDesarrolloPlan) {
       for (DesarrolloPlanEntity desarrolloPlan : listaDesarrolloPlan) {
            if (desarrolloPlan.getIdDesarrolloPlan()== idDesarrolloPlan) {
                return desarrolloPlan;
            }
        }
        return null;
    }
 
}
