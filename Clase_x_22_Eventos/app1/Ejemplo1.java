package Clase_x_22_Eventos.app1;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ejemplo1 {
    public static void main(String[] args){
        marco_boton marco_david= new marco_boton();
        marco_david.setVisible(true);
        marco_david.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}

class marco_boton extends JFrame{
    public marco_boton(){
        setTitle("Botones con marco");
        setBounds(500, 200, 300, 300);
        lamina_boton david_lamina= new lamina_boton();
        add(david_lamina);
    }
}

class lamina_boton extends JPanel implements ActionListener{
    JButton botonrojo= new JButton("Rojo");
    JButton botonazul= new JButton("Azul");
    JButton botonverde= new JButton("Verde");
    
    public lamina_boton(){
        add(botonrojo);
        add(botonazul);
        add(botonverde);
        botonrojo.addActionListener(this); // la misma lamina el listener
        botonazul.addActionListener(this); // la misma lamina el listener
        botonverde.addActionListener(this); // la misma lamina el listener
        // Oyente : 1 solo , la lamina
    }

    public void actionPerformed(ActionEvent e){
        Object botonelegido = e.getSource(); // origen del evento
        if (botonelegido== botonazul){
            setBackground(Color.BLUE);
        } else if (botonelegido == botonrojo){
            setBackground(Color.RED);
        } else{
            setBackground(Color.GREEN);
        }
    }

} 