package ArrayProgramms;

public class PrintNumbersIncreasingOrder {

	public static void main(String[] args) {

		int num = 0;
		for (int row = 1; row <= 4; row++) {

			for (int col = 1; col <= row; col++) {

				System.out.print((num++) + " ");

			}
			System.out.println();
		}

	}
}
