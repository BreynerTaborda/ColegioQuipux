/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.com.quipux.colegioquipux.models.entity;

/**
 *
 * @author Verde
 */
public class ProfesorEntity {
    private int idprofesor;
    private String nombre;
    private String apellidos;
    private String correo; 
    private int documento;
    private String idDocumento;

    public ProfesorEntity(int idprofesor, String nombre, String apellidos, String correo,String idDocumento, int documento) {
        this.idprofesor =idprofesor;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.documento = documento;
        this.idDocumento = idDocumento;
    }
    
    

    public int getIdprofesor() {
        return idprofesor;
    }

    public void setIdprofesor(int idprofesor) {
        this.idprofesor = idprofesor;
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

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getIdDocumento() {
        return idDocumento;
    }

    public void setIdDocumento(String idDocumento) {
        this.idDocumento = idDocumento;
    }
    
    
    
}
