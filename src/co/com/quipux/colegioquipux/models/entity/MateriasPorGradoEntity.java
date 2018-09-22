/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.models.entity;

/**
 *
 * @author BREINER
 */
public class MateriasPorGradoEntity {
  private int idgrado;
  private String idmateria;

    public MateriasPorGradoEntity(int idgrado, String idmateria) {
        this.idgrado = idgrado;
        this.idmateria = idmateria;
    }

   
    public int getIdgrado() {
        return idgrado;
    }

    public void setIdgrado(int idgrado) {
        this.idgrado = idgrado;
    }

    public String getIdmateria() {
        return idmateria;
    }

    public void setIdmateria(String idmateria) {
        this.idmateria = idmateria;
    }
  
  
}
