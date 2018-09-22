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
public class GradosAprobadosEntity {
 
  
  private int idestudiante;
  private int Grado;
  private String descripcion; //Se guarda si el estudiante aprobo o no los grados

    public GradosAprobadosEntity( int idestudiante, int Grado, String descripcion) {
        
        this.idestudiante = idestudiante;
        this.Grado = Grado;
        this.descripcion = descripcion;
    }

    public int getGrado() {
        return Grado;
    }

    public void setGrado(int Grado) {
        this.Grado = Grado;
    }
    public int getIdestudiante() {
        return idestudiante;
    }

    public void setIdestudiante(int idestudiante) {
        this.idestudiante = idestudiante;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
  
  
}
