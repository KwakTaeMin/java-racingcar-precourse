package service;

import domain.Car;
import domain.RaceCars;
import domain.RaceOrganizer;

public class Racing {

	private RaceCars raceCars;
	private int raceCount;

	public Racing(RaceOrganizer raceOrganizer) {
		this.raceCars = raceOrganizer.getRaceCars();
		this.raceCount = raceOrganizer.getRaceCount();
	}

	public void start() {
		for (int race = 0; race < raceCount; race++) {
			race();
		}
	}

	private void race() {
		for (Car car : this.raceCars.getCars()) {
			car.move();
			System.out.println(car.draw());
		}
		System.out.println();
	}

}
