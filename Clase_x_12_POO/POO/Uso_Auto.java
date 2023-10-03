package Clase_x_12_POO.POO;

public class Uso_Auto {
    public static void main(String[] args){
     // Instanciar la clase
     Auto Mitsubishi= new Auto();  // Ejemplar de clase (Instancia de clase coche)
     // como vemos las propiedades? Si la propiedad esta encapsulada puede usar los metodo
     //System.out.println("Ancho:" + Mitsubishi.ancho);
     System.out.println("Largo:" + Mitsubishi.dar_datos()); // aqui si estaria bien
     // Paso de parametros (sencillo)
     Mitsubishi.establecer_color("Verde"); // obtener el color
     System.out.println("Color es: "+ Mitsubishi.dar_color());
     // Configurar precio
     Mitsubishi.configura_precio(2000); // USD
     System.out.println("El precio es: "+ Mitsubishi.imprime_precio());
     // Configurar radio
     Mitsubishi.configura_radio("si");
     System.out.println(Mitsubishi.imprime_radio());
     
    }
    
}
