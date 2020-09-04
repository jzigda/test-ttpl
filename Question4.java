package week5;

import java.util.Arrays;

public class Question4 {

    public static String reorderstring(String s) {
        StringBuffer result = new StringBuffer("");
        StringBuffer original = new StringBuffer();
        original.append(s);
        int length=original.length();
       // while(length > 0){
        	if (original.length()!=0) {
            for (int i = 0; i < s.length(); i++) {
            	if (result.length() == 0) {
    				result.insert(i, original.charAt(i));
    				length--;
    			}
            	else {
            		if (original.charAt(i) > result.charAt(result.length()-1)) {
						result.append(original.charAt(i));
						length--;
					}
            	}
			}
            }
            
            //backward
            for (int i = s.length()-1; i <= 0; i--) {
            	if (original.length()!=0) {
            		if (original.charAt(i) < result.charAt(result.length()-1)) {
						result.append(original.charAt(i));
						length--;
					}
            	}
			}
        //    }
        return result.toString();
    }
    
    public static void main(String args[]) {
        String s = "aaaabbbbcccc";
        System.out.println(reorderstring(s));
    }
}