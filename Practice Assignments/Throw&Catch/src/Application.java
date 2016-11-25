import java.util.Scanner;

public class Application {
public static void main(String[] args) throws Exception {
	
boolean valid = false;
	do{
		try{
			System.out.println("Enter a name:");
			Scanner s1 = new Scanner(System.in);
			String name = s1.nextLine();
			
			Person p1 = new Person(name, 10);
			System.out.println(p1.getName() + p1.getAge());
			valid = true;
		}catch (Exception e){
			System.out.println("Please Enter a name");
		}
	}while(valid == false);
		

	
	
	
	
}
}
