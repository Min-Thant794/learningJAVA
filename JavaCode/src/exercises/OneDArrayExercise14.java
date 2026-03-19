package exercises;

import java.util.Scanner;

public class OneDArrayExercise14 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        String uInput = userInput();
        System.out.print("Paragraph: " + uInput);
        int wordCount = countWord(uInput);

        System.out.println("Word count: " + wordCount);

        int countOfA = countA(uInput);

        System.out.print("count of a: " + countOfA);

        countAllLetter(uInput);
    }

    public static String userInput()
    {
        System.out.print("Type a paragraph: ");

        return sc.nextLine();
    }

    public static int countWord(String u)
    {
        int count = 1;
        for(int i = 0; i < u.length(); i++) {
            if(u.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }

    public static int countA(String s)
    {
        int count = 0;

        String toLower = s.toLowerCase();

        for(int i = 0; i < s.length(); i++) {
            if(toLower.charAt(i) == 'a') {
                count++;
            }
        }

        return count;
    }

    public static void countAllLetter(String s)
    {
        String toLower = s.toLowerCase();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            int count = 0;

            for (int i = 0; i < toLower.length(); i++) {
                if(toLower.charAt(i) == ch) {
                    count++;
                }

                if(count > 0) {
                    System.out.println("Count of " + ch + ": " + count);
                }
            }
        }
    }
}
