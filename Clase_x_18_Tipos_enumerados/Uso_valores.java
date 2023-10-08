package Clase_x_18_Tipos_enumerados;

public class Uso_valores {
    // El enum tiene que ser creado fuera del main
    enum Categorias{MINI, MEDIANO, GRANDE, MUY_GRANDE}

    public static void main(String[] args){
        // Tipo enumerado :  variable objeto de tipo enum donde solo se puede almacenar un grupo de valores
        // ningun otro tipo de valores podra ser guardado
        Categorias d= Categorias.MINI; // Metodos estaticos
        Categorias m= Categorias.MEDIANO;
    }
}

