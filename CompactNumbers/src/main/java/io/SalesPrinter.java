package io;

import java.text.NumberFormat;
import java.util.List;

public class SalesPrinter {
	
	private final NumberFormat numberFormatter;
	
	
	
	public SalesPrinter(NumberFormat numberFormatter) {	
		this.numberFormatter = numberFormatter;
	}



	public void printSales(List<Double> sales) {
		sales.forEach(sale -> System.out.println(
				"""
				Original: %f,
				Formatted: %s
				""".formatted(sale, numberFormatter.format(sale))
				));
	}
}
