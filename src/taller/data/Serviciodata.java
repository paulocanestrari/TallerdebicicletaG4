/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import taller.entidades.Servicio;

/**
 *
 * @author canes
 */
public class Serviciodata {
    private Connection com;

    public Serviciodata(Connection com) {
        this.com =Conexion.buscarconexion();
        
        
}
    public void crearServicio(Servicio servicio) {

        String sql = "INSERT INTO servicio(codigo, descripcion, costo, estado) VALUES (?, ?, ?,1)";
        try {
            PreparedStatement ps = com.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
          
            ps.setString(2, servicio.getDescripcion());
            ps.setDouble(3, servicio.getCosto());

            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Nuevo servicio creado");
            } else {
                JOptionPane.showMessageDialog(null, "No se creo el servicio");
            }
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                servicio.setCodigo(rs.getInt(1));
            } else {
                JOptionPane.showMessageDialog(null, "Error data al crear servicio");
            }

            ps.close();

        } catch (SQLIntegrityConstraintViolationException ex) {
            JOptionPane.showMessageDialog(null, "El codigo ingresado ya se esta usando. " );
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Se produjo un error tratando de crear el servicio. " );
        }

    }

    public Servicio buscarServicioPorcodigo(int codigo) {
        Servicio s=null;
        String sql = "SELECT * FROM servicio WHERE codigo = ?";
        try {
            PreparedStatement ps = com.prepareStatement(sql);
            ps.setInt(1,codigo);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                s = new Servicio();
               
                s.setCodigo(rs.getInt("codigo"));
                s.setDescripcion(rs.getString("descripcion"));
                s.setCosto(rs.getFloat("costo"));
                s.setEstado(rs.getBoolean("estado"));

            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Se produjo un error. en buscar un servicio por id. " + ex);
        }
        return s;
    }

    public void actualizarServicio(Servicio s) {
        String sql = "UPDATE servicio SET descripcion= ? ,costo= ? WHERE codigo = ?";
        
            try {
                PreparedStatement ps = com.prepareStatement(sql);
                ps.setString(1, s.getDescripcion());
                ps.setFloat(2, s.getCosto());
                ps.setInt(3, s.getCodigo());
                if (ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "Se pudo actualizar el servicio.");
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo actualizar el servicio.");
                }

                ps.close();

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Se produjo un error");
            }
        }

    

    public ArrayList<Servicio> listarServicios(boolean estado) {

        ArrayList<Servicio> lista = new ArrayList();

        String sql = "SELECT * FROM servicio WHERE borrado= ?";

        try {
            PreparedStatement ps = com.prepareStatement(sql);

            ps.setBoolean(1, estado); 
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Servicio s = new Servicio();

             
                s.setCosto(rs.getFloat("costo"));
                s.setDescripcion(rs.getString("descripcion"));
                s.setCodigo(rs.getInt("codigo"));
                s.setEstado(rs.getBoolean("estado"));

                lista.add(s);
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Se produjo un error al obtener la lista de servicios ");
        }
        return lista;
    }

    
}

