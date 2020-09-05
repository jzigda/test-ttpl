package am.iunetworks.TashiTshewang;

import java.util.Scanner;

/**
 * Created by Tshewang on 9/3/2020.
 */
public class Exercise8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to generate Fibonacci");
        int N = input.nextInt();
        Solution8 sol = new Solution8();
        System.out.println(Solution8.fib(N));
    }
    }




