# Polimorfismo y principio de sustitución

**Principio de sustitución** se puede usar un objeto de la subclase siempre que el programa espere un objeto de la superclase. De forma sencilla : 

Un objeto se puede comportar de diferente forma dependiendo del contexto. Las variables objeto son *polimorficas*


# Enlazado dinamico

Capacidad que tiene Java para detectar la clase y al metodo al que tiene que llama. Es decir la maquina de Java sabe en tiempo de ejecucion a que metodo de la clase padre tiene que usar cuando hay herencia

# Metodos Constantes y clases constantes

Esto implica que si hay herencia no se pueden heredar metodos o atributos de una clase

Lo mismo ocurre con los metodos

```java
final class Director extends Jefe{
    public Director(String nom, double sue, int ao, int mes, int dia){
        super(nom, sue, ao,mes, dia);
    }
}
```

```java
// Metodo getter para el sueldo final + incentivo (sobre escribiendo)
final public double dar_sueldo(){ // final define que el metodo ya no se podra seguir heredando (OJO)
    double sueldo_jefe= super.dar_sueldo(); // especificando que llame a clase padre
    return incentivo+sueldo_jefe;
}
```