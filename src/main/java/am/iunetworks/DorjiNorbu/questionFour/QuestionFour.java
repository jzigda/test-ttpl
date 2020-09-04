package am.iunetworks.DorjiNorbu.questionFour;

/**
 * Created by Dorji Norbu on 02-Sep-20.
 */
public class QuestionFour {
    public static void main(String[] args) {
//        String s="leetcode";
        String s="aaaabbbbcccc";
        StringBuffer stringBuffer=new StringBuffer(s.length());
        char [] chars=new char[26];
        char count=0;

        for(int i=0;i<s.length();i++){
            chars[s.charAt(i)-'a']++;
        }

        while(count<s.length()){
            for(int i=0; i<chars.length;i++){
                if(chars[i]>0) {
                    stringBuffer.append((char)(i + 'a'));
                    chars[i]--;
                    count++;
                }
            }
            for(int i=chars.length-1; i>0;i--){
                if(chars[i]>0) {
                    stringBuffer.append((char)(i + 'a'));
                    chars[i]--;
                    count++;
                }
            }
        }
        System.out.println(stringBuffer);
    }
}
