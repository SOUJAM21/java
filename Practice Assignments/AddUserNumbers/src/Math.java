
/*
 * Math functions.
 */
public class Math {
	/*
	 * adds all the numbers given
	 * returns total 
	 */
	public int add(int[] numbers) {
		int total = 0;
		for (int i = 0; i < numbers.length; i++) {
			total = total + numbers[i];
		}
		return total;
	}

}
