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
public class Repuesto {
    private int num_serie;
    private String descripcion;
    private Float precio;
    private boolean estado;

    public Repuesto() {
    }

    public Repuesto(int num_serie, String descripcion, Float precio, boolean estado) {
        this.num_serie = num_serie;
        this.descripcion = descripcion;
        this.precio = precio;
        this.estado = estado;
    }

    public int getNum_serie() {
        return num_serie;
    }

    public void setNum_serie(int num_serie) {
        this.num_serie = num_serie;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Repuesto{" + "num_serie=" + num_serie + ", descripcion=" + descripcion + '}';
    }
    
    
}
