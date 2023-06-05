package Examenes;

public class EjemploEqual {
	String cadenaV="hola";
	
	public String comprobarCadena(String cadena) {
		if (cadena.equals(cadenaV)) {
			return "funciona";
		}else {
			return "no funciona";
		}
	}
	
	public String comprobarCSigno(String cadena) {
		if(cadena == cadenaV)
			return "va igual";
		else
			return "no va pero va ";
	}
	
	public void  prueba() {
		int i,j =1;
		i= (j>1)?2:1;
		switch (i) {
		case 0:
			System.out.print(0);
			break;
		case 1:
			System.out.print(1);
		case 2:
			System.out.print(2);
			break;
		case 3:
			System.out.print(3);
			break;
		}
	}
	public static void main(String[] args) {
		
		System.out.println("diferencia entre equal() y ==");
		EjemploEqual e= new EjemploEqual();
		System.out.println(e.comprobarCadena("ho"));
		System.out.println(e.comprobarCSigno("hola"));
		System.out.println("prueba de cond if: ");
		e.prueba();
		
		System.out.println("");
		//para ver si va el metodo split()
		String frase = "Esta es una frase de ejemplo";
		String[] palabras = frase.split(" ");
		for (String palabra : palabras) {
			System.out.println(palabra);
		}
		
	}

}
