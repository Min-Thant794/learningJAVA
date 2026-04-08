package exercises;

public class Clock {

    private int hour;
    private int minute;
    private int second;

    // Constructor
    public Clock(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // Setter methods
    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    // Display time
    public void displayTime(int mode) {

        if (mode == 1) {
            // 24-hour format
            System.out.printf("%02d:%02d:%02d\n", hour, minute, second);
        }

        else if (mode == 2) {
            // 12-hour format
            int h = hour;
            String period;

            if (hour == 0) {
                h = 12;
                period = "a.m.";
            }
            else if (hour < 12) {
                period = "a.m.";
            }
            else if (hour == 12) {
                period = "p.m.";
            }
            else {
                h = hour - 12;
                period = "p.m.";
            }

            System.out.printf("%02d:%02d %s\n", h, minute, period);
        }

        else {
            System.out.println("Invalid mode.");
        }
    }
}