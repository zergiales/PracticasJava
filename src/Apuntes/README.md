# APUNTES
```java <NombreClase> <Argumento>``` es un comando que inicia el programa de esa clase que contiene el main
# Tipos envolventes
- Cuando modificamos un objeto String, lo que realmente estamos haciendo es crear 
uno de nuevo con la modificacion ya hecha y no puede ser modificado como tal

# Pasar de String a int

```java
 public int convertirCadena(String cadena) {
  int numero = Integer.parseInt(cadena);
  System.out.println("cadena convertida : "+numero);
  return numero;
 }
 /*
 * Integer numero = 3 es lo mismo que si ponemos 
 * Integer numero = Integer (3)
 **/
```
# Autoboxing
- Tiene lugar cuando se utiliza un valor de tipo primitivo en un contexto que necesita una clase envolvente.

```java
int num = 10;
Integer num = numero;
listaArrayList.add(ValorEnteroInt);
```
# Unboxing
- Es la operacion inversa del autoBoxing, en el cual, cuando se utiliza un tipo envolvente en un contexto que necesita un tipo primitivo
envolvente en un cintexto que necesita un tipo primitivo.

```java
Integer num = new Integer(0);
int numero = num;
```
-----
# INTERFACES
- Se puede realizar herencia múltiple con ayuda de las interfaces, no solo de la clase padre (una clase puede implementar varias interfaces)

- Una interfaz define un tipo igual que una clase 

```java 
Intefaz animal;
// animal no puede ser un objeto propiamente de intefaz, pero si de los subtipos (clases que implementan la interfaz)

public interface Animal {
    void hacerSonido();
}

public class Perro implements Animal{
    public void hacerSonido(){
        System.out.println("Guau guau");
    }
}

public class Gato implements Animal{
    public void hacerSonido(){
        System.out.println("Miau miau");
    }
}

public class Main{
    public static void main(String [] args){
        Animal animal = new Perro();
        animal.hacerSonido(); //salida Guau guau

        animal = new Gato();
        animal.hecerSonido(); // salida miau miau
    }
}
```
-----

- Imaginemos que queremos implementar una lista, pero queremos haverlo de forma que se dedique el menor tiempo posivle al acceder y al realizar operaciones en las listas.

- ¿Implementamos un arraylist o un linkedList? Son clases que implementan la interfaz List, por lo que m para realizar las pruebas de medición del tiempo, podemos eclarar la lista como 
```java List lista= new ArrayList<Elemento>(); ``` y luego cambiar ArrayList por linkedList.
------

## Construccion de una interfaz
```java
public interface Interfaz{
    int CONSTANTE = 10; //Campo publico, estático y final
    //no constructor
    metodoAbstracto(); //metodo abstracto y publico
}
```
----
# CLASES
- Una clase abstracta y una interfaz se parecen pero no son lo mismo.Una clase abstracta puede ser hija de una sola clase (abstract o no) mientras que una interfaz puede ser jija de varias interfaces de una misma vez. Una clase abstracta puede tener metodos que sean abstractos o que no lo sean , mientras que las interfaces pueden definir métodos abstractos y por defecto.

### clase abstracta => metodos abstractos o no.No hay instancia 
 * clase extends

### interfaz => metodos abstractos y por defecto
 * interfaces extends

 **En java la herencia múltiple no está permitida !!**
 
- Una clase abstracta no puede instancias un objeto , pero si servir como tipo variable ```java ClaseAbs variable = new Subsclase(); ```

- Una subclase será abstracta si no se realiza una sobreescritura de todos los metodos abstractos de la clasePadre abstracta.

- **extends:** nombreClase **extends** nombreClasePadre, interfaz **extends** InterfazPadre, ````java Interfaz2 extends InterfazPadre ``` donde heredamos de la implementación.
