package tema1.figuras;
import java.awt.*; //solo nos interesa la de geom pero bueno nos vale igual
import java.awt.geom.Ellipse2D;
/**
 * clase circulo que podemos alterar los parametros sobre canvas
 * 
 *@author sergi
 *@version 30/05/2023
 *
 *Anotaciones: 
 *	@param diameter => es para estable el diametro del circulo
 *	@param xPosition => posicion del circulo en el eje x
 *	@param yPosition => posicion del circulo en el eje y
 */
public class Circle {
		
	 private int diameter; 
	 private int xPosition;
	 private int yPosition; 
	 private String color; //color del circulo
	 private boolean isVisible; //para cambiar la visibilidad
	    
	 
	 // contructor de un circulo con unos parametros por defecto.
	  
	    public Circle()
	    {
	        diameter = 68;
	        xPosition = 230;
	        yPosition = 90;
	        color = "blue";
	    }

	    /**
	     * Hace que el circulo este visible
	     * --> si ya esta visible de queda igual 
	     */
	    public void makeVisible()
	    {
	        isVisible = true;
	        draw();
	    }
	    
	  /**
	   * Hace el circulo invisible
	   * --> si esta visible lo hace invisible 
	   */
	    public void makeInvisible()
	    {
	        erase();
	        isVisible = false;
	    }
	    
	    //se mueve el circulo la der [20 px]
	    public void moveRight(){
	    	moveHorizontal(20);//se puede pedir al usuario con scanner que lo cambie si quiere
	    }

	   //se mueve el ciruclo a la izq
	    public void moveLeft(){
	        moveHorizontal(-20);
	    }

	    // se mueve el circulo arriba 
	    public void moveUp(){
	        moveVertical(-20);
	    }

	    /**
	     * Move the circle a few pixels down.
	     */
	    public void moveDown(){
	        moveVertical(20);
	    }

	    /**
	     * Desplaza al circulo a la distncia que queramos
	     * @pre:  distance
	     * @post: erase()
	     */
	    public void moveHorizontal(int distance){
	        erase();
	        xPosition += distance;
	        draw();
	    }

	    /**
	     * se mueve de forma vertical el circulo
	     * @param distance
	     */
	    public void moveVertical(int distance){
	        erase();
	        yPosition += distance;
	        draw();
	    }

	    //Se mueve el circulo mas lento en funcion de la distancia que se pide 
	    public void slowMoveHorizontal(int distance){
	        int delta; //variable que solo es declarada dentro de la funcion

	        if(distance < 0){
	            delta = -1;
	            distance = -distance;
	        }else{
	        	delta = 1;
	        }
	        
	        for(int i = 0; i < distance; i++){
	            xPosition += delta; //estamos haciendo que suma un valor a la posicion del eje x
	            draw();//pinta 
	        }
	    }

	    //lo mismo que slowMoveHorizontal pero en vertical
	    public void slowMoveVertical(int distance){
	        int delta;

	        if(distance < 0){
	            delta = -1;
	            distance = -distance;
	        }else{
	            delta = 1;
	        }

	        for(int i = 0; i < distance; i++){
	            yPosition += delta;
	            draw();
	        }
	    }

	    // para cambiar el tamaño del circulo 
	    public void changeSize(int newDiameter){
	        if(newDiameter>=0) {
	        	erase();
	        	diameter = newDiameter;
	        	draw();	        	
	        }
	    }

	    /**
	     * Change the color. Valid colors are "red", "yellow", "blue", "green",
	     * "magenta" and "black".
	     */
	    public void changeColor(String newColor)
	    {
	        color = newColor;
	        draw();
	    }

	    /**
	     * dibuja el circulo con las especificaciones que se diga
	     * */
	    private void draw()
	    {
	        if(isVisible) {
	            Canvas canvas = Canvas.getCanvas();
	            canvas.draw(this, color, new Ellipse2D.Double(xPosition, yPosition, 
	                                                          diameter, diameter));
	            canvas.wait(10);
	        }
	    }

	    /**
	     * Erase == borrar el circulo de la pantalla 
	     */
	    private void erase(){
	        // si esta visible se hace 
	    	if(isVisible) {
	            Canvas canvas = Canvas.getCanvas();
	            canvas.erase(this);
	        }
	    }

}
