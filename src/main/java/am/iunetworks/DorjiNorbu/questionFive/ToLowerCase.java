package am.iunetworks.DorjiNorbu.questionFive;

/**
 * Created by Dorji Norbu on 02-Sep-20.
 */
public class ToLowerCase {
    public String toLowerCase(char[] chars) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 65 && chars[i] <= 90) {
                stringBuffer.append((char) (chars[i] + 32));
            } else {
                stringBuffer.append(chars[i]);
            }
        }
        return stringBuffer.toString();
    }
}



