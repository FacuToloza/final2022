package ar.edu.unlam.pb2;

import java.util.HashSet;
import java.util.Set;

public class Mapa {

	private String lugar;
	private Integer CantidadDeVehiculos;
	private Set<Vehiculo> listaVehiculos;
	public Mapa(String lugar) {
		this.lugar = lugar;
		this.CantidadDeVehiculos = 0;
		this.listaVehiculos = new HashSet<Vehiculo>();
	}

	public void agregarVehiculo(Vehiculo vehiculo) throws ColitionException{
			if (hayCoalición()) {
				this.listaVehiculos.add(vehiculo);
				CantidadDeVehiculos++;
			}else{
				throw new ColitionException();
			}
			
			
	}

	public boolean hayCoalición() throws ColitionException  {
		for (Vehiculo aux1 : listaVehiculos) {
			for (Vehiculo aux2 : listaVehiculos) {
				if(aux1.getLatitud() != aux2.getLatitud()){
					return true;
				}
			}
		} 
		throw new ColitionException();
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public Integer getCantidadDeVehiculos() {
		return CantidadDeVehiculos;
	}

	public void setCantidadDeVehiculos(Integer cantidadDeVehiculos) {
		CantidadDeVehiculos = cantidadDeVehiculos;
	}

}
