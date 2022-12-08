/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller.data;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import taller.entidades.Bicicleta;
import taller.entidades.Reparacion;

/**
 *
 * @author canes
 */
public class Reparaciondata {
   private Connection com;
   private Bicicletadata biData;
    private Serviciodata serData;
    private ClienteData cliData;

    public Reparaciondata() {
        this.com =Conexion.buscarconexion();
        this.biData = new Bicicletadata();
        this.serData = new Serviciodata();
        this.cliData = new ClienteData();
    }
    
    public void crearReparacion(Reparacion rep) {

        String sql = "INSERT INTO reparación(id_bicicleta, id_servicio, fechaEntrada, precio, etapa, estado) VALUES (?,?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = com.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, rep.getBicicleta().getNum_serie());
            ps.setInt(2, rep.getServicio().getCodigo());
            ps.setDate(3, Date.valueOf(rep.getFechaEntrada()));
            ps.setFloat(4, rep.getPrecio());
            ps.setInt(5, rep.getEtapa());
            ps.setBoolean(6, rep.isEstado());
             
            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Nueva reparación creada");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo crear la reparación");
            }
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                rep.setId_reparacion(rs.getInt(1));
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo obtener ID");
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: al crear la reparación. ");
            System.out.println(ex.getMessage());
        }

    }
    
    public Reparacion buscarReparacionPorID(int id) {
        Reparacion rep = null;
        String sql = "SELECT * FROM reparación WHERE id_reparacion = ? ";
        try {
            PreparedStatement ps = com.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                rep = new Reparacion();
                rep.setId_reparacion(rs.getInt("id_reparacion"));
                rep.setBicicleta(biData.obtenerBicleta(rs.getInt("id_bicicleta")));
                rep.setServicio(serData.buscarServicioPorcodigo(rs.getInt("id_servicio")));
                rep.setEstado(rs.getBoolean("estado"));
                rep.setPrecio(rs.getFloat("precio"));
                rep.setFechaEntrada(rs.getDate("fechaEntrada").toLocalDate());
                rep.setEtapa(rs.getInt("etapa"));

            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: al buscar una reparacion por id. ");
            System.out.println(ex.getMessage());
        }

        return rep;
    }
    
    public void actualizarReparacion(Reparacion r) {
        String sql = "UPDATE reparación SET id_bicicleta= ? ,id_servicio= ? ,estado= ?,precio= ?, fechaEntrada= ?,etapa= ? WHERE id_reparacion = ?";
          
            try {
            PreparedStatement ps = com.prepareStatement(sql);
            ps.setInt(1, r.getBicicleta().getNum_serie());
            ps.setInt(2, r.getServicio().getCodigo());
            ps.setBoolean(3, r.isEstado());
            ps.setFloat(4, r.getPrecio()); 
            ps.setDate(5, Date.valueOf(r.getFechaEntrada()));
            ps.setInt(6, r.getEtapa()); 
            ps.setInt(7, r.getId_reparacion()); 
            
            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Se actualizó la reparación.");
            } else  {
                JOptionPane.showMessageDialog(null, "No se pudo actualizar la reparación.");
            }
            
            ps.close();
            
        } catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "error en actualizar, verifique." );
                System.out.println(ex.getMessage());
        }  
            }
            
    
    
    public ArrayList<Reparacion> listarReparacionesporestado() {
        ArrayList<Reparacion> listaRep = new ArrayList();

        String sql = "SELECT * FROM reparación WHERE estado= 1";

        try {
            PreparedStatement ps = com.prepareStatement(sql);           
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Reparacion rep = new Reparacion();

                rep.setId_reparacion(rs.getInt("id_reparacion"));
                rep.setBicicleta(biData.obtenerBicleta(rs.getInt("id_bicicleta")));
                rep.setServicio(serData.buscarServicioPorcodigo(rs.getInt("id_servicio")));
                rep.setEstado(rs.getBoolean("estado"));
                rep.setPrecio(rs.getFloat("precio"));
                rep.setFechaEntrada(rs.getDate("fechaEntrada").toLocalDate());
                rep.setEtapa(rs.getInt("etapa"));

                listaRep.add(rep);
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: al obtener la lista de reparaciónes "+ex);
        }
        return listaRep;
    }
    public ArrayList<Reparacion> listarReparacionesporbicicleta(Bicicleta bici) {
        ArrayList<Reparacion> listaRep = new ArrayList();

        String sql = "SELECT * FROM reparación WHERE id_bicicleta= ?";

        try {
            PreparedStatement ps = com.prepareStatement(sql);  
            ps.setInt(1, bici.getNum_serie());
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Reparacion rep = new Reparacion();

                rep.setId_reparacion(rs.getInt("id_reparacion"));
                rep.setBicicleta(biData.obtenerBicleta(rs.getInt("id_bicicleta")));
                rep.setServicio(serData.buscarServicioPorcodigo(rs.getInt("id_servicio")));
                rep.setEstado(rs.getBoolean("estado"));
                rep.setPrecio(rs.getFloat("precio"));
                rep.setFechaEntrada(rs.getDate("fechaEntrada").toLocalDate());
                rep.setEtapa(rs.getInt("etapa"));

                listaRep.add(rep);
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: al obtener la lista de reparaciónes "+ex);
        }
        return listaRep;
    }
    
    public void borrarReparacion (int id){
        String sql="UPDATE reparación SET estado=0 WHERE id_reparacion = ?";
        try {
            PreparedStatement ps=com.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            
            if (ps.executeUpdate() <= 0) {
                JOptionPane.showMessageDialog(null, "No se borro la reparación");
            } else  {   
                JOptionPane.showMessageDialog(null, "Se borro reparación correctamente");
            }
                ps.close();
            
    }   catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de al borrar!");
        }
    }
        
    
    public ArrayList<Bicicleta> buscarBicicletasPorFecha(LocalDate fecha) {

        ArrayList<Bicicleta> bicicletasPorFecha = new ArrayList();

        String sql = "SELECT id_bicicleta FROM `reparación` WHERE fechaEntrada = ?";

        try {
            PreparedStatement ps = com.prepareStatement(sql);
            
            ps.setDate(1, Date.valueOf(fecha)); 

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Bicicleta bici = biData.obtenerBicleta(rs.getInt("id_bicicleta"));
                
                bicicletasPorFecha.add(bici);
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error; al obtener la lista de bicicletas por fecha "+ex);
        }
        return bicicletasPorFecha;
    }}
    
    

