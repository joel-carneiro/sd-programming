package Array;

// Write a Java program to test if an array contains a specific value. 

public class Ex005 {
	
	public static void main(String[] args) {
		
		int[] values = {3, 5, 1, 30, 35};
		
		for (int i : values) {
			if (i == 19) {
				System.out.println("19 in array");
				System.exit(1);
			}
		}
		
		System.out.println("19 not in array");
		
	}

}
