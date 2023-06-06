# Tipos envolventes
- Cuando modificamos un objeto String, lo que realmente estamos haciendo es crear 
uno de nuevo con la modificacion ya hecha y no puede ser modificado como tal7

# Pasar de String a int

```java
//pasar de String a int 

 public int convertirCadena(String cadena) {
  int numero = Integer.parseInt(cadena);
  System.out.println("cadena convertida : "+numero);
  return numero;
 }
````