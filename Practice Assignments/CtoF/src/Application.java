import java.util.Scanner;

public class Application {
public static void main(String[] args) {
	System.out.println("Convert Celsius to Fahrenheit: ");
	Scanner in = new Scanner(System.in);
	int celsius = in.nextInt();
	
	TemperatureConverter m1 = new TemperatureConverter();
	double fahrenheit = m1.convertFromCelsiusToFahrenheit(celsius);
	
	System.out.println("Celsius: " + celsius);
	System.out.println("Fahrenheit: " + fahrenheit);
}
}
