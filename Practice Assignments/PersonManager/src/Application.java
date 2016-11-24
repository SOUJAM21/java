import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Application {
public static void main(String[] args) throws FileNotFoundException {
String fileName = "example.txt";
	PersonManager manager = new PersonManager();
	
	ArrayList<Person> persons = manager.getPersons();
	
	for(int i=0;i<persons.size();i++){
		Person p = persons.get(i);
		System.out.println( p.getName() + p.getAge() );

	}
}
}
