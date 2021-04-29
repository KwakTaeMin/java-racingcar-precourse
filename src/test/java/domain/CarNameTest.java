package domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import exceptions.InvalidCarNameLength;

@DisplayName("CarName 클래스 Test")
public class CarNameTest {

	@Test
	@DisplayName("Car 초기화 이름 5글자 이상 불가 테스트")
	public void initCarNameValidFiveMoreTest() {
		assertThrows(InvalidCarNameLength.class, () -> {
			String name = "abcdef";
			CarName carName = new CarName(name);
		});
	}

	@Test
	@DisplayName("Car 초기화 이름 0글자 이하 불가 테스트")
	public void initCarNameValidZeoTest() {
		assertThrows(InvalidCarNameLength.class, () -> {
			String name = "";
			CarName carName = new CarName(name);
		});
	}

}
