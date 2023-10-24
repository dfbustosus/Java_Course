package Clase_x_21_Swing.app7;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.imageio.*;

public class Imagenes {
    public static void main(String[] args){
        marco_imagen midavid= new marco_imagen();
        midavid.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        midavid.setVisible(true);
    }
}

class marco_imagen extends JFrame{
    public marco_imagen(){
        setTitle("Marco imagenes");
        setBounds(50, 100, 800, 600);
        lamina_imagen mi_lamina = new lamina_imagen();
        add(mi_lamina);
    }
}

class lamina_imagen extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        File data_imagen= new File("./Clase_x_21_Swing/app7/imagenes/Icon1.png");
        // Preparar el codigo para recibir una excepcion
        try{
            imagen= ImageIO.read(data_imagen);
        }
        catch(IOException e){
            System.out.println("La imagen no aparece ahí");
        }
        // Obtener propiedades de imagen
        int width= imagen.getWidth(this);
        int height= imagen.getHeight(this);
        g.drawImage(imagen,0,0, null);
        g.copyArea(0, 0, width, height, width+1, height+1);
        
    }
    private Image imagen;
}