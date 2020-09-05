package week5;

import java.util.Arrays;

public class Question4 {

	public static String reorderString(String s) {
        int[] freq = new int[128];
        for (char c : s.toCharArray()) {
            freq[(int) c]++;
        }

        int length = s.length();
        StringBuffer result = new StringBuffer();
        while (length > 0) {
            for (int i = 97; i < 123; i++) {
                if (freq[i] > 0) {
                    freq[i]--;
                    length--;
                    result.append((char) i);
                }
            }
            for (int i = 123; i > 96; i--) {
                if (freq[i] > 0) {
                    freq[i]--;
                    length--;
                    result.append((char) i);
                }
            }
        }
        return result.toString();
    }
    
    public static void main(String args[]) {
        String s = "aaaabbbbcccc";
        System.out.println(reorderString(s));
    }
}