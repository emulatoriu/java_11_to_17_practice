import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import io.SalesPrinter;
import logic.SalesService;
import logic.UserInputService;

public class Application {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		UserInputService userInputService = new UserInputService(scanner);
		System.out.print("Please type in the sales comma separated: ");
		String userInput = userInputService.getUserInput();
		System.out.println();
		SalesService salesService = new SalesService();
		List<Double> sales = salesService.getSalesFromUserInput(userInput);
		NumberFormat germanFormatter = NumberFormat.getCompactNumberInstance(Locale.GERMAN, NumberFormat.Style.LONG);
		NumberFormat usFormatter = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.LONG);
		SalesPrinter salesPrinterGerman = new SalesPrinter(germanFormatter);
		salesPrinterGerman.printSales(sales);
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		SalesPrinter salesPrinterUS = new SalesPrinter(usFormatter);
		salesPrinterUS.printSales(sales);
		
	}
}
