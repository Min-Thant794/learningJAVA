package exercises;
import java.util.*;
import java.io.InputStreamReader;

public class SelectionExercise12 {
	public static void main(String args[])
	{
		String fWord, secWord;
		System.out.println("Type two words: ");
		Scanner sc = new Scanner (new InputStreamReader(System.in));
		fWord = sc.next();
		secWord = sc.next();
		if(fWord.compareTo(secWord) == 0) {
			System.out.println("Great the same! " + fWord + " = " + secWord);
		} else if(fWord.compareToIgnoreCase(secWord) == 0) {
			System.out.println("Okay - almost the same. " + fWord + " and " + secWord);
		} else if(fWord.length() == secWord.length()) {
			System.out.println("At least the same length. " + fWord + " and " + secWord);
		} else {
			System.out.println("Two words are not the same");
		}
	}
}
