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
public class EstudianteEntity {
    private int idetudiante;
    private String nombre;
    private String apellidos;
    private String correo;
    private String documento;
    private String tipoDocumento;
    private String sexo;
    private String fechaNacimineto;
    private String ciudadResidencia;
    private String direccionResidencial;
    private int telefonoResidencial;
    private int telefonoCelular;

    public EstudianteEntity(int idetudiante, String nombre, String apellidos, String correo, String documento, String tipoDocumento, String sexo, String fechaNacimineto, String ciudadResidencia, String direccionResidencial, int telefonoResidencial, int telefonoCelular) {
        this.idetudiante = idetudiante;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.documento = documento;
        this.tipoDocumento = tipoDocumento;
        this.sexo = sexo;
        this.fechaNacimineto = fechaNacimineto;
        this.ciudadResidencia = ciudadResidencia;
        this.direccionResidencial = direccionResidencial;
        this.telefonoResidencial = telefonoResidencial;
        this.telefonoCelular = telefonoCelular;
    }

    
    public int getIdetudiante() {
        return idetudiante;
    }

    public void setIdetudiante(int idetudiante) {
        this.idetudiante = idetudiante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getFechaNacimineto() {
        return fechaNacimineto;
    }

    public void setFechaNacimineto(String fechaNacimineto) {
        this.fechaNacimineto = fechaNacimineto;
    }

    public String getCiudadResidencia() {
        return ciudadResidencia;
    }

    public void setCiudadResidencia(String ciudadResidencia) {
        this.ciudadResidencia = ciudadResidencia;
    }

    public String getDireccionResidencial() {
        return direccionResidencial;
    }

    public void setDireccionResidencial(String direccionResidencial) {
        this.direccionResidencial = direccionResidencial;
    }

    public int getTelefonoResidencial() {
        return telefonoResidencial;
    }

    public void setTelefonoResidencial(int telefonoResidencial) {
        this.telefonoResidencial = telefonoResidencial;
    }

    public int getTelefonoCelular() {
        return telefonoCelular;
    }

    public void setTelefonoCelular(int telefonoCelular) {
        this.telefonoCelular = telefonoCelular;
    }
    
    
}
