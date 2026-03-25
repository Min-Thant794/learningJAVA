package twoDArray;

public class TwoDArray2 {
    public static void main(String[] args)
    {
        byte[][] arr1 = {{1, 2}, {3, 4, 5, 6}, {7, 8, 9}};

        for (byte[] bytes : arr1) {
            for (int j = 0; j < bytes.length; j++) {
                System.out.print(bytes[j] + " ");
            }
        }

        byte[][] arr2 = new byte[3][];

        arr2[0] = new byte[2];
        arr2[0][0] = 1;
        arr2[0][1] = 2;

        arr2[1] = new byte[4];
        arr2[1][0] = 3;
        arr2[1][1] = 4;
        arr2[1][2] = 5;
        arr2[1][3] = 6;

        arr2[2] = new byte[3];
        arr2[2][0] = 7;
        arr2[2][1] = 8;
        arr2[2][2] = 9;

        System.out.println("\n" + "arr2[2][2]: " + arr2[2][2]);
    }
}
