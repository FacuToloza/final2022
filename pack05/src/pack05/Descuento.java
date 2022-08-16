package pack05;

public class Descuento {
	
	private int descuento;
	private double total = 0;
	
	public Descuento(int desc) {
		this.descuento = desc;
	}
	
	public void agregar(Articulo art) {
		this.total += art.getPrecio();
	}
	
}
