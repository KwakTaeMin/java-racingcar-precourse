package ui;

import controller.RacingManager;

public class Main {

	public static void main(String[] arg) {
		RacingManager racingManager = RacingManager.getInstance();
		racingManager.start();
		racingManager.result();
	}
}
