/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package taller.vistas;

import Imagenes.FondoPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import taller.data.Bicicletadata;
import taller.data.ClienteData;
import taller.entidades.Bicicleta;


/**
 *
 * @author cane
 */
public class VistaBicicleta extends javax.swing.JInternalFrame {


Bicicletadata bi;
ClienteData cli;
    public VistaBicicleta() {
     
         
        
          
          initComponents();
          
          bi= new Bicicletadata();
          cli= new ClienteData();
      

   
    }
    public boolean validarCamposVaciosAgregar() {
        if (JTFnroSerie.getText().equals("") ||  JTFtipo.getText().equals("") || JTFcolor.getText().equals("")) {
            return false;
        }
        return true;
    }

     public boolean validarCamposVaciosActualizar() {
        if (JTFnroSerie.getText().equals("") || JTFtipo.getText().equals("") || JTFcolor.getText().equals("")) {
            return false;
        }
        return true;
    }

    public boolean validarCamposVaciosBuscarCliente() {
        if (JTFcliente.getText().equals("")) {
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
        JLnroSerie = new javax.swing.JLabel();
        JLcolor = new javax.swing.JLabel();
        JLcliente = new javax.swing.JLabel();
        JTFnroSerie = new javax.swing.JTextField();
        JTFtipo = new javax.swing.JTextField();
        JLtipo = new javax.swing.JLabel();
        JTFcolor = new javax.swing.JTextField();
        JTFcliente = new javax.swing.JTextField();
        JBagregar = new javax.swing.JButton();
        JBactualizar = new javax.swing.JButton();
        JBlimpiar = new javax.swing.JButton();
        JBbuscarNroSerie = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Bicicletas");

        JLnroSerie.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        JLnroSerie.setText("N° de Serie");

        JLcolor.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        JLcolor.setText("Color");

        JLcliente.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        JLcliente.setText("Cliente");

        JTFnroSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFnroSerieActionPerformed(evt);
            }
        });

        JLtipo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        JLtipo.setText("Tipo");

        JBagregar.setText("Agregar");
        JBagregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBagregarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBagregarMouseExited(evt);
            }
        });
        JBagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBagregarActionPerformed(evt);
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

        JBbuscarNroSerie.setText("Buscar");
        JBbuscarNroSerie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JBbuscarNroSerieMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBbuscarNroSerieMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBbuscarNroSerieMouseExited(evt);
            }
        });
        JBbuscarNroSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBbuscarNroSerieActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JLcolor, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLtipo, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLnroSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(JTFnroSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(JBbuscarNroSerie))
                        .addComponent(JTFcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(JTFcolor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                    .addComponent(JTFtipo, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(56, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(JBagregar)
                .addGap(87, 87, 87)
                .addComponent(JBlimpiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JBactualizar)
                .addGap(79, 79, 79))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFnroSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLnroSerie)
                    .addComponent(JBbuscarNroSerie))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLtipo)
                    .addComponent(JTFtipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFcolor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLcolor))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLcliente)
                    .addComponent(JTFcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBactualizar)
                    .addComponent(JBlimpiar)
                    .addComponent(JBagregar))
                .addGap(45, 45, 45))
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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTFnroSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFnroSerieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFnroSerieActionPerformed

    private void JBlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBlimpiarActionPerformed
        // TODO add your handling code here:
       
        JTFnroSerie.setText("");
        JTFtipo.setText("");
        JTFcolor.setText("");
        JTFcliente.setText("");
    }//GEN-LAST:event_JBlimpiarActionPerformed

   
    private void JBbuscarNroSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBbuscarNroSerieActionPerformed

        // TODO add your handling code here:
        try {
            if (JTFnroSerie.getText().equals("")) {
                Bicicleta b = new Bicicleta();

                b = bi.obtenerBicleta(Integer.parseInt(JTFnroSerie.getText()));
              
                JTFtipo.setText(b.getTipo());
                JTFcolor.setText(b.getColor());
                JTFcliente.setText (String.valueOf(b.getDueño().getDni()));

            } else {
                JOptionPane.showMessageDialog(null, "Falta ingresar el nro de serie para buscar.");
            }
        } catch (NumberFormatException | NullPointerException ex) {
            JOptionPane.showMessageDialog(null, " ERROR: Caracteres no invalidos.");
        }

    }//GEN-LAST:event_JBbuscarNroSerieActionPerformed

    private void JBagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBagregarActionPerformed
        // TODO add your handling code here:
        
        try {
            if (validarCamposVaciosAgregar()) {
                Bicicleta b = new Bicicleta();
                //Cliente c = new Cliente();
               b.setNum_serie(Integer.parseInt(JTFnroSerie.getText()));
               b.setTipo(JTFtipo.getText());
               b.setColor(JTFcolor.getText());
               b.setDueño(cli.ObtenerclienteporDni(Integer.parseInt(JTFcliente.getText())));
               bi.guardarBicicleta(b);
            } else {
                JOptionPane.showMessageDialog(null, "Faltan llenar campos");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Ocurrio un problema revise los datos ingresados.");
        }
       
    }//GEN-LAST:event_JBagregarActionPerformed

    private void JBactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBactualizarActionPerformed
        // TODO add your handling code here:
                try {
            if (validarCamposVaciosActualizar()) {
               Bicicleta b = new Bicicleta();
                //Cliente c = new Cliente();
               
                b.setNum_serie(Integer.parseInt(JTFnroSerie.getText()));
                b.setTipo(JTFtipo.getText());
                b.setColor(JTFcolor.getText());
                b.setDueño(cli.ObtenerclienteporDni(Integer.parseInt(JTFcliente.getText())));
                bi.actualizarBicicleta(b);
               
            } else {
                JOptionPane.showMessageDialog(null, "Faltan llenar campos");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Ocurrio un problema revise los datos ingresados. " + ex);
        }
        
    }//GEN-LAST:event_JBactualizarActionPerformed

    private void JBbuscarNroSerieMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBbuscarNroSerieMouseEntered
        JBbuscarNroSerie.setBackground(Color.GRAY);
    }//GEN-LAST:event_JBbuscarNroSerieMouseEntered

    private void JBbuscarNroSerieMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBbuscarNroSerieMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_JBbuscarNroSerieMouseClicked

    private void JBbuscarNroSerieMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBbuscarNroSerieMouseExited
      JBbuscarNroSerie.setBackground( new Color(187,187,187));
    }//GEN-LAST:event_JBbuscarNroSerieMouseExited

    private void JBagregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBagregarMouseEntered
      JBagregar.setBackground(Color.GRAY);
    }//GEN-LAST:event_JBagregarMouseEntered

    private void JBagregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBagregarMouseExited
     JBagregar.setBackground( new Color(187,187,187));
    }//GEN-LAST:event_JBagregarMouseExited

    private void JBlimpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBlimpiarMouseEntered
       JBlimpiar.setBackground(Color.GRAY);
    }//GEN-LAST:event_JBlimpiarMouseEntered

    private void JBlimpiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBlimpiarMouseExited
        JBlimpiar.setBackground( new Color(187,187,187));
    }//GEN-LAST:event_JBlimpiarMouseExited

    private void JBactualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBactualizarMouseEntered
     JBactualizar.setBackground(Color.GRAY);
    }//GEN-LAST:event_JBactualizarMouseEntered

    private void JBactualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBactualizarMouseExited
     JBactualizar.setBackground( new Color(187,187,187));
    }//GEN-LAST:event_JBactualizarMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBactualizar;
    private javax.swing.JButton JBagregar;
    private javax.swing.JButton JBbuscarNroSerie;
    private javax.swing.JButton JBlimpiar;
    private javax.swing.JLabel JLcliente;
    private javax.swing.JLabel JLcolor;
    private javax.swing.JLabel JLnroSerie;
    private javax.swing.JLabel JLtipo;
    private javax.swing.JTextField JTFcliente;
    private javax.swing.JTextField JTFcolor;
    private javax.swing.JTextField JTFnroSerie;
    private javax.swing.JTextField JTFtipo;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables


}





