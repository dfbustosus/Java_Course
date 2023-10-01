package Clase_x_10_Bucles;
import javax.swing.JOptionPane;
public class While{
    public static void main(String args[]){
        String clave = "David";
        String pass ="";
        // Si el texto clave no es igual al pass volver a preguntas
        while (clave.equals(pass)==false){
            pass = JOptionPane.showInputDialog("Introduce la contraseña por favor: ");
            if (clave.equals(pass)==false){
                System.out.println("Contraseña  incorrecta");      
            }
        }
        System.out.println("Contraseña correcta admitido");

    }
}