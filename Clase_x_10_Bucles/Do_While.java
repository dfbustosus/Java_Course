package Clase_x_10_Bucles;

import java.util.Scanner;

public class Do_While {
    public static void main (String args[]){
        // Si en el ejemplo anterior el numero aleatorio es 0 no funciona
        // Generar numero aleatorio entre 0 y 1 y refundicion
        int aleatorio = (int)(Math.random()*100);
        Scanner entrada = new Scanner(System.in);

        int numero=0;
        int intentos =0;

        do {
            intentos+=1;
            System.out.println("Introduce un numero por favor: ");
            numero = entrada.nextInt();
            if (numero > aleatorio){
                System.out.println("Tu numero es > que aleatorio");
            } else if (numero < aleatorio){
                System.out.println("Tu numero es < que aleatorio");
            }

        }while(numero != aleatorio);

        System.out.println("Lo hiciste bien en "+ intentos+ " intentos");

    }
    
}
