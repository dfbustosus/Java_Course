package Clase_x_21_Swing.app5;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.Graphics2D;
import java.awt.SystemColor;
import java.awt.geom.Line2D;


public class Colores {
    public static void main (String[] args){
        marcocolor midavid= new marcocolor();
        midavid.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        midavid.setVisible(true);
    }
    
}

class marcocolor extends JFrame{
    public marcocolor(){
        setTitle("Prueba dibujos david");
        setSize(400, 400);
        laminacolor laminda_d= new laminacolor();
        add(laminda_d);
        //laminda_d.setBackground(Color.ORANGE);
        laminda_d.setBackground(SystemColor.window); // color default sistema operativo
    }
}

class laminacolor extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        // JAVA 2D - Rectangulo 2D
        Graphics2D g2= (Graphics2D) g; // refundición
        Rectangle2D rectangulo = new Rectangle2D.Double(100, 100, 200, 150);
        g2.setPaint(Color.BLUE);
        g2.draw(rectangulo);
        g2.setPaint(Color.RED);
        g2.fill(rectangulo);

        // JAVA 2D - Elipse2D
        Ellipse2D elipse = new Ellipse2D.Double();
        elipse.setFrame(rectangulo); // Rectangulo como limite
        //g2.setPaint(Color.BLUE);
        //g2.setPaint(new Color(0,140,255)); // Color RGB
        g2.setPaint(new Color(0,140,255).brighter()); // Color RGB
        //g2.draw(elipse);
        g2.fill(elipse);
    }
}
