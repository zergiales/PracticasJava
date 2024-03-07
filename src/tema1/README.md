# Tema 1
>
> Vamos a dar los Objetos y las clases
-----------

 1. Objetos y clases
 2. Creación de objetos
 3. Invocación de métodos
 4. Parámetros
 5. Tipos de datos
 6. Instancias múltiples
 7. Estados
 8. ¿Qué es lo que contiene un objeto?
 9. Código Java
 10. Interacción entre objetos
 11. Código fuente
 12. Otro ejemplo
 13. Valores de retorno
 14. Objetos como parámetros
 15. Resumen [de conceptos]

-----------

# Introduccion
>
> La programación orientada a objetos (_POO_) es un tipo de programacion que desciende del paradigma de programación imperativa.

# Clase

- Es el elemento básico de programación enun paradigma orientado a objetos.
- En ella se describe:
  - Un posible conjunto de datos [CAMPOS, PROPIEDADES o AMBOS, dependiendo del lenguaje de programación empleado].
  - Un cojunto de operaciones a realizar sobre ellos (métodos),constructores y destructores.

**_Nota_**: todos estos elementos son conocidos como **miembros**

- A partir de una clase se podrán instanciar tantos objetos de esta como sean necesarios.

> Una clase es una plantilla a partir de la cual definir y crear objetos.
-------

### Representacion de las clases
>
>Las clases se representan en UML en diagramas de clase mediante una caja dividida en tre áreas en la que se especifican el _nombre_
de la clase y sus _miembros_.

- _Área superior_: muestra el _nombre_ de la clase representada **(_Persona_)**.
- _Área intermedia_: contiene los _campos_ de la clase **(_DNI_,_nombre_,_apellido1_,_apellido2_)**.
- _Área inferior_: recoge los diferentes _métodos_ de la clase (en este caso solo tenemos el método constructor _Persona_).

<img src="../tema1/Assets/img/Diagrama%20de%20clase.png" width="450" height="450">

-------

## Campo
>
>Se denomina campo a un elemento que se comporta como una variable propia de cada instancia de una clase y que define un atributo de un objeto.

- Podemos almacenar datos, y sus valores pueden ser inicializados, modificados y leídos directamente sin ningun tipo de acción adicional.

-------

## Propiedad
>
>Una propiedad al igual que un campo, define un atributo de un objeto.

- La diferencia es que un campo dispone de un área de almacenamiento directamente accesible, la propiedad no tiene asociada una reserva de espacio de memoria para su almacenamiento.

**NOTA:** en realidad permite acceder a un area de almacenamiento a través del campo definido previamente o a través de un método creado para tal efecto.

```java
//GETTERS Y SETTERS 
    
 public String getTitulo() {
  return titulo;
 }
 public void setTitulo(String titulo) {
  this.titulo = titulo;
 }
```

-------

## Método
>
>El método es la implementacion de un algoritmo aplicable a todas las instacias de la clase y qe puede, o no, utilizar los datos contenidos en ella.
Un metodo tomará forma de:

- **_FUNCION:_**
- **_Procedimiento:_**

-------

## Constructor

## Destructor
>
>Se define como aquel método encargado de destruir un ojeto y liberar los recursos que tuviese asignados.

- una clase puede tener un nº indeterminado de destructores. (puede que no se declare ninguno).
**Nota:** En Java no exite este método.

# Objeto
>
>Un objeto es una instancia de una clase determinada.
>Y una instancia es una plantilla donde definimos y creamos un objeto.

- Un objeto es el resultado de crear en tiempo de ejecución un conjunto de datos. que se almacenan en memoria y que tiene una estructura.como la que se describe en su clase.

# Encapsulación

# Abstracción

# Reutilización o reusabilidad

# Visibilidad

# Relaciones entre clases

# Asociación, composición y agregación

### Asociación

### Composición

### Agregación

# Polimorfismo
