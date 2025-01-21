package roulette;

import logic.RandomService;

public final class AmericanRoulette implements RouletteService {
	private final RandomService randomService;
	private final int MAX_NUMBER_EXCLUSIVE = 38;

	public AmericanRoulette(RandomService randomService) {
		this.randomService = randomService;
	}

	@Override
	public String spinWheel() {
		int randomNumber = randomService.getRandomNumber(0, MAX_NUMBER_EXCLUSIVE);
		
		return switch (randomNumber) {
		case 0 -> "Green 0";
		case 37 -> "Green 00";
		default -> String.valueOf(randomNumber);
		};
	}

	@Override
	public String toString() {
		return "AmericanRoulette from 00-0-36";
	}
	
}
