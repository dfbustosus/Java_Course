package Clase_x_21_Swing;
import javax.swing.JFrame;

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

    }
}