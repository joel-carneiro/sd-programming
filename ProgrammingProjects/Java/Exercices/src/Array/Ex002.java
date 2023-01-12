package Array;

// Write a Java program to sum values of an array.

public class Ex002 {
	
	public static void main(String[] args) {
		
		int[] values = {142, 130, 212, 493, 124};
		
		int total = 0;
		for (int i : values) {
			total += i;
		}
		
		System.out.println("Total: " + total);
		
	}
	
}
