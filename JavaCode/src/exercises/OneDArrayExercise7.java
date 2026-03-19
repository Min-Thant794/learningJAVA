package exercises;

public class OneDArrayExercise7 {
    public static void main(String[] args)
    {
        int[] arr = {-2, -4, -6, -8, -10};
        System.out.print("Even negative array: ");
        for(int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println("\n");

        int[] positiveArr = evenPositive(arr);

        System.out.print("Even positive array: ");
        for(int i : positiveArr) {
            System.out.print(i + " ");
        }
    }

    public static int[] evenPositive(int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] *= (-1);
        }
        return arr;
    }
}
