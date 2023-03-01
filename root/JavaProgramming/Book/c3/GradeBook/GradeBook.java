package GradeBook;
public class GradeBook {

    private String courseName;
    private String instructorName;
    // Construtor

    public GradeBook(String courseName, String instructorName) {
        this.courseName = courseName;
        this.instructorName = instructorName;
    }

    // Métodos

    public void displayMessage() {
        System.out.printf("Welcome to GradeBook for \n%s!\n with %s!\n", getCourseName(), getInstructorName());
    }

    // Getters e Setters

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public String getCourseName() {
        return courseName;
    }

}