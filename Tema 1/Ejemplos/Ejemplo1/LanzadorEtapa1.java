public class LanzadorEtapa1 {

    public static void main(String[] args) {

        // Creamos una pelicula
                Pelicula p1 = new Pelicula(); //otra forma de crear un objeto 
        // en la clase pelicula en el main hay otra forma de como creamos un objeto y reservamos un espacio de memoria.

        // Modificamos los valores de sus atributos
                p1.setTitulo("EL LOBO DEL WALL STREET");
                p1.setAnyo(2020);
                p1.setGenero(TGenero.DRAMA);
                p1.setDirector("Martin Scorsese");
                p1.setActores("Leonardo DiCaprio, Jonah Hill, Margot Robbie");
                p1.setSinopsis("Basado en la historia real de Jordan Belfort, desde su ascenso" + "\n"+
                        "a un adinerado corredor de bolsa que vive la gran vida hasta su caída " +"\n"+
                        "que involucra el crimen, la corrupción y el gobierno federal.");
                // los \n son para hacer saltos de linea 
        //Visualizamos su información por pantalla
                System.out.println(p1.mostrarPelicula());
                
        // Creamos otra pelicula
                Pelicula p2 = new Pelicula();

       // Modificamos los valores de sus atributos
                p2.setTitulo("DJANGO DESENCADENADO");
                p2.setAnyo(2012);
                p2.setGenero(TGenero.ACCION);
                p2.setDirector("Quentin Tarantino");
                p2.setActores("Jamie Foxx, Christoph Waltz, Leonardo DiCaprio");
                p2.setSinopsis("Con la ayuda de un cazarrecompensas alemán, un esclavo liberado"+"\n" +
                        "se propone rescatar a su esposa de un brutal dueño de una " +"\n"+
                        "plantación de Mississippi.");
                
       //Visualizamos su información por pantalla
                System.out.println(p2.mostrarPelicula());
                
       //Modificamos el año de la pelicula p1
                p1.setAnyo(p1.getAnyo() - 7);
              
       //Volvemos a visualizar su información por pantalla
                System.out.println(p1.mostrarPelicula());

                }

    }