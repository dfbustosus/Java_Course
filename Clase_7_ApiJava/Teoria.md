# API Java

- ¿Qué es?
R// El lugar donde encontramos todos los paquetes con clases predefinidas

## Cómo se estructura
Voy a representar algunos, pero debes saber que hay muchas cosas dentro de cada paquete (piensalo como las carpetas de tu ordenador puedes tener muchas subcarpetas). 


Cada paquete luego entonces tiene sus propias clases

1. Paquetes
   1.1. Java
      1.1.1. java.awt 
      1.1.2. java.util (java.util.regex)
      1.1.3. java.io
      1.1.4. java.lang
   1.2. javax
      1.2.1. javax.activity
      1.2.2. javax.annotation

- ¿Porque son necesarios lo paquetes y para que inventaron eso?

1. Para organizar las clases 
2. Evitar conflictos de nombres
3. Controlar la visibilidad de las clases

## Ejemplo aplicado con algún paquete

**java.lang** paquete por defecto

Dentro de java.lang tenemos por ejemplo las siguientes clases:

1. String (e.g substring(), equals())
2. Math (e.g round(), sqrt(), pow())
3. System
4. Thread

Ahora si quieres usar otra clase que no esta en **java.lang** (que es el default) te va a mostrar un error porque debes importar el paquete e.g `import java.util.*;` o `import java.util.Scanner` o `import java.util.Locale`.

Es mejor importar una clase que importar todas pero es tu decisión que prefieres



