package oneDArray;
import java.util.*;

public class ElipseDay {
    public static void main(String[] args)
    {
        int td, ed, fd;

        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter today's Day: ");
        td = sc.nextInt();

        System.out.print("Enter the number of days elapsed since today: ");
        ed = sc.nextInt();

        fd = (td + ed) % 7;

        System.out.println("Today is " + days[td] + "and future day is " + days[fd]);
    }
}
