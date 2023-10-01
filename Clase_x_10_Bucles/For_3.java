package Clase_x_10_Bucles;
import javax.swing.JOptionPane;;
public class For_3 {
    public static void main(String args[]){
        // Factorial de un numero e.g 6! = 5*4*3*2*1
        long r= 1L; // Ojo como defines tu formatos
        int num= Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
        for (int i= num; i>0; i--){
            r= r*i;
        }
        System.out.println("El factorial de tu numero "+ num + " es:"+ r);
    }
}
