package Clase_x_21_Swing.app4;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

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
        //g.drawRect(50, 50, 200, 200);
        //g.drawLine(10, 300, 50, 100);
        //g.drawArc(50, 100, 100, 200, 120, 150);
        
        // JAVA 2D - Rectangulo 2D
        Graphics2D g2= (Graphics2D) g; // refundición
        Rectangle2D rectangulo = new Rectangle2D.Double(100, 100, 200, 150);
        g2.draw(rectangulo);

        // JAVA 2D - Elipse2D
        Ellipse2D elipse = new Ellipse2D.Double();
        elipse.setFrame(rectangulo); // Rectangulo como limite
        g2.draw(elipse);

        // JAVA 2D - Line2D
        g2.draw(new Line2D.Double(100,100,150,250));

        double centro_x = rectangulo.getCenterX();
        double centro_y = rectangulo.getCenterY();
        double radio = 50;
        Ellipse2D circulo = new Ellipse2D.Double();
        circulo.setFrame(centro_x, centro_y, centro_x-radio, centro_y-radio);
        g2.draw(circulo);

    }
}