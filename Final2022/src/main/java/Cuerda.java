
public class Cuerda extends Instrumento implements Afinable{

	public Cuerda(int tono, String nombre, String desc) {
		super(tono, nombre, desc);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void tocar() {
		System.err.println("Tocando");
		
	}

	public void afinar() {
		System.out.println("Afinando");
		
	}



}
