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
public class PlanEntity {
 private String nombrePlan;
 private String fecha;
 private int idplan;
 private String idmateria;
 private int idgrupo;
 private String descripcion;

    public PlanEntity(int idplan, String nombrePlan, String fecha,  String idmateria, int idgrupo, String descripcion) {
        this.nombrePlan = nombrePlan;
        this.fecha = fecha;
        this.idplan = idplan;
        this.idmateria = idmateria;
        this.idgrupo = idgrupo;
        this.descripcion = descripcion;
    }

    public String getNombrePlan() {
        return nombrePlan;
    }

    public void setNombrePlan(String nombrePlan) {
        this.nombrePlan = nombrePlan;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
 
    

    public int getIdplan() {
        return idplan;
    }

    public void setIdplan(int idplan) {
        this.idplan = idplan;
    }

    public String getIdmateria() {
        return idmateria;
    }

    public void setIdmateria(String idmateria) {
        this.idmateria = idmateria;
    }

    public int getIdgrupo() {
        return idgrupo;
    }

    public void setIdgrupo(int idgrupo) {
        this.idgrupo = idgrupo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
 
 
}
