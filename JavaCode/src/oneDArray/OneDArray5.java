package oneDArray;
import java.util.*;

//pass by reference
public class OneDArray5 {
    public static void main(String[] args)
    {
        int[] arr = {1, 2, 3};

        makeDbl(arr);
        makeDouble(arr);

        System.out.print("The double value of current array is: ");

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void makeDouble(int[] x) {
        for(int i = 0; i < x.length; i++) {
            x[i] *= 2;
        }
    }

    public static void makeDbl(int[] x) {
        for(int a : x) {
            a *= 2;
            System.out.println(a + " ");
        }
    }
}
