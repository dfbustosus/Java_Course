package Clase_x_19_Interfaces;
import java.lang.reflect.Array;
import java.util.Date; // Importar Date
import java.util.GregorianCalendar; // Importar GregorianCalendar
import java.util.Arrays;
// Crear constructor (Clase para dar estado inicial)
class Empleado_x implements Comparable{
    public Empleado_x(String nom, double sue, int ao, int mes, int dia){
        nombre= nom;
        sueldo= sue;
        GregorianCalendar fecha= new GregorianCalendar(ao, mes-1, dia);
        altacontrato= fecha.getTime(); // Obtener la fecha de la clase
    }
    // Metodo Getter- nombre
    public String darnombre(){
        return nombre;
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

    // Metodo compareTo (Basados en el sueldo) >>>>>>>>< SORT >>>>>>>>
    public int compareTo(Object miobjeto){
        Empleado_x otroEmpleado= (Empleado_x) miobjeto;
        if (this.sueldo < otroEmpleado.sueldo){
            return -1;
        }
        if (this.sueldo> otroEmpleado.sueldo){
            return 1;
        }
        return 0; // Caso restante
    }

    private String nombre;
    private double sueldo;
    private Date altacontrato;    
}

// Herencia
class Jefe extends Empleado_x{
    public Jefe(String nom, double sue, int ao, int mes, int dia){
        super(nom, sue, ao,mes, dia);
    }
    private double incentivo;

    // Metodo setter
    public void establecer_incentivo(double b){
        incentivo=b;
    }
    // Metodo getter para el sueldo final + incentivo (sobre escribiendo)
    final public double dar_sueldo(){ // final define que el metodo ya no se podra seguir heredando (OJO)
        double sueldo_jefe= super.dar_sueldo(); // especificando que llame a clase padre
        return incentivo+sueldo_jefe;
    }
}

// final se usa para detener la herencia entre clases
final class Director extends Jefe{
    public Director(String nom, double sue, int ao, int mes, int dia){
        super(nom, sue, ao,mes, dia);
    }
}

// Solo una clase debe ser publica 
public class Empleado_Uso {
    public static void main(String[] args){
        // Jefes
        Jefe jefe_RH=new Jefe("David BU", 10000, 2020, 12, 19);
        System.out.println(jefe_RH.dar_fecha());
        jefe_RH.establecer_incentivo(10000);

        // Una forma mas sencilla con arrays -for
        Empleado_x[] misempleados = new Empleado_x[5];
        
        misempleados[0]= new Empleado_x("David", 120000, 2010, 12, 19);
        misempleados[1]= new Empleado_x("Andres", 100000, 2008, 7, 5);
        misempleados[2]= new Empleado_x("Carlos", 90000, 2009, 6, 3);
        misempleados[3]= jefe_RH; // Polimorfimos en accion (Principio de sustitucion)
        misempleados[4]=new Jefe("Andrea", 5000, 2023, 10, 5); // Otra forma de polimorfismo
        // Refuncion o Casting sobre objetos en Arrays
        Jefe jefa_2 = (Jefe) misempleados[4];
        jefa_2.establecer_incentivo(10000);
        
        // For mejorado para subir sueldo a todo
        for (Empleado_x e: misempleados){
            e.subir_sueldo(5);
        }

        Arrays.sort(misempleados);// Ordenamiento de empleados con metodo sort
        // For para imprimir resultados

        for (Empleado_x e: misempleados){
            System.out.println("Nombre: "+ e.darnombre()+ 
            " Sueldo: "+ e.dar_sueldo()+
            " Fecha alta: "+ e.dar_fecha());
        }
        // Debra estar ordenado los valores por sueldo ascendente
    }
}
