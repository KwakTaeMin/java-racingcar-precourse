package domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import domain.interfaces.CarEngine;

@DisplayName("CarEngine 클래스 테스트")
public class CarRandomEngineTest {

	@Test
	@DisplayName("CarEngine 클래스 초기화")
	public void initCarEngine() {
		CarEngine carEngine = new CarRandomEngine();
		assertThat(carEngine).isNotNull();
	}

	@Test
	@DisplayName("CarEngine isMove() 테스트")
	public void isMoveTest() {
		CarEngine carEngine = new CarRandomEngine();
		//TODO : 이런건 어떻게 테스트 해야 할까..
		//assertThat(carEngine.isMove()).isEqualTo(true || false);
	}
}
