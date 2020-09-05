package am.iunetworks.KinzangChedup.week5;

/**
 * Created by kinza on 9/2/2020.
 */
public class Q10Pattern {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = 5 - 1; i > 0; i--) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}