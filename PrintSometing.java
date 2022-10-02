package sep17th;


import java.util.Date;

public class PrintSometing {

	private static int A;
	private static final int Z = 10;
	private static final int Y = 100;
	static String name = "Neha Singh";
	
		
	public static void main(String[] args) {
		
		// Print something
		System.out.println("========== Prinint current data and time ===========");
		System.out.println("- Current Date and Time " + new Date());
		// Creating object of class
		PrintSometing obj = new PrintSometing ();
		System.out.println("- My name is " + obj.name);
		System.out.println(PrintSometing.name);
		// Some arithmetic operations from class variables
		System.out.println("========== Output from Class variables ===========");
		System.out.println(("- Sum of A = " +(A=Y+Z)));
		System.out.println(("- Multiplication result = " +(A=Y*Z)));
		System.out.println(("- Division result = " +(A=Y/Z)));
		// Use of local variable instead of Class variables
		int Y = 100;
		int Z = 101;
		System.out.println(("- Subtraction result = " +(A=Y-Z)*10));		
		

	}

}
