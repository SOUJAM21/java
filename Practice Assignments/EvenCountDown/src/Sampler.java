import java.util.ArrayList;
import java.util.Scanner;

import javax.print.attribute.IntegerSyntax;

public class Sampler {
	/*
	 * gets all even numbers given a starting value
	 * returns an array of all even numbers
	 */
	public ArrayList<Integer> getEvenNumbers(int number) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		int x = 0;

		for (int i = number; i >= 0; i--) {
			//checking to see if even or not
			if (i % 2 == 0) {
				list.add(0, i); // adding even number to list
			}

		}
		return list;

	}
}
