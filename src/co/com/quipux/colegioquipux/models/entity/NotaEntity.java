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
public class NotaEntity {
 private int idnota;
 private double nota;
 private int periodo;
 private String nombreMateria;

    public NotaEntity(int idnota, double nota, int periodo, String nombreMateria) {
        this.idnota = idnota;
        this.nota = nota;
        this.periodo = periodo;
        this.nombreMateria = nombreMateria;
    }
 
 
    public int getIdnota() {
        return idnota;
    }

    public void setIdnota(int idnota) {
        this.idnota = idnota;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }
    
    
 
 
 
}
