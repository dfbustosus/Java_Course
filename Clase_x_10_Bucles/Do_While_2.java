package Clase_x_10_Bucles;
import javax.swing.JOptionPane;

public class Do_While_2 {
    public static void main (String args[]){
        String genero ="";
        // hacer siempre que no introduzca una H,h,M,m
        do{
            genero= JOptionPane.showInputDialog("Introduce tu genero (H/M):");
        }while(genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false);

        // Recibir la altura con metodos estaticos
        int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura en cm: "));
        int pesoideal=0;
        if (genero.equalsIgnoreCase("H")){
            pesoideal= altura-110;
        }else if (genero.equalsIgnoreCase("M")){
            pesoideal= altura-120;
        }
        System.out.println("El peso ideal es: "+ pesoideal + " kg");
    }
    
}
