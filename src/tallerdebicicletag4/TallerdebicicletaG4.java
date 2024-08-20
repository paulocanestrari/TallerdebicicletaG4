/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerdebicicletag4;

import java.time.LocalDate;
import taller.data.Bicicletadata;
import taller.data.ClienteData;
import taller.data.Conexion;
import taller.data.Itemrepuestodata;
import taller.data.Reparaciondata;
import taller.data.Repuestodata;
import taller.data.Serviciodata;
import taller.entidades.Bicicleta;
import taller.entidades.Cliente;
import taller.entidades.Itemrepuesto;
import taller.entidades.Reparacion;
import taller.entidades.Repuesto;
import taller.entidades.Servicio;

/**
 *
 * @author canes
 */
public class TallerdebicicletaG4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Conexion miConexion=new Conexion();
        miConexion.buscarconexion();
        //sdaadsdasasd
        
        //---------clase servicio------------
        Serviciodata serData = new Serviciodata();
        
        Servicio servicio = new Servicio("cambio de llanta ",1000f,true );
        // serData.crearServicio(servicio);
        
        
        //System.out.println(serData.buscarServicioPorcodigo(1));
        
        //Servicio s= serData.buscarServicioPorcodigo(2);
        //s.setDescripcion("cambio de cubiertas");
        //serData.actualizarServicio(s);
       
        //System.out.println(serData.listarServicios(true));
        
        
        //-------clase repuesto-------------
        
        Repuestodata resData= new Repuestodata();
        
        Repuesto rep = new Repuesto(123,"cadena",1400f,true);
        
        //resData.guardarRepuesto(rep);
        
        //System.out.println(resData.obtenerRepuesto(123));
        
        //Repuesto r = resData.obtenerRepuesto(123);
        //r.setDescripcion("cadena slp");
        
        //resData.actualizarRepuesto(r);
        
        //System.out.println(resData.obtenerRepuesto());
        
        // resData.borrarRepuesto(123);
       
       
       //-------clase cliente------------
        
       ClienteData clieData= new ClienteData();
    
       Cliente cliente1=new Cliente(4141,"Carlos","Ramirez","Barrio Eden",2554332,true);
       
       //clieData.guardarCliente(cliente1);
       
       //System.out.println(clieData.ObtenerclienteporDni(4141));
       
       //Cliente c = clieData.ObtenerclienteporDni(4141);
       //c.setTelefono(266485);
       //clieData.actualizarCliente(c);
       
       // System.out.println(clieData.listarClientes(true));
       
       
       
       //---------------clase bicicleta-----------
       
       Bicicletadata biciData= new Bicicletadata();
       
       Bicicleta bici=new Bicicleta(222,"bmx","verde", cliente1, true);
       
        //biciData.guardarBicicleta(bici);
       
        //System.out.println(biciData.obtenerBicleta(111));
        
        //Bicicleta b= biciData.obtenerBicleta(111);
        // b.setTipo("bmx street");
        //biciData.actualizarBicicleta(b);
        
        //System.out.println(biciData.obtenerBicletas(4141));
        
        //biciData.borrarBicicleta(111);
        
        
        //-------------clase reparacion-----------
        
        Reparaciondata repData = new Reparaciondata();
        Bicicleta bicicleta= biciData.obtenerBicleta(111);
        Servicio servicio1= serData.buscarServicioPorcodigo(1);
        
        Reparacion repa= new Reparacion(bicicleta,servicio1,LocalDate.of(2021, 12, 05),100f,1,true);
        
       // repData.crearReparacion(repa);
        
        
       // System.out.println(repData.buscarReparacionPorID(3));
       
       // Reparacion r= repData.buscarReparacionPorID(3);
       //r.setEtapa(2);
       //repData.actualizarReparacion(r);
       
       // System.out.println(repData.listarReparacionesporestado());
       //System.out.println(repData.listarReparacionesporbicicleta(bicicleta));
       //System.out.println(repData.buscarBicicletasPorFecha(LocalDate.of(2021, 12, 05)));
        
       // repData.borrarReparacion(3);
       
       
       //-----------clase Item repuesto------------
       Itemrepuestodata ird = new Itemrepuestodata();
       Reparacion repi= repData.buscarReparacionPorID(3);
       Repuesto repu=resData.obtenerRepuesto(123);
       
       Itemrepuesto item= new Itemrepuesto(repu,repi,2);
      // ird.guardarItemrepuesto(item);
      
      //  System.out.println(ird.buscarItemrepuestosPorID(1));
      
      //Itemrepuesto ri= ird.buscarItemrepuestosPorID(1);
      //ri.setCantidad(4);
      //ird.actualizarItemrepuesto(ri);
      
      //ird.borrarItemDetalle(1);
      
      
      
      
      
       
       
       
       
       
       
    }
    
    
    
    
    
    
    
    
}
