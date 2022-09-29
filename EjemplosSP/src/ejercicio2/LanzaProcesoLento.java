package ejercicio2;

import java.io.File;
import java.io.IOException;

public class LanzaProcesoLento {

	public static void main(String[] args) {
		String[] comando = {"java", "ejercicio2.LanzaProcesoLento"};
		ProcessBuilder pb = new ProcessBuilder(comando);
		pb.directory(new File("C:\\Users\\anavarro\\eclipse-workspace\\EjemplosSP\\bin\\lanzaproceso2"));
		//pb.inheritIO();
		try {
			Process p = pb.start();
			while(p.isAlive()) {
				System.out.println("sigue en ejecución");
				Thread.sleep(3000);
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
