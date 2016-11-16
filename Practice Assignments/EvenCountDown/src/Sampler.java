import java.util.ArrayList;
import java.util.Scanner;

public class Sampler {
	public ArrayList getEvenNumbers(int number){
	
		ArrayList list = new ArrayList(); 
		int x = 0;
		
		for(int i=number;i>=0;i--){
			
			
			if(i%2==0){
				list.add(i);
			}
			
			
			
		}
		return list;
		
		
	}
}
