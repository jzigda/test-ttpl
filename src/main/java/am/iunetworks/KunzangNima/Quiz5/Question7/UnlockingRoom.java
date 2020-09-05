package am.iunetworks.KunzangNima.Quiz5.Question7;
import java.util.HashSet;
import java.util.Iterator;
/**
 * Created by TTPLkn on 03-09-2020.
 */
public class UnlockingRoom {
    public static void main(String args[]) {
        int[][] keysInRom = {{1, 3}, {3, 0, 1}, {2}, {0}};
        //checkKeys(keysInRom);
        System.out.println(checkKeys(keysInRom));
    }

    public static boolean checkKeys(int[][] keyAndRoom) {
        int noRooms = keyAndRoom.length;
        boolean a=false;
        //int enteredRoomCount [] = new int [noRooms];
        HashSet<String> enteredRoomCount = new HashSet<String>();
        //room counts from 0 to nth
        for (int i = 0; i < noRooms; i++) {
            if (keyAndRoom[i][0] == 0) {
                enteredRoomCount.add(String.valueOf(keyAndRoom[i][0]));
            }
            enteredRoomCount.add(String.valueOf(i));
            for (int j = 0; j < keyAndRoom[i].length; j++) {
                enteredRoomCount.add(String.valueOf(keyAndRoom[i][j]));
                i = keyAndRoom[i][j];
            }

        }
        if (enteredRoomCount.size() == noRooms)
        {
            a = true;
        }
        //Traversing elements
        /*Iterator<String> itr = enteredRoomCount.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }*/
        return a;
    }
}
