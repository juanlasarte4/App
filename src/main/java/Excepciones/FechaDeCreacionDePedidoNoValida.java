package Excepciones;

public class FechaDeCreacionDePedidoNoValida extends Exception {
	private static final long serialVersionUID = 6L;

	public FechaDeCreacionDePedidoNoValida(String m) {
		super(m);
	}
}