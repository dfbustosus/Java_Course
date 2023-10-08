package Clase_x_18_Tipos_enumerados;
import java.util.Scanner;
public class Uso_valores2 {

    enum Valores2{
        MINI("S"),MEDIANO("M"),GRANDE("L"),MUY_GRANDE("XL");
        // Constructor
        private Valores2(String abreviatura){
            this.abreviatura= abreviatura;
        }
        private String abreviatura;

        // Metodo Getter
        public String darAbreviature(){
            return abreviatura;
        }
    }

    public static void main (String[] args){
        Scanner entrada= new Scanner(System.in);
        System.out.println(" Escribe una tablla: MINI, MEDIANO, GRANDE, MUY_GRANDE");
        String entrada_datos= entrada.next().toUpperCase();
        Valores2 val= Enum.valueOf(Valores2.class, entrada_datos);
        System.out.println(" Talla = "+ val);
        System.out.println("Abreviatura es = "+ val.darAbreviature());
    }
    
}
