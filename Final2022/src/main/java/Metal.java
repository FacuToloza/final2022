
public class Metal extends Viento {

	public Metal(int tono, String nombre, String desc) {
		super(tono, nombre, desc);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void tocar() {
		System.out.println("Tocando");
		
	}

	public void afinar() {
		System.out.println("Afinando");
		
	}

	public void lustrar() {
		System.out.println("Lustrando");
		
	}

}
