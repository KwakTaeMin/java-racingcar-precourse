package controller;

import java.util.InputMismatchException;
import java.util.Scanner;

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
			System.out.println("숫자를 입력하여 주세요.");
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
		System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,) 기준으로 구분)");
		String inputCarNames = scanner.nextLine();
		return inputCarNames;
	}

	private int inputRaceCount() {
		System.out.println("시도할 회수는 몇회인가요?");
		Scanner scanner = new Scanner(System.in);
		int inputRaceCount = scanner.nextInt();
		return inputRaceCount;
	}
}
