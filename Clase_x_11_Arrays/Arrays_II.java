package Clase_x_11_Arrays;

public class Arrays_II {
    public static void main (String[] args){
        // Arrays 2D

        int [][] arreglo = new int[3][2];
        arreglo[0][0]= 1;arreglo[0][1]= 1;
        arreglo[1][0]= 2;arreglo[1][1]= 3;
        arreglo[2][0]= 4;arreglo[2][1]= 5;

        System.out.println("Elemento fila 1, columna 2"+ arreglo[0][1]);

        int filas= arreglo.length;
        int columnas= arreglo[0].length;
        
        System.out.println("Filas: "+ filas + " Columnas: "+ columnas);

        for (int i=0; i<filas; i++){
            for (int j=0; j< columnas; j++){
                System.out.println("Elemento fila: ["+ (i+1)+ "] columna ["+(j+1)+"] ="+ arreglo[i][j]);
            }
        }


    }
}
