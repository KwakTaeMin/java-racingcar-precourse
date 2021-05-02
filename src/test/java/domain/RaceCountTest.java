package domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import exceptions.InvalidRaceCount;

@DisplayName("RaceCount 클래스 테스트")
public class RaceCountTest {

	@Test
	@DisplayName("RaceCount 초기화 테스트")
	public void initRaceCountTest() throws InvalidRaceCount {
		RaceCount raceCount = new RaceCount(5);
		assertThat(raceCount).isNotNull();
	}

	@Test
	@DisplayName("RaceCount getCount 테스트")
	public void getCountTest() throws InvalidRaceCount {
		RaceCount raceCount = new RaceCount(5);
		assertThat(raceCount.getCount()).isEqualTo(5);
	}

	@Test
	@DisplayName("RaceCount InvalidRaceCount Exception 테스트")
	public void invalidRaceCountTest() {
		assertThrows(InvalidRaceCount.class, () -> {
			RaceCount raceCount = new RaceCount(-1);
		});
	}
}
