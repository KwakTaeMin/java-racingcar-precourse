package domain;

public class RaceResult {

	private RaceCars raceCars;
	private RaceCars winCars;
	private int winPosition;

	public RaceResult(RaceCars raceCars) {
		this.raceCars = raceCars;
		this.winCars = new RaceCars();
		this.winPosition = 0;
		this.winResult();
	}

	public String getWinMessage() {
		return this.winCars.toString() + "가 최종 우승했습니다.";
	}

	private void winResult() {
		for (Car car : this.raceCars.getCars()) {
			addWinnerCars(car);
		}
	}

	private void addWinnerCars(Car car) {
		if (car.getPosition() > this.winPosition) {
			this.winPosition = car.getPosition();
			this.winCars.getCars().clear();
			this.winCars.addCar(car);
			return;
		}
		if (car.getPosition() == this.winPosition) {
			this.winCars.addCar(car);
			return;
		}
	}
}
