package logic;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DaySupporter {
	private final DateTimeFormatter dateTimeFormatter;
	
	
	
	public DaySupporter(DateTimeFormatter dateTimeFormatter) {
		this.dateTimeFormatter = dateTimeFormatter;
	}

	public String getDayPeriod(LocalTime localTime) {
		String period = dateTimeFormatter.format(localTime);
		return period;
	}
}
