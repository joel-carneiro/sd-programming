package Array;

// Write a Java program to calculate the average value of array elements.

public class Ex004 {
	
	public static void main(String[] args) {
		
		int[] values = {5, 10, 15, 20, 25, 30};
		
		int sum = 0;
		
		for (int i : values) {
			sum += i;
		}
		
		double average = sum / values.length;
		
		System.out.println(average);
		
	}

}
