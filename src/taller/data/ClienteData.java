/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller.data;

import java.sql.Connection;
import taller.entidades.Cliente;

/**
 *
 * @author canes
 */
public class ClienteData {
    private Connection com;

    public ClienteData(Connection com) {
        this.com = Conexion.buscarconexion();}

    public ClienteData() {
    }

    public Cliente ObtenerclienteporDni(int dni) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }

