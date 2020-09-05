package am.iunetworks.KunzangNima.Quiz5.Question8;
import java.util.Scanner;
/**
 * Created by TTPLkn on 03-09-2020.
 */
class FibonacciSeries {
    public static int fibonacci(int n) {
        if(n==0 ){
            return 0;
        }else if(n==1){
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter nth number to find fibonacci value of entered number. ");
        int n = input.nextInt();
        //long preTime=System.currentTimeMillis();
        System.out.println("Value of "+n+"th number in fibonacci series->"+fibonacci(n));
        //long postTime=System.currentTimeMillis();
        //System.out.println("Time taken to compute in milliseconds->"+(postTime-preTime));
    }
    /*static long prev=0;
    public static void printSequence(int elements) {
        LongStream.iterate(1, n -> {n+=prev; prev=n-prev; return n;}).
                limit(elements).forEach(System.out::println);
    }
    public static void main(String args[]){
        printSequence(10);
    }*/
}