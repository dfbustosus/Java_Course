package Clase_x_21_Swing;
import javax.swing.JFrame;
import java.awt.Frame;

public class CrearFrames{
    public static void main (String[] args){

        miFrame frame1= new miFrame();
        frame1.setVisible(true);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// importante para poder cerrar correctamente
    }
}

class miFrame extends JFrame{
    // Constructor
    public miFrame(){
        setSize(500, 300);
        //setBounds(500,300,250,250);
        //setResizable(false);// impedir que se pueda modificar
        //setExtendedState(Frame.MAXIMIZED_BOTH);// Maximizar todo el tamaño de ventana
        //setTitle("Ventana de David");

    }
}