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
import java.util.ArrayList;
import javax.swing.JOptionPane;
import taller.entidades.Repuesto;

/**
 *
 * @author canes
 */
public class Repuestodata {
    private Connection com;

    public Repuestodata() {
        this.com =Conexion.buscarconexion();
}
     public void guardarRepuesto(Repuesto repuesto){
        String sql="INSERT INTO repuesto (num_serie, descripcion, precio, estado) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement ps=com.prepareStatement(sql);
            ps.setInt(1, repuesto.getNum_serie());
            ps.setString(2,repuesto.getDescripcion());
            ps.setFloat(3, repuesto.getPrecio());
            ps.setBoolean(4, repuesto.isEstado());
            ps.executeUpdate();
                                   
                JOptionPane.showMessageDialog(null, "Repuesto agregado exitosamente!");           
                     
            ps.close();           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "repuesto no se pudo agregar!");
                       
        }
    }
    
    public ArrayList<Repuesto> obtenerRepuesto(){
        
        ArrayList<Repuesto> listaRepuesto=new ArrayList();
        
        String sql="SELECT * FROM repuesto WHERE estado = 1";
        
        try {
            PreparedStatement ps=com.prepareStatement(sql);
            
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
            
                Repuesto a=new Repuesto();
                
                a.setNum_serie(rs.getInt("num_serie"));
                a.setDescripcion(rs.getString("descripcion"));
                a.setPrecio(rs.getFloat("precio"));
                a.setEstado(rs.getBoolean("estado"));
                
                listaRepuesto.add(a);
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener Repuesto");
        }
    return listaRepuesto;
    }
    
    
    public Repuesto obtenerRepuesto(int num_serie) {
        String sql= "SELECT * FROM repuesto WHERE estado = 1 AND num_serie = ?";
        Repuesto R = new Repuesto();
        try {
            PreparedStatement ps=com.prepareStatement(sql);
            ps.setInt(1, num_serie);
            ResultSet rs=ps.executeQuery();
            
            if(rs.next()){              
                R.setNum_serie(rs.getInt("num_serie"));
                R.setDescripcion(rs.getString("descripcion"));
                R.setPrecio(rs.getFloat("precio"));
                R.setEstado(rs.getBoolean("estado"));
                
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "RepuestoData Sentencia SQL erronea-obtenerRepuesto por num_serie");
        }
        return R;
         
    }
    
    
    public void borrarRepuesto (int num_serie){
        String sql="UPDATE `repuesto` SET estado =0 WHERE num_serie=?";
        try {
            PreparedStatement ps=com.prepareStatement(sql);
            ps.setInt(1, num_serie);
            ps.executeUpdate();//
            
            JOptionPane.showMessageDialog(null, "Se elimino el repuesto correctamente");
            
            ps.close();
            
    }   catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "RepuestoData Sentencia SQL erronea-borrarrepuesto");
        }
    }
public void actualizarRepuesto(Repuesto r) {
        String sql = "UPDATE repuesto SET descripcion= ? ,precio= ? ,estado= ? WHERE num_serie = ?";
        
            try {
                PreparedStatement ps = com.prepareStatement(sql);
               
                ps.setString(1, r.getDescripcion());
                ps.setFloat(2, r.getPrecio());
                ps.setBoolean(3, r.isEstado());
                ps.setInt(4, r.getNum_serie());

                if (ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "Se pudo actualizar el repuesto.");
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo actualizar el repuesto.");
                }

                ps.close();

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Se produjo un error. en actualizar repuesto" + ex);
            }
        }

    }

     