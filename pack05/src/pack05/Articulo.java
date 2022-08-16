package pack05;

public class Articulo {
	
	private String articulo;
	private double precio;
	
	public Articulo(String nombre, double precio) {
		this.articulo = nombre;
		this.precio = precio;
	}
	
	public double getPrecio() {
		return this.precio;
	}
}
