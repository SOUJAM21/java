import java.io.IOException;
import java.util.Scanner;

public class Application {
public static void main(String[] args) throws IOException {
	TextProcess t1 = new TextProcess();
	
	System.out.println("Enter a name:");
	Scanner s1 = new Scanner(System.in);
	String userInput = s1.nextLine();
	System.out.println(userInput);
	t1.findWord(userInput);
	
	
	t1.TestProcess(userInput);
	t1.getWordCount();
	System.out.println(t1.getWordCount());
}	
}