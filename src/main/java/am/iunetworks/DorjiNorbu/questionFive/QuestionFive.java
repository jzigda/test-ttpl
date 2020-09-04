package am.iunetworks.DorjiNorbu.questionFive;

/**
 * Created by Dorji Norbu on 02-Sep-20.
 */
public class QuestionFive {
    public static void main(String[] args) {
        ToLowerCase toLowerCase = new ToLowerCase();
        String str = "LOVELY";
//        String str = "Lovely";
//        String str = "happy";
        System.out.println(toLowerCase.toLowerCase(str.toCharArray()));

        //using stream and its lower case method
//        Stream.of(str).map(e->e.toLowerCase()).forEach(System.out::print);
    }
}
