package am.iunetworks.TashiTshewang;

/**
 * Created by Tshewang on 9/3/2020.
 */
public class Solution6 {
    public static char[] reverseString(char[] s) {
        int i = 0, j = s.length -1;
        while(i < j){
            char ch = s[i];
            s[i] = s[j];
            s[j] = ch;
            i++;j--;
        }

        return s;
    }
    }
