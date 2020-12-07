package Excepciones;

public class ClienteDuplicado extends Exception {
	private static final long serialVersionUID = 3L;

	public ClienteDuplicado(String m) {
		super(m);
	}
}
