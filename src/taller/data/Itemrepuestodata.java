/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller.data;

import java.sql.Connection;

/**
 *
 * @author canes
 */
public class Itemrepuestodata {
      private Connection com;

    public Itemrepuestodata(Connection com) {
        this.com = Conexion.buscarconexion();
}
}