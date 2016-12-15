import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextProcess {
	String word;
	
	public TextProcess(String word){
		this.word = word;
	}
	
	public int getWordCount(String word){
		String[] values = word.split(" ");
		int numberOfWords = values.length;
		return numberOfWords;
	}
	
	public int getLetterCount(String word){
		String[] values = word.split(" ");
		
		int startingNumberOfLetters = 0;
		for(int i=0;i<values.length;i++){
			int letters = values[i].length();
			startingNumberOfLetters = letters + startingNumberOfLetters ;
			
		}
		return startingNumberOfLetters;
	}
	
	
}