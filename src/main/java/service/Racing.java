package service;

import domain.Car;
import domain.RaceCars;
import domain.RaceCount;
import domain.RaceOrganizer;
import domain.RaceResult;

public class Racing {

	private RaceCars raceCars;
	private RaceCount raceCount;

	public Racing(RaceOrganizer raceOrganizer) {
		this.raceCars = raceOrganizer.getRaceCars();
		this.raceCount = raceOrganizer.getRaceCount();
	}

	public void start() {
		for (int race = 0; race < this.raceCount.getCount(); race++) {
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
