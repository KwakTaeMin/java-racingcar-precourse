package domain;

import exceptions.InvalidCarNameLength;

public class Car {
	private static final String CAR_POSITION_DRAW_MARK = "-";
	private static final int NAME_MAX_LENGTH = 5;
	private static final int NAME_MIN_LENGTH = 1;

	private String name;
	private int position;

	public Car(String name) throws InvalidCarNameLength {
		validateName(name);
		this.name = name;
		this.position = 0;
	}

	public void move() {
		position++;
	}

	public String getName() {
		return this.name;
	}

	public int getPosition() {
		return this.position;
	}

	@Override
	public String toString() {
		int drawCurrentPosition = 0;
		String printPosition = "";
		while (this.position == drawCurrentPosition) {
			printPosition += CAR_POSITION_DRAW_MARK;
			drawCurrentPosition++;
		}
		return this.name + " : " + printPosition;
	}

	private void validateName(String name) {
		if(this.name.length() > NAME_MAX_LENGTH || this.name.length() < NAME_MIN_LENGTH)
			throw new InvalidCarNameLength("자동차 이름의 길이는 5이하 0보다 커야합니다. 자동차 이름 길이 : " + this.name.length());
	}
}
