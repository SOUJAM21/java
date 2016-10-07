import java.util.Scanner;

public class Application {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.println("Please Enter Command:");
	String text = input.nextLine();
	
	switch(text){
	case "start":
		System.out.println("Machine Started");
		break;
		
	case "stop":
		System.out.println("Machine Stopped");
		break;
		
	default:
		System.out.println("Command not recognized");
	}
	
}
}
