package am.iunetworks.DorjiNorbu.questionNine;

/**
 * Created by Dorji Norbu on 02-Sep-20.
 */
public class QuestionNine {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        solution.printStar(5);

        /*using lambda*/
//        Print p = (num) -> {
//                            for (int i = 1; i <= num; i++) {
//                                for (int j = num; j >= i; j--) {
//                                    System.out.print(" ");
//                                }
//                                for (int k = 0; k < i; k++) {
//                                    System.out.print(" *");
//                                }
//                                System.out.println();
//                            }
//                        };
//        p.printStar1(5);
    }
}

interface Print {
    void printStar1(int number);
}
