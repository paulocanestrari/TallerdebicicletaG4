/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package taller.vistas;


import Imagenes.FondoPanel;
import java.awt.Color;

import javax.swing.JOptionPane;

import taller.data.ClienteData;
import taller.entidades.Cliente;
;

/**
 *
 * @author canes
 */
public class VistaCliente extends javax.swing.JInternalFrame {

    /**
     * Creates new form VistaCliente
     */
  
    ClienteData cli = new ClienteData();

    public VistaCliente() {
        
        initComponents();
    }

    public boolean validarCamposVaciosAgregar() {
        if (JTFnombre.getText().equals("") || JTFapellido.getText().equals("") || JTFdomicilio.getText().equals("") || JTFcelular.getText().equals("")) {
            return false;
        }
        return true;
    }

    public boolean validarCamposVaciosBuscar() {
        if (JTFdni.getText().equals("")) {
            return false;
        }
        return true;
    }

    public boolean validarCamposVaciosActualizar() {
        if (JTFnombre.getText().equals("") || JTFdni.getText().equals("") || JTFapellido.getText().equals("") || JTFdomicilio.getText().equals("") || JTFcelular.getText().equals("")) {
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
        JLnombre1 = new javax.swing.JLabel();
        JLnombre2 = new javax.swing.JLabel();
        JLnombre3 = new javax.swing.JLabel();
        JLnombre4 = new javax.swing.JLabel();
        JLnombre5 = new javax.swing.JLabel();
        JTFapellido = new javax.swing.JTextField();
        JTFdomicilio = new javax.swing.JTextField();
        JTFcelular = new javax.swing.JTextField();
        JTFdni = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jBagregar = new javax.swing.JButton();
        JBactualizar = new javax.swing.JButton();
        JBlimpiar = new javax.swing.JButton();
        JTFnombre = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Clientes", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        JLnombre1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        JLnombre1.setText("Apellido");

        JLnombre2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        JLnombre2.setText("Nombre");

        JLnombre3.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        JLnombre3.setText("Domicilio");

        JLnombre4.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        JLnombre4.setText("Teléfono");

        JLnombre5.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        JLnombre5.setText("DNI");

        jButton1.setText("Buscar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jBagregar.setText("Agregar");
        jBagregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBagregarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBagregarMouseExited(evt);
            }
        });
        jBagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBagregarActionPerformed(evt);
            }
        });

        JBactualizar.setText("Actualizar");
        JBactualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBactualizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBactualizarMouseExited(evt);
            }
        });
        JBactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBactualizarActionPerformed(evt);
            }
        });

        JBlimpiar.setText("Limpiar");
        JBlimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBlimpiarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBlimpiarMouseExited(evt);
            }
        });
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jBagregar)
                        .addGap(42, 42, 42)
                        .addComponent(JBactualizar)
                        .addGap(40, 40, 40)
                        .addComponent(JBlimpiar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLnombre1)
                            .addComponent(JLnombre2)
                            .addComponent(JLnombre3)
                            .addComponent(JLnombre5)
                            .addComponent(JLnombre4))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(JTFdni, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(JTFcelular, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                                .addComponent(JTFapellido, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(JTFnombre, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(JTFdomicilio, javax.swing.GroupLayout.Alignment.LEADING)))))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLnombre1))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLnombre2)
                    .addComponent(JTFnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLnombre3)
                    .addComponent(JTFdomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFcelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLnombre4))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLnombre5)
                    .addComponent(JTFdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBagregar)
                    .addComponent(JBactualizar)
                    .addComponent(JBlimpiar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            if (validarCamposVaciosBuscar()) {
                Cliente c = new Cliente();
                c = cli.ObtenerclienteporDni(Integer.parseInt(JTFdni.getText()));
                JTFnombre.setText(c.getNombre());
                JTFapellido.setText((c.getApellido()));
                JTFdomicilio.setText(c.getDomicilio());
                JTFcelular.setText(String.valueOf(c.getTelefono()));

            } else {
                JOptionPane.showMessageDialog(null, "Falta ingresar el dni para buscar.");
            }
        } catch (NumberFormatException | NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "El dni ingresado contiene caracteres o es invalido.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jBagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBagregarActionPerformed
        try {
            if (validarCamposVaciosAgregar()) {
                Cliente c = new Cliente();
                c.setNombre(JTFnombre.getText());
                c.setApellido((JTFapellido.getText()));
                c.setDni(Integer.parseInt(JTFdni.getText()));
                c.setTelefono(Integer.parseInt(JTFcelular.getText()));
                c.setDomicilio((JTFdomicilio.getText()));
                c.setEstado(true);
                cli.guardarCliente(c);
            } else {
                JOptionPane.showMessageDialog(null, "Falta llenar campos");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "ERROR:datos ingresados incorrectos.");
        }
    }//GEN-LAST:event_jBagregarActionPerformed

    private void JBactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBactualizarActionPerformed
        try {
            if (validarCamposVaciosActualizar()) {
                Cliente c = new Cliente();
                c.setNombre(JTFnombre.getText());
                c.setApellido((JTFapellido.getText()));
                c.setDomicilio(JTFdomicilio.getText());
                c.setTelefono(Integer.parseInt(JTFcelular.getText()));
                c.setDni(Integer.parseInt(JTFdni.getText()));
                
                cli.actualizarCliente(c);
            } else {
                JOptionPane.showMessageDialog(null, "Faltan llenar campos");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: revise los datos ingresados. " );
        }
    }//GEN-LAST:event_JBactualizarActionPerformed

    private void JBlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBlimpiarActionPerformed
        JTFapellido.setText("");
        JTFnombre.setText("");
        JTFdni.setText("");
        JTFcelular.setText("");
        JTFdomicilio.setText("");
    }//GEN-LAST:event_JBlimpiarActionPerformed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        jButton1.setBackground(Color.GRAY);
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        jButton1.setBackground( new Color(187,187,187));
    }//GEN-LAST:event_jButton1MouseExited

    private void jBagregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBagregarMouseEntered
       jBagregar.setBackground(Color.GRAY);
    }//GEN-LAST:event_jBagregarMouseEntered

    private void jBagregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBagregarMouseExited
        jBagregar.setBackground( new Color(187,187,187));
    }//GEN-LAST:event_jBagregarMouseExited

    private void JBactualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBactualizarMouseEntered
        JBactualizar.setBackground(Color.GRAY);
    }//GEN-LAST:event_JBactualizarMouseEntered

    private void JBactualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBactualizarMouseExited
        JBactualizar.setBackground( new Color(187,187,187));
    }//GEN-LAST:event_JBactualizarMouseExited

    private void JBlimpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBlimpiarMouseEntered
        JBlimpiar.setBackground(Color.GRAY);
    }//GEN-LAST:event_JBlimpiarMouseEntered

    private void JBlimpiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBlimpiarMouseExited
       JBlimpiar.setBackground( new Color(187,187,187));
    }//GEN-LAST:event_JBlimpiarMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBactualizar;
    private javax.swing.JButton JBlimpiar;
    private javax.swing.JLabel JLnombre1;
    private javax.swing.JLabel JLnombre2;
    private javax.swing.JLabel JLnombre3;
    private javax.swing.JLabel JLnombre4;
    private javax.swing.JLabel JLnombre5;
    private javax.swing.JTextField JTFapellido;
    private javax.swing.JTextField JTFcelular;
    private javax.swing.JTextField JTFdni;
    private javax.swing.JTextField JTFdomicilio;
    private javax.swing.JTextField JTFnombre;
    private javax.swing.JButton jBagregar;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
