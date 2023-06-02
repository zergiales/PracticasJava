package Junio2k22.modeloA;

public class Comprobador {
	
	public static void main(String [] args) {
		System.out.println("comprobador");
		System.out.println( "Expresion 1: "+ !(4<5));
		System.out.println( "Expresion 2: "+ ( (2 > 2) || ((4 == 4) && (1<0) ) ) );
		System.out.println( "Expresion 3: "+ ( (2 > 2) || (4 == 4) && (1<0) ) );
		System.out.println( "Expresion 4: "+ ( (2 > 2) || !((4 == 4) && (1<0) ) ));
		System.out.println( "Expresion 5: "+ ( (34 != 33) && ! false));
	}
}
