package week5;

import java.util.Scanner;

public class Question11 {

	public static void main(String[] args) {
		System.out.println("Enter a number to be formatted: ");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		String str = String.format("%,d", number);
		System.out.println(str);
	}

}
