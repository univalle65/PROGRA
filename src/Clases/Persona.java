/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author thebest
 */
public class Persona {
        //atributos propios
        private long identificacion;
        private String nombre;
        private String Apellido;
      
        
        //constructor

    public Persona(long identificacion, String nombre, String Apellido) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.Apellido = Apellido;
    }

    public Persona() {
    }

    public long getIdentificacion() {
        return identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setIdentificacion(long identificacion) {
        this.identificacion = identificacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }
    
    
   
    
    
}
