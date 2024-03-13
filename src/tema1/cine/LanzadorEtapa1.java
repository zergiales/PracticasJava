package tema1.cine;
//Va a ser nuestra clase main
public class LanzadorEtapa1 {
	// declaramos el metodo main
	public static void main(String[] args) {
		
		System.out.println("***Ejemplo***");
		System.out.println("..............");
		System.out.println("PELICULA 1");
		/*
		 * **CREACION DEL OBJETO DE LA CLASE PELICULA**
		 * Estamos reservando memoria  con esta variable pero
		 * cogiendo un objeto de tipo Pelicula
		 */
		Pelicula p1;
		
		p1=new Pelicula();
		/*
		 * con new Pelicula() que es el constructor inicializado, el de por defecto
		 * creamos un objeto de tipo pelicula y lo metemos
		 * en ese espacio de memoria que dijimos.
		 */
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
		System.out.println("..............");
		System.out.println("PELICULA 2");

		//Vamos a crear de otra forma un objeto
		Pelicula p2= new Pelicula();
		
		//modificamos los valores de los atributos
		p2.setTitulo("DJANGO DESENCADENADO");
		p2.setAnyo(2012);
		p2.setGenero(TGenero.ACCION);
		p2.setDirector("Quentin Tarantino");
		p2.setActores("Jamie Foxx,Christoph Waltz, Leonardo DiCaprio");
		p2.setSinopsis("Con la ayuda de un cazarrecompensas alemán, un esclavo liberado"+
		"\n"+"se propone rescatar a su esposa de un brutal dueño de una"+
		"\n"+"plantación de Mississippi.");
		
		//visualizamos su información por pantalla
		System.out.println(p2.mostrarPelicula());

		System.out.println("**EJEMPLO DE MODIFICACION**");
		//modificamos el año de la pelicula p1
		p1.setAnyo(p1.getAnyo()- 7);
		//visualizamos el año de la pelicula uno de nuevo
		System.out.println("Anio modificado de la pelicula p1: "+p1.getAnyo());
	}		
}
