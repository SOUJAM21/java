import java.util.Scanner;

public class Application {
public static void main(String[] args) {
	System.out.println("Enter a number:");
	
	Scanner input1 = new Scanner(System.in);
	int userInput = input1.nextInt();
	
	if(userInput % 2 == 0){
		System.out.println("Even number");
	}
	else{
		System.out.println("Odd number");
	}
	
	
}
}
