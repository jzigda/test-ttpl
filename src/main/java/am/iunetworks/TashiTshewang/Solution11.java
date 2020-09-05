package am.iunetworks.TashiTshewang;

/**
 * Created by Tshewang on 9/3/2020.
 */
public class Solution11 {

    public static String thousandSeparator(int n) {
        StringBuilder s = new StringBuilder().append(n);
        for(int i=s.length()-3;i>0;i-=3){
            s.insert(i,".");
        }
        return s.toString();
    }
    }


