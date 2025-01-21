package repository;

import java.util.List;

public class WeatherRepository {
	private final List<String> weatherRepository;

	public WeatherRepository(List<String> weatherRepository) {
		super();
		this.weatherRepository = weatherRepository;
	}
	
	public void add(String weather) {
		weatherRepository.add(weather);
	}
	
	public String getAtIndex(int index) {
		return weatherRepository.get(index);
	}
	
	public int getLength() {
		return weatherRepository.size();
	}
}
