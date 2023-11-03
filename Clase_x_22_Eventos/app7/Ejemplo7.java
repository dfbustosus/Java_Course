package Clase_x_22_Eventos.app7;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.event.MouseInputListener;

public class Ejemplo7 {
    public static void main(String[] args){
        MarcoRaton marco_david= new MarcoRaton();
        marco_david.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoRaton extends JFrame{
    public MarcoRaton(){
        setVisible(true);
        setBounds(150,150,300,300);
        EventoRaton evento_david= new EventoRaton();
        //EventoDinamico evento_david2= new EventoDinamico();
        addMouseListener(evento_david);
        //addMouseMotionListener(evento_david2);
    }
}

class EventoRaton extends MouseAdapter{
    public void mouseClicked(MouseEvent e){
        System.out.println("Pulsaste en X: "+ e.getX() + " Y: "+ e.getY());
        System.out.println(e.getClickCount());
    }
    public void mousePressed(MouseEvent e){
        //System.out.println(e.getModifiersEx()); // Esto devuelve una constante de clase
        if (e.getModifiersEx()==MouseEvent.BUTTON1_DOWN_MASK){
            System.out.println("Has pulsado el derecho");
        } else if (e.getModifiersEx()==MouseEvent.BUTTON2_DOWN_MASK){
            System.out.println("Has pulsado la rueda del raton");
        } else if (e.getModifiersEx()==MouseEvent.BUTTON3_DOWN_MASK){
            System.out.println("Has pulsado el izquierdo");
        }
    }
}

/* 
class EventoDinamico implements MouseMotionListener{

    @Override
    public void mouseDragged(MouseEvent e) {
        System.out.println("Estas arrastrando el mouse");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        System.out.println("Estas moviendo el mouse");
    }

}
*/

// java Ejemplo7.java