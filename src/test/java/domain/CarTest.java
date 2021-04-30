package domain;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import exceptions.InvalidCarNameLength;

@DisplayName("Car 클래스 테스트")
public class CarTest {

	@Test
	@DisplayName("Car 초기화 테스트")
	public void initCarTest() throws InvalidCarNameLength {
		String name = "benz";
		Car car = new Car(name);
		assertThat(car).isNotNull();
		CarName carName = new CarName(name);
		assertThat(car.getCarName().getName()).isEqualTo(carName.getName());
		assertThat(car.getPosition()).isEqualTo(0);
	}

	@Test
	@DisplayName("Car 이동 테스트")
	public void moveCarTest() throws InvalidCarNameLength {
		Car car = new Car("Benz");
		assertThat(car.getPosition()).isEqualTo(0);
		car.move();
		assertThat(car.getPosition()).isEqualTo(1);
	}

	@Test
	@DisplayName("Car 이름 가져오기 테스트")
	public void getCarNameTest() throws InvalidCarNameLength {
		String name = "Benz";
		Car car = new Car(name);
		assertThat(car.getCarName().getName()).isEqualTo(new CarName(name).getName());
	}

	@Test
	@DisplayName("Car 현재 위치 가져오기 테스트")
	public void getCarPositionTest() throws InvalidCarNameLength {
		String name = "Benz";
		Car car = new Car(name);
		assertThat(car.getPosition()).isEqualTo(0);
	}

	@DisplayName("자동차 그리기 테스트")
	@Test
	public void drawTest() throws InvalidCarNameLength {
		Car car = new Car("Benz");
		String drawResult = car.draw();
		Assertions.assertThat(drawResult).isEqualTo("Benz : ");
	}

	@DisplayName("자동차 그리기 테스트 (한칸 이동)")
	@Test
	public void drawOneMoveTest() throws InvalidCarNameLength {
		Car car = new Car("Benz");
		while (car.getPosition() != 1)
			car.move();
		String drawResult = car.draw();
		Assertions.assertThat(drawResult).isEqualTo("Benz : -");
	}

	@DisplayName("자동차 그리기 테스트 (세칸 이동)")
	@Test
	public void drawThreeMoveTest() throws InvalidCarNameLength {
		Car car = new Car("Benz");
		while (car.getPosition() != 3)
			car.move();
		String drawResult = car.draw();
		Assertions.assertThat(drawResult).isEqualTo("Benz : ---");
	}
}
