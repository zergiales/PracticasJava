package tema1.pruebaVariable;

import java.util.ArrayList;

public class Main {



	    public static void main(String[] args) {
	        // Crear un objeto de la clase Variables
	        Variables miVariable = new Variables(10, 3.14, 2.5f, 100L, (byte) 5, (short) 20);
	        
	        System.out.println("------------");
	        System.out.println("*** Tipos de variables numericas ***");
	        // Imprimir los valores de los atributos del objeto
	        System.out.println("Valor de n: " + miVariable.getN()+" entero");
	        System.out.println("Valor de d: " + miVariable.getD()+ " double");
	        System.out.println("Valor de f: " + miVariable.getF()+" float");
	        System.out.println("Valor de l: " + miVariable.getL()+" long");
	        System.out.println("Valor de b: " + miVariable.getB()+" byte");
	        System.out.println("Valor de s: " + miVariable.getS()+" short");
	        System.out.println("-------------");
	        
	        ArrayList <String> a = new ArrayList<> (5);
	        for (int i = 0; i <=5; i++) {
				a.add("prueba");
				System.out.println(a.toString());
			}
	        System.out.println("esto va");
	    }
	

}
