package Array;

import java.util.Arrays;

/* Write a Java program to sort a numeric array and a string array */

public class Ex001 {
	
	public static void main(String[] args) {
		
		int[] numericArray = {9, 10, 7, 3, 1, 2, 8, 5, 4,};
		String[] literalArray = {"Bob", "Ariel", "Eloi", "Carlos", "Daniel"};
		
		Arrays.sort(numericArray);
		Arrays.sort(literalArray);
		
		System.out.println(Arrays.toString(numericArray));
		System.out.println(Arrays.toString(literalArray));
		
	}
	
}
