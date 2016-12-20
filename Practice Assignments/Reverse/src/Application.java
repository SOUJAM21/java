import java.util.ArrayList;
import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		ArrayList<Integer> reversed = new ArrayList<Integer>();
		
		for(int i=0;;i++){
			System.out.println("Enter a number: ");
			Scanner s1 = new Scanner(System.in);
			int userNumber = s1.nextInt();
			
			if(userNumber == 0){
				break;
			}
			
			numbers.add(userNumber);
		}
		
		Math m1 = new Math();
		reversed = m1.reverse(numbers);
		
	System.out.println(reversed);
	
	}
}