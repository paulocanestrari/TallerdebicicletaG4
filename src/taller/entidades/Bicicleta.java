/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller.entidades;

/**
 *
 * @author canes
 */
public class Bicicleta {
    private int num_serie;
    private String tipo;
    private String color;
    private Cliente dueño;
    private boolean estado;

    public Bicicleta() {
    }

    public Bicicleta(int num_serie, String tipo, String color, Cliente dueño, boolean estado) {
        this.num_serie = num_serie;
        this.tipo = tipo;
        this.color = color;
        this.dueño = dueño;
        this.estado = estado;
    }

    public int getNum_serie() {
        return num_serie;
    }

    public void setNum_serie(int num_serie) {
        this.num_serie = num_serie;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Cliente getDueño() {
        return dueño;
    }

    public void setDueño(Cliente dueño) {
        this.dueño = dueño;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Bicicleta{" + "num_serie=" + num_serie + ", tipo=" + tipo + '}';
    }
    
    
}
