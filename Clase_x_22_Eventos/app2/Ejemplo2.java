package Clase_x_22_Eventos.app2;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ejemplo2 {
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

class lamina_boton extends JPanel{
    JButton botonrojo= new JButton("Rojo");
    JButton botonazul= new JButton("Azul");
    JButton botonverde= new JButton("Verde");
    
    // Constructor
    public lamina_boton(){
        add(botonrojo);
        add(botonazul);
        add(botonverde);
        ColorFondo Rojo = new ColorFondo(Color.RED);
        ColorFondo Azul = new ColorFondo(Color.BLUE);
        ColorFondo Verde = new ColorFondo(Color.GREEN);
        botonrojo.addActionListener(Rojo); // 
        botonazul.addActionListener(Azul); // 
        botonverde.addActionListener(Verde); //
    }

    // Clase interna
    private class ColorFondo implements ActionListener{
        private Color colordefondo;
        public ColorFondo(Color c){
            colordefondo = c;
        }
        public void actionPerformed(ActionEvent e){
            setBackground(colordefondo);
        }
    }

} 

