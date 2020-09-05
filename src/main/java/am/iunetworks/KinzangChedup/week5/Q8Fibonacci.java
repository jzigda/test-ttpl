package am.iunetworks.KinzangChedup.week5;

import java.util.Scanner;

/**
 * Created by kinza on 9/3/2020.
 */
public class Q8Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do{
            n = scanner.nextInt();
            System.out.println(sum((n-1),(n-2)));
        }while (n !=0);
    }
    public static int FibonacciSeries(int n){
        int n1 = 0, n2 = 1, n3 = 0;
        if(n==1){
            return n2;
        }
        for (int i = 1; i <n; i++) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        return n3;
    }
    public static int sum(int a, int b){
        return FibonacciSeries(a)+FibonacciSeries(b);
    }
}
