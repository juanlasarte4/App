package Excepciones;

public class ClienteNoEncontrado extends Exception {
	private static final long serialVersionUID = 5L;

	public ClienteNoEncontrado(String m) {
		super(m);
	}
}