import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class UI {
	public void viewUsers() throws FileNotFoundException{
		
		String fileName = "example.txt";
		PersonManager manager = new PersonManager();
		
		ArrayList<Person> persons = manager.getPersons();
		
		for(int i=0;i<persons.size();i++){
			Person p = persons.get(i);
			System.out.println( p.getName() + p.getAge() );
		}
	}
	
	public void findUsers() throws FileNotFoundException{
		System.out.println("Enter a name");
		
		Scanner s2 = new Scanner(System.in);
		String name = s2.nextLine();
		
		String fileName = "example.txt";
		PersonManager manager = new PersonManager();
		
		ArrayList<Person> persons = manager.getPersons();
		
		boolean found = false;
		
		for(int i=0;i<persons.size();i++){
			Person p = persons.get(i);
			
			if(p.getName().equals(name)){
				System.out.println(p.getName() + p.getAge());
				found = true;
				break;
			}
		}
		
		if(found == false){
			System.out.println("Contact Not Found!!!");
		}
		
	}
	
	
}
