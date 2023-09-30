package Clase_8_Entrada_Salida_Datos;
import javax.swing.*;

public class Entrada_Salida_Datos_JoptionPanel {
    public static void main(String[] args){
        // Uso del metodo de JoptionPane
        String nombre_usuario  = JOptionPane.showInputDialog("Introduce tu nombre");
        String edad  = JOptionPane.showInputDialog("Introduce tu edad");
        String ingresos  = JOptionPane.showInputDialog("Introduce tu ingreso al año: ");
        // Convertimos a double el input
        double ingresos_d = Double.parseDouble(ingresos);
        // Usamos ParseInt para convertir el string al numero
        System.out.println("Hola "+ nombre_usuario+ " el próximo año tendras :"+ (Integer.parseInt(edad)+1) + " años");
        System.out.println("Tus ingresos al año son: ");
        System.out.printf("%1.2f", ingresos_d);
    }
}
