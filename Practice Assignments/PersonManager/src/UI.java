import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class UI {
	public void viewUsers(PersonManager personManager) {

		ArrayList<Person> persons = personManager.getPersons();

		for (int i = 0; i < persons.size(); i++) {
			Person p = persons.get(i);
			System.out.println(p.getName() + p.getAge());
		}
	}

	public void findUsers(PersonManager personManager) {
		System.out.println("Enter a name");

		Scanner s2 = new Scanner(System.in);
		String name = s2.nextLine();

		Person p = personManager.findPerson(name);

		if (p == null) {
			System.out.println("Contact Not Found!!!");
		} else {
			System.out.println(p.getName() + p.getAge());
		}
	}

	public void deleteUsers(PersonManager personManager) {
		System.out.println("Enter a name");

		Scanner s2 = new Scanner(System.in);
		String name = s2.nextLine();
		personManager.deletePerson(name);

	}

	public void addPerson(PersonManager personManager) {
		System.out.println("Enter a name");
		Scanner s3 = new Scanner(System.in);
		String newName = s3.nextLine();

		System.out.println("Enter a age");
		Scanner s4 = new Scanner(System.in);
		int newAge = s4.nextInt();

		personManager.addPerson(newName, newAge);
	}

}
