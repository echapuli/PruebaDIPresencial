/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pelotabota.logica;

import java.awt.Image;
import java.io.File;
import static java.lang.Thread.sleep;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author Eduardo
 */
public class CrearObjeto extends Thread {

    private int x;
    private int y;
    private int incx;
    private int incy;
    private int velocidad;
    private File f;
    private javax.swing.JFrame padre;

    public CrearObjeto(int x, int y, int incx, int incy, File f, int velocidad, javax.swing.JFrame padre) {
        this.x = x;
        this.y = y;
        this.incx = incx;
        this.incy = incy;
        this.f = f;
        this.velocidad = velocidad;
        this.padre = padre;
    }

    public void run() {
        rebote();
    }

    private void rebote() {

        javax.swing.JLabel jLObjeto = new javax.swing.JLabel();
        crearComponente(x, y, f, jLObjeto, padre);
        while (true) {
            //detecta los bordes y bota
            if (x + 50 == padre.getContentPane().getWidth()) {
                incx = -1;
            }
            if (x == 0) {
                incx = 1;
            }
            if (y + 50 == padre.getContentPane().getHeight()) {
                incy = -1;
            }
            if (y == 0) {
                incy = 1;
            }

            x += incx;

            y += incy;

            //posiciona el label
            jLObjeto.setLocation(x, y);

            try {
                sleep(velocidad);
            } catch (Exception ex) {
                ex.printStackTrace();
            }

        }
    }
    //Método que crea el componente (x,y) posición (tamx,tamy) tamaño

    private void crearComponente(int x, int y, File f, javax.swing.JLabel jLabel2, javax.swing.JFrame padre) {
        //mete el icono al label
        try {
            Image image = ImageIO.read(f);
            image = image.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
            jLabel2.setIcon(new ImageIcon(image));
        } catch (Throwable e) {
            e.printStackTrace();
        }
        padre.add(jLabel2);
        jLabel2.setBounds(x, y, 50, 50);

    }
}
