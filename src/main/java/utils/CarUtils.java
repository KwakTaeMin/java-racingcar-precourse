package utils;

import domain.Car;

public class CarUtils {
	private static final String DRAW_CAR_POSITION = "-";
	public static String draw(Car car) {
		String drawPosition = "";
		for(int currentPosition = 0; currentPosition < car.getPosition(); currentPosition++)
			drawPosition += DRAW_CAR_POSITION;
		return car.getCarName().getName() + " : " + drawPosition;
	}
}
