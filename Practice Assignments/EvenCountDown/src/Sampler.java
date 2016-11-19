import java.util.ArrayList;
import java.util.Scanner;

import javax.print.attribute.IntegerSyntax;

public class Sampler {
	public ArrayList<Integer> getEvenNumbers(int number){
	
		ArrayList<Integer> list = new ArrayList<Integer>();
		int x = 0;
		
		for(int i=number;i>=0;i--){
			
			
			if(i%2==0){
				list.add(0,i);
			}
			
			
			
		}
		return list;
		
		
	}
}
