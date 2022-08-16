
public abstract class Instrumento{

	

	private int tono;
	private String nombre;
	private String descripcion;
	
	public Instrumento(int tono, String nombre, String desc) {
		this.descripcion = desc;
		this.nombre =nombre;
		this.tono = tono;
	}
	

	public abstract void tocar();
	
	public int compareTo(Instrumento i1){
		if(this.tono >= i1.tono)
			return 1;
		else
			return -1;
	}
	
	@Override
	public String toString() {
		//return "Instrumento [tono=" + tono + ", nombre=" + nombre + "]";
		return nombre + " " +tono;
	}

	
}
