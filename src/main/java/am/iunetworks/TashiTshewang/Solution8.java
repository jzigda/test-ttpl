package am.iunetworks.TashiTshewang;

/**
 * Created by Tshewang on 9/3/2020.
 */
public class Solution8 {
        public static int fib(int Input) {
            if (Input<2) {
                return Input;
            }
            int[] arr = new int[Input+1];
            arr[0] = 0;
            arr[1] = 1;
            for (int i=2; i<=Input; i++) {
                arr[i] = arr[i-1] + arr[i-2];
            }
            return arr[Input];
        }
    }

