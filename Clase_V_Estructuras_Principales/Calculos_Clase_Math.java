package Clase_V_Estructuras_Principales;

public class Calculos_Clase_Math {
    public static void main(String[] args){
        double raiz= Math.sqrt(10);
        System.out.println("La raiz de 10 es: "+ raiz);

        float num1 = 3.45F;
        int resultado= Math.round(num1);
        System.out.println("Redondear un float es: "+ resultado);

        // Caso especial-  refundicion (casting)
        double num2= 3.45;
        int resultado1= Math.round(((float)num2));
        int resultado2= Math.round(((int)num2));
        System.out.println("El redondeo 1 es: "+ resultado1);
        System.out.println("El redondeo 2 es: "+ resultado2);

        double potencia=Math.pow(5,3);
        System.out.println("5 al cubo es: "+ potencia);
    }
}
