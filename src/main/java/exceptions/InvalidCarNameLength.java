package exceptions;

public class InvalidCarNameLength extends Exception {
	public InvalidCarNameLength() {
		super();
	}

	public InvalidCarNameLength(String message) {
		super(message);
	}

}
