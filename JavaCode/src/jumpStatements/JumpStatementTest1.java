package jumpStatements;

public class JumpStatementTest1 {
	public static void main(String args[])
	{
		for(int i = 1; i < 50; i++) {
			if(i == 5) {
				break;
			}
			
			if(i % 10 == 0) {
				System.out.println("\n");
			}
			System.out.print(i + " ");
		}
		
		System.out.println("\nString after looping. \n");
		
		for(int j = 1; j < 50; j++) {
			if(j == 5) {
				continue;
			}
			
			if(j % 10 == 0) {
				System.out.println("\n");
			}
			System.out.print(j + " ");
		}
		
		System.out.println("\nString after looping. \n");
		
		for(int k = 1; k < 50; k++) {
			if(k == 5) {
				return;
			}
			
			if(k % 10 == 0) {
				System.out.print("\n");
			}
			
			System.out.print(k + " ");
		}
		
		System.out.println("\nString after looping. \n");
	}
}
