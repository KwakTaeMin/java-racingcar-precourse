package domain;

import java.util.ArrayList;
import java.util.List;

public class RaceCars {
	private List<Car> cars;

	public RaceCars() {
		this.cars = new ArrayList<>();
	}

	public void add(Car car) {
		this.cars.add(car);
	}

	public List<Car> getCars() {
		return cars;
	}
}
