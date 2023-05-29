enum TGenero { DRAMA, ACCION, COMEDIA;}

public class Pelicula {
    
       //Atributos == Campos que es donde se almacenan de manera persistente dentro de un objeto
        
       private String titulo; //cada de caracteres 
       private int anyo; //tipo numero entero 
       private String director; 
       private String actores; 
       private String sinopsis; 
       private TGenero genero; //tiene lo valores enumerados anteriores (consistencia de tipos )
             
       //Constructor
       /**
        * un constructor es responsable de garantizar que un objeto se configure como se debe 
        * en el momento de crearlo por primera vez
        */
       public Pelicula (String tituloParametro) {    
            this.titulo=tituloParametro; //le pasamos por parametro el titulo del campo o atributo pelicula
        }
        
        //Constructor sin parametros
      public Pelicula () {
        titulo="por defecto";
      }
      //*******METODOS*********** 
      //Consultar y modificar (getters & setters)
      // metodo que nos saca por pantala el valor concret de ese atributo
      public String getTitulo (){
        return titulo;//nos devuelve el valor del atributo titulo 
      }
      
      //método para modificar el valor del atributo 
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
      //método qu enos muestra por pantalla datos sobre la pelicula metido a mano 
      public String mostrarPelicula (){
        String mostrarPelicula = "Título: "+ titulo  + "\n"  + "Año: "+ anyo +"\n" + "Director: "+ director +"\n" + "Actores: "+ actores +"\n" +"Sinopsis: "+ sinopsis +"\n" +"Género: "+ genero;
        return mostrarPelicula;
      }
      //este metodo puede estar en una clase a parte y llamamos a esta y creamos objetos y hacer locuras como llamar meotodo de otrda clase y tal 
      public static void main(String[] args) {
        System.out.println("------EJEMPLO CINE---------");
          System.out.println("imprimir por pantalla esta cadena de caracteres");
          // vamos a jugar con los objetos
          Pelicula Pelicula1; //reservamos un espacio de memoria con esta variable cogiendo un objeto de tipo Pelicula
          Pelicula1=new Pelicula();//constructor por defecto y con esto inicializamos
          System.out.println(Pelicula1.mostrarPelicula());//podemos llamar a metodos del objeto de la clase
        }
}





