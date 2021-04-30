package domain;

import java.util.Random;

import domain.interfaces.CarEngine;

public class CarRandomEngine implements CarEngine {

	private static final int MIN_RANDOM_NUMBER = 0;
	private static final int MAX_RANDOM_NUMBER = 9;
	private static final int MOVE_STANDARD_NUMBER = 4;

	private int generateRandomNumbers() {
		Random random = new Random();
		return random.nextInt((MAX_RANDOM_NUMBER - MIN_RANDOM_NUMBER) + 1) + MIN_RANDOM_NUMBER;
	}

	@Override
	public boolean isMove() {
		return generateRandomNumbers() >= MOVE_STANDARD_NUMBER;
	}
}
