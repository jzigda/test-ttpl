package am.iunetworks.TashiTshewang;

/**
 * Created by Tshewang on 9/2/2020.
 */
public class Solution4 {

        public String sortString(String s) {
            StringBuilder result = new StringBuilder("");
            int alphabeticsL [] = new int[26];
            for(int i=0;i<s.length();i++) alphabeticsL[s.charAt(i)-97]++;
            int letterCount=s.length();
            while(letterCount > 0){
                //increasing order of alphabet from start
                for(int i=0;i<alphabeticsL.length;i++){
                    if(alphabeticsL[i]!=0){
                        result.append((char) (i+97));
                        alphabeticsL[i]--;
                        letterCount--;
                    }
                }
                //decreasing order of alphabet from back
                for(int i=alphabeticsL.length-1;i>=0;i--){
                    if(alphabeticsL[i]!=0){
                        result.append((char) (i+97));
                        alphabeticsL[i]--;
                        letterCount--;
                    }
                }
            }
            return result.toString();
        }
    }

