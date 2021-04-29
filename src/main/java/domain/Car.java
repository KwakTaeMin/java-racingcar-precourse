package domain;

import exceptions.InvalidCarNameLength;

public class Car {

	private CarName name;
	private int position;

	public Car(String name) throws InvalidCarNameLength {
		this.name = new CarName(name);
		this.position = 0;
	}

	public CarName getCarName() {
		return this.name;
	}

	public int getPosition() {
		return this.position;
	}

	public void move() {
		position++;
	}
}
