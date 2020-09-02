package am.iunetworks.KunzangNima.Quiz5.Question10;
/**
 * Created by TTPLkn on 02-09-2020.
 */
public class DiamondShapePattern {
    public static void main(String args[]) {
        int row=5, i, j;
        int space = row - 1;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            space--;
            for (j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        space = 1;
        for (i = 1; i <= row - 1; i++) {
            for (j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            space++;
            for (j = 1; j <= 2 * (row - i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}