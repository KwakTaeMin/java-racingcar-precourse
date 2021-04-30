package domain;

public class RaceOrganizer {

	private RaceCars raceCars;
	private int raceCount;
	public RaceOrganizer(RaceCars raceCars, int raceCount) {
		this.raceCars = raceCars;
		this.raceCount = raceCount;
	}

	public RaceCars getRaceCars() {
		return raceCars;
	}

	public int getRaceCount() {
		return raceCount;
	}
}
