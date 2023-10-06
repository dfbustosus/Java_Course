# Herencia

Es lo mismo que en la vida real solo que a objetos en Java

La idea principal es la **reutilización de código**

Por ejemplo cuando quieres crear clases que se construyan a partir de otras

**Notación general**

```java
public class Furgoneta extends Auto {
    private int capacidad;
    private int personas;

    public Furgoneta(int capacidad, int personas){
        super(); // llamar constructor clase padre
        this.capacidad= capacidad; 
        this.personas= personas;
    }
    
}
```

- Furgoneta (Subclase o Clase hija/o) mientras qe Coche (Super clase o Clase Padre)

**Nota** Java no admite herencia múltiple como en otros lenguajes aunque para resolver esto se crearon interfaces y otras estructuras

# Como diseñar la herencia

La regla de **Es un...**

Por ejemplo la Furgoneta es un Coche? en este caso no aplica

El diseño sería mejor de la siguiente forma:

Vehiculo y luego heredando en Coche, Furgoneta, Camion, Moto

- Un Coche es un vehiculo >>> Si
- Un Furgoneta es un vehiculo >>> Si
- Un Camion es un vehiculo >>> Si
- Un Moto es un vehiculo >>> Si

**OJO** recuerda que no existe herencia múltiple

Ejemplo: 
- Un Jefe es un empleado? Siempre
- Un empleado es un Jefe? Siempre

**Entonces Jefe es una subclase de Empleado**