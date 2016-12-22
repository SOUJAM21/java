import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Application {
	public static void main(String[] args) throws IOException {	
      	System.out.println("What do you want to Replace? : ");
      	Scanner s2 = new Scanner(System.in);
		String word = s2.nextLine();
		
		System.out.println("What do you want to Replace it with? : ");
		Scanner s3 = new Scanner(System.in);
		String replaceWord = s3.nextLine();
     
		
		FileReader inputFile = new FileReader("example.txt");
		 BufferedReader br = new BufferedReader(inputFile);
		 String line;
		 
		 ArrayList<String> replacedLines = new ArrayList<String>();
		 
          while((line = br.readLine()) != null){
        	  System.out.println(line);
        	  String wordSwitch = line.replace(word, replaceWord);
        	  replacedLines.add(wordSwitch);
        	 
       }
      	
        PrintWriter writer = new PrintWriter("example.txt");
         
      	for(int i = 0;i<replacedLines.size();i++){
        	 String newReplacedLine = replacedLines.get(i);
        	 System.out.println(newReplacedLine);
        	 writer.println(newReplacedLine);
       }
       writer.close();
		
	}
}