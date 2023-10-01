package Clase_x_10_Bucles;
import javax.swing.JOptionPane;
public class For_2 {
    public static void main (String args[]){
        // Evaluar si un correo es valir o no solo verificando arroba
        String correo = JOptionPane.showInputDialog("Ingresa tu correo: ");
        //boolean arroba = false;
        int arroba = 0;
        boolean punto =false;
        for (int i=0; i< correo.length(); i++){
            if (correo.charAt(i) == '@'){
                //arroba = true;
                arroba++;
            } 
            if (correo.charAt(i)=='.'){
                // Que tenga al menos un punto
                punto = true;
            }
        }

        if (arroba== 1 && punto ==true){
            System.out.println("Email valido");
        }else {
            System.out.println("No es correcto");
        }
        // Ahora  te preguntaras con esto es suficiente bueno no se pueden verificar muchas mas cosas
    }
}
