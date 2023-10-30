package Clase_x_22_Eventos.app5;
import javax.swing.JFrame;
//import java.awt.event.WindowListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ejemplo5 {
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
        addWindowListener(new T_Ventana());
        //T_Ventana oyente_ventana= new T_Ventana(); // Instancia de oyente
        //addWindowListener(oyente_ventana);// Poner la ventana a la escucha
    }
}

// Interfaz con los 7 metodos (no es necesario usar todod)
class T_Ventana extends WindowAdapter{
    // Con esto ya no tenemos que implementar los 7 metodos
    public void windowActivated(WindowEvent e){
        System.out.println("Ventana activada");
    }
    public void windowClosed(WindowEvent e){
        System.out.println("Cerrando ventana 2");
    }
    
}
