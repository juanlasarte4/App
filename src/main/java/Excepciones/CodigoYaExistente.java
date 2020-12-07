package Excepciones;

public class CodigoYaExistente extends Exception {
	private static final long serialVersionUID = 2L;

	public CodigoYaExistente(String m) {
		super(m);
	}
}