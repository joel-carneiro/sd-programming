package Array;

// Write a Java program to find the index of an array element

public class Ex006 {
	
	public static void main(String[] args) {
		
		int[] values = {1, 3, 5, 7, 11};
		
		System.out.println(indexOf(values, 11));
		
	}
	
	public static int indexOf(int[] array, int value) {
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] == value) {
				return i;
			}
		}
		
		return -1;
	}
}


