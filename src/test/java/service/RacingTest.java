package service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import domain.Car;
import domain.RaceCars;
import domain.RaceOrganizer;
import domain.RaceResult;
import exceptions.InvalidCarNameLength;

@DisplayName("Racing 테스트")
public class RacingTest {

	@Test
	@DisplayName("Racing 클래스 초기화")
	public void initRaceTest() {
		RaceCars raceCars = new RaceCars();
		int raceCount = 5;
		RaceOrganizer raceOrganizer = new RaceOrganizer(raceCars, raceCount);
		Racing racing = new Racing(raceOrganizer);
		assertThat(racing).isNotNull();
	}

	@Test
	@DisplayName("Racing start 테스트")
	public void startRaceTest() throws InvalidCarNameLength {
		RaceCars raceCars = new RaceCars();
		Car benz = new Car("Benz");
		Car audi = new Car("Audi");
		Car hyundai = new Car("Hyun");
		Car kia = new Car("Kia");
		raceCars.addCar(benz);
		raceCars.addCar(audi);
		raceCars.addCar(hyundai);
		raceCars.addCar(kia);
		int raceCount = 5;
		RaceOrganizer raceOrganizer = new RaceOrganizer(raceCars, raceCount);
		Racing racing = new Racing(raceOrganizer);
		racing.start();
	}

	@Test
	@DisplayName("Racing getResult 테스트")
	void getResultTest() throws InvalidCarNameLength {
		RaceCars raceCars = new RaceCars();
		Car benz = new Car("Benz");
		Car audi = new Car("Audi");
		Car hyundai = new Car("Hyun");
		Car kia = new Car("Kia");
		raceCars.addCar(benz);
		raceCars.addCar(audi);
		raceCars.addCar(hyundai);
		raceCars.addCar(kia);
		int raceCount = 5;
		RaceOrganizer raceOrganizer = new RaceOrganizer(raceCars, raceCount);
		Racing racing = new Racing(raceOrganizer);
		racing.start();
		RaceResult raceResult = racing.getResult();
		System.out.println(raceResult.getWinMessage());
	}
}
