# Clases internas (Inner class)

Simplemente son una clase dentro de otra

```java
public class Clase 1 {
    class Clase 2{
        Code_Clase_2
    }
    Code_Clase_1
}
```

# Para que son necesarias

- Para acceder a los campos privados de una clase desde otra clase
- Para ocultar una clase de otras pertenecientes al mismo paquete
- Para crear clases internas **anonimas** muy utiles para gestionar eventos y retrollamadas
- Cuando una clase debe acceder a los campos de ejemplar de otra clase

