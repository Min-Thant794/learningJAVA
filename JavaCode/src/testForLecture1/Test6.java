package testForLecture1;

public class Test6 {
	public static void main(String args [])
	{
		byte a = 1, b = 3, c = 0;
		c = (byte)(a & b);
		System.out.println("AND C = " + c);
		
		c = (byte)(a | b);
		System.out.println("OR C = " + c);
		
		c = (byte)(a ^ b);
		System.out.println("XOR C = " + c);
		
		c = (byte)~a;
		System.out.println("Completement of C = " + c);
		
		//completement means changing positive number to negative number and negative number to positive number.
		
		c = (byte)(a >> 2);
		System.out.println("C = " + c);
		
		//right shift => divide
		//left shift => multiply
		
		c = (byte)(a << 2);
		System.out.println("C = " + c);
	}
}
