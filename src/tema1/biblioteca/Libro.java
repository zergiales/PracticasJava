package tema1.biblioteca;


/**
 * una clase sencilla que mantiene informacion sobre un libro.
 * Puede formar parte de una biblioteca
 * 
 * @author Sergio Sanchex 
 * @version 1.0
 */
public class Libro
{
   //atributos (campos)
   private String autor;
   private String titulo;

    /**
     * Constructor de objetos de tipo Libro
     */
    public Libro(String libroAutor, String libroTitulo)
    {
        //declaramos variables y se inicializan a los parametros insertados
        autor = libroAutor;
        titulo  = libroTitulo;
    }
    
    /**
     * constructor de objetos de tipo Libro 
     *  - deja los atributos en valores por defecto
     */
    public Libro(){
    }
    //metodo modificadores get y set
    public String getTitulo() {
		return titulo;
	}

    /**
     * *** Explicacion de lo que hace el this. ***
     *  this. hace referencia al constructor del método actual,
     *  no puede ser invocado en constructores para ahorrar código repetido entre ellos.
     *  Debe mencionarse al principio de la sección del código.
     * 
     */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
    
    //METODOS
    /**
     * Con el mismo simbolo puedo hacer diferentes tareas.
     * [concepto de polimorfismo]
     *  **Metodo para imprimir el titulo del libro** 
     */
    public void impirmirTitulo(){
        System.out.println("El titulo del libro es: "+getTitulo());
    }
    

	public void imprimirAutor(){
        System.out.println("El autor del libro es: "+getAutor());
    }
    
    public String getAutor() {
	return autor;
    }
    public void setAutor(String autor) {
		this.autor = autor;
    }
}
