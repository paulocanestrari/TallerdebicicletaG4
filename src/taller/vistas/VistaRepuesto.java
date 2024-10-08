/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package taller.vistas;


import Imagenes.FondoPanel;
import javax.swing.JOptionPane;
import taller.data.Repuestodata;
import taller.entidades.Repuesto;

/**
 *
 * @author canes
 */
public class VistaRepuesto extends javax.swing.JInternalFrame {

    /**
     * Creates new form VistaRepuesto
     */

    Repuestodata rep = new Repuestodata();

    public VistaRepuesto() {
        initComponents();
    }

    //Validaciones
    public boolean validarCamposVaciosAgregar() {
        if ( JTFnumSerie.getText().equals("") || JTFdescripcion.getText().equals("") || JTFprecio.getText().equals("")) {
            return false;
        }
        return true;
    }


    public boolean validarCamposVaciosBuscarNumSerie() {
        if (JTFnumSerie.getText().equals("")) {
            return false;
        }
        return true;
    }

    public boolean validarCamposVaciosActualizar() {
        if ( JTFnumSerie.getText().equals("") || JTFdescripcion.getText().equals("") || JTFprecio.getText().equals("")) {
            return false;
        }
        return true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new FondoPanel();
        JLnumSerie = new javax.swing.JLabel();
        JLdescripcion = new javax.swing.JLabel();
        JLprecio = new javax.swing.JLabel();
        JTFnumSerie = new javax.swing.JTextField();
        JTFdescripcion = new javax.swing.JTextField();
        JTFprecio = new javax.swing.JTextField();
        JBbuscar = new javax.swing.JButton();
        JBagregar = new javax.swing.JButton();
        JBactualizar = new javax.swing.JButton();
        JBlimpiar = new javax.swing.JButton();

        setClosable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP), "Repuestos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Constantia", 0, 16))); // NOI18N

        JLnumSerie.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        JLnumSerie.setText("Número de serie");

        JLdescripcion.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        JLdescripcion.setText("Descripción");

        JLprecio.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        JLprecio.setText("Precio");

        JBbuscar.setText("Buscar");
        JBbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBbuscarActionPerformed(evt);
            }
        });

        JBagregar.setText("Agregar");
        JBagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBagregarActionPerformed(evt);
            }
        });

        JBactualizar.setText("Actualizar");
        JBactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBactualizarActionPerformed(evt);
            }
        });

        JBlimpiar.setText("Limpiar");
        JBlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBlimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLnumSerie)
                            .addComponent(JLprecio))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JTFprecio)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(JTFnumSerie)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JBbuscar)))
                                .addContainerGap())
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(JBagregar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                .addComponent(JBlimpiar)
                                .addGap(28, 28, 28)
                                .addComponent(JBactualizar)
                                .addGap(21, 21, 21))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(JLdescripcion)
                        .addGap(57, 57, 57)
                        .addComponent(JTFdescripcion)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFnumSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLnumSerie)
                    .addComponent(JBbuscar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLdescripcion)
                    .addComponent(JTFdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLprecio)
                    .addComponent(JTFprecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBagregar)
                    .addComponent(JBactualizar)
                    .addComponent(JBlimpiar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Botón Buscar:
    private void JBbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBbuscarActionPerformed
        try {
            if (validarCamposVaciosBuscarNumSerie()) {
                Repuesto r = new Repuesto();
                r = rep.obtenerRepuesto(Integer.parseInt(JTFnumSerie.getText()));
                             
                JTFdescripcion.setText(r.getDescripcion());
                JTFprecio.setText(String.valueOf(r.getPrecio()));
            } else {
                JOptionPane.showMessageDialog(null, "Falta ingresar numero de serie para buscar.");
            }
        } catch (NumberFormatException | NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "El  ingresado contiene caracteres o es invalido.");
        }
    }//GEN-LAST:event_JBbuscarActionPerformed

    //Botón Limpiar
    private void JBlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBlimpiarActionPerformed
        JTFdescripcion.setText("");
       
        JTFnumSerie.setText("");
        
        JTFprecio.setText("");
    }//GEN-LAST:event_JBlimpiarActionPerformed

    //Botón Agregar
    private void JBagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBagregarActionPerformed
        try {
            if (validarCamposVaciosAgregar()) {
                Repuesto r = new Repuesto();
               
                r.setPrecio(Float.parseFloat(JTFprecio.getText()));
                r.setDescripcion(JTFdescripcion.getText());
                r.setNum_serie(Integer.parseInt(JTFnumSerie.getText()));
                r.setEstado(true);
                rep.guardarRepuesto(r);
            } else {
                JOptionPane.showMessageDialog(null, "Faltan llenar campos!");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Error: revise los datos ingresados.");
        }
    }//GEN-LAST:event_JBagregarActionPerformed

    //Botón Actualizar
    private void JBactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBactualizarActionPerformed
        try {
            if (validarCamposVaciosActualizar()) {
                Repuesto r = new Repuesto();
               
                r.setPrecio(Float.parseFloat(JTFprecio.getText()));
                r.setDescripcion(JTFdescripcion.getText());
                r.setNum_serie(Integer.parseInt(JTFnumSerie.getText()));
               
                rep.actualizarRepuesto(r);
            } else {
                JOptionPane.showMessageDialog(null, "Faltan llenar campos");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: revise los datos ingresados. " + ex);
        }
    }//GEN-LAST:event_JBactualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBactualizar;
    private javax.swing.JButton JBagregar;
    private javax.swing.JButton JBbuscar;
    private javax.swing.JButton JBlimpiar;
    private javax.swing.JLabel JLdescripcion;
    private javax.swing.JLabel JLnumSerie;
    private javax.swing.JLabel JLprecio;
    private javax.swing.JTextField JTFdescripcion;
    private javax.swing.JTextField JTFnumSerie;
    private javax.swing.JTextField JTFprecio;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
