package am.iunetworks.DorjiNorbu.questionSeven;

/**
 * Created by Dorji Norbu on 03-Sep-20.
 */
public class QuestionSeven {
    public static void main(String[] args) {
//        int[][] roomAndKey={{1},{2},{3},{}};
//        int[][] roomAndKey = {{1, 3}, {3, 0, 2}, {4}, {0},{2},{5,3}};
        int[][] roomAndKey = {{1, 3}, {3, 0, 1}, {2}, {0}};
        FindRoomKey findRoomKey = new FindRoomKey();
        System.out.println(findRoomKey.roomKey(roomAndKey));
    }
}
