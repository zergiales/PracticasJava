# Tema 1

> Vamos a dar los Objetos y las clases

---

1.  Objetos y clases
2.  Creación de objetos
3.  Invocación de métodos
4.  Parámetros
5.  Tipos de datos
6.  Instancias múltiples
7.  Estados
8.  ¿Qué es lo que contiene un objeto?
9.  Código Java
10. Interacción entre objetos
11. Código fuente
12. Otro ejemplo
13. Valores de retorno
14. Objetos como parámetros
15. Resumen [de conceptos]

---

# Introduccion

> La programación orientada a objetos (_POO_) es un tipo de programacion que desciende del paradigma de programación imperativa.

# Clase

- Es el elemento básico de programación enun paradigma orientado a objetos.
- En ella se describe:
  - Un posible conjunto de datos [CAMPOS, PROPIEDADES o AMBOS, dependiendo del lenguaje de programación empleado].
  - Un cojunto de operaciones a realizar sobre ellos (métodos),constructores y destructores.

**_Nota_**: todos estos elementos son conocidos como **miembros**

- A partir de una clase se podrán instanciar tantos objetos de esta como sean necesarios.

> Una clase es una plantilla a partir de la cual definir y crear objetos.

---

### Representacion de las clases

> Las clases se representan en UML en diagramas de clase mediante una caja dividida en tre áreas en la que se especifican el _nombre_
> de la clase y sus _miembros_.

- _Área superior_: muestra el _nombre_ de la clase representada **(_Persona_)**.
- _Área intermedia_: contiene los _campos_ de la clase **(_DNI_,_nombre_,_apellido1_,_apellido2_)**.
- _Área inferior_: recoge los diferentes _métodos_ de la clase (en este caso solo tenemos el método constructor _Persona_).

<img src="../tema1/Assets/img/Diagrama%20de%20clase.png" width="400" height="400">

---

## Campo

> Se denomina campo a un elemento que se comporta como una variable propia de cada instancia de una clase y que define un atributo de un objeto.

- Podemos almacenar datos, y sus valores pueden ser inicializados, modificados y leídos directamente sin ningun tipo de acción adicional.

---

## Propiedad

> Una propiedad al igual que un campo, define un atributo de un objeto.

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

---

## Método

> El método es la implementacion de un algoritmo aplicable a todas las instacias de la clase y qe puede, o no, utilizar los datos contenidos en ella.
> Un metodo tomará forma de:

- **_FUNCION:_** si al ser invocado el algoritmo contenido en ella ejecuta una serie de instrucciones y finalmente retorna un valor.
- **_Procedimiento:_** si al ser invocado el algoritmo contenido en él realiza una serie e accionesbasadas generalmente en un conjuntio de parametros o argumentos. A diferencia de las funciones, un procedimiento no retorna ningún valor.

**Nota:** en Java los métodos se implementan como funciones.

---

## Constructor

> Un constructor es un tipo especial de método perteneciente a una clase concreta y que se utiliza para instanciar objetos de esta.

- Para cada clase pueden declararse varios métodos constructores, aunque puede darse el caso de que no se declare ninguno.

> [!CAUTION]
> :point_right: *EL HECHO DE QUE NO SE DECLARE NINGÚN MÉTODO CONSTRUCTOR NO IMPLICA QUE NO EXISTA*

**por defecto, todas las clases disponen de un método constructor, que si se invoca, incializará los campos de dichaclase a los valores por defecto.**

### Construcor parametrizado

> Es un constructor con parametros,que le hemos insertado.

```java
    //metodo particular de la clase, denominado contructor
    public Pelicula(){

    }
    //constructor con parametros
    public Pelicula(String titulo){
        this.titulo =titulo;
    }
```

## Destructor

> Se define como aquel método encargado de destruir un ojeto y liberar los recursos que tuviese asignados.

- una clase puede tener un nº indeterminado de destructores. (puede que no se declare ninguno).
  **Nota:** En Java no exiten los métodos destructores.

# Objeto

> Un objeto es una instancia de una clase determinada.
>
> Y una instancia es una plantilla donde definimos y creamos un objeto.

- Un objeto es el resultado de crear en tiempo de ejecución un conjunto de datos. que se almacenan en memoria y que tiene una estructura.como la que se describe en su clase.

```java
public class LanzadorEtapa1 {
 //Va a ser nuestra clase main
 // declaramos el metodo main
 public static void main(String[] args) {

  //declaramos e instanciamos el objeto p1 de la clase pelicula
  Pelicula p1= new Pelicula();

  //modificamos los valores a través de los metodos modificadores set
  p1.setTitulo("EL LOBO DE WALL STREET");
  p1.setAnyo(2020);
  p1.setGenero(TGenero.DRAMA);
  p1.setDirector("MartinScorsese");
  p1.setActores("Leonardo DiCaprio,Jonah Hill, Margot Robbie");
  p1.setSinopsis("Basado en la historia real de Jordan Belfort,desde su ascenso"+
  "\n"+"a un adinerado corredor de bolsa que vive la gran vida hasta su caida"+
  "\n"+"que involucra el crimen, la corrupción y el gobierno federal.");

  /*
   * Visualizamos su informacion por pantalla a traves
   * del metodo mostrarPelicula que es de la clase Pelicula y
   * por eso tiene acceso el objeto p1
   */
  System.out.println(p1.mostrarPelicula());
 }
}
```

# Encapsulación

# Abstracción

> Ignorar/prescndir de los detalles de las partes. Para centrarse en un concepto situado en un novel más alto

# Modularidad

> proceso de dividir un todo en partes bien definidas que pueden ser construidas y examinadas separadamente.

# Reutilización o reusabilidad

# Visibilidad

# Relaciones entre clases

# Asociación, composición y agregación

### Asociación

### Composición

### Agregación

# Polimorfismo
