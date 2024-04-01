package tema1;

import java.lang.annotation.ElementType;
import java.util.*;
/** **INDICE**
 *  - Colecciones -> ArrayList
 *  - Bucles
 *  - Iteradores
 *  - Arrays
 *  
 *  
 * 
 * 
 * @author sergi
 *
 */
//lo usamos para manejar una agenda (estructura de datos), nos permite usar la clase arraylist del paquete java.util.
//con el * importamos todo lo del paquete util.
public class AgendaDeNOtas {
	/**
	 * arraylist: coleccion de elementos infinita (las limitaciones que tenga el sistema de memoria)
	 * 
	 * - Clae contenedora generica que implementa coleccion dinamica de objetos que voy a manejar. luego tengo a mi disposicion un conjunto de metodos.
	 * 
	 *  array: se establece un tama�o pero ya esta definido ese tama�o (concepto matematico,vector) (lo que se reserve a priori)
	 */
	
	/**
	 * Necesidad de agrupar objetos
	 * 
	 * - muchas apliaciones requieren agrupar objetos,como agendas,catalogos de libros....
	 * - el numero de elemntos a agrupar varia segun usemos la apliacion:
	 * 		-->adici�n de elemtnos
	 * 		-->eliminaci�n de elementos
	 * 
	 * - y hay que ser capaces de manipular los elemntos de la coleccion: consulta y modificacion de sus elementos.
	 *
	 */
	
	//****************************************************************
	
	/**
	 * Especificacio de requisitos:
	 * 1. las notas se pueden almacenar
	 * 2. se pueden consultar notas individuales
	 * 3. no hay limite en el numero de notas
	 * 4. se puede saber cuantas notas se tienen guardadas
	 * 
	 * 5. NO VAMOS A IMPLEMENTAR LAS ESTRUCTURAS DE DATOS para guardar notas: USAREMOS LAS LIBRERIAS!!!!
	 * 				LIBRERIA = PAQUETE (java.util.*)
	 * 6.Una libreria de clases es... una coleccion de clases �tiles
	 * 
	 */
	
	//almacenamiento para un numero arbitrario de notas
	private ArrayList<String> notas;
	private String nota;

	
	/**
	 * INICIALIZAMOS Y DECLARAMOS lo necesario para el cuaderno
	 */
	
	public AgendaDeNOtas() {
		// TODO Auto-generated constructor stub
		notas =new ArrayList<String>();
	}
	
	public void NotaAlmacenada() {
		notas.add(nota);
	}
	
	public int numeroDeNotas() {
		return notas.size();
	}
	
	public void mostrarNota(int numNota) {
		if (numNota<0) {
			//nada
		} else if(numNota < numeroDeNotas()){
			System.out.println(notas.get(numNota));
		}else {
			//nada
		}
	}
	
	// BUCLES FOR-EACH Y WHILE**
	
	public void listNotes() {
		for(String nota:notas) {
			System.out.println(nota);
		}
	
	}
	
	public void listaNotas() {
		int index= 0;
		while(index<notas.size()) {
			System.out.println(notas.get(index));
			index++;//iterador , se usa para recorer la coleccion o el bucle
			
		}
	}
	
	//iterator
	Iterator<ElementType> it =myCollection.iterator();
	while(it.hasNext()) {
		it.next();
	}
}


