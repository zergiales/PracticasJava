package Septiembre2019.modeloA;

import java.util.Random;

public class Aleatorio {
	
	//dos formas de declarar e instanciar un array
	 int[] hoursCounts1 = new int[24]; 
	 
	 int hoursCounts[] = new int[24]; 
	 


	public static void main(String[] args) {
		Aleatorio a = new Aleatorio();
		Random randomGenerator; 
		randomGenerator = new Random(0); 
 		char index = (char) randomGenerator.nextInt(0); 
		System.out.println(index); 
		System.out.println("	 int[] hoursCounts1 = new int[24]; \r\n"
				+ ""+ a.hoursCounts1);
		
		System.out.println("	 int hoursCounts[] = new int[24]; \r\n"
				+ ""+ a.hoursCounts);
	}

}
