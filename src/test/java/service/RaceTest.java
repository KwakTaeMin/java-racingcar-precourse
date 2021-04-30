package service;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import domain.Car;
import domain.RaceCars;
import domain.RaceOrganizer;
import exceptions.InvalidCarNameLength;

@DisplayName("Race 테스트")
public class RaceTest {

	@Test
	@DisplayName("Race 클래스 초기화")
	public void initRace() {
		RaceCars raceCars = new RaceCars();
		int raceCount = 5;
		RaceOrganizer raceOrganizer = new RaceOrganizer(raceCars, raceCount);
		Race race = new Race(raceOrganizer);
		assertThat(race).isNotNull();
	}

	@Test
	public void startRace() throws InvalidCarNameLength {
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
		Race race = new Race(raceOrganizer);
		race.start();
	}
}
