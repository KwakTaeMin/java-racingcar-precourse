package service;

import java.util.ArrayList;
import java.util.List;

import domain.Car;
import domain.RaceCars;
import domain.RaceOrganizer;
import domain.RaceResult;

public class Racing {

	private RaceCars raceCars;
	private int raceCount;

	public Racing(RaceOrganizer raceOrganizer) {
		this.raceCars = raceOrganizer.getRaceCars();
		this.raceCount = raceOrganizer.getRaceCount();
	}

	public void start() {
		for (int race = 0; race < this.raceCount; race++) {
			race();
		}
	}

	public RaceResult getResult() {
		return new RaceResult(this.raceCars);
	}

	private void race() {
		for (Car car : this.raceCars.getCars()) {
			car.move();
			System.out.println(car.draw());
		}
		System.out.println();
	}

}
