package am.iunetworks.KunzangNima.Quiz5.Question9;

/**
 * Created by TTPLkn on 02-09-2020.
 */
public class PyramidShapePrint {
    public static void main(String args[]) {
        PyramidPattern();
    }
    public static void PyramidPattern() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
