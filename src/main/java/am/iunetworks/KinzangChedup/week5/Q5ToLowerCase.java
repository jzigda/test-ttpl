package am.iunetworks.KinzangChedup.week5;

/**
 * Created by kinza on 9/3/2020.
 */
interface WeekFive<T> {
    T toLowerCase(T t);
}
public class Q5ToLowerCase{
    public static void main(String[] args) {
        String st = "Havenly BhuTAN";
        WeekFive<String> lower = (str)->{
            for(int i = 0;i<str.length();i++){
                if(str.charAt(i)>=64 && str.charAt(i)<=96){
                    str = str.replace(str.charAt(i),(char) ((int) str.charAt(i)+32));
                }
            }
            return str;
        };
        System.out.println(lower.toLowerCase(st));
    }
}
