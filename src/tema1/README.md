# Tema 1

## Introduccion

> La programación orientada a objetos (_POO_) es un tipo de programacion que desciende del paradigma de programación imperativa.

## Clase

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
> :point_right: El hecho de que no se declare ningún método constructor no implica que no exista :eyes: .

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

## Objeto
>
> Un objeto es una instancia de una clase determinada. Y una instancia es una plantilla donde definimos y creamos un objeto.

- Un objeto es el resultado de crear en tiempo de ejecución un conjunto de datos que se almacenan en memoria y que tiene una estructura.como la que se describe en su clase.

>[!TIP]
>Los objetos pueden ser **simples** o **compuestos**. Un objeto **simple**  está formado por datos primitivos (caracter,digito,un booleano...), mientras que un objeto **compuesto** está formado por datos primitivos y por otros objetos pertenecientes a otreas clases

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

> [!CAUTION]
> :point_right: El hecho de que dos onjetos tengan los mismos datosno significa que sean el mismo objeto.Cada uno tiene **reservado su espacio único en memoria** y es único e independiente :eyes: .

## Encapsulación
>
>Se define encapsulación como al agrupamiento de los datos y las operaciones relacionadas con ellos en un mismo elemento.
>En este caso ,la clase ofrece este nivel de encapsulación, permitiendo el ocultamiento de la información.

- La encapsulación entonces hace referencia a la limitación de acceso de los elementos de una clase (campos y métodos) de manera que no puedan ser modificados desde fuera incorrectamente.

- Debido a la restricción de los accesos de los campos (atributos), accedemos a ellos mediante métodos observadores *GET* y los modificamos de forma segura con métodos *SET*.

### 2.TIPOS DE ENCAPSULACION

   **+_Encapsulamiento alto:_** el cual disminuye acoplamiento(uso `private` en las _variables_).
   **+_Encapsulamiento bajo:_** el cual aumenta el acoplamiento ( :no_entry: No se usa `private` en las _variables_ , solo `public`).

---

## Abstracción [DIVIDE Y VENCERÁS :crossed_swords: | :white_check_mark:]
>
>La abstracción es un mecanismo de reducción de la complejidad que minimiza la información de los objetos a representar unicamente a los aspectos más relevantes.

- **Descomponer el problema en partes** y empezar resolviendolo ignorando los pequeños detalles y **centrándose en lo que nos importa.**

---

## Modularidad
>
> proceso de dividir un todo en partes bien definidas que pueden ser construidas y examinadas separadamente.

- La idea es que estas partes en la que se devide el programa,          interactúen entre sí.
- Deben tener una función clara y única.

---

## Reutilización o reusabilidad
>
>[!NOTE]
> A mayor utilización **=>** menor cantidad de líenas de código **=>** mayor facilidad de generación de código **=>** menos posibilidad de cometer errores y menor dificultad de mantenimiento...
>_todo esto se consigue mediante el empleo de técnicas de herencia y composición de objetos._

_El modelado orientado a objetos permite reutilizar de forma facil el código que ya se ha escrito anteriormente sin la necesidad de duplicarlo._

---

## Visibilidad
>
>[!IMPORTANT]
> Est nuevo concepto establece la forma en la que los miembros de una clase serán accedidos desde otros puntos del programa. Toma vital importancia no solo a la hora de implementar los algoritmos, sino tambien a la hora de crear relaciones de herencia entre diferentes clases.

  Existen **3** niveles de visibilidad:
  
  _+ Privada "-":_ los miembros declarados con visibilidad privada solo serán visibles desde la misma clase en la cual se han declarado
  _+ Publica "+"_ los miembros declarados con visibilidad  pública desde cualquier lugar del programa.
  _+ Protegida "#"_ los miembros declrados con visibilidad protegida solo serán visibles desde las clases que hereden de ella.

---

# Relaciones entre clases

## Herencia

>
>La herencia es una propiedad exclusiva de las clases que permite la declaración de nuevas clases a partir de otras declaradas previamente.

- La clase desde la que se hereda, se llama **CLASE PADRE / SUPERCLASE**.
- La clase que hereda, se llama **CLASE HIJA / SUBCLASE**.

>[!NOTE]
>Cuando la clase B "hereda" de la clase A, todos los miembros de la clase A son transferidos a la clase B, a excepción de constructores y destructores.La clase podrá añadir miembros propios de la nueva clase (campos, métodos y propiedades) o sobreescribir los miembros heredados.

<img src="../tema1/Assets/img/Ejemplo de herencia.png">

+ La herencia múltiple en Java no es posible, solo en **C++ o Effiel** , ya que implica que para una misma clase puede haber más de una clase padre desde la cual derivar al mismo tiempo.

---

## Asociación, composición y agregación 
>
> :eyes: Conexiones semánticas entre los elementos de un modelo.

### Asociación

Es un tipo de relación entre los objetos de una o varias clases que interactúan entre sí. Cada uno de los onjetos puede existir por si mismoy sin depender del otro.

<img src="../tema1/Assets/img/asoc.png">

### Agregación

Representa una asociación opcional, de manera que los componentes pueden existir por sí mismos e incluso formar parte de otras relaciones de composición con otros objetos.

<img src="../tema1/Assets/img/Agr.png">

### Composición

Representa una asociación obligatoria.Los componentes son totalmente dependientes del copuesto y no tiene sentido su existencia en ausencia de este

<img src="../tema1/Assets/img/comp.png">

---
>[!NOTE]
> :green_book:  herencia obligatoria => **COMPOSICIÓN** 
>>:closed_book:  herencia opcional  => **AGREGACIÓN**
>>> :open_book:  herencia normal de tu a tu => **ASOCIACIÓN**1

--- 

# Polimorfismo

El polimorfirmo es la propiedad de los objetos que les permite adoptar diferentes formas en tiempo de ejecucción asi como que un objeto de la clase base.
+ Junto con la herencia, establece uno de los pilares de la POO.

---
# Resumen

>[!IMPORTANT]
> + En la programación orientada a objetos, los datos y los métodos que hacen uso de estos son declarados dentro de la misma clase.
> + La programación orientada a objetos es más adecuada para abordar proyectos de gran tamaño.
> + Una clase es un molde o plantilla que define, en fase de desarrollo, el aspecto (visibilidad), la composición (campos) y el comportamiento (propiedades y métodos) de los elementos que serán creados a partir de ella.
> + Los elementos que serán creados en tiempo de ejecución a partir de la definición de la clase son los objetos.
>>Cada clase puede definir varios métodos contructores, que serán empleados para llevar a cabo la instaciación de objetos (creación) a excepción de las clases abstractas, que son empleados con otros fines (polimorfismo, declaración de clases a base a partir de las cuales realizar herencia).


>[!TIP]
> + Para llevar a cabo la descripcion y el diseño de programas orientas a objetos se utiliza UML.
> + Al igual que la **programacion estructurada**, la _programación orientada a objetos_ es un tipo de programación que desciende del paradigma de **programación imperativa.**
> + La POO permite enfocar los problemas a resolver de una forma mucho más intuitiva de lo que lo hacen otros paradigmas.
> + En la POO los datos (campos, propiedades o ambos) y el código que los utiliza (métodos, constructores y destructores) están mezclados en un elemento denominado clase.
> + Las clases determinan la estructura que tendrán los objetos instanciados a partir de las mismas.
> + La POO se basa en: encapsulación, abstacción, reutilización, visibilidad, herencia y polimorfismo.

