package am.iunetworks.TashiTshewang;

import java.util.Scanner;

/**
 * Created by Tshewang on 9/4/2020.
 */

    public class Exercise9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Enter row number=5 to get given pattern:
        System.out.println("Enter the number of rows=5 to get given triangle: ");

        int rows = in.nextInt();
        for (int i = rows - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k <= rows - 1; k++) {
                System.out.print("*" + " ");
            }
            System.out.println("");
        }
        in.close();
    }
}
