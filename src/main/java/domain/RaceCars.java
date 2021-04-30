package domain;

import java.util.ArrayList;
import java.util.List;

public class RaceCars {

	private List<Car> cars;

	public RaceCars() {
		this.cars = new ArrayList<>();
	}

	public void addCar(Car car) {
		this.cars.add(car);
	}

	public List<Car> getCars() {
		return this.cars;
	}

	@Override
	public String toString() {
		String stringCars = "";
		for (Car car : this.cars)
			stringCars += car.getCarName().toString() + ", ";
		return stringCars.substring(0, stringCars.length() - 2);
	}
}
