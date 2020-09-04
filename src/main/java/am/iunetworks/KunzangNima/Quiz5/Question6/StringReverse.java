package am.iunetworks.KunzangNima.Quiz5.Question6;

/**
 * Created by TTPLkn on 04-09-2020.
 */
public class StringReverse {
    public static void main(String args[]) {
        char[] charArray = new char[]{'h', 'e', 'l', 'l', 'o'};
        reverseCharArray(charArray);
    }
    public static void reverseCharArray(char[] charsArr) {
        int lastChar = (charsArr.length - 1);

        for (int i = lastChar; i >= 0; i--) {
            if (i == lastChar)
                System.out.print("[\"");

            System.out.print(charsArr[i]);

            if (i <= lastChar && i > 0)
                System.out.print("\",\"");

            if (i == 0)
                System.out.print("\"]");
        }
    }

}
