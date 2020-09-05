package am.iunetworks.TashiTshewang;

/**
 * Created by Tshewang on 9/2/2020.
 */
public class Solution5 {
    public static StringBuilder StringBuilderLowerCase(String str) {
        StringBuilder pTextLower = new StringBuilder(str);
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 65 && c <= 65 + 27) {
                pTextLower.setCharAt(i, (char) ((int) (str.charAt(i)) | 32));
            }
        }
        return pTextLower;
    }
}
