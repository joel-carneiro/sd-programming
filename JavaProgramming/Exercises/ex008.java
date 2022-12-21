/* Write a Java program to find the number of days in a month. */
import java.util.Scanner;

public class ex008 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int days;

        System.out.print("Input a month: "); 
        int month = input.nextInt();

        if (month > 12 || month < 1) System.out.println("ERROR");

        else {

            System.out.println("Input a year: ");
            int year = input.nextInt();

            boolean thirtyDays = month == 4 || month == 6 || month == 9 || month == 11;
        
            if (thirtyDays) days = 30;

            else if (month == 2) {

                if (year % 4 == 0) days = 29;

                else days = 28;

            }
            else days = 31;

            System.out.println("Month " + month + " has " + days + " days");
        }

        input.close();
    }
}
