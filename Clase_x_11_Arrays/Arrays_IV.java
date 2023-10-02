package Clase_x_11_Arrays;

public class Arrays_IV {
    public static void main (String[] args){
        double acumulado;
        double interes= 0.10;

        double [][] saldo = new double[6][5];
        for (int i=0; i < 6; i++){
            saldo[i][0]=10000;
            acumulado=1000;
            for (int j=1; j<5; j++){
                acumulado= acumulado+(acumulado*interes);
                saldo[i][j]= acumulado;
            }

            interes= interes+ 0.01; // Sumamos el interes para la segunda columna
        }

        // Como leer esto
        for (int m=0; m<6; m++){
            for (int n=0; n<5; n++){
                System.out.println("Elemento fila: ["+ (m+1)+ "] columna ["+(n+1)+"] ="+ saldo[m][n]);
            }
        }
    }
    
}
