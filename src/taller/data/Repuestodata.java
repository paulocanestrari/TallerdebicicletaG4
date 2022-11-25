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

    public Repuestodata(Connection com) {
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
    
    
   /* 
    public void actualizaAlumno(Alumno alumno){
        String sql="UPDATE alumno SET dni=?, apellido = ?, nombre = ?, fecha_nacimiento = ?, estado=? WHERE id_alumno= ?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setLong(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFecha_nacimiento()));
            ps.setBoolean(5, alumno.getEstado());
            ps.setInt(6, alumno.getId_alumno());
            
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Datos del alumno actualizados");
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ALumnoData Sentencia SQL erronea-actualizarAlumno");
        }
    }
}*/
}
