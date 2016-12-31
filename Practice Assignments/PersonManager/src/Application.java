import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Application {
	public static void main(String[] args) throws IOException {
		PersonManager pm1 = new PersonManager("People.txt");

		while (true) {
			Menu m1 = new Menu();
			m1.showOptions();

			Scanner s1 = new Scanner(System.in);
			int optionInput = s1.nextInt();

			UI u1 = new UI();

			if (optionInput == 1) {
				u1.viewUsers(pm1);
			} else if (optionInput == 2) {
				u1.findUsers(pm1);
			} else if (optionInput == 3) {
				break;
			} else if (optionInput == 4) {
				u1.addPerson(pm1);

			}

			else if (optionInput == 5) {
				u1.deleteUsers(pm1);
			}
			else if (optionInput == 6) {
				pm1.save("People.txt");
				break;
			}
		}
		
		System.out.println("Saved!!!");

	}
}
