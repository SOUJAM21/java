import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class PersonManager {
	public ArrayList<Person> getPersons() throws FileNotFoundException{
		ArrayList<Person> persons = new ArrayList<Person>();
		
		String fileName = "People.txt";
		
		File textFile = new File(fileName);
		
		Scanner in = new Scanner(textFile);
		
		int count = 1;
		while(in.hasNextLine()){
			String line = in.next();
			int age = in.nextInt();
			Person person = new Person(line,age);
			
			persons.add(person);
			count++;
		}
		
		in.close();

		
		
		return persons;
		
	}
	
	public void addPerson(String name, int age) throws IOException{
		
		try(FileWriter fw = new FileWriter("People.txt", true);
			    BufferedWriter bw = new BufferedWriter(fw);
				   PrintWriter out = new PrintWriter(bw))
		{
		
			out.print("\n" + name + "  " + age);
		
		
	}
}
}