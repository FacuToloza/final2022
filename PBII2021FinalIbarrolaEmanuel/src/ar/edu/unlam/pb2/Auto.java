package ar.edu.unlam.pb2;

public class Auto extends Vehiculo implements Multeable {
	private String Patente;
	private Integer VelocidadActual;
	private Integer VelocidadMaximaPermitida;
	private Integer CantidadMaximaDePasajeros;

	public Auto(String patente, Integer cantidadMaxima, Integer velocidadMaxima, Double Latitud, Double Longitud) {
		super(Latitud, Longitud);
		this.CantidadMaximaDePasajeros = cantidadMaxima;
		this.Patente = patente;
		this.VelocidadActual = 0;
		this.VelocidadMaximaPermitida = velocidadMaxima;
	}

	public String getPatente() {
		return Patente;
	}

	public void setPatente(String patente) {
		Patente = patente;
	}

	public Integer getVelocidadActual() {
		return VelocidadActual;
	}

	public void setVelocidadActual(Integer velocidadActual) {
		VelocidadActual = velocidadActual;
	}

	public Integer getVelocidadMaximaPermitida() {
		return VelocidadMaximaPermitida;
	}

	public void setVelocidadMaximaPermitida(Integer velocidadMaximaPermitida) {
		VelocidadMaximaPermitida = velocidadMaximaPermitida;
	}

	public Integer getCantidadMaximaDePasajeros() {
		return CantidadMaximaDePasajeros;
	}

	public void setCantidadMaximaDePasajeros(Integer cantidadMaximaDePasajeros) {
		CantidadMaximaDePasajeros = cantidadMaximaDePasajeros;
	}

	@Override
	public Boolean superoVelocidadMaxima() throws VelocidadMaximaException {
		if (getVelocidadActual() < getVelocidadMaximaPermitida()) {
			return true;
		}

		throw new VelocidadMaximaException();
	}

	@Override
	public Boolean superoPesoMaximoCarga() throws PesoMaximoException {
			if(getCantidadMaximaDePasajeros() <= 5 ){
				return true;
			}
		throw new PesoMaximoException();
	}

	@Override
	public Boolean cruzoEnRojo() throws NoRespetoSemaforoException {
		if(getVelocidadActual() >= 100){
		return true;
		}
		throw new NoRespetoSemaforoException();
	}

	@Override
	public Boolean estaEnRegla() throws FlojoDePapelesException {
		if(getPatente().length() == 6){
			return true;
		}
		throw new FlojoDePapelesException();
	}

}
