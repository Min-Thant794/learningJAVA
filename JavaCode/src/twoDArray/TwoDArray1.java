package twoDArray;

public class TwoDArray1 {
    public static void main(String[] args) {
        byte[][] arr1 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};

        byte[][] arr2 = new byte[3][4]; //length of an array not index

        byte count = 1;
        for(byte i = 0; i < arr2.length; i++) {
            for(byte j = 0; j < arr2[i].length; j++) {
                arr2[i][j] = count;
                count++;
            }
        }

        System.out.println("arr2[3][4]: " + arr2[2][3]);

        System.out.print("Two dimensional array: ");

        for(int i = 0; i < arr2.length; i++) {
            for(int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
        }
    }
}
