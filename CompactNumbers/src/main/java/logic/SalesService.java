package logic;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SalesService {
	public List<Double> getSalesFromUserInput(String salesAsStringCommaSeparated) {
		return Stream.of(salesAsStringCommaSeparated.split(","))
				.mapToDouble(Double::parseDouble)
				.boxed()
				.collect(Collectors.toList());
	}
}
