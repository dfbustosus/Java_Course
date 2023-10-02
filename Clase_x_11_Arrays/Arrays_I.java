package Clase_x_11_Arrays;
import java.util.Arrays;
public class Arrays_I {
    public static void main (String args[]){
        // Declaracion 1
        int [] matriz= new int[5];
        matriz[0]=3;matriz[1]=4;matriz[2]=5;
        matriz[3]=7;matriz[4]=8;
        // Declaracion 2
        int matriz_2[]= new int[5];
        matriz_2[0]=3;matriz_2[1]=4;matriz_2[2]=5;
        matriz_2[3]=7;matriz_2[4]=8;
        // Declaracion 3
        int [] matriz_3 = {3,4,5,7,8};
        // Importante no se puede  usar == ya que los arrays no son datos primitivos
        System.out.println("Matriz 1 igual a Matriz 2 =: "+ Arrays.equals(matriz, matriz_2));
        System.out.println("Matriz 1 igual a Matriz 3 =: "+ Arrays.equals(matriz,matriz_3));

        // System.out.println(matriz.length);
        for (int i=0; i<matriz.length; i++){
            System.out.println("Elemento "+ i + " = "+ matriz[i]);
        }

    }
    
}
