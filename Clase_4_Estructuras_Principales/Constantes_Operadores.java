package Clase_4_Estructuras_Principales;

public class Constantes_Operadores{
    public static void main(String[] args){
        int a=5; // inicializacion+ asignacion en una linea
        int b;
        b=7;
        int c= b+a; // operador aritmetico +
        c++; // operador incremento en 1
        c--; // operador decremento en 1
        c+=3; // incremento en 3
        c-=1; // decremento en 1
        int d = b/a; // Ojo te devuelve un entero a pesar de ser decimal
        double e = ((double)b)/((double)a); // casting para obtener decimal
        System.out.println("C vale: "+c);
        System.out.println("D vale: "+d);
        System.out.println("e vale: "+e);

        // Constantes
        final int cte= 3;
        System.out.println("El valor de cte es: "+ cte);
        final double apulgadas= 2.54;
        double cm= 4;
        double resultado= cm/apulgadas;
        System.out.println("En " + cm + " hay "+ resultado + " pulgadas");

        // Asignacion multiples
        int r1,r2,r3;
        r1= 2; r2=3; r3=4;

        // No vamos a ver todavia operadores logicos porque necesitamos ver condicionales primero







    }
}