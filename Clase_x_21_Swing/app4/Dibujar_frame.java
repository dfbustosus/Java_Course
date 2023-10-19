package Clase_x_21_Swing.app4;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;

public class Dibujar_frame {
    public static void main (String[] args){
        marcodibujo mi_marco= new marcodibujo();
        mi_marco.setVisible(true);
        mi_marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        laminafiguras mi_lamina = new laminafiguras();
        mi_marco.add(mi_lamina);
    }

}

class marcodibujo extends JFrame{
    public marcodibujo(){
        setTitle("Prueba dibujos david");
        setSize(400, 400);
        setLocation(200, 150);
    }
}

class laminafiguras extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        // x,y = posicion inicio esquina superior izquierda (todo en pixeles)
        g.drawRect(50, 50, 200, 200);
        g.drawLine(10, 300, 50, 100);
        g.drawArc(50, 100, 100, 200, 120, 150);
    }
}