package week5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Question7 {
	
	public static boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int m = rooms.size();
        if(m==0) return true;
        boolean[] markVisited = new boolean[m];
        int roomsVisited = traverseRooms(rooms, 0, markVisited, 0, m);
        return roomsVisited == m;
    }
    
    private static int traverseRooms(List<List<Integer>> rooms, int x, boolean[] markVisited, int roomsVisited, int m) {
        if(!markVisited[x]) {
            List<Integer> roomsKeys = rooms.get(x);
            markVisited[x]=true;
            roomsVisited++;
            for(int i=0;i<roomsKeys.size();i++){
                if(roomsVisited == m) break;
                int nextRoom = roomsKeys.get(i);
                roomsVisited = traverseRooms(rooms, nextRoom, markVisited, roomsVisited, m);
                
            }
            return roomsVisited;
        }
        return roomsVisited;
    }

	public static void main(String[] args) {
		List<List<Integer>> rooms = new ArrayList<List<Integer>>();
		List<Integer> roomList = new ArrayList<Integer>();
		roomList.add(1);
		roomList.add(2);
		roomList.add(3);
		rooms.add(roomList);
		boolean result = canVisitAllRooms(rooms);
		System.out.println(result);

	}
}
