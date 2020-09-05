package am.iunetworks.KinzangChedup.week5;

/**
 * Created by kinza on 9/2/2020.
 */
public class Q4SmallestLargest {
    public static void main(String[] args) {
        Q4SmallestLargest ss = new Q4SmallestLargest();
        System.out.println(ss.sortString("bhutan"));
    }
    public String sortString(String s) {
        StringBuilder sb = new StringBuilder();
        int count = s.length();
        int[] frequency = new int[26];

        for (int i = 0; i < count; i++) {
            frequency[s.charAt(i) - 'a']++;
            System.out.println(s.charAt(i) - 'a');
        }

        while (count > 0) {
            for (int i = 0; i < frequency.length; i++) {
                if (frequency[i] != 0) {
                    sb.append((char)(i+97));
                    frequency[i]--;
                    count--;
                }
            }
            for (int i = frequency.length-1; i >= 0; i--) {
                if (frequency[i] != 0) {
                    sb.append((char)(i+97));
                    frequency[i]--;
                    count--;
                }
            }
        }
        return sb.toString();
    }
}
