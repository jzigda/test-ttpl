package am.iunetworks.KinzangChedup.week5;

/**
 * Created by kinza on 9/2/2020.
 */
public class Q9Triangle {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                if(j%2==1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
