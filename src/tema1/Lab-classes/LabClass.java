import java.util.*;
/**
 * Clase LabClass para crear un objeto, Como indica la asignatura, es necesario indicar
 * el numero maximo de estudiantes en dicha clase (TIPO ENTERO)
 * 
 * @author sergio
 * @version 1.0
 */
public class LabClass{
    private int nStudents; //numero de estudiantes
    private ArrayList<Student> students;//arraylist para guardar student de la clase Student
    private int capacity;//para establecer la capacidad maxima que entra dentro de la clase (metodo maxNumberOfStudents)
    //DATOS POCO IMPORTANTES
    private Date timeAndDay = new Date();
    private int clase = (int)(Math.random() * 10) + 1;
    private String profe = "profesor nefario";
    //constructor con parametros 
    public LabClass(int maxNumberOfStudents){
        profe = "teacher";
        //CLASE Y time AndDay random y la que es
        students = new ArrayList<Student>();
        capacity = maxNumberOfStudents;
    }
    //metodo para inscribir el student
    //le pasamos por parametro una variable `new student` de tipo Student (objeto)
    public void enrollStudent(Student newStudent){
        if(students.size() == capacity){
            System.out.println("La clase esta llena y no puede entrar");
        }else{
            students.add(newStudent);
            System.out.println("bienvenido,ha sido añadido a la clase"); 
        }
    }
    
    //metodo para indicar el numero máximo de students
    public int numberOfStudents(){
        return students.size();//le pedimos que obtenga el  numero de students
    }
    //metodo para sacar listado
    public void printList(){
        System.out.println("*** Clase del "+timeAndDay+"***");
        System.out.println("profesor: "+ profe + " Clase: "+ clase);
        System.out.println("Listado de alumnos:");
        //bucle for que itera
        for(Student student: students){
            student.print();
        }
        System.out.println("numero total de estudiantes: " + numberOfStudents());
    
    }
}
