package luchadores;

public class Luchador {
	private double peso;
	private double altura;
	
	public Luchador() {
		
	}
	
	public Luchador(double peso, double altura) {
		this.peso = peso;
		this.altura = altura;
	}

	public int comparar(Luchador l1, Luchador l2) {
		if(l1.altura >= l2.altura) {
			if(l1.peso > l2.peso) {
				return 1;
			}
		} else {
			if(l2.peso > l1.peso) {
				return -1;
			}
		}
		
		if(l2.altura >= l1.altura) {
			if(l2.peso > l1.peso) {
				return -1;
			}
		} else {
			if(l1.peso > l2.peso) {
				return 1;
			}
		}
		return 0;
	}
	
	@Override
	public String toString() {
		return "Altura: " + this.altura + "  Peso: " + this.peso;
	}
}
