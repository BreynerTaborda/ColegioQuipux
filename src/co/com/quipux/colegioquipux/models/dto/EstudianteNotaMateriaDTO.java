/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.models.dto;

/**
 *
 * @author BREINER
 */
public class EstudianteNotaMateriaDTO {
    
  private int idestudiante;
  private String idmateria; 
  private int idnota;
  private int idDesarrolloPlan;

    public int getIdestudiante() {
        return idestudiante;
    }

    public void setIdestudiante(int idestudiante) {
        this.idestudiante = idestudiante;
    }

    public String getIdmateria() {
        return idmateria;
    }

    public void setIdmateria(String idmateria) {
        this.idmateria = idmateria;
    }

    public int getIdnota() {
        return idnota;
    }

    public void setIdnota(int idnota) {
        this.idnota = idnota;
    }

    public int getIdDesarrolloPlan() {
        return idDesarrolloPlan;
    }

    public void setIdDesarrolloPlan(int idDesarrolloPlan) {
        this.idDesarrolloPlan = idDesarrolloPlan;
    }
  
  
}
