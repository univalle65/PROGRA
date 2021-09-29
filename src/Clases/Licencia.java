/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.time.LocalDate;
/**
 *
 * @author thebest
 */
public class Licencia {
    
   public enum  CATEGORIA{A1,A2,A3,B1,B2};
    
    //no tiene stributo propios;
    //relaciones de asociacion;
    
    // de 1 a 1 con persona;
    private Persona Conductor;
    
    // relacion de 1 a con fecha;
    private LocalDate fecha;

    public Licencia(Persona Conductor, LocalDate fecha) {
        this.Conductor = Conductor;
        this.fecha = fecha;
    }

    public Licencia() {
    }

    public Persona getConductor() {
        return Conductor;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setConductor(Persona Conductor) {
        this.Conductor = Conductor;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    
    
    
    
}
