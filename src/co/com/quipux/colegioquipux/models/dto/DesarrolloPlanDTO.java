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
public class DesarrolloPlanDTO {
 private int idDesarrolloPlan;
 private int idplan;
 private String descripcion;

    public int getIdDesarrolloPlan() {
        return idDesarrolloPlan;
    }

    public void setIdDesarrolloPlan(int idDesarrolloPlan) {
        this.idDesarrolloPlan = idDesarrolloPlan;
    }

    public int getIdplan() {
        return idplan;
    }

    public void setIdplan(int idplan) {
        this.idplan = idplan;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
 
 
}
