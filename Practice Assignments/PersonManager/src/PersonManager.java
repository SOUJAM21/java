import java.io.File;
import java.io.FileNotFoundException;
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
			String line = in.nextLine();
			Person person = new Person(line);
			
			persons.add(person);
			count++;
		}
		
		in.close();

		
		
		return persons;
		
	}
}
	