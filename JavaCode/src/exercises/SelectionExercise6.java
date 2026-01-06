package exercises;
import java.io.InputStreamReader;
import java.util.*;

public class SelectionExercise6 {
    public static void main(String args[]) {

        int month, year;
        boolean isLeapYear = false;

        System.out.print("Enter month (1-12) and year: ");
        Scanner sc = new Scanner(new InputStreamReader(System.in));
        month = sc.nextInt();
        year = sc.nextInt();

        if (month < 1 || month > 12 || year < 1) {
            System.out.println("Please input valid month or year");
            return;
        }
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            isLeapYear = true;
        }
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            System.out.println(month + "/" + year + " has 31 days");
        } else if (month == 2 && isLeapYear) {
            System.out.println(month + "/" + year + " has 29 days");
        } else if (month == 2 && !isLeapYear) {
            System.out.println(month + "/" + year + " has 28 days");
        } else {
            System.out.println(month + "/" + year + " has 30 days");
        }
    }
}
