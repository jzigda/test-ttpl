package am.iunetworks.KunzangNima.Quiz5.Question4;
import java.util.Arrays;
/**
 * Created by TTPLkn on 04-09-2020.
 */
public class SortingStringAlternatively {
    public static void main(String args[]) {
        String s = "leetcode";
        System.out.println(sortString(s));
        String s1 = "aaaabbbbcccc";
        System.out.println(sortString(s1));
        String s2 = "rat";
        System.out.println(sortString(s2));
    }
    public static String sortString(String s) {
        StringBuilder charResult = new StringBuilder("");
        //taking counter charCount for iterating over the loop
        int charCount = s.length();
        //Counting the frequency(mode) of the character  in array;
        int charFrequency[] = new int[26];
        Arrays.fill(charFrequency, 0);

        for (int i = 0; i < s.length(); i++) {
            charFrequency[s.charAt(i) - 'a']++;
        }
        //iterating the loop for character present in the given String
        while (charCount > 0) {
            //iterating for the steps 1 to 3
            for (int i = 0; i < charFrequency.length; i++) {
                if (charFrequency[i] != 0) {
                    charResult.append((char) (i + 97));
                    charFrequency[i]--;
                    charCount--;
                }
            }
            //iterating for the step 4 to 6
            for (int i = charFrequency.length - 1; i >= 0; i--) {
                if (charFrequency[i] != 0) {
                    charResult.append((char) (i + 97));
                    charFrequency[i]--;
                    charCount--;
                }
            }
        }
        //converting the StringBuilder to String
        return charResult.toString();
    }
}
