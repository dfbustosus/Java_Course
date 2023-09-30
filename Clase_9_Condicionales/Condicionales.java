package Clase_9_Condicionales;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Condicionales {
    public static void main(String args[]){
        Scanner entrada =new Scanner(System.in);
        // Uso de if-else
        System.out.println("Introduce tu edad por favor: ");
        int edad = entrada.nextInt();

        if (edad>= 18){
            System.out.println("Eres mayor de edad");
        } else{
            System.out.println("Eres menor de edad");
        }
        //Se puede usar varias condiciones con el if else if
        // Uso de if-elif-else
        if (edad< 18){
            System.out.println("Eres joven");
        } else if (edad <40){
            System.out.println("Eres joven");
        } else if (edad < 60){
            System.out.println("Eres persona adulta");
        } else {
            System.out.println("Eres persona adulta mayor");
        }

    }
}
