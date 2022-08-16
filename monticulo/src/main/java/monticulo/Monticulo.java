package monticulo;

import java.util.ArrayList;

public class Monticulo {
	private ArrayList<Integer> array = new ArrayList<Integer>();

	public Monticulo() {
		array.add(0);
	}

	public void insertar(int elemento) {

		array.add(elemento);

		int indiceElemNuevo = array.size() - 1;
		int indicePadre = indiceElemNuevo / 2;

		while (array.get(indiceElemNuevo) < array.get(indicePadre) && indiceElemNuevo > 1) {
			int aux = array.get(indiceElemNuevo);
			array.set(indiceElemNuevo, array.get(indicePadre));
			array.set(indicePadre, aux);

			indiceElemNuevo = indicePadre;
			indicePadre = indiceElemNuevo / 2;
		}
	}

	public int sacar(){
		int tam = array.size();
		if(tam == 1){
			System.out.println("No hay elementos en el monticulo.");
			return 0;
		}
		
		int elem = array.get(1);
		int nuevoValorRaiz = array.get(tam);
		array.set(1, nuevoValorRaiz);
		array.remove(tam);
		
		int indiceNodoPadre = 1;
		int indiceHijoIzq = indiceNodoPadre * 2;
		int indiceHijoDer = indiceNodoPadre * 2 + 1;
		
		tam--;
		
		int valorHijoIzq = -1; 
		int valorHijoDer = -1; 
		
		if( indiceHijoIzq <= tam && indiceHijoDer <= tam ){
			//tengo ambos hijos..
			valorHijoIzq = array.get(indiceHijoIzq);
			valorHijoDer = array.get(indiceHijoDer);
			
		}else if( indiceHijoIzq <= tam ){
			//tengo el hijo izq
			valorHijoIzq = array.get(indiceHijoIzq);
		}
		//verificar si uno de los hijos es mas grande..
		
		if( valorHijoDer != -1){
			// buscamos el minimo de los 3...
		}
		
		
		
		
//		if( valorHijoIzq > valorHijoDer ){
//			indice =
//		}
//		else
//			indice =  
		
		
		return elem;
	}

	private int buscarIndiceValorMenor(int indice1, int indice2) {
		return array.get(indice1) < array.get(indice2) ? indice1 : indice2;
	}

	public void mostrarArray() {
		for (int i = 1; i < array.size(); i++) {
			System.out.println(array.get(i));
		}

	}

	public static void main(String[] args) {

		Monticulo mont = new Monticulo();
		mont.insertar(100);
		mont.insertar(120);
		mont.insertar(150);
		mont.insertar(150);
		mont.insertar(180);
		mont.insertar(200);
		mont.insertar(300);
		mont.insertar(40);

		mont.mostrarArray();
	}

}
