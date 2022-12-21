public class Time1Test {
    public static void main(String[] args) {
        Time1 time1 = new Time1();

        time1.setTime(6, 30, 15);

        System.out.println(time1);

        Time1 time2 = new Time1();

        try {
            time2.setTime(99, 99, 99);
        } catch (IllegalArgumentException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
    }
}
