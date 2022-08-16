package ar.edu.unlam.pb2;

public class Moto extends Vehiculo implements Multeable{

	private String Patente;
	private Integer VelocidadMaximaPermitida;
	private Integer CAPACIDA_MAXIMA_DE_PASAJEROS;

	public Moto(String Patente, Integer VelocidadMaximaPermitida, Double Latitud, Double Longitud) {
		super(Latitud,Longitud);
		this.Patente=Patente;
		this.VelocidadMaximaPermitida=VelocidadMaximaPermitida;
		this.CAPACIDA_MAXIMA_DE_PASAJEROS=2;
		
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

	

	public Integer getCAPACIDA_MAXIMA_DE_PASAJEROS() {
		return CAPACIDA_MAXIMA_DE_PASAJEROS;
	}

	public void setCAPACIDA_MAXIMA_DE_PASAJEROS(Integer cAPACIDA_MAXIMA_DE_PASAJEROS) {
		CAPACIDA_MAXIMA_DE_PASAJEROS = cAPACIDA_MAXIMA_DE_PASAJEROS;
	}

	@Override
	public Boolean superoVelocidadMaxima() throws VelocidadMaximaException {
		if (getVelocidadMaximaPermitida()< 100) {
			return true;
		}

		throw new VelocidadMaximaException();
	}

	@Override
	public Boolean superoPesoMaximoCarga() throws PesoMaximoException {
			if(getCAPACIDA_MAXIMA_DE_PASAJEROS() <=2){
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
