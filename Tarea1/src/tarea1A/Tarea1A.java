package tarea1A;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Tarea1A {

	public static void main(String[] args) {
		
		try {
			String registro;
			File archivo = new File("C:\\Users\\anavarro\\eclipse-workspace\\Tarea1\\src\\tarea1A\\Carpetas.txt");
			BufferedReader read = new BufferedReader(new FileReader(archivo));
			boolean exito;
			
			while((registro=read.readLine()) != null) {
				exito = (new File(registro)).mkdir();
				if(exito) {
					System.out.println("Directorios: " + registro + " creados");
				}
			}
			
			}catch (Exception e){
				System.err.println("Error: " + e.getMessage());
				
			}

	}

}
