package Clase_III_Estructuras_Principales;

public class Variables {
    public static void main(String[] args){
        // Comentario de una linea
        
        /*Comentarios largos
        de mas de una linea
        */ 
        
        byte edad; // declaración
        edad = 25; // inicialización
        // puedes declararlo como int, long, short si quieres

        int edad_2 = 25; // declaracion & inicializacion al tiempo
        //POO: System tiene muchos metodos por ejemplo .out.println()
        System.out.println("Valor original de edad: "+edad); // imprimir variable
        System.out.println("Edad 2: "+ edad_2);

        edad = 30; // si haces esto modificas el valor de la variable
        System.out.println("Nuevo valor de edad:"+edad); // imprimir variable
    }
}