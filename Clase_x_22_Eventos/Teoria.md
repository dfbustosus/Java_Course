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

# Eventos de raton
- Interfaz `MouseListener` con la clase `MouseAdapter`
- Dentro de `MouseListener` tenemos distintos metodos como
1. `mouseClicked(MouseEvent e)`
2. `mouseEntered(MouseEvent e)`
3. `mouseExited(MouseEvent e)`
4. `mousePressed(MouseEvent e)`
5. `mouseReleased(MouseEvent e)`

La clase `MouseEvent` tiene distintos metodos como `getX, getY, getModifiers,getClick` y distintos campos de clase como `BUTTON1_DOWN_MASK, BUTTON2_DOWN_MASK, BUTTON3_DOWN_MASK`

#  Eventos de Foco

Esto se refiere a la selección de ventanas o ventana activa. E.g cuando tienes dos ventanas abiertas y eliges una de estas se mantiene seleccionada

## Eventos foco orientados a componentes

Interfaz `FocusListener` con clase `FocusAdapter` y metodos `focusGained(FocusEvent e)` y `focusLost(FocusEvent e)`

## Eventos de foco orientados a ventanas

Interfaz `WindowFocusListener` con la clase `WindowAdapter` y los metodos `windowGainedFocus(FocusEvent e)` y `windowLostFocus(FocusEvent e)`

# Multiples fuentes de eventos

Interfaz `Action` con distintos metodos como
- `setEnabled(boolean b)`
- `putValue(String Clave, Object valor)`
- `addPropertyChanged(propertyChangedListener oyente)`
- `isEnabled(boolean b)`
- `getValue(String clave)`
- `removePropertyChangedListener(PropertyChangedListener oyente)`
- `actionPerformed(Event evento)`

Ademas con la clase `AbstractAction` se pueden implementar todos los metodos de Action
