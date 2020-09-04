package week5;

import java.util.Scanner;

public class Question6 {
	public static void Reverse(char[] c) {
		
		char[] result = new char[c.length];
		for (int i = c.length-1; i >= 0; i--) {
			System.out.println(c[i]);
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter the characters to be reversed: ");
		Scanner input = new Scanner(System.in);
		char[] c=input.next().toCharArray();
		Reverse(c);
	}

}
