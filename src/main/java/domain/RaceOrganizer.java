package domain;

public class RaceOrganizer {

	private RaceCars raceCars;
	private RaceCount raceCount;

	public RaceOrganizer(RaceCars raceCars, RaceCount raceCount) {
		this.raceCars = raceCars;
		this.raceCount = raceCount;
	}

	public RaceCars getRaceCars() {
		return raceCars;
	}

	public RaceCount getRaceCount() {
		return raceCount;
	}
}
