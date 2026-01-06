package exercises;
import java.util.*;

public class FunctionExercise8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Binary to Decimals
        System.out.println("Enter a binary number:");
        int bNum = sc.nextInt();
        binaryToDecimal(bNum);

        // Decimal to Binary
        System.out.println("Enter a decimal number:");
        int num = sc.nextInt();
        decimalToBinary(num);

        // Octal to Decimal
        System.out.println("Enter an octal number:");
        int octNum = sc.nextInt();
        octalToDecimal(octNum);

        // Decimal to Octal
        System.out.println("Enter a decimal number:");
        int deciNum = sc.nextInt();
        decimalToOctal(deciNum);
    }

    // Binary to Decimal
    public static void binaryToDecimal(int bNum) {

        int decimal = 0;
        int power = 1;

        while (bNum > 0) {
            int digit = bNum % 10;

            if (digit < 0 || digit > 1) {
                System.out.println("Invalid binary number.");
                return;
            }

            decimal += digit * power;
            power *= 2;
            bNum = bNum / 10;
        }

        System.out.println("Binary to Decimal: " + decimal);
    }

    // Decimal to Binary
    public static void decimalToBinary(int num) {

        if (num == 0) {
            System.out.println("Binary: 0");
            return;
        }

        String binary = "";

        while (num > 0) {
            int remainder = num % 2;
            binary = remainder + binary;
            num = num / 2;
        }

        System.out.println("Binary: " + binary);
    }

    // Octal to Decimal
    public static void octalToDecimal(int octNum) {

        int decimal = 0;
        int power = 1;

        while (octNum > 0) {
            int digit = octNum % 10;

            // validation
            if (digit < 0 || digit > 7) {
                System.out.println("Invalid octal number.");
                return;
            }

            decimal += digit * power;
            power *= 8;
            octNum = octNum / 10;
        }

        System.out.println("Octal to Decimal: " + decimal);
    }

    // Decimal to Octal
    public static void decimalToOctal(int deciNum) {

        if (deciNum == 0) {
            System.out.println("Octal: 0");
            return;
        }

        String octal = "";

        while (deciNum > 0) {
            int remainder = deciNum % 8;
            octal = remainder + octal;
            deciNum = deciNum / 8;
        }

        System.out.println("Octal: " + octal);
    }
}