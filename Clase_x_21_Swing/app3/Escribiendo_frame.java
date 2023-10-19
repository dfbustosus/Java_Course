package Clase_x_21_Swing.app3;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;

public class Escribiendo_frame {
    public static void main(String[] args){
        marco_con_texto marco= new marco_con_texto();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class marco_con_texto extends JFrame{
    // Crear constructor
    public marco_con_texto(){
        setVisible(true);
        // (0,0) esta en la parte superior izquierda de tu monitor X aumente de izq a derecha 
        // y aumente de arriba hacia abajo
        setSize(600, 450);
        setLocation(400,200);
        setTitle("Texto David");
        lamina lamnina_prueba= new lamina();
        add(lamnina_prueba);

    }
}

class lamina extends JPanel{

    public void paintComponent(Graphics g){
        // Invocar metodo clase padre 
        super.paintComponent(g); // llamando de Jcomponent
        g.drawString("Swing sencillo", 100, 100);
        // x = 100 pixeles del borde izquierdo del marco
        // y = 100 pixeles del borde superior del marco
    }

}
