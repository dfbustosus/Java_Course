package Clase_x_12_POO.POO;
public class Auto {
    // caracteristicas comunes
    private int ruedas; // cuantas hay?
    private int largo; // redondeado a int
    private int ancho; // redondeado a int
    private int motor; // cm^3 del motor
    private int peso; // en kg redondeado a int
    // propiedades que puedan variar
    private String color;
    private int precio_total;
    private boolean radio;

    // Definir los valores a traves de un metodo constructor
    // Metodo constructor: es un metodo especial para dar un estado inicial a nuestro objeto
    // ¿Como se construye? nombre igual al de la clase (public nombre_metodo_constructor() {})

    public Auto(){
        ruedas=4;
        largo=1000;
        ancho=400;
        motor= 1200;
        peso= 500;
    }
    // Metodo GETTER
    public String dar_datos(){
        return "El largo del coche es: "+ largo + " cm"+
        " ruedas :"+ ruedas+ " ancho:"+ ancho + "cm y un peso: "+
        peso +" kg" ;
    }
    // Metodo SETTER
    public void establecer_color(String color_c){
        //color="Azul";
        color = color_c;

    }
    // Metodo GETTER DEL Color
    public String dar_color(){
        return "El color es: "+ color;
    }

    // Metodo SETTER del precio
    public void configura_precio(int valor){
        this.precio_total= valor;
        // La variable de clase se encuentra con this.
    }

    // Metodo GETTER del precio
    public int imprime_precio(){
        return precio_total;
    }

    // Metodo SETTER de radio
    public void configura_radio(String radio_c){
        if(radio_c == "si"){
            this.radio= true;
        }else{
            this.radio= false;
        }
    }
    // Metodo GETTER de radio
    public String imprime_radio(){
        if (radio==true){
            return "Auto tiene radio";
        }else{
            return "Auto no tiene radio";
        }
    }
    // Metodo Setter y getter (No es recomedable pero es posible hacerlo)
    public String imprime_peso_total(){
        int peso_total=0;
        if (this.radio == true){
            peso_total= this.peso+100;
        }else{
            peso_total= this.peso+0;
        }
        return "Precio total: " + peso_total;
    }
}
