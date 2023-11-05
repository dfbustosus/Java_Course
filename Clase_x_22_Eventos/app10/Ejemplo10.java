package Clase_x_22_Eventos.app10;

import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

import javax.swing.JFrame;

public class Ejemplo10 extends JFrame implements WindowFocusListener {
    public static void main(String[] args){
        Ejemplo10 miv= new Ejemplo10();
        miv.iniciar();

    }

    Ejemplo10 marco1; Ejemplo10 marco2;
    public void iniciar(){
        marco1= new Ejemplo10();
        marco2= new Ejemplo10();
        marco1.setVisible(true);
        marco2.setVisible(true);
        marco1.setBounds(150,100,600,350);
        marco2.setBounds(800,100,600,350);
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco1.addWindowFocusListener(this);
        marco2.addWindowFocusListener(this);
    }
    @Override
    public void windowGainedFocus(WindowEvent e) {
        if (e.getSource()== marco1){
            marco1.setTitle("Tengo el foco");
        }else{
            marco2.setTitle("Tengo el foco");
        }
    }

    @Override
    public void windowLostFocus(WindowEvent e) {
        if (e.getSource()== marco1){
            marco1.setTitle("");
        }else{
            marco2.setTitle("");
        }
    }


    
}
