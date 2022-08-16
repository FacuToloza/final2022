package ar.edu.unlam.pb2;

public class Camion extends Vehiculo implements Multeable {

	private String Patente;
	private Integer VelocidadMaximaPermitida;
	private Integer PesoMaximoPermitido;

	public Camion(String Patente, Integer VelocidadMaximaPermitida, Integer PesoMaximoPermitido, Double Latitud,
			Double Longitud) {
		super(Latitud, Longitud);
		this.Patente = Patente;
		this.VelocidadMaximaPermitida = VelocidadMaximaPermitida;
		this.PesoMaximoPermitido = PesoMaximoPermitido;

	}

	public String getPatente() {
		return Patente;
	}

	public void setPatente(String patente) {
		Patente = patente;
	}

	public Integer getVelocidadMaximaPermitida() {
		return VelocidadMaximaPermitida;
	}

	public void setVelocidadMaximaPermitida(Integer velocidadMaximaPermitida) {
		VelocidadMaximaPermitida = velocidadMaximaPermitida;
	}

	public Integer getPesoMaximoPermitido() {
		return PesoMaximoPermitido;
	}

	public void setPesoMaximoPermitido(Integer pesoMaximoPermitido) {
		PesoMaximoPermitido = pesoMaximoPermitido;
	}

	@Override
	public Boolean superoVelocidadMaxima() throws VelocidadMaximaException {
		if (getVelocidadMaximaPermitida() < 100) {
			return true;
		}

		throw new VelocidadMaximaException();
	}

	@Override
	public Boolean superoPesoMaximoCarga() throws PesoMaximoException {
			if(getPesoMaximoPermitido() <= 5 ){
				return true;
			}
		throw new PesoMaximoException();
	}

	@Override
	public Boolean cruzoEnRojo() throws NoRespetoSemaforoException {
		if(getVelocidadMaximaPermitida() >= 100){
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
