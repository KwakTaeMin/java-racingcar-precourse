package domain;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

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
		assertThat(car.getName()).isEqualTo(name);
		assertThat(car.getPosition() ).isEqualTo(0);
	}

	@Test
	@DisplayName("Car 초기화 이름 5글자 이상 불가 테스트")
	public void initCarNameValidFiveMoreTest() {
		assertThrows(InvalidCarNameLength.class, () -> {
			String name = "abcdef";
			Car car = new Car(name);
		});
	}

	@Test
	@DisplayName("Car 초기화 이름 0글자 이하 불가 테스트")
	public void initCarNameValidZeoTest() {
		assertThrows(InvalidCarNameLength.class, () -> {
			String name = "";
			Car car = new Car(name);
		});
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
		assertThat(car.getName()).isEqualTo("Benz");
	}

	@Test
	@DisplayName("Car 현재 위치 가져오기 테스트")
	public void getCarPositionTest() throws InvalidCarNameLength {
		String name = "Benz";
		Car car = new Car(name);
		assertThat(car.getPosition()).isEqualTo(0);
	}
}
