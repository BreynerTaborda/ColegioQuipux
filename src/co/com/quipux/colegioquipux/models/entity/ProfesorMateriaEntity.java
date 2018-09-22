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
public class ProfesorMateriaEntity {
    
    private String idmateria;
    private int idprofesor;

    public ProfesorMateriaEntity(String idmateria, int idprofesor) {
        this.idmateria = idmateria;
        this.idprofesor = idprofesor;
    }
    
    

    public String getIdMateria() {
        return idmateria;
    }

    public void setIdMateria(String idmateria) {
        this.idmateria = idmateria;
    }

    public int getIdProfesor() {
        return idprofesor;
    }

    public void setIdProfesor(int idprofesor) {
        this.idprofesor = idprofesor;
    }
    
    
}
