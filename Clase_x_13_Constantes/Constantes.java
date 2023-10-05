package Clase_x_13_Constantes;

public class Constantes {
    public static void main (String[] args){
        // Instanciar objetos de empleados
        Empleados t1= new Empleados("David");
        Empleados t2= new Empleados("Andrea");
        Empleados t3= new Empleados("Pedro");
        Empleados t4= new Empleados("Juan");
        // Cambiamos la seccion de un empleado
        t1.cambiaseccion("IT");
        // Mostrar resultados
        System.out.println(t1.muestra_datos());
        System.out.println(t2.muestra_datos());
        System.out.println(t3.muestra_datos());
        System.out.println(t4.muestra_datos());
    }
    
}

class Empleados {
    public Empleados(String nom){
        nombre= nom;
        seccion= "RRHH";
        Id= IdSiguiente;
        IdSiguiente++;
    }
    // SETTER seccion
    public void cambiaseccion(String seccion_x){
        this.seccion= seccion_x;
    }
    // GETTER datos
    public String muestra_datos(){
        return "El nombre es: " + nombre + " y la seccion es: "+seccion + " y el Id es: " +Id; 
    }

    private final String nombre; // constante que no cambia
    private String seccion;
    private int Id; 
    private static int IdSiguiente=1; // Metodo static
}
