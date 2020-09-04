package week5;

import java.util.Scanner;

public class Question8 {
	public static int Fibonacci(int n) {
		if(n == 0){
			return 0;
		}
		if(n == 1 || n == 2){
				return 1;
			}
		return Fibonacci(n-2) + Fibonacci(n-1);
	}

	public static void main(String[] args) {
		System.out.println("Enter a number between 0 to 30: ");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		if (number < 0 && number >30) {
			System.out.println("number should be more than or eaual to 0 and less than or equal to 30!!");
		}
		else {
			System.out.println(Fibonacci(number));
		}
	}

}
