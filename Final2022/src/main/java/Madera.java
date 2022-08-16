
public class Madera extends Viento{

	public Madera(int tono, String nombre, String desc) {
		super(tono, nombre, desc);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void tocar() {
		System.out.println("Tocando");
		
	}

	public void lustrar() {
		System.out.println("Lustrando");
		
	}

	public void afinar() {
		System.out.println("Afinando");
	}

}
