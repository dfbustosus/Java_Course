package Clase_x_14_Herencia.POO;

public class Furgoneta extends Auto {
    private int capacidad;
    private int personas;

    public Furgoneta(int capacidad, int personas){
        super(); // llamar constructor clase padre
        this.capacidad= capacidad; 
        this.personas= personas;
    }

    // Metodo getter
    public String dardatosfurgoneta(){
        return "La capacidad es: "+ capacidad+ " y la cantidad maxima de personas es: "+ personas;
    }
    
}
