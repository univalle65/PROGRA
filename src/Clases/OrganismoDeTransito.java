/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author thebest
 */
public class OrganismoDeTransito {
    
    // no tiene atributos propios
    
    // relaciones de asociacion
    
    // de 1 a varios con motivoMulta
    
    private List<MotivoMulta> ListaMotivosDeMulta;
    
    //relacion de 1 a varios con agente;
    
    private List<Agente> ListaDeAgentes;
    
    // relacion se asociacion de 1 a varios con Vehiculo;
    
    private List<Vehiculo> ListadoVehiculos;
    
    //relacion de 1 a varios con Multa;
    
    
    private List<Multa> ListadoMultas;
    
    // relacion de 1 a varios con Licencia;
    
    private List<Licencia> ListadoLicencias;

    
    // constructor
    public OrganismoDeTransito() {
       
        this.ListaMotivosDeMulta=new LinkedList<>();
        this.ListaDeAgentes = new LinkedList<>();
        this.ListadoVehiculos = new LinkedList<>();
        this.ListadoMultas = new LinkedList<>();
        this.ListadoLicencias = new LinkedList<>();
    }
    
    
    
    
    
}
