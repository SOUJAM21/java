
public class Math {
	public int findLCM(int num1,int num2){
		int max = java.lang.Math.max(num1, num2);
		int min = java.lang.Math.min(num1, num2);
		
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
