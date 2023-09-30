package Clase_8_Entrada_Salida_Datos;
import java.util.Scanner;

public class Entrada_Salida_Datos {
    public static void main (String[] args){
        // Creamos el objeto scanner para recibir data
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce tu nombre: ");
        String nombre_usuario = entrada.nextLine();
        System.out.println("Introduce tu edad: ");
        int edad = entrada.nextInt();
        System.out.println("Tu nombre es: "+ nombre_usuario+ " y tendras el proximo año "+ (edad+1) + " años");
        
    }
    
}
