import java.util.Scanner;

public class Application {
	public static void main(String[] args) {

		int[] numbers = new int[10];
		int totalValue = 0;

		for (int i = 0;; i++) {
			System.out.println("Enter a number: ");
			Scanner s1 = new Scanner(System.in);
			int userNumber = s1.nextInt();

			numbers[i] = userNumber; //adding user Input numbers to array

			if (userNumber == 0) { // breaking out of loop and adding all the user input values
				Math m1 = new Math();
				totalValue = m1.add(numbers);

				break;
			}
		}
		System.out.println("Total value is: " + totalValue);

	}
}
