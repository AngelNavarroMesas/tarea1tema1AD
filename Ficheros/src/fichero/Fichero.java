package fichero;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Fichero {

	public static void main(String[] args) throws IOException {
		File fichero=new File("D:\\acceso a datos\\fichero1.txt");
		FileReader fic=new FileReader(fichero);
		int i;
		char[] letras=new char[(int) fichero.length()];
		while ((i = fic.read(letras,0,2)) != -1) { //se va leyendo un carÃ¡cter hasta que lea -1
			System.out.print(letras); //cast a char
		}

		fic.close(); //cerrar fichero  
	}

}
