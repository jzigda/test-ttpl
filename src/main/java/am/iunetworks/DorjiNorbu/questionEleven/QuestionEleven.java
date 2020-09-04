package am.iunetworks.DorjiNorbu.questionEleven;

/**
 * Created by Dorji Norbu on 03-Sep-20.
 */
public class QuestionEleven {
    public static void main(String[] args) {
        StringBuffer string = new StringBuffer();
        int number = 123456789;
//        int temp = String.valueOf(number).length();
//        for (int i = (temp - 1) % 3 + 1, j = 0; i < temp; i = i + 3, j = j + 3) {
//            string.append(String.valueOf(number).substring(j, i)).append(".");
//
//        }
//
//        System.out.println(String.valueOf(number).substring(0, 1));
//
//        System.out.println(string.toString());
        String res = Integer.toString(number);
        int len = res.length();
        System.out.println(res.substring(7,len));
        for(int i = len; i >= 0; i-=3) {
            if(i!=0 && i != len && len > 3) {
                res = res.substring(0, i) + "." + res.substring(i, len);
            }
        }
        System.out.println(res);
    }
}
