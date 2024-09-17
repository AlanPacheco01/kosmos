package aapr.consultorio.exceptions;

public class CitaNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	public CitaNotFoundException (Long id) {
		super("El usuario con el id: " + id + " no existe");
	}

}
