import java.util.Scanner;
public class Application {
	public static void main(String[] args) {
		System.out.println("Convert Fahrenheit to Celsius: ");
		Scanner in = new Scanner(System.in);
		int fahrenheit = in.nextInt();
		
		TemperatureConverter m1 = new TemperatureConverter();
		double celsius = m1.convertFromFahrenheitToCelsius(fahrenheit);
		
		System.out.println("Fahrenheit: " + fahrenheit);
		System.out.println("Celsius: " + celsius);
		
	}
}

