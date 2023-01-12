package Array;

import java.util.Arrays;

// Write a Java program to remove a specific element from an array.

public class Ex007 {
	
	public static void main(String[] args) {
		
		int[] array = {2, 3, 5, 7, 11, 13, 17, 19, 21};
		
		int indexremove = 5;
		
		for (int i = indexremove; i < array.length - 1; i++) {
			array[i] = array[i + 1];
			
		}
		
		System.out.println(Arrays.toString(array));
		
	}

}
