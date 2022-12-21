package GradeBook;
import java.util.Scanner;

public class GradeBookTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        GradeBook gradeBook1 = new GradeBook("Java Programming", "Sue Grein");
        GradeBook gradeBook2 = new GradeBook("Data Science!", "Ribeiro");

        System.out.printf("\nname of gradeBook1 is %s\n", gradeBook1.getCourseName());
        System.out.printf("name of gradeBook1 is %s\n", gradeBook2.getCourseName());

        input.close();


        /* 
        GradeBook myGradeBook = 
                    new GradeBook("Data Science");

        System.out.printf("Initial of course name is: %s\n\n", myGradeBook.getCourseName());

        System.out.println("Please enter the course name: ");
        myGradeBook.setCourseName(input.nextLine());
        System.out.println();

        myGradeBook.displayMessage();

        input.close();

        */
    }
}
