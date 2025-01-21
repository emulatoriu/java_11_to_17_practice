package logic;

import java.time.LocalDateTime;

public class Application {

	public static void main(String[] args) {
		LoggerService loggerService = new LoggerService();
		String logMessage = loggerService.getFormattedLogInfo(LocalDateTime.now(), "1", 500);
		System.out.println(logMessage);

	}

}
