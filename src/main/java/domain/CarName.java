package domain;

import common.PrintMessage;
import exceptions.InvalidCarNameLength;

public class CarName {

	private static final int MIN_LENGTH = 0;
	private static final int MAX_LENGTH = 5;

	private String name;

	public CarName(String name) throws InvalidCarNameLength {
		if (!validName(name))
			throw new InvalidCarNameLength(PrintMessage.INVALID_RACE_CARS_MESSAGE);
		this.name = name;
	}

	private boolean validName(String name) {
		return name.length() > MIN_LENGTH && name.length() <= MAX_LENGTH;
	}

	@Override
	public String toString() {
		return this.name;
	}
}
