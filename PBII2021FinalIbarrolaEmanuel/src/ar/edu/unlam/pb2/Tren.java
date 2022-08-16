package ar.edu.unlam.pb2;

public class Tren extends Vehiculo{

	private Integer CantidadDeVagones;
	private Integer CantidadDePasajerosPorVagon;
	private Integer VelocidadMaximaPermitida;
	

	public Tren(Integer CantidadDeVagones, Integer CantidadDePasajerosPorVagon, Integer VelocidadMaximaPermitida, Double Latitud, Double Longitud) {
		super(Latitud,Longitud);
	this.CantidadDeVagones=CantidadDeVagones;
	this.CantidadDePasajerosPorVagon=CantidadDePasajerosPorVagon;
	this.VelocidadMaximaPermitida=VelocidadMaximaPermitida;
			
	
	
	}

	public Integer getCantidadDeVagones() {
		return CantidadDeVagones;
	}

	public void setCantidadDeVagones(Integer cantidadDeVagones) {
		CantidadDeVagones = cantidadDeVagones;
	}

	public Integer getCantidadDePasajerosPorVagon() {
		return CantidadDePasajerosPorVagon;
	}

	public void setCantidadDePasajerosPorVagon(Integer cantidadDePasajerosPorVagon) {
		CantidadDePasajerosPorVagon = cantidadDePasajerosPorVagon;
	}

	public Integer getVelocidadMaximaPermitida() {
		return VelocidadMaximaPermitida;
	}

	public void setVelocidadMaximaPermitida(Integer velocidadMaximaPermitida) {
		VelocidadMaximaPermitida = velocidadMaximaPermitida;
	}


}
