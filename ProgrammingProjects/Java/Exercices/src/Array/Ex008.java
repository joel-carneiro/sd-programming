package Array;

import java.util.Arrays;

// Write a Java program to insert an element (specific position) into an array.

public class Ex008 {
	
	public static void main(String[] args) {
		
		int[] array = {2, 3, 5, 7, 11, 13, 17, 19, 21};
		
		int value = 22;
		int index = 2;
		
		for (int i = array.length - 1; i > index; i--) {
			
			array[i] = array[i - 1];
			
		}
		
		array[index] = value;
		
		System.out.println(Arrays.toString(array));
		
	}
	
}
