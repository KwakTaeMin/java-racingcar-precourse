package domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import exceptions.InvalidCarNameLength;
import exceptions.InvalidRaceCount;

@DisplayName("RaceOrganizer 클래스 테스트")
public class RaceOrganizerTest {

	@DisplayName("RaceOrganizer 초기화 테스트")
	@Test
	public void initRaceOrganizerTest() throws InvalidRaceCount {
		RaceCars raceCars = new RaceCars();
		RaceCount raceCount = new RaceCount(5);
		RaceOrganizer raceOrganizer = new RaceOrganizer(raceCars, raceCount);
		assertThat(raceOrganizer).isNotNull();
	}

	@Test
	public void getRaceCount() throws InvalidRaceCount {
		RaceCars raceCars = new RaceCars();
		RaceCount raceCount = new RaceCount(5);
		RaceOrganizer raceOrganizer = new RaceOrganizer(raceCars, raceCount);
		assertThat(raceOrganizer.getRaceCount().getCount()).isEqualTo(5);
	}

	@Test
	public void getRaceCars() throws InvalidCarNameLength, InvalidRaceCount {
		RaceCars raceCars = new RaceCars();
		RaceCount raceCount = new RaceCount(5);
		Car car = new Car("Benz");
		raceCars.addCar(car);
		RaceOrganizer raceOrganizer = new RaceOrganizer(raceCars, raceCount);
		assertThat(raceOrganizer).isNotNull();
		assertThat(raceOrganizer.getRaceCars()).isNotNull();
		assertThat(raceOrganizer.getRaceCars().getCars()).isNotNull();
		assertThat(raceOrganizer.getRaceCars().getCars().get(0).getCarName().toString()).isEqualTo("Benz");
		assertThat(raceOrganizer.getRaceCars().getCars().get(0).getPosition()).isEqualTo(0);
		assertThat(raceOrganizer.getRaceCars().getCars().get(0).draw()).isEqualTo("Benz : ");
	}
}
