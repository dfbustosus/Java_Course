package Clase_x_21_Swing.app2;
import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.Dimension;
import java.awt.Image;

public class MarcoCentrado {
    public static void main(String[] args){
        Marcos mi_marco= new Marcos();
        mi_marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mi_marco.setVisible(true);
    }
}

class Marcos extends JFrame{
    // Constructor
    public Marcos(){
        // Obtiene el tipo de pantalla
        Toolkit pantalla= Toolkit.getDefaultToolkit();
        // Obtener dimensiones de la pantalla
        Dimension tamanopantalla= pantalla.getScreenSize();
        int alturapantalla= tamanopantalla.height;
        int anchopantalla= tamanopantalla.width;
        // Dividir a la mitad el tamaño la pantalla
        setSize(alturapantalla/2, anchopantalla/2);
        // Posicionar en el centro
        setLocation(alturapantalla/4, anchopantalla/4);
        // Poner titulo
        setTitle("Marco de David");
        // Poner una imagen en el icono
        Image icono_david= pantalla.getImage("Soccer.png");
        setIconImage(icono_david);
    }
}
