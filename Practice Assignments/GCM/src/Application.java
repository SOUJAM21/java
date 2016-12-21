import java.util.Scanner;

public class Application {
public static void main(String[] args) {
	System.out.println("Enter 1st number: ");
	Scanner s1 = new Scanner(System.in);
	int num1 = s1.nextInt();
	
	System.out.println("Enter 2nd number: ");
	Scanner s2 = new Scanner(System.in);
	int num2 = s2.nextInt();
	
	int max = 0;
	int min = 0;
	
	Math m1 = new Math();
	int GCF = m1.findGCF(num1, num2);
	
	System.out.println("The GCF is: " + GCF);
}
}
