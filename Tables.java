package ArrayProgramms;

import java.util.Scanner;

public class Tables {

	public static void main(String[] args) {
		// TO print any table

		for (int digit = 1; digit <=10; digit++) {

			int num;
			System.out.print("Enter any number to print table: ");
			Scanner sc = new Scanner(System.in);
			num = sc.nextInt();

			for (int i = 1; i <= 10; i++) {

				System.out.println("Table of " + num + ": " + num + " X " + i + " = " + (num * i));
			}
			System.out.println("-------------------------------------");
		}

	}

}