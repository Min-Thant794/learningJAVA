package oneDArray;

public class OneDArray1 {
    public static void main(String[] args)
    {
        byte[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18};


        byte[] anotherArr = new byte[9];

        anotherArr[0] = 2;
        anotherArr[1] = 4;
        anotherArr[2] = 6;
        anotherArr[3] = 8;
        anotherArr[4] = 10;
        anotherArr[5] = 12;
        anotherArr[6] = 14;
        anotherArr[7] = 16;
        anotherArr[8] = 18;

        System.out.println("the value of arr[1] is " + arr[1]);
        System.out.println("Array of length: " + arr.length);
        System.out.println("Another Array of length: " + anotherArr.length);
    }
}