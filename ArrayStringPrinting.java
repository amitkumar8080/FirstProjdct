package ArrayProgramms;

public class ArrayStringPrinting {

	public static void main(String[] args) {
		// Printing length of an Array
		System.out.println("\n-----Printing length of an Array-----");
		String[] printwords1 = "I am becoming best version of myself".split("");
		for (int i = 0; i < printwords1.length; i++) {
			System.out.print("");
			System.out.print(printwords1[i]);
		}
		// Printing in reverse order
		System.out.println("\n-----Printing in reverse-----");
		String[] printwords2 = "I will be the best version of myself".split("");
		for (int i = printwords2.length - 1; i >= 0; i--) {
			System.out.print(" ");
			System.out.print(printwords2[i]);
		}

	}
}
