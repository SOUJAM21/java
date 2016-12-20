
public class Math {
	public int findGCF(int num1,int num2){
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
		
		if(max%min == 0){
			return min;
		}
		else{
			for(int i=min;i>=2;i--){
				if(max%i==0 && min%i==0){
					return i;
				}
			}
		}
		return (Integer) null;
	}
}
