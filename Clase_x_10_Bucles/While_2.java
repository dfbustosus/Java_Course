package Clase_x_10_Bucles;
import java.util.Scanner;

public class While_2 {
    public static void main(String args[]){
        
        // Generar numero aleatorio entre 0 y 1 y refundicion
        int aleatorio = (int)(Math.random()*100);
        Scanner entrada = new Scanner(System.in);

        int numero=0;
        int intentos =0;

        while (numero != aleatorio){
            intentos+=1;
            System.out.println("Introduce un numero por favor: ");
            numero = entrada.nextInt();
            if (numero > aleatorio){
                System.out.println("Tu numero es > que aleatorio");
            } else if (numero < aleatorio){
                System.out.println("Tu numero es < que aleatorio");
            }
        }
        System.out.println("Lo hiciste bien en "+ intentos+ " intentos");

    }
    
}
