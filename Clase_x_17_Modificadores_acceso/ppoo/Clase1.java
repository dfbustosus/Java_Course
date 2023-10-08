package Clase_x_17_Modificadores_acceso.ppoo;

public class Clase1 {
    //int var=10;
    //int var2= 5;
    protected int var=10;
    protected int var2= 5;
    // No hay constructor public Clase1(){} pero java lo asume por default
    // Modificador por default
    /* Caso 1 
    String metodo(){
        return "El valor de mi variable2 es:"+ var2;
    }
    */
    /*Clase 2 */
    protected String metodo(){
        return "El valor de mi variable2 es:"+ var2;
    }
}
