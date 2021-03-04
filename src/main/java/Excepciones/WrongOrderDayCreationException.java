package Excepciones;

public class WrongOrderDayCreationException extends Exception {
	private static final long serialVersionUID = 1L;
	
	public WrongOrderDayCreationException(String m) {
		super(m);
	}
}