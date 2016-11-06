import java.util.Scanner;

public class Application {
public static void main(String[] args) {
	System.out.println("Enter a number:");
	
	Scanner input = new Scanner(System.in);
	int userInput = input.nextInt();
	int x = 0;
	for(int i=0;i<=userInput;i++){
		 x = x+i;
	}
	 System.out.println(x);
}
}
