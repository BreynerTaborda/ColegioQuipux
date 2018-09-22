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
public class GrupoEntity {
 private int idgrupo;
 private String nombreGrupo;
 private int idgrado;
 private int idestudiante;
 private int idprofesor;
 private String jornada;

    public GrupoEntity(int idgrado, int idgrupo, String nombreGrupo, int idestudiante, int idprofesor, String jornada) {
        this.idgrupo = idgrupo;
        this.nombreGrupo = nombreGrupo;
        this.idgrado = idgrado;
        this.idestudiante = idestudiante;
        this.idprofesor = idprofesor;
        this.jornada = jornada;
    }

  
    public int getIdgrupo() {
        return idgrupo;
    }

    public void setIdgrupo(int idgrupo) {
        this.idgrupo = idgrupo;
    }

    public int getIdgrado() {
        return idgrado;
    }

    public void setIdgrado(int idgrado) {
        this.idgrado = idgrado;
    }

    public int getIdestudiante() {
        return idestudiante;
    }

    public void setIdestudiante(int idestudiante) {
        this.idestudiante = idestudiante;
    }

    public int getIdprofesor() {
        return idprofesor;
    }

    public void setIdprofesor(int idprofesor) {
        this.idprofesor = idprofesor;
    }

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }

    public String getNombreGrupo() {
        return nombreGrupo;
    }

    public void setNombreGrupo(String nombreGrupo) {
        this.nombreGrupo = nombreGrupo;
    }
    
    
    
 
}
