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
        String sql = "INSERT INTO itemrespuesto (id_ItemRepuesto ,id_reparacion, num_serie, cantidad, estado) VALUES (?,?,?,?,1)";
        
        try {
            PreparedStatement ps = com.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setInt(2, item.getReparacion().getId_reparacion());
            ps.setInt(3, item.getRepuesto().getNum_serie());
            ps.setInt(4, item.getCantidad());
           
            
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
    public Itemrepuesto buscarItem_detallePorID(int id) {
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
                item.setRepuesto(repuData.obtenerRepuesto(rs.getInt("id_repuesto")));
                item.setCantidad(rs.getInt("cantidad"));
                               
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: en buscar item por id."+ex);
        }

        return item;
    }
    
    
    //actualizar itemDetalle
    public void actualizarItemrepuesto(Itemrepuesto item) { 
        String sqlQuery = "UPDATE item_detalle SET id_reparacion= ? ,id_repuesto = ? ,cantidad= ?  WHERE id_detalle = ?";
            if (buscarItem_detallePorID(item.getId_detalle()) != null) {
            try {
            PreparedStatement ps = com.prepareStatement(sqlQuery);
            ps.setInt(1, item.getReparacion().getId());
            ps.setInt(2, item.getRepuesto().getId());
            ps.setInt(3, item.getCantidad());
            ps.setDouble(4, item.getSuma_precios());
            ps.setDouble(5, item.getId_detalle());
           
           
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
            
        }
    //listar itemDetalle
    public ArrayList<Item_detalle> listarItem() {

        ArrayList<Item_detalle> listaItem = new ArrayList();
       
        String sql = "SELECT * FROM item_detalle WHERE borrado= false";

        try {
            PreparedStatement ps = conexionData.prepareStatement(sql);
            

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Item_detalle item = new Item_detalle();

                item.setId_detalle(rs.getInt("id_detalle"));
                item.setReparacion(repaData.buscarReparacionPorID(rs.getInt("id_reparacion")));
                item.setRepuesto(repuData.buscarRepuestoPorID(rs.getInt("id_repuesto")));
                item.setCantidad(rs.getInt("cantidad"));
                item.setSuma_precios(rs.getDouble("suma_precios"));
                item.setBorrado(rs.getBoolean("borrado"));
                
                listaItem.add(item);
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Se produjo un error al obtener la lista de item_detalle " + ex);
        }
        return listaItem;
    }
    
    //dar de baja itemDetalle
      public void borrarItemDetalle (int id){
        String sql="DELETE item_detalle SET borrado= true WHERE id_detalle = ?";
        try {
            PreparedStatement ps=conexionData.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            
            if (ps.executeUpdate() <= 0) {
                JOptionPane.showMessageDialog(null, "No se pudo borrar el item");
            } else  {   
                JOptionPane.showMessageDialog(null, "Se borro el item correctamente");
            }
         
            ps.close();
            
    }   catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de tipo exception " + ex);
        }
    }


}
    
    
    
    
    
}