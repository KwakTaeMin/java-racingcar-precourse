package domain;

public class CarDraw {

	private static final String DRAW_CAR_POSITION = "-";

	private String position;

	public CarDraw() {
		this.position = "";
	}

	public void drawMoving() {
		this.position += DRAW_CAR_POSITION;
	}

	public String getDrawing() {
		return this.position;
	}
}
