package Examenes.modeloA;
import java.io.*;

public class Ejemplo2 {
	public static void main (String[] args) throws IOException{
		String filename = new String ("EJEMPLO"); 	
		try { 
			throw new IOException (); 
		}
		catch (Exception e) { 
			System.out.println("Unable to save to "+ filename); 
		}

	}
}