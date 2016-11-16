import java.util.ArrayList;
import java.util.Scanner;

public class Application {
public static void main(String[] args) {
	System.out.println("Please Enter a Number:");
	Scanner s1 = new Scanner(System.in);
	int userInput = s1.nextInt();
	
	Sampler sample = new Sampler();
	
	ArrayList countDown = sample.getEvenNumbers(userInput);
	
	for(int x=0 ; x<countDown.size(); x++){
		int number = (int) countDown.get(x);
		System.out.printf("%d %d\n",number, number*2);
	}
	
//	System.out.println(countDown);
}
}
