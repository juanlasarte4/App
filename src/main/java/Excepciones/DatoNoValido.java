package Excepciones;

public class DatoNoValido extends Exception {
	private static final long serialVersionUID = 1L;

	public DatoNoValido(String m) {
		super(m);
	}
}