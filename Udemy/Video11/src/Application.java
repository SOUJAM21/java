import java.util.Scanner;

public class Application {
public static void main(String[] args) {
	//Create Scanner Object
	Scanner input =  new Scanner(System.in);
	
	//Output the prompt
	System.out.println("Enter a floating  point value: ");
	
	//Wait for user to enter something
	double value = input.nextDouble();
	
	//Tell them what they entered
	System.out.println("You entered: " + value);
}
}
