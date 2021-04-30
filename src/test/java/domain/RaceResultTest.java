package domain;

import static org.assertj.core.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import exceptions.InvalidCarNameLength;

@DisplayName("RaceResult 클래스 테스트")
public class RaceResultTest {

	@Test
	@DisplayName("RaceResult 초기화")
	public void initRaceResult() {
		RaceCars raceCars = new RaceCars();
		RaceResult raceResult = new RaceResult(raceCars);
		assertThat(raceResult).isNotNull();
	}

	@Test
	@DisplayName("RaceResult printWinMessage 테스트")
	public void printWinMessage() throws InvalidCarNameLength {
		RaceCars raceCars = new RaceCars();
		Car Benz = new Car("Benz");
		Car Audi = new Car("Audi");
		raceCars.addCar(Benz);
		raceCars.addCar(Audi);
		RaceResult raceResult = new RaceResult(raceCars);
		assertThat(raceResult).isNotNull();
		assertThat(raceResult.getWinMessage()).isEqualTo("Benz, Audi가 최종 우승했습니다.");
	}
}
