import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		System.out.println("Enter a word: ");
		Scanner s1 = new Scanner(System.in);
		String userInput = s1.nextLine();
	
		WordProcessor w1 = new WordProcessor();
		int numberOfA = w1.findWord(userInput);
		
		System.out.println("Number of A's in this word: " + numberOfA  );
	}
}

