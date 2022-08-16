package luchadores;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

public class Archivo {

	public Luchador[] leerArch() {
		int cant = 0;
		Luchador lista[] = new Luchador[cant];

		Scanner scanner = null;
		File file = new File("archivos/luchadores.in");
		try {
			scanner = new Scanner(file);
			scanner.useLocale(Locale.ENGLISH);

			if (scanner.hasNextInt()) {
				cant = scanner.nextInt();
			}

			lista = new Luchador[cant];

			for (int i = 0; i < cant; i++) {
				if (scanner.hasNextDouble()) {
					lista[i] = new Luchador(scanner.nextDouble(), scanner.nextDouble());
				}
				// lista[i] =
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			scanner.close();
		}

		return lista;
	}

	public void escribirArch(int[] luchadores) {		
		FileWriter file = null;
		PrintWriter printerWriter = null;
		
		try {
			file = new FileWriter("archivos/luchadores.out");
			printerWriter = new PrintWriter(file);
			
			for (int i = 0; i < luchadores.length; i++) {
				printerWriter.println(luchadores[i]);
			}
				
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (file != null) {
				try {
					file.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
