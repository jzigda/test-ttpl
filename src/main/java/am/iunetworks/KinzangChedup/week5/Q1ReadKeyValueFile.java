package am.iunetworks.KinzangChedup.week5;

import java.io.*;
import java.util.*;

/**
 * Created by kinza on 9/2/2020.
 */
public class Q1ReadKeyValueFile {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\kinza\\OneDrive\\Desktop\\bits-project\\assign-quiz\\test-ttpl\\src\\main\\java\\am\\iunetworks\\KinzangChedup\\week5\\resources\\country");
        Map<String,String> values = new LinkedHashMap<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String countryName;
            while ((countryName =br.readLine())!=null){
                int index = countryName.indexOf("=");
                String key = countryName.substring(0,index);
                String value = countryName.substring(index+1,countryName.length());
                values.put(key,value);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<Map.Entry<String,String>> list = new LinkedList<>(values.entrySet());
        list.stream().sorted((val1, val2)->{
            if (val1.getKey().charAt(0) == val2.getKey().charAt(0)) {
                return val1.getValue().compareTo(val2.getValue());
            } else {
                return val1.getKey().compareTo(val2.getKey());
            }
        });
        list.forEach(System.out::println);
    }
}
