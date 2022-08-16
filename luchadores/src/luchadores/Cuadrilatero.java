package luchadores;

public class Cuadrilatero {
	public Cuadrilatero() {

	}

	public int[] ordenar(Luchador[] luchadores) {
		int[] lista = new int[luchadores.length];
		Luchador luchador = new Luchador();
		
		for(int i = 0; i < luchadores.length; i++) {
			lista[i] = 0;
			for(int a = 0; a < luchadores.length; a++) {
				if((luchador.comparar(luchadores[i], luchadores[a])) == 1){
					lista[i]++;
				}
			}
		}
		
		return lista;
	}

	public void generarOut() {
		Archivo arch = new Archivo();

		arch.escribirArch(ordenar(arch.leerArch()));
	}
}
