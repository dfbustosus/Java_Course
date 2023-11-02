package Clase_x_22_Eventos.app6;

import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.event.MouseInputListener;

public class Ejemplo6 {
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
        addMouseListener(evento_david);
    }
}

class EventoRaton implements MouseInputListener{

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Has hecho algun click");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Has presionado el mouse");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Has levantado el click");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Has entrado con moause1 ");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Acabaste de salir");
        
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        
    }

}

// java Ejemplo6.java