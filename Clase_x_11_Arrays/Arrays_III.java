package Clase_x_11_Arrays;

public class Arrays_III {
    public static void main(String[] args){
        // Ejemplo 
        int [][] matriz = {{1,2},{3,4},{5,6}};
        int filas= matriz.length;
        int columnas= matriz[0].length;
        System.out.println("Filas: "+ filas + " Columnas: "+ columnas);

        for (int i=0; i<filas; i++){
            for (int j=0; j< columnas; j++){
                System.out.println("Elemento fila: ["+ (i+1)+ "] columna ["+(j+1)+"] ="+ matriz[i][j]);
            }
        }

        // for each (Como hacer lo mismo)
        for (int[] fila:matriz){
            System.out.println(" ");
            for (int z:fila){
                System.out.println("Elemento: "+z);
            }
        }

    }
}
