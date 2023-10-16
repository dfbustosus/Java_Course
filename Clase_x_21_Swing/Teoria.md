# Aplicaciones Graficas SWING

- Java 1.0: AWT (Abstract Window Toolkit) delegaba la creación y comportamiento de interfaz al S.O huesped. Para aplicaciones graficas sencillas AWT funcionaba bien pero no siempre

- Java 1.1: SWING los elementos de nterfaz se pintan sobre una ventana. Este paquete mejora muchas de las cosas de AWT añadiendo muchas más features. Esto es más costoso porque tienes que diseñar el dibujo 

# Jerarquia

1. Paquete `java.awt`
    1.1 Clase `Frame`

2. Paquete `javax.swing`
    2.1 Clase `JFrame` >> Hereda de Clase `Frame`

```java
Class JFrame extends Frame
```

# Caracteristicas de Frames (marcos)

- Nacen invisibles. Se necesitan el metódo `setVisible` para hacerlos visibles
- Nacen con un tamaó inutil. Se necesita el metódo `setsize` para darles tamaño
- Conviene decir que debe hacer el programa si se cierra un frame

# Métodos importantes de JFrame
1. Object
2. Component > (`setLocation(x,y)`, `setBounds(x,y,anchonlargo)`)
3. Container
4. Window > (`setIconImage(Image image)`)
5. Frame > (`setTitle(String title)`)
6. JFrame > (`setResizeble(boolean resizable)`)

