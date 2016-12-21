
public class Math {
	public int findLCM(int num1,int num2){
		int max;
		int min;
		
		if(num1>num2){
			max = num1;
			min = num2;
		}
		else{
			max = num2;
			min = num1;
		}
		
		if(max%min==0){
			return max;
		}
		
		
		
		else{
			for(int i=max;;i++)
			   {
					if(i%max==0 && i%min==0){
						return i;
					}
			   }
	}
		
	}
}
