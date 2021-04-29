package utils;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import domain.Car;
import exceptions.InvalidCarNameLength;

@DisplayName("CarUtils 클래스 테스트")
public class CarUtilsTest {

	@DisplayName("자동차 그리기 테스트")
	@Test
	public void drawTest() throws InvalidCarNameLength {
		Car car = new Car("Benz");
		String drawResult = CarUtils.draw(car);
		assertThat(drawResult).isEqualTo("Benz : ");
	}

	@DisplayName("자동차 그리기 테스트 (한칸 이동)")
	@Test
	public void drawOneMoveTest() throws InvalidCarNameLength {
		Car car = new Car("Benz");
		car.move();
		String drawResult = CarUtils.draw(car);
		assertThat(drawResult).isEqualTo("Benz : -");
	}

	@DisplayName("자동차 그리기 테스트 (세칸 이동)")
	@Test
	public void drawThreeMoveTest() throws InvalidCarNameLength {
		Car car = new Car("Benz");
		car.move();
		car.move();
		car.move();
		String drawResult = CarUtils.draw(car);
		assertThat(drawResult).isEqualTo("Benz : ---");
	}
}
