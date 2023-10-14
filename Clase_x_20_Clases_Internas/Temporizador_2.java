package Clase_x_20_Clases_Internas;

import javax.swing.*;
import javax.swing.Timer;
import java.awt.event.*;
import java.util.*;
import java.awt.Toolkit;

public class Temporizador_2 {
    public static void main(String[] args){
        Reloj mireloj= new Reloj(5000, true);
        mireloj.enmarcha();
        JOptionPane.showMessageDialog(null, "Pulsa Aceptar para terminar");
        System.exit((0));

    }
}
    
class Reloj{
    private int intervalo;
    private boolean sonido;
    // Constructor
    public Reloj(int intervalo, boolean sonido){
        this.intervalo=intervalo;
        this.sonido= sonido;
    }
    public void enmarcha(){
        ActionListener oyente= new darHora();
        Timer mitemporizador= new Timer(intervalo,oyente);
        mitemporizador.start();
    }

    // Clase interna
    private class darHora implements ActionListener{
        public void actionPerformed(ActionEvent evento){
            Date ahora = new Date();
            System.out.println("La hora cada 5 seg");

            if(sonido ==true){
                Toolkit.getDefaultToolkit().beep();
            }

        }
    }
}