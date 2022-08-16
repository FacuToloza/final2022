
public class Percusion extends Instrumento implements Lustrable{

	public Percusion(int tono, String nombre, String desc) {
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

}
