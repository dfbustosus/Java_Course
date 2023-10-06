package Clase_x_14_Herencia.POO;
import java.util.Date; // Importar Date
import java.util.GregorianCalendar; // Importar GregorianCalendar
// Crear constructor (Clase para dar estado inicial)
class Empleado_x{
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

    private String nombre;
    private double sueldo;
    private Date altacontrato;    
}


// Solo una clase debe ser publica 
public class Empleado {
    public static void main(String[] args){
        // Creamos instancias
        Empleado_x empleado1= new Empleado_x("David", 120000, 2010, 12, 19);
        Empleado_x empleado2= new Empleado_x("Andres", 100000, 2008, 7, 5);
        Empleado_x empleado3= new Empleado_x("Carlos", 90000, 2009, 6, 3);

        empleado1.subir_sueldo(5);
        empleado2.subir_sueldo(5);
        empleado3.subir_sueldo(5);

        System.out.println("Nombre: "+ empleado1.darnombre()+ " Sueldo: "+ empleado1.dar_sueldo()+
        " Alta contrato: "+ empleado1.dar_fecha());
        System.out.println("Nombre: "+ empleado2.darnombre()+ " Sueldo: "+ empleado2.dar_sueldo()+
        " Alta contrato: "+ empleado2.dar_fecha());
        System.out.println("Nombre: "+ empleado3.darnombre()+ " Sueldo: "+ empleado3.dar_sueldo()+
        " Alta contrato: "+ empleado3.dar_fecha());

        System.out.println("-----------------------");
        // Una forma mas sencilla con arrays -for
        Empleado_x[] misempleados = new Empleado_x[3];
        
        misempleados[0]= new Empleado_x("David", 120000, 2010, 12, 19);
        misempleados[1]= new Empleado_x("Andres", 100000, 2008, 7, 5);
        misempleados[2]= new Empleado_x("Carlos", 90000, 2009, 6, 3);
        // For simple
        for (int i=0; i<3; i++){
            misempleados[i].subir_sueldo(5);
        }
        for (int i=0; i<3; i++){
            System.out.println("Nombre: "+ misempleados[i].darnombre()+ 
            " Sueldo: "+ misempleados[i].dar_sueldo()+
            " Fecha alta: "+ misempleados[i].dar_fecha());
        }
        System.out.println("-----------------------");
        // For mejorado
        for (Empleado_x e: misempleados){
            e.subir_sueldo(5);
        }
        for (Empleado_x e: misempleados){
            System.out.println("Nombre: "+ e.darnombre()+ 
            " Sueldo: "+ e.dar_sueldo()+
            " Fecha alta: "+ e.dar_fecha());
        }

    }
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
    public double dar_sueldo(){
        double sueldo_jefe= super.dar_sueldo(); // especificando que llame a clase padre
        return incentivo+sueldo_jefe;
    }
}
