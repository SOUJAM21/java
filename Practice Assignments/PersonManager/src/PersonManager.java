import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class PersonManager {

	private ArrayList<Person> persons = new ArrayList<Person>();

	public PersonManager(String fileName) throws FileNotFoundException {
		this.load(fileName);
	}

	private void load(String fileName) throws FileNotFoundException {

		File textFile = new File(fileName);

		Scanner in = new Scanner(textFile);

		int count = 1;
		while (in.hasNextLine()) {
			try {
				String line = in.next();
				int age = in.nextInt();
				Person person = new Person(line, age);

				persons.add(person);
				count++;
			} catch (java.util.NoSuchElementException e) {

			}

		}

		in.close();
	}

	public ArrayList<Person> getPersons() {
		return this.persons;
	}

	public void addPerson(String name, int age) {
		Person p = new Person(name, age);

		persons.add(p);

	}
	
	public Person findPerson(String name){
	
		for(int i=0;i<persons.size();i++){
			Person p = persons.get(i);
			
			if(p.getName().equalsIgnoreCase(name)){
				return p;
			}
		}
		
		return null;
		
	}

	public void deletePerson(String name) {

		ArrayList<Person> persons = this.getPersons();

		boolean found = false;

		for (int i = 0; i < persons.size(); i++) {
			Person p = persons.get(i);

			if (p.getName().equals(name)) {
				System.out.println(p.getName() + p.getAge());
				found = true;

				persons.remove(p);
				break;

			}
		}

		if (found == false) {
			System.out.println("Contact Not Found!!!");
		}

	}

	public void save(String fileName) throws IOException {

		FileWriter fw = new FileWriter(fileName, false);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter out = new PrintWriter(bw);
		for (int i = 0; i < persons.size(); i++) {
			Person p = persons.get(i);
			out.println(p.getName() + "   " + p.getAge());
		}
		bw.close();
		fw.close();

	}
}
