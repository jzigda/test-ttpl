package am.iunetworks.DorjiNorbu.questionEight;

/**
 * Created by Dorji Norbu on 02-Sep-20.
 */
public class Solution {
    public int fibonacci(int number) {
        if (number == 1) return 1;
        else if (number == 0) return 0;
        return fibonacci(number - 1) + fibonacci(number - 2);
    }

}
