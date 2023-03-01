public class Time1 {
    private int hour;
    private int minute;
    private int second;

    public void setTime(int hour, int minute, int second) {

        if (hour >= 24 || minute >= 60 || second >= 60) {
            throw new IllegalArgumentException
                ("Hour, minute or second was out of range");
        }

        else if (hour < 0 || minute < 0 || second < 0) {
            throw new IllegalArgumentException
                ("Hour, minute or second negative.");
        }

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String toUniversalString() {
        
        return String.format("%02d:%02d:%02d", hour, minute, second);

    }

    public String toString() {
        return this.toUniversalString();
    }
}