package domain;

import domain.interfaces.CarEngine;
import exceptions.InvalidCarNameLength;

public class Car {

	private CarName name;
	private CarEngine engine;
	private CarDraw draw;
	private int position;

	public Car(String name) throws InvalidCarNameLength {
		this.name = new CarName(name);
		this.engine = new CarRandomEngine();
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
		if (engine.isMove()) {
			this.draw.drawMoving();
			this.position++;
		}
	}

	public String draw() {
		return this.name.toString() + " : " + this.draw.getDrawing();
	}
}
