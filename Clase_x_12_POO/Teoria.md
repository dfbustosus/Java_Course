# POO = Programacion orientada a objetos

Hay dos **paradigmas** de programación generales:

1. Orientados a procedimientos (entre los 60-70) e.g Fortran Cobol, Basic

**Desventajas**

- Codigo muy grande para aplicaciones complejas
- Código dificil de descrifrar
- No sencillo de reutilizar
- Fallas pequeñas colapsaban todo
- Código espaguetti
- Díficil de depurar

2. Orientados a objetos (más recientes) e.g C++, Java, Visual.NET, Python, etc

- **¿En que consiste?:** Trasladar objetos de la vida real al código
- **¿Que es trasladar objetos de vida real?:** transferir estado y comportamiento de objetos (propiedades/características, que hace, etc)

Un ejemplo sería un **auto**
- ¿Estado de un auto?: parado, circulando, estacionado, etc
- ¿Qué propiedades tiene?: color, peso marca, modelo, tamaño, etc
- ¿Qué comportamientos tiene?: acelerar, frenar, girar, etc

Así mismo puedes pensar en cualquier otra cosa e.g silla, monitor, caja, televisor, humano, etc

**Ventajas**

1. Programas divididos en partes o modulos/clases a esto se le llama **modularización**
2. Reutilizable, **herencia** de metódos o características
3. Si hay fallo el programa puede continuar con el uso de excepciones
4. **Encapsulamiento** puede haber comunicación entre las carecteristicas de un objeto pero usualmente operan de forma independiente

Nota: Un programa de Java es simplemente un conjunto de clases que funcionan como un todo

# Vocabulario POO
- **Clase**:  modelo donde se redactan las características comunes de un grupo de objetos
- **Objeto**: ejemplar perteneciente a una clase. Tienen propiedades y un comportamiento (¿qué son capaces de hacer?)

Como podemos acceder a las propiedades y comportamiento. Para eso utilizamos algo que se conoce como **pseudocódigo**

```java
// Propiedades
Auto.color ="rojo";
Auto.ancho =1300;
Auto.peso =1200;
Auto.alto =900;
// Metódos
Auto.arranca();
Auto.frena();
Auto.gira();
Auto.acelera();
```
- **Instancia de clase**: Una realizacion de la clase. Por ejemplo si tienes una clase Auto y quieres instanciarla puedes usar esto

```java
Auto Mitsubishi= new Auto();  
```

- **Modularización:** tener componentes independientes que funcionan en conjunto. (Dividir programa en trozos/módulos o clases). 

<span style="color:red;font-weight:bold">Solo puede haber una clase con el metódo main.</span>

Ahora bien también es posible crear todo en un fichero con todas las clases pero no siempre es la mejor forma de hacerlo

- **Encapsulamiento**: cada componente del todo (las clases/modulos) se conectan de una forma u otra a través de métodos. Pero se pueden hacer ciertas cosas y otras no dependiendo en que clase estes

```java
private int ruedas; // cuantas hay?
private int largo; // redondeado a int
private int ancho; // redondeado a int
private int motor; // cm^3 del motor
private int peso; // en kg redondeado a int
```

En ese ejemplo `private` impide que la caracteristica sea visible/modificable desde otra clase

Para poder modificar propiedades de una instancia utilizamos lo que se conoce como **Setters y Getters** tambien se conocen como metodos de acceso

1. Setters o definidores: modifican el valor de las propiedades de los objetos
```java
public void nombre_metodo(){codigo}
 public void establecer_color(String color_c){
        //color="Azul";
        color = color_c;

    }
```
**Nunca lleva return los setters, esa es la utilidad de la palabra void**

2. Getters o captadores: devuelven el valor de las propiedades de los objetos

```java
public dato_devolver nombre_metodo(){codigo + return}
//
public String dar_largo(){
        return "El largo del coche es"+ largo;
    }
```

**Siempre aparece el return en los getters**

Se puede configurar el setter y el getter en cualquier order 
- **Herencia**:
- **Polimorfismo**:










