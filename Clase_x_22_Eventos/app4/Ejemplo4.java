package Clase_x_22_Eventos.app4;
import javax.swing.JFrame;
//import java.awt.event.WindowListener;
import java.awt.event.WindowStateListener;
import java.awt.Frame;
import java.awt.event.WindowEvent;

public class Ejemplo4 {
    public static void main(String[] args){
        MarcoEstado marco_david = new MarcoEstado();
        marco_david.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}

class MarcoEstado extends JFrame{
    public MarcoEstado(){
        setVisible(true);
        setBounds(150,150,350,350);
        CambioEstado nuevo_estado= new CambioEstado();
        addWindowStateListener(nuevo_estado);
    }
}

class CambioEstado implements WindowStateListener{
    public void windowStateChanged(WindowEvent e){
        System.out.println("La ventana ha cambiado");
        //System.out.println(e.getNewState());
        if (e.getNewState()==Frame.MAXIMIZED_BOTH){
            System.out.println("La ventana esta en pantalla completa");
        } else if (e.getNewState()==Frame.NORMAL){ //0
            System.out.println("La ventana esta en pantalla normal");
        } else if (e.getNewState()==Frame.ICONIFIED){ //0
            System.out.println("La ventana esta minimizada");
        }
    }
}