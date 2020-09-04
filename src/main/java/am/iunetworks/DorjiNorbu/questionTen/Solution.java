package am.iunetworks.DorjiNorbu.questionTen;

/**
 * Created by Dorji Norbu on 02-Sep-20.
 */
public class Solution {
    public void printStar(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = num; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = num-1; i > 0; i--) {
            for (int j = i; j < num; j++) {
                System.out.print(" ");
            }
            for (int k = 2 * i - 1; k >= 1; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
