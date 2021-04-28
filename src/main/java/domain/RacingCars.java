package domain;

import java.util.ArrayList;
import java.util.List;

public class RacingCars {
	private List<Car> cars;

	public RacingCars() {
		this.cars = new ArrayList<>();
	}

	public void add(Car car) {
		this.cars.add(car);
	}

	public List<Car> getCars() {
		return cars;
	}
}
