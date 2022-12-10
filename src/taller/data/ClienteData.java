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
import taller.entidades.Cliente;

/**
 *
 * @author canes
 */
public class ClienteData {
    private Connection com;

    public ClienteData() {
        this.com = Conexion.buscarconexion();}

   
public void guardarCliente(Cliente cliente) {

        String sql = "INSERT INTO cliente(dni, nombre, apellido, domicilio, telefono, estado) VALUES (?,?,?,?,?,?)";
        try {
            PreparedStatement ps = com.prepareStatement(sql);
             ps.setLong(1, cliente.getDni());
            ps.setString(2, cliente.getNombre());
            ps.setString(3, cliente.getApellido());
            ps.setString(4, cliente.getDomicilio());
            ps.setLong(5, cliente.getTelefono());
            ps.setBoolean(6, cliente.isEstado());

            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Cliente registrado");
            } else {
                JOptionPane.showMessageDialog(null, "Cliente no registrado");
            }
            
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falla en sistema para guardar cliente");
        }

    }
 public Cliente ObtenerclienteporDni(int dni) {
        Cliente cliente = null;
        String sql = "SELECT * FROM cliente WHERE dni = ?";
        try {
            PreparedStatement ps = com.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                cliente = new Cliente();
                cliente.setDni(rs.getInt("dni"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApellido(rs.getString("apellido"));
                cliente.setDomicilio(rs.getString("domicilio"));
                cliente.setTelefono(rs.getInt("telefono"));
                cliente.setEstado(rs.getBoolean("estado"));
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Un error a ocurrido");
        }
        return cliente;
    }
 public void actualizarCliente(Cliente cliente) {
        String sql= "UPDATE cliente SET nombre= ?, apellido= ?, domicilio= ?, telefono= ?, estado= ? WHERE dni=?";
        
            try {
                PreparedStatement ps = com.prepareStatement(sql);
                ps.setString(1, cliente.getNombre());
                ps.setString(2, cliente.getApellido());
                ps.setString(3, cliente.getDomicilio());
                ps.setInt(4, cliente.getTelefono());
                ps.setBoolean(5, cliente.isEstado());
                ps.setInt(6, cliente.getDni());

                if (ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "Cliente actualizado y dado de alta");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al actualizar cliente");
                }

                ps.close();

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error: al actualizar cliente" + ex);
            }
        }
     public void borrarCliente(int dni) {
        String sql = "UPDATE cliente SET estado= false WHERE dni= ?";
        try {
            PreparedStatement ps = com.prepareStatement(sql);
            ps.setInt(1, dni);
            ps.executeUpdate();

            if (ps.executeUpdate() <= 0) {
                JOptionPane.showMessageDialog(null, "No se pudo dar de baja al cliente");
            } else {
                JOptionPane.showMessageDialog(null, "Se dio de baja al cliente correctamente");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error no se pudo borrar cliente");
        }
    }

    public ArrayList<Cliente> listarClientes(boolean estado) {

        ArrayList<Cliente> lista = new ArrayList();

        String sql = "SELECT * FROM cliente WHERE estado = ?";

        try {
            PreparedStatement ps = com.prepareStatement(sql);

            ps.setBoolean(1, estado);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Cliente cl = new Cliente();

                cl.setDni(rs.getInt("dni"));
                cl.setNombre(rs.getString("nombre"));
                cl.setApellido(rs.getString("apellido"));
                cl.setDomicilio(rs.getString("domicilio"));
                cl.setTelefono(rs.getInt("telefono"));
                 
                cl.setEstado(rs.getBoolean("estado"));
             
                lista.add(cl);
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Se produjo un error");
        }
        return lista;
    }

}

    

  

