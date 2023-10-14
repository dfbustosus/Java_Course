package Clase_x_19_Interfaces;
import javax.swing.JOptionPane;
import javax.swing.Timer;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class PruebaTemporizadir {
    public static void main(String[] args) {
        darHora oyente = new darHora();
        Timer miTemporizador = new Timer(5000, oyente);
        miTemporizador.start();

        JOptionPane.showMessageDialog(null, "Pulsa aceptar para detener");
        System.exit(0);
    }
}

class darHora implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        Date ahora = new Date();
        System.out.println("La hora cada 5 segundos: " + ahora);
        Toolkit.getDefaultToolkit().beep(); // Sonido del sistema
    }
}

