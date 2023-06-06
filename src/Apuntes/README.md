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
´´´java
int num = 10;
Integer num = numero;
listaArrayList.add(ValorEnteroInt);
´´´