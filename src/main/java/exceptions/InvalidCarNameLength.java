package exceptions;

public class InvalidCarNameLength extends RuntimeException {
	public InvalidCarNameLength(String message) {
		super(message);
	}
}
