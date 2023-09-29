package Clase_6_String;

public class String_I {
    public static void main (String[] args){
        String nombre ="David";
        System.out.println("Mi nombre es: " +nombre);
        // Algunos metodos
        // 1. lenght
        System.out.println("Mi nombre tiene :"+ nombre.length()+ " caracteres");
        // 2. charAt
        System.out.println("La primera letra de mi nombre es: "+ nombre.charAt(0));
        int ultima_letra= nombre.length();
        System.out.println("La ultima letra de mi nombre es: "+ nombre.charAt(ultima_letra-1));
        // 3. substring (primer indice inclusivo, segundo indice exclusivo)
        String frase ="Estamos aprendiendo el lenguaje de programacion Java";
        System.out.println(frase.substring(23, frase.length()));
        // Concatenar strings
        String s1= "Hola como estas";
        String s2= " mi nombre es David";
        System.out.println("Frases concatenadas: " + s1+ s2);
        // 4. equals (distingue mayus de minus)
        String al1, al2, al3;
        al1="David"; al2= "David"; al3="david";
        System.out.println("Cadenas son iguales: "+ al1.equals(al2));
        System.out.println("Cadenas son iguales: "+ al1.equals(al3));
        // 5. equalsignorecase (compara ignorando el case)
        System.out.println("Cadenas son iguales: "+ al1.equalsIgnoreCase(al3));
        // Donde encontrar más metódos: https://docs.oracle.com/javase/8/docs/api/java/lang/String.html
    }
}
