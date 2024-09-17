package aapr.consultorio.exceptions;

public class ConsultorioNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public ConsultorioNotFoundException(Integer numConsultorio) {
		super("El consultorio: " + numConsultorio + " no existe");
	}

}
