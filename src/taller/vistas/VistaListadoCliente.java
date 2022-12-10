/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package taller.vistas;



import Imagenes.FondoPanel;
import java.sql.Connection;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import taller.data.ClienteData;
import taller.entidades.Cliente;

public class VistaListadoCliente extends javax.swing.JInternalFrame {

  
    ClienteData cli = new ClienteData();
    private DefaultTableModel modeloDeTabla;
    ArrayList<Cliente> listaClientes = new ArrayList();

    public VistaListadoCliente() {
        initComponents();
        modeloDeTabla = new DefaultTableModel() {
        };
        armarTabla();
    }

//    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new FondoPanel();
        jRBalta = new javax.swing.JRadioButton();
        JRBbaja = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTListadoClientes = new javax.swing.JTable();
        JBAlta = new javax.swing.JButton();
        JBBaja = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Clientes", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 0, 24))); // NOI18N

        buttonGroup1.add(jRBalta);
        jRBalta.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jRBalta.setText("Alta");
        jRBalta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBaltaActionPerformed(evt);
            }
        });

        buttonGroup1.add(JRBbaja);
        JRBbaja.setText("Baja");
        JRBbaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRBbajaActionPerformed(evt);
            }
        });

        JTListadoClientes.setAutoCreateRowSorter(true);
        JTListadoClientes.setBackground(new java.awt.Color(242, 242, 242));
        JTListadoClientes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        JTListadoClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        JTListadoClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JTListadoClientes.setName(""); // NOI18N
        JTListadoClientes.setRowHeight(25);
        jScrollPane1.setViewportView(JTListadoClientes);

        JBAlta.setText("Dar alta");
        JBAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAltaActionPerformed(evt);
            }
        });

        JBBaja.setText("Dar baja");
        JBBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBBajaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(238, 238, 238)
                .addComponent(jRBalta)
                .addGap(107, 107, 107)
                .addComponent(JRBbaja)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(JBAlta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 199, Short.MAX_VALUE)
                .addComponent(JBBaja)
                .addGap(163, 163, 163))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRBalta)
                    .addComponent(JRBbaja))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBAlta)
                    .addComponent(JBBaja))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRBaltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBaltaActionPerformed
        JBAlta.setEnabled(false);
        JBBaja.setEnabled(true);
        listadoClientesAlta();
    }//GEN-LAST:event_jRBaltaActionPerformed

    private void JRBbajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRBbajaActionPerformed
        JBAlta.setEnabled(true);
        JBBaja.setEnabled(false);
        listadoClientesBaja();
    }//GEN-LAST:event_JRBbajaActionPerformed

    private void JBBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBBajaActionPerformed
        int filaSelecionada = JTListadoClientes.getSelectedRow();
        Cliente selec = new Cliente();
        if (filaSelecionada != -1) {
            selec.setDni((Integer) JTListadoClientes.getValueAt(filaSelecionada, 0));
            cli.borrarCliente(selec.getDni());
            System.out.println(selec.getDni());
            listadoClientesAlta();
        }
    }//GEN-LAST:event_JBBajaActionPerformed

    private void JBAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAltaActionPerformed
        int filaSelecionada = JTListadoClientes.getSelectedRow();
        Cliente Selec = new Cliente();
        if (filaSelecionada != -1) {
            Selec.setDni((Integer)JTListadoClientes.getValueAt(filaSelecionada, 0));
            Selec.setNombre((String.valueOf(JTListadoClientes.getValueAt(filaSelecionada, 1))));
            Selec.setApellido((String.valueOf(JTListadoClientes.getValueAt(filaSelecionada, 2))));
            Selec.setDomicilio((String.valueOf(JTListadoClientes.getValueAt(filaSelecionada,3))));
            Selec.setTelefono((Integer)JTListadoClientes.getValueAt(filaSelecionada,4));
            Selec.setEstado(true);
            cli.actualizarCliente(Selec);
            listadoClientesBaja();
            
        }
    }//GEN-LAST:event_JBAltaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBAlta;
    private javax.swing.JButton JBBaja;
    private javax.swing.JRadioButton JRBbaja;
    private javax.swing.JTable JTListadoClientes;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRBalta;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void armarTabla() {
        ArrayList<Object> columnas = new ArrayList();
        
        columnas.add("DNI");
        columnas.add("Nombre");
        columnas.add("Apellido");
        columnas.add("Domicilio");
        columnas.add("Telefono");
        columnas.add("estado");

        for (Object aux : columnas) {
            modeloDeTabla.addColumn(aux);
        }

        JTListadoClientes.setModel(modeloDeTabla);
    

    }
    
    private void listadoClientesAlta() {
        modeloDeTabla.setNumRows(0);
        listaClientes = cli.listarClientes(true);
        for (Cliente aux : listaClientes) {
            modeloDeTabla.addRow(new Object[]{ aux.getDni(),aux.getNombre(), aux.getApellido(),aux.getDomicilio(), aux.getTelefono(), aux.isEstado()});
        }
    }
    
    private void listadoClientesBaja() {
        modeloDeTabla.setNumRows(0);
        listaClientes = cli.listarClientes(false);
        for (Cliente aux : listaClientes) {
             modeloDeTabla.addRow(new Object[]{aux.getDni(), aux.getNombre(), aux.getApellido(),aux.getDomicilio(), aux.getTelefono(), aux.isEstado()});
        }
    }

}
