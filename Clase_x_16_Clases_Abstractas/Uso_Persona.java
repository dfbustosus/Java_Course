package Clase_x_16_Clases_Abstractas;
import java.util.Date;
import java.util.GregorianCalendar;

// Clase abstracta
abstract class Persona{
    // 1. Constructor
    public Persona (String nom){
        nombre=nom;
    }
    // 2. Metodo getter
    public String dar_nombre(){
        return nombre;
    }
    // 3. Metodo abstracto getter
    public abstract String dar_descripcion(); // Metodo abstracto
    // 4. Definición de atributos
    private String nombre;

}

class Empleado_x extends Persona{
    public Empleado_x(String nom, double sue, int ao, int mes, int dia){
        super(nom);// Herencia
        sueldo= sue;
        GregorianCalendar fecha= new GregorianCalendar(ao, mes-1, dia);
        altacontrato= fecha.getTime(); // Obtener la fecha de la clase
    }
    // Metodo Getter-sueldo
    public double dar_sueldo(){
        return sueldo;
    }
    // Metodo getter -fecha
    public Date dar_fecha(){
        return altacontrato;
    }
    // Metodo setter- sueldo
    public void subir_sueldo(double porcentaje){
        double aumento= sueldo*porcentaje/100;
        sueldo += aumento;
    }
    // Metodo dar_descripcion
    public String dar_descripcion(){
        return "Este empleado tiene un sueldo= " +sueldo;
    }

    private double sueldo;
    private Date altacontrato;    
}

class Alumno extends Persona{
    public Alumno (String nom, String car){
        super(nom);
        carrera= car;
    }
    // Metodo dar descripcion
    public String dar_descripcion(){
        return "Este alumno esta en una carrera= "+ carrera;
    }
    private String carrera;
}

public class Uso_Persona{
    public static void main(String[] args){
        Persona[] personas= new Persona[2];
        personas[0]= new Empleado_x("David", 10000, 2023, 12, 19);
        personas[1]=new Alumno("David", "Ciencia");

        for (Persona t: personas){
            System.out.println(t.dar_nombre()+", "+t.dar_descripcion());
        }

    }
}

