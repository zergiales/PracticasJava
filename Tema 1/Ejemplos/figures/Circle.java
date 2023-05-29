
/**
 * Write a description of class Circle here.
 * 
 * @author Sergio Sanchez 
 * @version  1.0
 */
import java.awt.*; //para importar la libreria de graficos 
public class Circle
{
    // campos donde se intancian las variables
    private int x;
    private int y;
    private int radius;
    private Color color;
    private Frame frame;
    private Canvas canvas;

    /**
     * Constructor donde inicializamos la variable x a 33 
     * - como?
     * 33??
     */
    public Circle(int x, int y, int radius)
    {
        // inicializamos en este constructor unos valores del constructor
        this.x = x;
        this.y= y;
        this.radius= radius;
        this.color = color.RED;
        this.frame = new Frame("Circle");
        this.canvas = new Canvas(){
        //metemos tb el metodo que lo hace visible
            public void paint(Graphics graphics){
                graphics.setColor(color);
                graphics.drawOval (x,y,radius,radius);
            }   
        };
        frame.add(canvas);
        frame.setSize(400, 400);
    }
    
    /**
     * metodo para hacerlo visible 
     */
    public void makeVisible(){
        frame.setVisible(true);
    }

    /**
     * Método de ejemplo
     * 
     * @param --> parametros que necesitamos para el metodo
     * @return --> devuelve lo que lo nos devuele la funcion
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }

    // public static void main() {
    //     Circle cirle1= new Circle(30, 40, 40)
    //     cirle1.makeVisible();
    // }
}
