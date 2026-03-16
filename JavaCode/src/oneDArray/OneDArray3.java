package oneDArray;

public class OneDArray3 {
    public static void main(String[] args)
    {
        byte[] arr = {2, 4, 6, 8, 10, 12, 14};

        int total = 0;
        int sum = 0;

        for (int b : arr) {
            total += b;
        }

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        float avg = (total * 1.0f) / arr.length;

        System.out.println("Total: " + total);

        System.out.println("Another sum value: " + sum);

        System.out.println("Average: " + avg);

        System.out.print("Values of array: ");

        for (int v : arr) {
            System.out.print(v + " ");
        }
    }
}
