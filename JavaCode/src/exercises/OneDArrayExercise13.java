package exercises;

public class OneDArrayExercise13 {
    public static void main(String[] args)
    {
        int[] arr1 = {1, 2, 4, 5, 6, 3};
        int[] arr2 = {23, 4, 6, 9, 10};

        int[] result = mergeArr(arr1, arr2);

        for(int i : result) {
            System.out.print(i + " ");
        }
    }

    public static int[] mergeArr(int[] a, int[] b)
    {
        int[] mArray = new int[a.length + b.length];
        int k = 0;

        // 1. odds from array a
        for(int i = 0; i < a.length; i++) {
            if(a[i] % 2 != 0) {
                mArray[k++] = a[i];
            }
        }

        // 2. odds from array b
        for(int i = 0; i < b.length; i++) {
            if(b[i] % 2 != 0) {
                mArray[k++] = b[i];
            }
        }

        // 3. evens from array a
        for(int i = 0; i < a.length; i++) {
            if(a[i] % 2 == 0) {
                mArray[k++] = a[i];
            }
        }

        // 4. evens from array b
        for(int i = 0; i < b.length; i++) {
            if(b[i] % 2 == 0) {
                mArray[k++] = b[i];
            }
        }

        return mArray;
    }
}