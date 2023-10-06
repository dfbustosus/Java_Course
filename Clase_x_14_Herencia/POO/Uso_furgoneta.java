package Clase_x_14_Herencia.POO;

public class Uso_furgoneta {

    public static void main(String[] args){
        Auto miauto_1= new Auto();
        miauto_1.establecer_color("Azul");

        Furgoneta mifurgo_1= new Furgoneta(1000, 7);
        // Ambos objetos tienen definidos el estado inicial
        // Veamos como utlizar la herencia en la furgoneta
        mifurgo_1.establecer_color("Verde");
        mifurgo_1.configura_precio(3000);
        mifurgo_1.configura_radio("si");

        System.out.println(miauto_1.dar_datos()+ " color: "+ miauto_1.dar_color());
        System.out.println(mifurgo_1.dar_datos()+ " color: "+ mifurgo_1.dar_color());
        System.out.println(mifurgo_1.dardatosfurgoneta()); // este metodo solo es de furgoneta no del Coche

    }
    
}
