package tema1.cine;
enum TGenero{DRAMA, ACCION, COMEDIA;} //definimos un tipo de dato enumerado con tres cte
public class Pelicula {
    //atributos (aqui se declaran y se inicialiazan por defecto)
    private String titulo;// cadena de caracteres
    private int anyo; //numero entero
    private String director; 
    private String actores;
    private String sinopsis;
    private TGenero genero;//como hemos elegido los tres estado cte con el enum

    //metodo particular de la clase , denominado contructor
    public Pelicula(){

    }
    
    //constructor con parametros
    public Pelicula(String titulo){
        this.titulo =titulo;
    }
    
    //GETTERS Y SETTERS 
    
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getAnyo() {
		return anyo;
	}
	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getActores() {
		return actores;
	}
	public void setActores(String actores) {
		this.actores = actores;
	}
	public String getSinopsis() {
		return sinopsis;
	}
	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}
	public TGenero getGenero() {
		return genero;
	}
	public void setGenero(TGenero genero) {
		this.genero = genero;
	}
	
	//metodo para motrar una pelicula
	public String mostrarPelicula(){
		String mostrarPelicula="Titulo: "+titulo+"\n"+"Año: "+anyo
		+"\n"+"Director: "+ director+"\n"+"Actores: "+actores+"\n"+"Sinopsis: "
		+sinopsis+"\n"+"Genero: "+genero;
		return mostrarPelicula;
	}
	
}
