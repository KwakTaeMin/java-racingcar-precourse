package controller;

import java.util.InputMismatchException;
import java.util.Scanner;

import common.PrintMessage;
import domain.Car;
import domain.RaceCars;
import domain.RaceOrganizer;
import exceptions.InvalidCarNameLength;
import service.Racing;

public class RacingManager {

	private RaceCars raceCars;
	private RaceOrganizer raceOrganizer;
	private Racing racing;
	private int raceCount;

	private static RacingManager instance = new RacingManager();

	private RacingManager() {
		setRaceCars();
		setRaceCount();
		setRaceOrganizer();
		setRacing();
	}

	public static RacingManager getInstance() {
		return instance;
	}

	public void start() {
		this.racing.start();
	}

	public void result() {
		System.out.println(this.racing.getResult().getWinMessage());
	}

	private void setRaceCars() {
		try {
			this.raceCars = new RaceCars();
			addCarNamesToRaceCars();
		} catch (InvalidCarNameLength invalidCarNameLength) {
			System.out.println(invalidCarNameLength.getMessage());
			setRaceCars();
		}
	}

	private void addCarNamesToRaceCars() throws InvalidCarNameLength {
		for (String name : inputCarNames().split(",")) {
			Car car = new Car(name.trim());
			this.raceCars.addCar(car);
		}
	}

	private void setRaceCount() {
		try {
			this.raceCount = inputRaceCount();
		} catch (InputMismatchException inputMismatchException) {
			System.out.println(PrintMessage.INVALID_RACE_COUNT_MESSAGE);
			setRaceCount();
		}

	}

	private void setRaceOrganizer() {
		this.raceOrganizer = new RaceOrganizer(this.raceCars, this.raceCount);
	}

	private void setRacing() {
		this.racing = new Racing(this.raceOrganizer);
	}

	private String inputCarNames() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(PrintMessage.INPUT_RACE_CARS_MESSAGE);
		String inputCarNames = scanner.nextLine();
		return inputCarNames;
	}

	private int inputRaceCount() {
		System.out.println(PrintMessage.INPUT_RACE_COUNT_MESSAGE);
		Scanner scanner = new Scanner(System.in);
		int inputRaceCount = scanner.nextInt();
		return inputRaceCount;
	}
}
