package domain;

import exceptions.InvalidCarNameLength;

public class Car {

	private CarName name;
	private int position;
	private CarDraw draw;

	public Car(String name) throws InvalidCarNameLength {
		this.name = new CarName(name);
		this.draw = new CarDraw();
		this.position = 0;
	}

	public CarName getCarName() {
		return this.name;
	}

	public int getPosition() {
		return this.position;
	}

	public void move() {
		this.draw.drawMoving();
		position++;
	}

	public String draw() {
		return this.name.getName() + " : " + this.draw.getDrawing();
	}
}
