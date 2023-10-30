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

# Eventos de Ventana

- Interfaz ```Window Listener``` que implementa 7 metodos

**Estamos obligados a construir los 7 metodos de acá abajo** debido a la estructura de interfaces.

1. `windowActivated(WindowEvent e)`
2. `windowClosed(WindowEvent e)`
3. `windowClosing(WindowEvent e)`
4. `windowDeactivate(WindowEvent e)`
5. `windowDeinconified(WindowEvent e)`
6. `windowiconified(WindowEvent e)`
7. `windowOpened(WindowEvent e)`

Cuando una ventana cambia de estado también es útil conocer la interfaz `WindowStateListener` con un solo método `windowsStateChanged(WindowEvent e)`. 

`WindowEvent` tambien es una clase con dos métodos principales
1. `getNewState()`: estado nuevo de ventana
2. `getOldState()`: estado posterior ventana

# Clases adaptadoras

1. `KeyAdapter` (No por el momento)
2. `WindowAdapter` con interfaces como `WindowFocusListener`, `WindowsStateListener`, `WindowListener` y `EventListener`
3. `MouseAdapter` (no por le momento)






