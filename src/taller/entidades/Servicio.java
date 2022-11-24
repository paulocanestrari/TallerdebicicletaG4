/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller.entidades;

/**
hor canes
 */
public class Servicio {
    private int codigo;
    private String descripcion;
    private Float costo;
    private boolean estado;

    public Servicio() {
    }

    public Servicio(String descripcion, Float costo, boolean estado) {
        this.descripcion = descripcion;
        this.costo = costo;
        this.estado = estado;
    }

    public Servicio(int codigo, String descripcion, Float costo, boolean estado) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.costo = costo;
        this.estado = estado;
        
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Float getCosto() {
        return costo;
    }

    public void setCosto(Float costo) {
        this.costo = costo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Servicio{" + "descripcion=" + descripcion + ", costo=" + costo + '}';
    }
    
    
}
