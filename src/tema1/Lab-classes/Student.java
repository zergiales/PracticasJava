
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
    private String ID;
    private int credits;

    //constructor sin parametros
    public Student()
    {
        // inicializamos las variables instaciadas
        name = "por defecto";
        surname = "por defecto";
        ID = "1234567E";
        credits = 30;
    }

    //constructor que le pasamos dos parametros
    public Student(String nombre, String apellido, String DNI, int creditos){
        name = nombre;
        surname = apellido;
        ID = DNI;
        credits = creditos;
    }
    //metodos get para retornar el valor de name 
    /**
     * Los métodos pueden devolver información acerca de un objeto
     * mediante un valor de retorno.
     */
     
     /**
     * Como podemos observar devuelve un resultado en nuestro caso 
     * ,concretamente, nos devuelve un resultado de tipo String.
     *  
     *  --> Esto lo podemos saber gracias a que vemos en la cabecera
     *      que el retorno es String.
     */
    public String getName(){
        return name;
    }
    //metodo para cambiar el nombre (como un set +-)
    //la palabra void indica que este metodono devuelve ningún método.
    /**
     * Los métodos con valores de retorno nos permiten obtener información de un objeto
     * mediante la invocación de un métodO.
     *  
     *  --> Esto significa que podems emplear métodos para cambiar el estado de un objeto
     *      o para averiguar cuál es el estado.
     */
    public void changeName(String replacementName){
     name = replacementName;
    }
    //metodo get para devolver el valor de ID
    public String getStudentID(){
        return ID;
    }
    //metodo get para devolver el valor de creditos
    public int getStudentCredits(){
        return credits;
    }
    //metodo para modificar el valor de credits del student
    public void addCredits(int addCredits){
        credits += addCredits;
    }
    
    //metodo para imprimir bonito al student
    public void print(){
        System.out.println(name +" "+ surname +" numero de ID: "+ ID +" numero de creditos: "+ credits);
    }
}
