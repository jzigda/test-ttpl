package am.iunetworks.DorjiNorbu.questionSeven;

/**
 * Created by Dorji Norbu on 03-Sep-20.
 */
public class FindRoomKey {
    public boolean roomKey(int[][] room) {
        boolean[] openRoom = new boolean[room.length];
        openRoom[0] = true;
        for (int i = 0; i < room.length; i++) {
            if (openRoom[i]) {
                for (int j = 0; j < room[i].length; j++) {
                    if (room[i][j] != 0) openRoom[room[i][j]] = true;
                }
            } else {
                System.out.println("Sorry didn't get key for room number " + i);
                return false;
            }
            System.out.println("Room number: "+i+" opened.");
        }
        System.out.println("Could Open all room.");
        return true;
    }
}
