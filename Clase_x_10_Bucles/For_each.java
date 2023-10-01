package Clase_x_10_Bucles;
import java.util.ArrayList;
import java.util.List;

public class For_each {
    public static void main(String[] args){
        // Una ArrayList para luego iterar sobre el
        List<String> colores = new ArrayList<>();
        colores.add("Rojo");
        colores.add("Verde");
        colores.add("Azul");

        System.out.println("Iterando sobre lista:");
        for (String color:colores){
            System.out.println(color);
        }
    }
    
}
