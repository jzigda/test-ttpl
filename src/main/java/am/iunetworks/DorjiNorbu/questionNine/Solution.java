package am.iunetworks.DorjiNorbu.questionNine;

/**
 * Created by Dorji Norbu on 02-Sep-20.
 */
public class Solution {
    public void printStar(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = number; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
