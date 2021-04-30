package domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import exceptions.InvalidCarNameLength;

@DisplayName("RaceOrganizer 클래스 테스트")
public class RaceOrganizerTest {

	@DisplayName("RaceOrganizer 초기화 테스트")
	@Test
	public void initRaceOrganizerTest() {
		RaceCars raceCars = new RaceCars();
		RaceOrganizer raceOrganizer = new RaceOrganizer(raceCars, 5);
		assertThat(raceOrganizer).isNotNull();
	}

	@Test
	public void getRaceCount() {
		RaceCars raceCars = new RaceCars();
		RaceOrganizer raceOrganizer = new RaceOrganizer(raceCars, 5);
		assertThat(raceOrganizer.getRaceCount()).isEqualTo(5);
	}

	@Test
	public void getRaceCars() throws InvalidCarNameLength {
		RaceCars raceCars = new RaceCars();
		Car car = new Car("Benz");
		raceCars.addCar(car);
		RaceOrganizer raceOrganizer = new RaceOrganizer(raceCars, 5);
		assertThat(raceOrganizer).isNotNull();
		assertThat(raceOrganizer.getRaceCars()).isNotNull();
		assertThat(raceOrganizer.getRaceCars().getCars()).isNotNull();
		assertThat(raceOrganizer.getRaceCars().getCars().get(0).getCarName().toString()).isEqualTo("Benz");
		assertThat(raceOrganizer.getRaceCars().getCars().get(0).getPosition()).isEqualTo(0);
		assertThat(raceOrganizer.getRaceCars().getCars().get(0).draw()).isEqualTo("Benz : ");
	}
}
