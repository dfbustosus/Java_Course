package Clase_x_11_Arrays;
import javax.swing.JOptionPane;

public class ForEach {
    public static void main (String[] args){
        // Inicializacion
        String [] david = new String[5];
        david[0]="Chile";david[1]="Colombia";
        david[2]="Mexico";david[3]="Argentina";
        david[4]="Peru";

        for (int i=0; i< david.length; i++){
            System.out.println("Pais "+i+ " = "+ david[i]);
        }

        // ForEach (Bastante util para trabajar con arrays)
        for (String d:david){
            System.out.println("Pais : "+d);
        }

        // Rellenar valor
        System.out.println("A continuacion deberas rellenar matriz con 3 valores");
        String [] paises = new String[3];

        for (int j=0; j<paises.length; j++){
            paises[j] = JOptionPane.showInputDialog("Introduce valor"+ (j+1));
        }

        for (String m:paises){
            System.out.println("Pais : "+m);
        }

    }
    
}
