package am.iunetworks.DorjiNorbu.questionOne;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Dorji Norbu on 02-Sep-20.
 * using string and custom collection sort
 * Custom sort is based on if the character at starting is same then it is sort based on strong after "="
 */
public class QuestionOne {
    public static void main(String[] args) throws IOException {
        try {
            String path = "D:/JavaPractice/src/quiz5/test-ttpl/src/main/java/am/iunetworks/DorjiNorbu/questionOne/";
            File file = new File(path + "questionOne.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));

            List<String> strings = new ArrayList<>();
            String st;
            while ((st = br.readLine()) != null) {
                strings.add(st);
            }
            Collections.sort(strings, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    if (o1.charAt(0) == o2.charAt(0)) {
                        return o1.substring(o1.indexOf("="), o1.length())
                                .compareTo(o2.substring(o2.indexOf("="), o2.length()));
                    } else {
                        return o1.substring(0, o1.indexOf("="))
                                .compareTo(o2.substring(0, o2.indexOf("=")));
                    }
                }
            });

            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path + "questionOneResult.txt"));
                bufferedWriter.write("The result is using string and custom collection sort\n\n");
                for (String s : strings) {
                    bufferedWriter.write(s.substring(0, s.indexOf("=")) + ":" + s.substring(s.indexOf("="), s.length())
                            + "\n");
                }
                bufferedWriter.close();
            } catch (IOException e) {
                System.out.println("Error writing file");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error reading file");
        }
    }
}
