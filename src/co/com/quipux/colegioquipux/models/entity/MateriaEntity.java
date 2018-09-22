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
public class MateriaEntity {
   
   private String idmateria;
   private String nombreMateria;
   private String descripcion;

    public MateriaEntity(String idmateria, String nombreMateria, String descripcion) {
        this.idmateria = idmateria;
        this.nombreMateria = nombreMateria;
        this.descripcion = descripcion;
    }

   
    public String getIdmateria() {
        return idmateria;
    }

    public void setIdmateria(String idmateria) {
        this.idmateria = idmateria;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
   
   
   
}
