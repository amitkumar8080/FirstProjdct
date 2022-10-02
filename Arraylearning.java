package ArrayProgramms;

public class Arraylearning {

	public static void main(String[] args) throws InterruptedException {

		String[] printwords = "The man I am seeing is a great person".split(" ");
		for (String abc : printwords) {
			System.out.print(abc);
			System.out.print(" ");

		}
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
		// Character Array printing
		System.out.println("\n-----Character Array printing-----");
		char[] ch = { 'a', 'b', 'c', 'd' };
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i] + " | ");

		}
		// Character Array printing in reverse order
		System.out.println("\n-----Character Array reverse order-----");
		char[] ch1 = { 'a', 'b', 'c', 'd' };
		for (int i = ch1.length - 1; i >= 0; i--) {
			System.out.print(ch[i] + " | ");

		}
		// String to character array convert
		System.out.println("\n-----Character Array use-----");
		char[] charr = "What is happening here guys".toCharArray();
		for (int i = 0; i < charr.length; i++) {
			System.out.print(charr[i] + " | ");
			Thread.sleep(100);
		}
	}
}
