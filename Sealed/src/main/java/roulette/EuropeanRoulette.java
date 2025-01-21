package roulette;

import logic.RandomService;

public final class EuropeanRoulette implements RouletteService {

	private final RandomService randomService;
	private final int MAX_NUMBER_EXCLUSIVE = 37;

	public EuropeanRoulette(RandomService randomService) {
		this.randomService = randomService;
	}

	@Override
	public String spinWheel() {
		int randomNumber = randomService.getRandomNumber(0, MAX_NUMBER_EXCLUSIVE);
		
		return switch (randomNumber) {
		case 0 -> "Green 0";
		default -> String.valueOf(randomNumber);
		};
	}
	
	@Override
	public String toString() {
		return "EuropeanRoulette from 0-36";
	}

}
