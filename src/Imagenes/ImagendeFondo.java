 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Imagenes;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JDesktopPane;

/**
 *
 * @author canes
 */

public class ImagendeFondo extends JDesktopPane {

private BufferedImage imagen;

        public ImagendeFondo() throws IOException {
    try {
        imagen = ImageIO.read(getClass().getResourceAsStream("/Imagenes/BIKE.png"));
    } catch (IOException ex) {
        
    }
        }     
        
    
@Override
protected void paintComponent (Graphics   g){
     
    super.paintComponent(g);
    g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
        }
        }



