package functions;

public class Function2 {
	public static void main(String args[])
	{
		int result = sum(4, 6);
		System.out.println("Result: " + result);
		
		int anotherResult = sum(2, 9);
		System.out.println("Another Result: " + anotherResult);
	}
	
	public static int sum(int n1, int n2)
	{
		int answer = n1 + n2;
		return answer;
	}
}