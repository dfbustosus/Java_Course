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
class Jefe extends Empleado_x implements Jefes{
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
    //////////////////////////////////////////////////////////////7
    /// PARTE 2 INTERFACES
    public String tomar_decisiones(String decicion){
        return "Uno de los jefes tomo la decision de "+ decicion;
    }
    //////////////////////////////////////////////////////////////7
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

        // Principio de sustitucion
        Empleado_x director_comercial = new Jefe("Andres", 50000, 2022, 10, 5);
        // La clase Empleado implementa la interfaz empleado luego entonces
        // podemos crear una instancia de la interfaz pero decirle que es de tipo Empleado
        Comparable ejemplo = new Empleado_x("Juan", 20000, 2023, 11, 10);

        // Uso de instanceof para detectar si una instancia pertenece a una clase o no
        if(director_comercial instanceof Empleado_x){
            System.out.println("director_comercial Pertenece a Jefe");
        }
        if(ejemplo instanceof Comparable){
            System.out.println("ejemplo es de tipo interfaz comparable");
        }
        
        //////////////////////////////////////////////////////////////7
        /// PARTE 2 INTERFACES
        System.out.println(jefa_2.tomar_decisiones("Dar más bono de vacaciones"));
        //////////////////////////////////////////////////////////////7

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
