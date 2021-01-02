package Excepciones;

public class ClienteNotFoundException extends Exception {
	private static final long serialVersionUID = 5L;

	public ClienteNotFoundException(String m) {
		super(m);
	}
}