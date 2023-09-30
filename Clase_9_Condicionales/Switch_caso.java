package Clase_9_Condicionales;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Switch_caso {
    public static void main(String args[]){
        // Switch (Caso tipos de interes- simulador pagos)
        Scanner ing= new Scanner(System.in);
        // Pedimos que ingrese uno de los valores numericos
        System.out.println("Elige una opción: \n1: Caso I (Barclays Bank) \n2: Caso II (Lulo Bank) \n3: Caso III (ScotiaBank) \n4: Caso IV (BBVA bank)");
        int opcion = ing.nextInt();

        // Uso del switch
        // Calculo final con switch (A = P(1+r/n)^{nt})
        switch(opcion){
            case 1:
                double interes= 3.875; // %
                int plazo= 3; // años
                double cantidad = Double.parseDouble(JOptionPane.showInputDialog("Introduce el monto: "));
                double A= cantidad*Math.pow((1+ ((interes/100)/12)), 12*plazo);
                System.out.println("El monto final a pagar es: "+ A);
                break;
            case 2:
                double interes_2= 4.515; // %
                int plazo_2= 2; // años
                double cantidad_2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el monto: "));
                double A_2= cantidad_2*Math.pow((1+ ((interes_2/100)/12)), 12*plazo_2);
                System.out.println("El monto final a pagar es: "+ A_2);
                break;
            case 3:
                double interes_3= 3.117; // %
                int plazo_3= 4; // años
                double cantidad_3 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el monto: "));
                double A_3= cantidad_3*Math.pow((1+ ((interes_3/100)/12)), 12*plazo_3);
                System.out.println("El monto final a pagar es: "+ A_3);
                break;
            case 4:
                double interes_4= 5.317; // %
                int plazo_4= 4; // años
                double cantidad_4 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el monto: "));
                double A_4= cantidad_4*Math.pow((1+ ((interes_4/100)/12)), 12*plazo_4);
                System.out.println("El monto final a pagar es: "+ A_4);
                break;
            default:
                System.out.println("La opcion no es correcta");
        }
    }
}
