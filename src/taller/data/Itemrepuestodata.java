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
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import taller.entidades.Itemrepuesto;

/**
 *
 * @author canes
 */
public class Itemrepuestodata {
      private Connection com;
      private Reparaciondata repaData;
       private Repuestodata repuData;
    
    public Itemrepuestodata(){
   this.com = Conexion.buscarconexion();
    this.repuData= new Repuestodata();
    this.repaData= new Reparaciondata();
}

public void guardarItemrepuesto (Itemrepuesto item){
        String sql = "INSERT INTO itemrespuesto (id_reparacion, num_serie, cantidad) VALUES (?,?,?)";
        
        try {
            PreparedStatement ps = com.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setInt(1, item.getReparacion().getId_reparacion());
            ps.setInt(2, item.getRepuesto().getNum_serie());
            ps.setInt(3, item.getCantidad());
           
            
            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null,"Item agregado");
            } else {
                JOptionPane.showMessageDialog(null, "Item no agregada");
            }
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                item.setId_itemrepuesto(rs.getInt(1));
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo obtener ID del item");
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: en agregar item");
        }
        
    }
    //buscar itemDetalle
    public Itemrepuesto buscarItemrepuestosPorID(int id) {
        Itemrepuesto item = null;
        String sql = "SELECT * FROM itemrespuesto WHERE Id_ItemRepuesto= ?";
        try {
            PreparedStatement ps = com.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                item = new Itemrepuesto();
                item.setId_itemrepuesto(rs.getInt("id_ItemRepuesto"));
                item.setReparacion(repaData.buscarReparacionPorID(rs.getInt("id_reparacion")));
                item.setRepuesto(repuData.obtenerRepuesto(rs.getInt("num_serie")));
                item.setCantidad(rs.getInt("cantidad"));
                               
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: en buscar item por id.");
            System.out.println(ex.getMessage());
        }

        return item;
    }
    
    
    //actualizar itemDetalle
    public void actualizarItemrepuesto(Itemrepuesto item) { 
        String sql = "UPDATE itemrespuesto SET id_reparacion= ? ,num_serie = ? ,cantidad= ?  WHERE id_ItemRepuesto = ?";

            try {
            PreparedStatement ps = com.prepareStatement(sql);
            ps.setInt(1, item.getReparacion().getId_reparacion());
            ps.setInt(2, item.getRepuesto().getNum_serie());
            ps.setInt(3, item.getCantidad());
            ps.setDouble(4, item.getId_itemrepuesto());
           
           
            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Se pudo actualizar el item.");
            } else  {
                JOptionPane.showMessageDialog(null, "No se pudo actualizar el item.");
            }
            
            ps.close();
            
        } catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Se produjo un error. en actualizar item" + ex);
        }  
            }
            
        
    //listar itemDetalle
    public ArrayList<Itemrepuesto> listarItem() {

        ArrayList<Itemrepuesto> listaItem = new ArrayList();
       
        String sql = "SELECT * FROM itemrespuesto WHERE estado= 1";

        try {
            PreparedStatement ps = com.prepareStatement(sql);
            

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Itemrepuesto item = new Itemrepuesto();

                item.setId_itemrepuesto(rs.getInt("id_ItemRespuesto"));
                item.setReparacion(repaData.buscarReparacionPorID(rs.getInt("id_reparacion")));
                item.setRepuesto(repuData.obtenerRepuesto(rs.getInt("num_serie")));
                item.setCantidad(rs.getInt("cantidad"));
                             
                listaItem.add(item);
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Se produjo un error al obtener la lista de item_detalle " + ex);
        }
        return listaItem;
    }
    
    
      public void borrarItemDetalle (int id){
        String sql="DELETE FROM itemrespuesto WHERE id_ItemRepuesto = ?";
        try {
            PreparedStatement ps=com.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            
            if (ps.executeUpdate() <= 0) {
                JOptionPane.showMessageDialog(null, "No se pudo borrar el item");
            } else  {   
                JOptionPane.showMessageDialog(null, "Se borro el item correctamente");
            }
         
            ps.close();
            
    }   catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error con el borrado, verifique consulta sql.");
        }
    }


}
    
    
    
    
    
