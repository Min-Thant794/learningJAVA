package exercises;

import static exercises.OneDArrayExercise2.getSize;
import static exercises.OneDArrayExercise2.setData;
import static oneDArray.CeateArray.display;

public class OneDArrayExercise3 {
    public static void main(String[] args)
    {
        int size = getSize();
        int[] arr = new int[size];
        setData(arr);

        System.out.print("Original Array: ");
        display(arr);

        System.out.println("\n");

        reverseArray(arr);
        System.out.print("Reversed Array: ");
        display(arr);
    }

    public static void reverseArray(int[] arr)
    {
        int fIndex = 0;
        int lIndex = arr.length - 1;

        for(int i = 0; i < arr.length/2; i++) {
            int temp = arr[fIndex];
            arr[fIndex] = arr[lIndex];
            arr[lIndex] = temp;

            fIndex++;
            lIndex--;
        }
    }
}
