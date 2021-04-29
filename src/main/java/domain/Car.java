package domain;

import exceptions.InvalidCarNameLength;

public class Car {

	private static final int MIN_LENGTH = 0;
	private static final int MAX_LENGTH = 5;

	private String name;
	private int position;

	public Car(String name) throws InvalidCarNameLength {
		if (!validName(name))
			throw new InvalidCarNameLength("자동차 이름의 길이는 1이상 5이하의 문자열로 입력하여 주세요.");
		this.name = name;
		this.position = 0;
	}

	public String getName() {
		return this.name;
	}

	public int getPosition() {
		return this.position;
	}

	private boolean validName(String name) {
		return name.length() > MIN_LENGTH && name.length() <= MAX_LENGTH;
	}

	public void move() {
		position++;
	}
}
