package service;

import java.util.Random;

import domain.Car;
import domain.RaceCars;
import domain.RaceOrganizer;

public class Race {

	private static final int MIN_RANDOM_NUMBER = 0;
	private static final int MAX_RANDOM_NUMBER = 9;
	private static final int MOVE_STANDARD_NUMBER = 4;

	private RaceCars raceCars;
	private int raceCount;

	public Race(RaceOrganizer raceOrganizer) {
		this.raceCars = raceOrganizer.getRaceCars();
		this.raceCount = raceOrganizer.getRaceCount();
	}

	//TODO : indent 2 이상 refactoring 필요
	public void start() {
		for (int race = 0; race < raceCount; race++) {
			for (Car car : this.raceCars.getCars()) {
				if (isMove())
					car.move();
				System.out.println(car.draw());
			}
			System.out.println();
		}
	}

	private int generateRandomNumbers() {
		Random random = new Random();
		return random.nextInt((MAX_RANDOM_NUMBER - MIN_RANDOM_NUMBER) + 1) + MIN_RANDOM_NUMBER;
	}

	private boolean isMove() {
		return generateRandomNumbers() >= MOVE_STANDARD_NUMBER;
	}

}
