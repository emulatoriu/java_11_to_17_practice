import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;
import java.util.Random;

import logic.DaySupporter;
import logic.WeatherService;
import repository.WeatherRepository;

public class Application {
	public static void main(String[] args) {
		List<String> weatherTypes = List.of("sunny", "cloudy", "rainy");
		WeatherRepository weatherRepository = new WeatherRepository(weatherTypes);
		Random random = new Random();
		WeatherService weatherService = new WeatherService(weatherRepository, random); 
		LocalTime localTime = LocalTime.now();
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("B", Locale.US);
		DaySupporter daySupporter = new DaySupporter(dateTimeFormatter);
		String dayTime = daySupporter.getDayPeriod(localTime);
		String randomWeather = weatherService.getRandomWeather();
		System.out.println("Tomorrow %s it will be %s".formatted(dayTime, randomWeather));
	}
}
