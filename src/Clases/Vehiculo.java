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
public class Vehiculo {
    
    private String placa;
    private  short modelo;
    private String color;
    private String marca;
    
    

    public Vehiculo(String placa, short modelo, String color, String marca) {
        this.placa = placa;
        this.modelo = modelo;
        this.color = color;
        this.marca = marca;
    }
    
    
    

    public Vehiculo() {
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getColor() {
        return color;
    }

    public short getModelo() {
        return modelo;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    
    public void setModelo(short modelo) {
        this.modelo = modelo;
    }
   
    public void setColor(String color) {
        this.color = color;
    }

     public void setMarca(String marca) {
        this.marca = marca;
    }

    
    
    
    
    
    
    
}
