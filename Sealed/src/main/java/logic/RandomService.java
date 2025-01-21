package logic;

import java.util.Random;

public class RandomService {
	private final Random random;

	public RandomService(Random random) {		
		this.random = random;
	}

	public int getRandomNumber(int lowerBoundInkclusive, int upperBoundExclusive) {
		return random.nextInt(lowerBoundInkclusive, upperBoundExclusive);
	}
}
