/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.dao.impl;

import co.com.quipux.colegioquipux.dao.NotaDAO;
import co.com.quipux.colegioquipux.models.entity.NotaEntity;
import java.util.ArrayList;

/**
 *
 * @author BREINER
 */
public class NotaDaoImpl implements NotaDAO {
 ArrayList<NotaEntity> listaNota = new ArrayList<NotaEntity>();

  NotaEntity notaEntity= new NotaEntity(0, 0, 0, null);
    @Override
    public void registrarNota(NotaEntity nota) {
        listaNota.add(nota);
    }

    @Override
    public NotaEntity consultarNota(int idNota) {
        for (NotaEntity nota : listaNota) {
            if (nota.getIdnota()== idNota) {
                return nota;
            }
        }
        return null;
    }
 
 
}
