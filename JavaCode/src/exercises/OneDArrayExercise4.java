package exercises;
import static exercises.OneDArrayExercise2.getSize;
import static exercises.OneDArrayExercise2.setData;

public class OneDArrayExercise4 {
    public static void main(String[] args)
    {
        int size1 = getSize();
        int[] arr1 = new int[size1];
        setData(arr1);

        int size2 = getSize();
        int[] arr2 = new int[size2];
        setData(arr2);

        boolean isIdentical = isIdentical(arr1, arr2);

        if (isIdentical) {
            System.out.println("This 2 arrays are identical");
        } else {
            System.out.println("This 2 arrays are not identical");
        }
    }

    public static boolean isIdentical(int[] a1, int[] a2)
    {
        if (a1.length != a2.length) {
            return false;
        }

        for (int i = 0; i < a1.length; i++) {
            if(a1[i] != a2[i]) {
                return false;
            }
        }

        return true;
    }
}
