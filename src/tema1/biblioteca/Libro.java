
/**
 * una clase senciala de libro 
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
        // initialise instance variables
        autor = libroAutor;
        titulo  = libroTitulo;
    }
    
    /**
     * constructor de objetos de tipo Libro 
     *  - ESTO NO HACE NADA, NO DEJA NADA DEFINIDO
     */
    public Libro(){
    }
    
    //METODOS
    /**
     * Con el mismo simbolo puedo hacer diferentes tareas , concepto de polimorfismo
     *  Metodo para imprimir el titulo del libro 
     */
    public void impirmirTitulo(){
        System.out.println("El titulo del libro es: "+titulo);
    }
    
    public void imprimirAutor(){
        System.out.println("El autor del libro es: "+autor);
    }
    
    public String getAutor() {
	return autor;
    }
    public void setAutor(String autor) {
		this.autor = autor;
    }
}
