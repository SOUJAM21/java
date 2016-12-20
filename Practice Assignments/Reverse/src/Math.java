import java.util.ArrayList;

public class Math {
	public ArrayList<Integer> reverse(ArrayList<Integer> numbers){
		
		ArrayList<Integer> reversed = new ArrayList<Integer>();
		for(int x = numbers.size() -1; x>=0;x--){
			reversed.add(numbers.get(x));
		}
		
		
		
		return reversed;
		
	}
}
