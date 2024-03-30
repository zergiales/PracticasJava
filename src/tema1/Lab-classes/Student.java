
/**
 * Description => creamos la clase Student para instanciar un objeto de la clase Student.
 * Tener en cuenta que no solo se no sva a pedir el nombre de la instancia sino algunos
 * parametros.
 * Los parametros se tienen que rellenar antes de hacer click en OK
 * ***PARAMETROS DE TIPO String ---> se tienen que escribir entre dobles comillas
 * 
 * @author Sergio
 * @version 1.0
 */
public class Student
{
    // instanciamos las variables
    private String name;
    private String surname;

    //constructor sin parametros
    public Student()
    {
        // inicializamos las variables instaciadas
        name="default";
        surname="default";
    }

    //constructor que le pasamos dos parametros
    public Student(String nombre, String apellido){
        name = nombre;
        surname = apellido;
    }
    //metodos get para retornar el valor de name
    /**
     * como podemos observar devuelve un resultado en nuestro caso 
     * nos devuelve un resultad de tipo String.
     * Esto lo poedemos sber gracias a que vemos ne la cabecera que el retorno es String.
     */
    public String getName(){
        return name;
    }
    //metodo para cambiar el nombre (como un set)
    public void changeName(String replacementName){
     name = replacementName;
     //la palabra void indica que este metodono devuelve ningún método.
    }
}
