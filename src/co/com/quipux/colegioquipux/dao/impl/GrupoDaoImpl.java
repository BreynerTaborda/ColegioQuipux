/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.dao.impl;

import co.com.quipux.colegioquipux.dao.GrupoDAO;
import co.com.quipux.colegioquipux.models.entity.GrupoEntity;
import java.util.ArrayList;

/**
 *
 * @author BREINER
 */
public class GrupoDaoImpl implements GrupoDAO {

    ArrayList<GrupoEntity> listaGrupo = new ArrayList<GrupoEntity>();

    GrupoEntity grupoEntity = new GrupoEntity(0, 0, null, 0, 0, null);

    @Override
    public void registrarGrupo(GrupoEntity grupo) {
        listaGrupo.add(grupo);
    }

    @Override
    public GrupoEntity consultarGrupo(int idGrupo) {
        for (GrupoEntity grupo : listaGrupo) {
            if (grupo.getIdgrupo() == idGrupo) {
                return grupo;
            }
        }
        return null;
    }

}
