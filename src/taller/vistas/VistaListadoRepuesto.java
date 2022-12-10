/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package taller.vistas;


import Imagenes.FondoPanel;
import java.sql.Connection;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import taller.data.Repuestodata;
import taller.entidades.Repuesto;

/**
 *
 * @author canes
 */
public class VistaListadoRepuesto extends javax.swing.JInternalFrame {

    /**
     * Creates new form VistaListadoRepuesto
     */
    
    Repuestodata repD = new Repuestodata();
    
    private DefaultTableModel modeloDeTabla;
    
    ArrayList<Repuesto> listaRepuestos = new ArrayList();
    
    public VistaListadoRepuesto() {
        initComponents();
        modeloDeTabla = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        armarTabla();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new FondoPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTlistadoDeRepuestos = new javax.swing.JTable();
        JBdarDeAlta = new javax.swing.JButton();
        JBdarDeBaja = new javax.swing.JButton();
        JRBdadosDeBaja = new javax.swing.JRadioButton();
        JRBdadosDeAlta = new javax.swing.JRadioButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de repuesto", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Verdana", 1, 16))); // NOI18N

        JTlistadoDeRepuestos.setFont(new java.awt.Font("Constantia", 0, 12)); // NOI18N
        JTlistadoDeRepuestos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(JTlistadoDeRepuestos);

        JBdarDeAlta.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        JBdarDeAlta.setText("Dar de Alta");
        JBdarDeAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBdarDeAltaActionPerformed(evt);
            }
        });

        JBdarDeBaja.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        JBdarDeBaja.setText("Dar de Baja");
        JBdarDeBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBdarDeBajaActionPerformed(evt);
            }
        });

        buttonGroup1.add(JRBdadosDeBaja);
        JRBdadosDeBaja.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        JRBdadosDeBaja.setText("Dados de Baja");
        JRBdadosDeBaja.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                JRBdadosDeBajaItemStateChanged(evt);
            }
        });
        JRBdadosDeBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRBdadosDeBajaActionPerformed(evt);
            }
        });

        buttonGroup1.add(JRBdadosDeAlta);
        JRBdadosDeAlta.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        JRBdadosDeAlta.setText("Dados de Alta");
        JRBdadosDeAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRBdadosDeAltaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(113, 113, 113)
                                .addComponent(JBdarDeAlta)
                                .addGap(64, 64, 64)
                                .addComponent(JBdarDeBaja))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addComponent(JRBdadosDeBaja)
                                .addGap(82, 82, 82)
                                .addComponent(JRBdadosDeAlta)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JRBdadosDeBaja)
                    .addComponent(JRBdadosDeAlta))
                .addGap(46, 46, 46)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBdarDeAlta)
                    .addComponent(JBdarDeBaja))
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Radio Botón Dados de Baja
    private void JRBdadosDeBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRBdadosDeBajaActionPerformed
        JBdarDeAlta.setEnabled(true);
        JBdarDeBaja.setEnabled(false);
        cargarListadoDeRepuestosQueEstanDadosDeBaja();
    }//GEN-LAST:event_JRBdadosDeBajaActionPerformed

    //Radio Botón Dados de Alta
    private void JRBdadosDeAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRBdadosDeAltaActionPerformed
        JBdarDeAlta.setEnabled(false);
        JBdarDeBaja.setEnabled(true);
        cargarListadoDeRepuestosQueEstanDadosDeAlta();
    }//GEN-LAST:event_JRBdadosDeAltaActionPerformed

    //Botón Dar de Alta
    private void JBdarDeAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBdarDeAltaActionPerformed
        int filaS = JTlistadoDeRepuestos.getSelectedRow();
        Repuesto r = new Repuesto();
        if (filaS != -1) {
            r.setNum_serie((Integer) JTlistadoDeRepuestos.getValueAt(filaS, 0));
            r.setDescripcion((String.valueOf(JTlistadoDeRepuestos.getValueAt(filaS, 1))));
            r.setPrecio((Float)JTlistadoDeRepuestos.getValueAt(filaS, 2));
            r.setEstado((true));
            repD.actualizarRepuesto(r);
            cargarListadoDeRepuestosQueEstanDadosDeBaja();
            
        }
    }//GEN-LAST:event_JBdarDeAltaActionPerformed

    //Botón dar de Baja
    private void JBdarDeBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBdarDeBajaActionPerformed
        int filaS = JTlistadoDeRepuestos.getSelectedRow();
        Repuesto r = new Repuesto();
        if (filaS != -1) {
            r.setNum_serie((Integer) JTlistadoDeRepuestos.getValueAt(filaS, 0));
            repD.borrarRepuesto(r.getNum_serie());
            cargarListadoDeRepuestosQueEstanDadosDeAlta();
        }
    }//GEN-LAST:event_JBdarDeBajaActionPerformed

    private void JRBdadosDeBajaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_JRBdadosDeBajaItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_JRBdadosDeBajaItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBdarDeAlta;
    private javax.swing.JButton JBdarDeBaja;
    private javax.swing.JRadioButton JRBdadosDeAlta;
    private javax.swing.JRadioButton JRBdadosDeBaja;
    private javax.swing.JTable JTlistadoDeRepuestos;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    //Armar tabla
    private void armarTabla() {
        ArrayList<Object> columnas = new ArrayList();
        columnas.add("Número de serie");
        columnas.add("Descripcion");
        columnas.add("precio");
        columnas.add("estado");
        
        for (Object aux : columnas) {
            modeloDeTabla.addColumn(aux);
        }
        
        JTlistadoDeRepuestos.setModel(modeloDeTabla);
              
    }
    
    //Cargar listados dados de alta
    private void cargarListadoDeRepuestosQueEstanDadosDeAlta() {
        modeloDeTabla.setNumRows(0);
        listaRepuestos = repD.obtenerRepuestos(true);
        for (Repuesto aux : listaRepuestos) {
            modeloDeTabla.addRow(new Object[]{ aux.getNum_serie(), aux.getDescripcion(), aux.getPrecio(), aux.isEstado()});
        }
    }
    
    //Cargar listados dados de baja
    private void cargarListadoDeRepuestosQueEstanDadosDeBaja() {
        modeloDeTabla.setNumRows(0);
        listaRepuestos = repD.obtenerRepuestos(false);
        for (Repuesto aux : listaRepuestos) {
            modeloDeTabla.addRow(new Object[]{aux.getNum_serie(), aux.getDescripcion(), aux.getPrecio(), aux.isEstado()});
        }
    }
    
    
}


