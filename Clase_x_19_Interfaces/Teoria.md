# Interfaces

Conjunto de directrices que deben cumplir las clases

Algo muy parecido a lo que se vio en Clases abstractas

Ejemplo

Clase 1 Hereda una Interfaz 1

Esto implica que la Clase 1 tiene todos los metódos de la interfaz

**Las interfaces establecen los comportamientos (directrices) a cumplir por las clases**

# Caracteristicas de interfaces

Hay interfaces predefinidas y puedes crear las tuyas propias

1. Solo pueden contener metodos abstractos y constantes
2. No pueden tener variables si constantes
3. Se alacenan en ficheros en ficheros .class (a la hora de compilar por cada interfaz)
4. No se pueden instanciar (no uso del operador new)
5. Todos sus metodos son public y abstract. No se implementan

# Cual es la diferencia con una clase abstracta?

Hay que recordar que en Java no se permite herencia múltiple en ese sentido si tuvieramos una clase que hereda de otra y quisieramos crear una clase abstracta de la cual también pueda heredar no podríamos.

En ese caso es cuando las interfaces ayudan porque la clase puede heredar de otra pero también esa misma clase se le pueden asociar múltiples interfaces de las cuales puede utilizar todos los metódos disponibles sin problema

En notación sería:

```java
class Jefe extends Empleado implements Interfaz1,Interfaz2
```

