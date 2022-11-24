/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller.entidades;

import java.time.LocalDate;

/**
 *
 * @author canes
 */
public class Reparacion {
    
    private int id_reparacion;
    private Bicicleta bicicleta;
    private Servicio servicio;
    private LocalDate fechaEntrada;
    private Float precio;
    private int etapa;
    private boolean estado;

    public Reparacion() {
    }

    public Reparacion(Bicicleta bicicleta, Servicio servicio, LocalDate fechaEntrada, Float precio, int etapa, boolean estado) {
        this.bicicleta = bicicleta;
        this.servicio = servicio;
        this.fechaEntrada = fechaEntrada;
        this.precio = precio;
        this.etapa = etapa;
        this.estado = estado;
    }

    public Reparacion(int id_reparacion, Bicicleta bicicleta, Servicio servicio, LocalDate fechaEntrada, Float precio, int etapa, boolean estado) {
        this.id_reparacion = id_reparacion;
        this.bicicleta = bicicleta;
        this.servicio = servicio;
        this.fechaEntrada = fechaEntrada;
        this.precio = precio;
        this.etapa = etapa;
        this.estado = estado;
    }

    public int getId_reparacion() {
        return id_reparacion;
    }

    public void setId_reparacion(int id_reparacion) {
        this.id_reparacion = id_reparacion;
    }

    public Bicicleta getBicicleta() {
        return bicicleta;
    }

    public void setBicicleta(Bicicleta bicicleta) {
        this.bicicleta = bicicleta;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(LocalDate fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public int getEtapa() {
        return etapa;
    }

    public void setEtapa(int etapa) {
        this.etapa = etapa;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Reparacion{" + "id_reparacion=" + id_reparacion + ", bicicleta=" + bicicleta + ", servicio=" + servicio + ", fechaEntrada=" + fechaEntrada + ", precio=" + precio + ", etapa=" + etapa + ", estado=" + estado + '}';
    }
    
    
    
    
    
    
}
