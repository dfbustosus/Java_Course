package Clase_x_22_Eventos.app9;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class Ejemplo9 {
    public static void main(String[] args){
        MarcoFoco marco_david= new MarcoFoco();
        marco_david.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
   
class MarcoFoco extends JFrame{
    public MarcoFoco(){
        setVisible(true);
        setBounds(150,150,300,300);
        add(new laminaFoco());
    }
}

class laminaFoco extends JPanel{
    JTextField cuadro1;
    JTextField cuadro2;

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        setLayout(null); // Evitar que java ponga elementos con diseó predeterminado
        cuadro1= new JTextField();
        cuadro2= new JTextField();
        // Dar tamaño y posicion a cuadros
        cuadro1.setBounds(60,20,150,20);
        cuadro2.setBounds(60,50,150,20);
        add(cuadro1);
        add(cuadro2);
        LanzaFocos foco1= new LanzaFocos();
        cuadro1.addFocusListener(foco1);
    } 

    private class LanzaFocos implements FocusListener{

        @Override
        public void focusGained(FocusEvent e) {
            // TODO Auto-generated method stub
            System.out.println("Foco ganado");
        }

        @Override
        public void focusLost(FocusEvent e) {
            // TODO Auto-generated method stub
            System.out.println("Foco perdido");
            String email = cuadro1.getText();
            boolean comprobar = false;
            for (int i=0; i <email.length(); i++){
                if ((email.charAt(i)=='@')){
                    comprobar=true;
                }
            }
            if (comprobar){
                    System.out.println("tu email es correcto");
                }else{
                    System.out.println("tu email es invalido");
            }

        }
        
    }

}

