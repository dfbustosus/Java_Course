# Modificadores de acceso

| Modificador      | Clase |Paquete |Subclase |Todos |
| ----------- | ----------- |-------|-------|-------|
| Public      | Si       | Si | Si | Si |
| Protected   | Si        | Si | Si | No |
| Private   | Si        | No | No | No |
| Por defecto   | Si        | Si | Si | No |

Se declaran antes de variables o metodos. 

1. **Public** : Variable/método es visible desde la propia clase, paquete y subclase
2. **Protected**:  Es muy parecido a por defecto aunque permite ser accedido desde subclases en otros paquetes
3. **Private**: Variable/método es accesible desde la propia clase pero no desde ningún otro sitio. Ponerlo en una variable es muy frecuente aunque también es posible ponerlo en algunos métodos
4. **Por defecto**: No poner nada antes de la variable/método. No es accesible desde **subclases que esten en otros paquetes** 

# Clase Object

Se le llama la super cosmica porque es la clase que esta en la cúspide de las clases Java, tanto las nuestras como las que aparecen en la API de java **(No importa cual clase estes usando)**

Así que cuando crees cualquier objeto/instancia vas a poder obtener los metodos de Object **SIEMPRE**

