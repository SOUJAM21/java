import java.util.Scanner;

public class Application {
public static void main(String[] args) {
	System.out.println("Convert Celsius to Fahrenheit: ");
	Scanner in = new Scanner(System.in);
	int celsius = in.nextInt();
	
	Math m1 = new Math();
	double fahrenheit = m1.Convert(celsius);
	
	System.out.println("Celsius: " + celsius);
	System.out.println("Fahrenheit: " + fahrenheit);
}
}
