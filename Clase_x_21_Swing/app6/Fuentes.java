package Clase_x_21_Swing.app6;

import java.awt.GraphicsEnvironment;
import javax.swing.JOptionPane;

public class Fuentes {
    public static void main(String[] args){
        // Pedir un tipo de fuente
        String fuente= JOptionPane.showInputDialog("Introduce una fuente");
        boolean estado_fuente  = false;

        
        String [] nombre_fuentes= GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames(null);
        // Imprimir todas las fuentes
        for (String n : nombre_fuentes){
            //System.out.println(n);
            if (n.equals(fuente)){
                estado_fuente= true;
            }

        }

        if (estado_fuente){
            System.out.println("Fuente instalada");
        }else{
            System.out.println("No esta instalada la fuente");
        }



    }
    
}

