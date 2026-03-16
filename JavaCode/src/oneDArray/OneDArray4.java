package oneDArray;
import java.util.*;

//Pass by value
public class OneDArray4 {
    public static void main(String[] args)
    {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = sc.nextInt();

        int ans = makeDouble(num);

        System.out.println("The double value of " + num + " is " + ans);
    }

    public static int makeDouble(int x) {
     x = x * 2;
        System.out.println("The value of x is " + x);
        return x;
    }
}
