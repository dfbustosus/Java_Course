# Jerarquia de clases y abstracción

Pensemos en lo que habíamos construido hasta ahora

clase Empleado >> Clase Jefe >> Clase Director

- La clase más especializada es Director porque hereda todos los metodos de empleado y Jefe
- Ahora si quisieramos hacer una mejor definición de las clases podríamos hacer algo como esto

1. Persona >> Empleado >> Jefe >> Director
2. Persona >> Alumno

Piensa en que persona puede tener un metódo que se llame `darnombre()` y a la vez puede tener otro que se llama `dardescripcion`, pero en el caso de `darnombre()` si podríamos utilizar la misma información porque no importa si eres un empleado, Jefe, Director o Alumno siempre tendrás un nombre

Pero en el segundo caso, el metódo `dardescripcion` no tendra la misma información para todos, es por esto que este sería un metódo abstracto.

Para crear un metodo abstracto debemos utilizar la siguiente notacion:

```java
public abstract String dardescripcion();
```
Por regla si una clase tiene 1 o más metódos abstractos debe declararse como abstracta, para hacerlo seguimos esta notación

```java
abstract class persona{
    // Constructor
    // etc
}
```

Luego entonces en todas las clases que quieras usar `dardescripcion()` (Empleado, Jefe, Director, Alumno) vas a tener que generar un código distinto para cada una con esta notación

```java
public String dame_descripcion(){
    return "Descripcion;
}
```
