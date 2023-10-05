# Constantes

Valores que no cambian

```java
private final string nombre;
```

# Campos Static

Hacer que todas las entidades compartan un campo 

```java 
public static int Id=1;
```

# Metodo static

- No actuan sobre objetos
- No acceden a campos de ejemplar (variables/ctes declaradas ) a menos que estas sean también static
- Para llamarlos se usa `nombre_calve.nombre_metodo()`

```java
public static String dae_id_siguiente(){
        return "Id siguiente es: "+ IdSiguiente;
    }

// Uso
Empleados.dae_id_siguiente()
```

Otro ejemplo (cuando usabamos Math)

```java
Math.sqrt(9);
Math Pi();
```