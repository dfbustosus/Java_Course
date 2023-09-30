# Flujo de ejecucioon

Proceso mediante el cual se ejecuta cierto proceso (código).

```java
Public static void main (String args[]){

Linea_1

Linea_2

}```

En Java tenemos dos formas de poder modificar el flujo de ejecución de un programa:

1. Condicionales : dando saltos

**if**: cuando quieres evaluar una única condición

```java
if (condicion){
    Codigo_a_ejecutar;
}else if (condicion_2){
    Codigo_a_ejecutar
}else{
    Condicion_restante
}
```

**switch**: cuando quieres evaluar múltiples condiciones

```java
switch (valor_evaluar){
    case valor_1:
        Codigo_a_ejecutar;
        break;
    case valor_2:
        Codigo_a_ejecutar;
        break;
    default XX
}
```

2. Repetir: bucles (for, while, do-while).
