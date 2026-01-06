package exercises;
import java.io.InputStreamReader;
import java.util.*;

public class SelectionExercise11 {
    public static void main(String args[]) {

        String type;
        float loanAmount, interest = 0;
        int loanPeriod;

        System.out.println("Enter type of account (Normal || Deluxe || Others), loan amount in USD and loan period in year");
        Scanner sc = new Scanner(new InputStreamReader(System.in));
        type = sc.next();
        loanAmount = sc.nextFloat();
        loanPeriod = sc.nextInt();

        System.out.println("User chose " + type);
        
        if (type.equals("Normal")) {
            if (loanPeriod < 5) {
                interest = loanAmount * (0.15f * loanPeriod);
            } else {
                interest = loanAmount * (0.17f * loanPeriod);
            }
        } else if (type.equals("Deluxe")) {
            if (loanPeriod < 10) {
                interest = loanAmount * (0.14f * loanPeriod);
            } else if (loanPeriod <= 15) {
                interest = loanAmount * (0.16f * loanPeriod);
            } else {
                interest = loanAmount * (0.18f * loanPeriod);
            }
        } else {
            interest = loanAmount * (0.18f * loanPeriod);
        }

        System.out.println(
            "Interest for type of account: \"" + type + "\"" + " loan amount: " + loanAmount + " for " + loanPeriod + " years is " + interest
        );
    }
}
