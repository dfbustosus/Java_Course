# Bucles en Java

¿Función? Repetir lineas de código dentro de un programa

## Bucles indeterminados

No sabemos cuantas veces hay que repetir el código (o las líneas de código)

- **While**
```java
while (condicion){
    Linea_1
    Linea_2
    Linea_3
}
```

- **Do-While**
Evalua la condición luego de haber ejecutado una instruccion. Esto te asegura que a pesar de que la condicion sea falsa se ejecutan al menos una vez los procesos en el Do

```java
do{
    Linea_1
    Linea_2
    Linea_3
} while(condicion);
```

## Bucles determinados

Sabemos de antemano cuantas veces hay que repetir el código (o las líneas de código)

- **For**
Iteraciones controladas con contador y condicion

```java 
for (inicio bucle, condicion, contador bucle){
    Linea_1
    Linea_2
    Linea_3
}
```

- **For-each**
Se diseño para iterar osbre arrays y colecciones cuando no necesitas un control de bajo nivel sobre las iteraciones facilitando la vida. 

```java
for (String iterador:collecion){
    Linea_1
    Linea_2
}
```