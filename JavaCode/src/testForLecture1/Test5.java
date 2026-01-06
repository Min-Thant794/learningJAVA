package testForLecture1;

public class Test5 {
	public static void main(String args[])
	//logical operator => || &&
	//bitwise operator => | &
	//NOTE THAT LOGICAL OPERATOR CHECK THE FIRST WITHOUT CHECKING THE REST WHILE BITWISE CHECK ALL OF IT
	{
		int a = 2, b = 0;
		if ( a == 2 || a / b != 0) {
			System.out.println("a is 2 and a/b!=0");
		}
		
		int c = 2, d = 0;
		if ( c == 2 | c/d!=0) {
			System.out.println("a is 2 and a/b!=0");
		}
	}
}
