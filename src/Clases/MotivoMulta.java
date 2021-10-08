/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 
 * @author thebest
 */
public class MotivoMulta {
    private short codigo;
    private String Descripcion;
    private int valor;

    public MotivoMulta(short codigo, String Descripcion, int valor)throws Exception {

     
        this.codigo = codigo;
        this.Descripcion = Descripcion;
        this.valor = valor;
    }

    
    public MotivoMulta() {
    }

    public short getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public int getValor() {
        return valor;
    }

    public void setCodigo(short codigo) {
        this.codigo = codigo;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    
    
    
    
    
}
