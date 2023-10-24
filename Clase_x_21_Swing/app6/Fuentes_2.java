package Clase_x_21_Swing.app6;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Fuentes_2 {
    public static void main(String[] args){
        marco_fuentes marco_prueba= new marco_fuentes();
        marco_prueba.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco_prueba.setVisible(true);
    }
    
}

class marco_fuentes extends JFrame{
    public marco_fuentes(){
        setTitle("Prueba de fuentes");
        setSize(400, 400);
        lamina lamina_david= new lamina();
        add(lamina_david);
        //lamina_david.setForeground(Color.BLUE); // Si quieres dejar todo de un mismo color en la lamina

    }
}

class lamina extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponents(g);
        Graphics2D g2= (Graphics2D) g;
        Font mi_fuente= new Font("Arial", Font.BOLD, 15);
        g2.setFont(mi_fuente);
        g2.setColor(Color.RED);
        g2.drawString("David", 100, 150);

        g2.setFont(new Font("Courier", Font.ITALIC, 18));
        g2.setColor(new Color(150, 130, 80));
        g2.drawString("Pedro", 100, 200);

    }
}