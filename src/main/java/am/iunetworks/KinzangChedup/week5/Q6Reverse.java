package am.iunetworks.KinzangChedup.week5;

/**
 * Created by kinza on 9/2/2020.
 */

interface Reverse<T>{
    T meth(T t);
}
public class Q6Reverse {
    public static void main(String[] args) {
        char ch[] = {'H','a','n','n','a','h'};
        Reverse<StringBuffer> reverse = (t)->{
            StringBuffer result=new StringBuffer(t.length());
            for(int i=t.length()-1;i>=0;i--) {
                result.append(t.charAt(i));
            }
            return result;
        };
        System.out.println(reverse.meth(new StringBuffer(String.valueOf(ch))));
    }
}
