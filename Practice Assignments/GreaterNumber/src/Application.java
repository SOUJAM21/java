import java.util.Scanner;

public class Application {
public static void main(String[] args) {
	System.out.println("Enter 1st number: ");
	Scanner in = new Scanner(System.in);
	int num1 = in.nextInt();
	
	System.out.println("Enter 2nd number: ");
	Scanner s1 = new Scanner(System.in);
	int num2 = s1.nextInt();
	
	Math m1 = new Math();
	
	int maxValue = 	m1.getGreatestInteger(num1, num2);
	
	System.out.println(maxValue + " is the bigger number");
}
}
