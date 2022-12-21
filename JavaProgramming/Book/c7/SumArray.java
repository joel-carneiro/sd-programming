public class SumArray {
    public static void main(String[] args) {
        
        int[] intArray = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048};

        int sum = 0;

        for (int i = 0; i < intArray.length; i++) {
            sum += intArray[i];
        }

        System.out.println("Total of array elements: " + sum);
    }
}