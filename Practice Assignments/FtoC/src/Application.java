	import java.util.Scanner;
public class Application {
	public static void main(String[] args) {
		System.out.println("Convert Fahrenheit to Celsius: ");
		Scanner in = new Scanner(System.in);
		int fahrenheit = in.nextInt();
		
		Math m1 = new Math();
		double celsius = m1.Convert(fahrenheit);
		
		System.out.println("Fahrenheit: " + fahrenheit);
		System.out.println("Celsius: " + celsius);
		
	}
}

