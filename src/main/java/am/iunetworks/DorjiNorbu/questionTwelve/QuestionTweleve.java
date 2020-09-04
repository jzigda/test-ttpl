package am.iunetworks.DorjiNorbu.questionTwelve;

/**
 * Created by Dorji Norbu on 04-Sep-20.
 */
public class QuestionTweleve {
    public static void main(String[] args) {
        Cashier cashier = new Cashier(3, 50, new int[]{1, 2, 3, 4, 5, 6, 7}, new int[]{100, 200, 300, 400, 300, 200, 100});

        int[][][] array =
                {{{1, 2}, {1, 2}},
                        {{3, 7}, {10, 10}},
                        {{1, 2, 3, 4, 5, 6, 7}, {1, 1, 1, 1, 1, 1, 1}},
                        {{4}, {10}},
                        {{7, 5, 3, 1, 6, 4, 2}, {10, 10, 10, 9, 9, 9, 7}},
                        {{2, 3, 5}, {5, 3, 2}}
                };

        for (int i = 0; i < array.length; i++) {
            cashier.setCounter(cashier.getCounter() + 1);
            System.out.println(cashier.getBill(array[i][0], array[i][1]));
        }

//        cashier.setCounter(cashier.getCounter() + 1);
//        System.out.println(cashier.getBill(new int[]{1, 2}, new int[]{1, 2}));
//        cashier.setCounter(cashier.getCounter() + 1);
//        System.out.println(cashier.getBill(new int[]{3, 7}, new int[]{10, 10}));
//        cashier.setCounter(cashier.getCounter() + 1);
//        System.out.println(cashier.getBill(new int[]{1, 2, 3, 4, 5, 6, 7}, new int[]{1, 1, 1, 1, 1, 1, 1}));
//        cashier.setCounter(cashier.getCounter() + 1);
//        System.out.println(cashier.getBill(new int[]{4}, new int[]{10}));
//        cashier.setCounter(cashier.getCounter() + 1);
//        System.out.println(cashier.getBill(new int[]{7, 3}, new int[]{10, 10}));
//        cashier.setCounter(cashier.getCounter() + 1);
//        System.out.println(cashier.getBill(new int[]{7, 5, 3, 1, 6, 4, 2}, new int[]{10, 10, 10, 9, 9, 9, 7}));
//        cashier.setCounter(cashier.getCounter() + 1);
//        System.out.println(cashier.getBill(new int[]{2, 3, 5}, new int[]{5, 3, 2}));
    }
}
