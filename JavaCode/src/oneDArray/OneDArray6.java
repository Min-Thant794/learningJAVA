package oneDArray;
import java.util.*;

public class OneDArray6 {
    public static void main(String[] args)
    {
        int[] num = {1, 2, 3, 4, 5};

        int total = calTotal(num);

        System.out.println("The total value of array is " + total);
    }

    public static int calTotal(int[] x)
    {
        int total = 0;

        for(int i : x) {
            total += i;
        }

        return total;
    }
}
