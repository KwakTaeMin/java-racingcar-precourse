package domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import exceptions.InvalidCarNameLength;

@DisplayName("RaceCars Class 테스트")
public class RaceCarsTest {

	@Test
	@DisplayName("RaceCars 초기화")
	public void initRaceCarsTest() {
		RaceCars raceCars = new RaceCars();
		assertThat(raceCars).isNotNull();
	}

	@Test
	@DisplayName("RaceCars에 경주할 자동차 추가")
	public void addCarTest() throws InvalidCarNameLength {
		RaceCars raceCars = new RaceCars();
		Car car = new Car("Benz");
		assertThat(raceCars.getCars().size()).isEqualTo(0);
		raceCars.addCar(car);
		assertThat(raceCars.getCars().size()).isEqualTo(1);
	}

	@Test
	@DisplayName("RaceCars에 경주할 자동차 조회")
	public void getCarsTest() throws InvalidCarNameLength {
		RaceCars raceCars = new RaceCars();
		Car car = new Car("Benz");
		raceCars.addCar(car);
		assertThat(raceCars.getCars().size()).isEqualTo(1);
	}
}
