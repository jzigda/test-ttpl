package am.iunetworks.KinzangChedup.week5;

import java.text.NumberFormat;
import java.util.Formatter;
import java.util.Scanner;

/**
 * Created by kinza on 9/3/2020.
 */
public class Q11Dot {
    public static void main(String[] args) {
            long l = 123L;
            System.out.println(thousandSeparator(l));
    }
    public static StringBuffer thousandSeparator(long n) {
        StringBuffer br = new StringBuffer(String.valueOf(n));
        for(int i = br.length(); i >= 0; i-=3) {
            if(i!=0 && i!=br.length() && br.length() > 2) {
                br.insert(i,'.');
            }
        }
        return br;
    }
//    public static void format(int num){
//        Formatter formatter = new Formatter();
//        formatter = new Formatter();
//        formatter.format("%,d", num);
//        StringBuffer buffer = new StringBuffer(formatter.toString());
//        String s=null;
//        for(int i =0;i<formatter.toString().length();i++){
//            if(formatter.toString().contains(",")){
//                s=formatter.toString().replace(",",".");
//            }else{
//                s=formatter.toString();
//            }
//        }
//        System.out.println(s);
//    }
}
