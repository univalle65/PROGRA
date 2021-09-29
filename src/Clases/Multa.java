/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import Clases.MotivoMulta;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

     

/**
 *
 */
public class Multa {
    // atributos propios;
    private int valor;
    
    //relacion 1 a 1 con vehiculo;
    
    private Vehiculo carro;
    
    //relacion de 1 a 1 con persona o conductor
    private Persona Conductor;
    
    //relacion de 1 a 1  con agente de transito;
    
    private Agente AgenteDeTransito;
    
    
    //fecha impuesta, con relacion  de 1 a 1
    
    private localDate Fecha;
    
    //relacion 1 a muchos con Motivo multa;
    
    private List<MotivoMulta> ListaMultas;

    public Multa(int valor, Vehiculo carro, Persona Conductor, Agente AgenteDeTransito, localDate Fecha){
        this.valor = valor;
        this.carro = carro;
        this.Conductor = Conductor;
        this.AgenteDeTransito = AgenteDeTransito;
        this.Fecha = Fecha;
      
        //lista de multas;
        this.ListaMultas =new LinkedList<>();
       
    }

    public int getValor() {
        return valor;
    }

    public Vehiculo getCarro() {
        return carro;
    }

    public Persona getConductor() {
        return Conductor;
    }

    public Agente getAgenteDeTransito() {
        return AgenteDeTransito;
    }

    public localDate getFecha() {
        return Fecha;
    }

                public void setValor(int valor) {
                    this.valor = valor;
                }

    public void setCarro(Vehiculo carro) {
        this.carro = carro;
    }
    
    
    public void setConductor(Persona Conductor) {
          this.Conductor = Conductor;
      }
    
    
    public void setAgenteDeTransito(Agente AgenteDeTransito) {
        this.AgenteDeTransito = AgenteDeTransito;
    }

    public void setFecha(localDate Fecha) {
        this.Fecha = Fecha;
    }

  
    
    
    
    
    
    
}
