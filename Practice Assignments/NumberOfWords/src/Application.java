import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Application {
	public static void main(String[] args) throws IOException {

		System.out.println("Enter a word to search for: ");
		Scanner s1 = new Scanner(System.in);
		String userWord = s1.nextLine();

		
		Math m1 = new Math();
		int numberOfAppearances = m1.findWord(userWord);
		
		
		if(numberOfAppearances == 1){
			System.out.println("This word appears " + numberOfAppearances + " time");
		}
		else{
			System.out.println("This word appears " + numberOfAppearances + " times");
		}
		
	}
}