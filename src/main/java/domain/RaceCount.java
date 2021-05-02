package domain;

import common.PrintMessage;
import exceptions.InvalidRaceCount;

public class RaceCount {

	private static final int MIN_COUNT = 0;

	private int count;

	public RaceCount(int count) throws InvalidRaceCount {
		if (!isValidCount(count))
			throw new InvalidRaceCount(PrintMessage.INVALID_RACE_COUNT_ZERO_MORE_MESSAGE);
		this.count = count;
	}

	private boolean isValidCount(int count) {
		return count > MIN_COUNT;
	}

	public int getCount() {
		return this.count;
	}
}
