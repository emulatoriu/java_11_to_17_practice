package logic;

import java.time.LocalDateTime;

public class LoggerService {
	public String getFormattedLogInfo(LocalDateTime localDateTime, String id, double amount) {
		return """
			   Transaction log
			   Timestamp: %s
			   Account: %s
			   Amount: %f
			   """.formatted(localDateTime.toString(), id, amount);
				
	}
}
