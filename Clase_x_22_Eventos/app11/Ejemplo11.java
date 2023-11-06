package Clase_x_22_Eventos.app11;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ejemplo11 {
    public static void main(String[] args){
        AccionDavid marco_david = new AccionDavid();
        marco_david.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco_david.setVisible(true);
    }
    
}

class AccionDavid extends JFrame{
    public AccionDavid(){
        setTitle("Prueba de acciones");
        setBounds(300,300,600,500);
        PanelAction laminda = new PanelAction();
        add(laminda);
    }
}

class PanelAction extends JPanel{
    public PanelAction(){
        JButton botonazul= new JButton("Azul");
        JButton botonverde= new JButton("Verde");
        JButton botonrojo= new JButton("Rojo");
        add(botonazul);
        add(botonverde);
        add(botonrojo);
    }
}

class AccionColor extends AbstractAction{
    
    @Override
    public void actionPerformed(ActionEvent e) {
    }

}