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

## Clases internas locales

- Son unca clase dentro de un metódo

**¿Cuando las usamos y porque?**

- Cuando solo se va a utilizar (instanciar) la clase interna una vez. El objetivo es simplificar el código
- Su ambito queda restringido al mtódo donde son declaradas

**Ventajas**

- Estas muy *encapsuladas*. Ni siquiera la clase a la que pertenecen pueden acceder a ella. Tan solo puede acceder a ella el metódo donde están declaradas
- El código resulta más simple

```java
class Clase_externa{
    public void metodo(){
        class clase_interna_local{
            codigo_clase_interna
        }
    codigo_metodo
    }
codigo_clase_externa
}
```

