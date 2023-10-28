package Clase_x_22_Eventos.app3;

import javax.swing.JFrame;
import java.awt.event.WindowListener;
import java.awt.event.WindowEvent;

public class Ejemplo3 {
    public static void main(String[] args){
        MarcoVentana marco_david = new MarcoVentana();
        marco_david.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MarcoVentana marco_david_2 = new MarcoVentana();
        marco_david_2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        // Si cierras el marco 2 solo ese marco desaparece mientras que si cierras el primero ambos se cierras

        marco_david.setTitle("Ventana 1");
        marco_david_2.setTitle("Ventana 2");
        marco_david.setBounds(300,300, 500,350);
        marco_david_2.setBounds(900, 300, 500, 350);
    }
    
}

class MarcoVentana extends JFrame{
    public MarcoVentana(){
        //setTitle("Responsive method");
        //setBounds(100,150,300,300);
        setVisible(true);
        T_Ventana oyente_ventana= new T_Ventana(); // Instancia de oyente
        addWindowListener(oyente_ventana);// Poner la ventana a la escucha
    }
}

// Interfaz con los 7 metodos (no es necesario usar todod)
class T_Ventana implements WindowListener{
    public void windowActivated(WindowEvent e){
        System.out.println("Ventana activada");
    }
    public void windowClosed(WindowEvent e){
        System.out.println("Cerrando ventana 2");
    }
    public void windowClosing(WindowEvent e){
        System.out.println("Ventana cerrando");
    }
    public void windowDeactivated(WindowEvent e){
        System.out.println("Ventana desactivada");
    }
    public void windowDeiconified(WindowEvent e){
        System.out.println("Ventana restaurada");
    }
    // Minimizar ventana
    public void windowIconified(WindowEvent e){
        System.out.println("Ventana minimizada");
    }
    public void windowOpened(WindowEvent e){
        System.out.println("Ventana abierta");
    }
}
