package domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("CarDraw 클래스 테스트")
public class CarDrawTest {

	@Test
	@DisplayName("CarDraw 초기화 테스트")
	public void initCarDrawTest() {
		CarDraw carDraw = new CarDraw();
		assertThat(carDraw).isNotNull();
		assertThat(carDraw.getDrawing()).isEqualTo("");
	}

	@Test
	@DisplayName("CarDraw 그리기 테스트")
	public void drawCarDrawTest() {
		CarDraw carDraw = new CarDraw();
		carDraw.drawMoving();
		assertThat(carDraw.getDrawing()).isEqualTo("-");
	}

	@Test
	@DisplayName("CarDraw 3칸 그리기 테스트")
	public void drawThreeMoveCarDrawTest() {
		CarDraw carDraw = new CarDraw();
		carDraw.drawMoving();
		carDraw.drawMoving();
		carDraw.drawMoving();
		assertThat(carDraw.getDrawing()).isEqualTo("---");
	}


}
