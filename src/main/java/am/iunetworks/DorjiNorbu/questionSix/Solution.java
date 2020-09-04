package am.iunetworks.DorjiNorbu.questionSix;

/**
 * Created by Dorji Norbu on 02-Sep-20.
 */
public class Solution {
    public char[] reverseCharArray(char[] chars) {
        char temp;
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < i; j++) {
                temp = chars[j];
                chars[j] = chars[i];
                chars[i] = temp;
            }
        }
        return chars;
    }
}
