package logic;

import java.time.LocalDateTime;

public class Application {
	public static void main(String[] args) {
		TimeService timeService = new TimeService();
		LocalDateTime now = LocalDateTime.now();
		int currentHour = now.getHour();
		String hourAsString = timeService.hourToText(currentHour);
		System.out.println(hourAsString);
	}
}
