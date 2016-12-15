import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TextProcess {
	String word;
	
	public void TestProcess(String word){
		this.word = word;
	}
	
	public int getWordCount(){
		String[] values = word.split(" ");
		int numberOfWords = values.length;
		return numberOfWords;
	}
	
	public void getLetterCount(){
		String[] values = word.split(" ");
		
		int startingNumberOfLetters = 0;
		for(int i=0;i<values.length;i++){
			int letters = values[i].length();
			startingNumberOfLetters = letters + startingNumberOfLetters ;
			
		}
	}
	
	
	public void findWord(String userInput) throws IOException{
		String fileName = "test.txt";
		
		File textFile = new File(fileName);
		
		Scanner in = new Scanner(textFile);
		
		
		boolean check = false;
		while(in.hasNextLine()){
			String userWord = in.next();
			
			if(userInput.equals(userWord)){
				check =true;
				System.out.println("This is the word you entered: " + userWord);
			}
	
		}
		
		if(check==false){
			System.out.println("Could not find your word");
		}
	
	
	
}
}