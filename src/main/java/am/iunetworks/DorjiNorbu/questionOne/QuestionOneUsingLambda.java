package am.iunetworks.DorjiNorbu.questionOne;

import java.io.*;
import java.util.*;

/**
 * Created by Dorji Norbu on 03-Sep-20.
 * In this program, i have used has map and lambda to sort the the data read from a file
 * Custom sort is such that is starting character of key is same then it is sorted based on values
 */

public class QuestionOneUsingLambda {

    public static void main(String[] args) throws IOException {
        try {
            String path = "D:/JavaPractice/src/quiz5/test-ttpl/src/main/java/am/iunetworks/DorjiNorbu/questionOne/";
            File file = new File(path + "questionOne.txt");
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

            LinkedHashMap<String, String> map = new LinkedHashMap<>();
            String st;
            while ((st = bufferedReader.readLine()) != null) {
                map.put(st.substring(0, st.indexOf('=')), st.substring(st.indexOf('=') + 1, st.length()));
            }
            /* Map.Entry is an interface, makes it possible to use lambda with iterator*/
            List<Map.Entry<String, String>> list = new LinkedList<>(map.entrySet());
            Collections.sort(list, (o1, o2) ->
                    {
                        if (o1.getKey().charAt(0) == o2.getKey().charAt(0)) {
                            return o1.getValue().compareTo(o2.getValue());
                        } else {
                            return o1.getKey().compareTo(o2.getKey());
                        }
                    }
            );
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path + "questionOneResult.txt"));
                bufferedWriter.write("The result is using map and custom collection sort with lambda expression\n\n");
                for (Map.Entry<String, String> entry : list) {
                    bufferedWriter.write(entry.getKey() + ":" + entry.getValue() + "\n");
                }
                bufferedWriter.close();
            }catch (IOException e){
                System.out.println("Error writing file");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error reading file");
        }
    }
}
