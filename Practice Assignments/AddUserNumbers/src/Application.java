import java.util.Scanner;

public class Application {
public static void main(String[] args) {
	int total =0;
	
	for(int i=0;i<100;i++){
		System.out.println("Enter a number: ");
		Scanner s1 = new Scanner(System.in);
		int userNumber = s1.nextInt();
		
		 total = userNumber + total;
		 
		 if(userNumber == 0){
			 break;
		 }
	}
	System.out.println("Total value is: " + total);
	
	
	
}
}
