# Eventos
Para java son objetos los eventos

3 factores importantes a tener presente:

1. ¿Que desencadena la accion? >> Objeto `Evento`
2. ¿Quien desencadena la accion? >> Objeto `Fuente`
3. ¿Quien recibe la accion? >> Objeto `Listener`

# Objeto Evento

Clase `EventObject` de ella descienden 

1. Clase `ActionEvent` >> paquete `Java.awt.event`
2. Clase `WindowEvent` >> paquete `Java.awt.event`

Ejemplo: Imagina que tengas un boton en una lamina y que al pulsarlo el fondo del marco se ponga de color verde o rojo

- Objeto fuente Clase `JButton` con método `addActionListener()`
- Objeto Listener Clase `JPanel` con interfaz `ActionListener` y metodo `actionPerformed()`
