import java.util.ArrayList;
import java.util.Collections;

public class Resolucion {

	private static ArrayList<Instrumento> instrumentos;
	
	public static void main(String[] args) {
		
		Resolucion res = new Resolucion();
		instrumentos = new ArrayList<Instrumento>();
		
		Madera flauta = new Madera(12,"Flauta","aa");
		Metal saxo = new Metal(20, "Saxo","aa");
		Cuerda guitarra = new Cuerda(15, "Guitarra", "aa");
		Percusion bateria = new Percusion(18, "Bateria", "aa");
		
		instrumentos.add(flauta);
		instrumentos.add(saxo);
		instrumentos.add(guitarra);
		instrumentos.add(bateria);
		
		flauta.tocar();
		saxo.lustrar();
		saxo.afinar();
		guitarra.tocar();
		guitarra.afinar();
		bateria.lustrar();
		bateria.tocar();
		
		//System.out.println("Ordenando...");
		//Collections.sort(instrumentos);
		
		
//		res.quicksort(instrumentos, 0, instrumentos.size());
//		for (Instrumento instrumento : instrumentos) {
//			System.out.println(instrumento);
//		}
	}
}
