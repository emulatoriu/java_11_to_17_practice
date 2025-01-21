package logic;

import java.util.Random;

import repository.WeatherRepository;

public class WeatherService {
	private final WeatherRepository weatherRepository;
	private final Random random;
	
	public WeatherService(WeatherRepository weatherRepository, Random random) {	
		this.weatherRepository = weatherRepository;
		this.random = random;
	}


	public String getRandomWeather() {
		int length = weatherRepository.getLength();
		int randomIndex = random.nextInt(length);
		return weatherRepository.getAtIndex(randomIndex);
	}
}
