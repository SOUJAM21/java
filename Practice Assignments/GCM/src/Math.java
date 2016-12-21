
public class Math {
	public int findGCF(int num1,int num2){
		int max = java.lang.Math.max(num1, num2);
		int min = java.lang.Math.min(num1, num2);
		
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
