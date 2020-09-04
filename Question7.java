package week5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Question7 {
	
	public static void traverseRooms(ArrayList<Rooms> rooms) {
		boolean lock = false;
		int key = 0;
		for (int i = 0; i < rooms.size(); i++) {
			System.out.println("Enter Room: "+ rooms.get(i).getRoomId() + " Pick Key: "+ rooms.get(i).getKeys());
            if (rooms.get(i).getRoomId() == key) {
				rooms.get(i).setLock(true);
				key = rooms.get(i).getKeys().get(i);
			}
		}
		int count =0;
		for (int i = 0; i < rooms.size(); i++) {
			if (rooms.get(i).isLock() == true) {
				count++;
			}
		}
		if (count == rooms.size()) {
			System.out.println("All rooms are unlocked.");
		}else {
			System.out.println("All rooms are not unlocked.");
		}
	}

	public static void main(String[] args) {
		boolean lock = false;
		System.out.print("Enter the number of rooms: ");
		Scanner input = new Scanner(System.in);
		int numberOfRooms = input.nextInt();
		//List<ArrayList<Rooms>> listOfRooms = new ArrayList<ArrayList<Rooms>>();
		ArrayList<Rooms> rooms = new ArrayList<Rooms>();
		// enter into list of rooms
		for (int i = 0; i < numberOfRooms; i++) {	
			List<Integer> keys = new ArrayList<Integer>();
			System.out.print("Enter the number of keys for room no."+i+" : ");
			int length = input.nextInt();
			System.out.print("Enter the keys for room no."+i+" : ");
			for (int j = 0; j < length; j++) {
				keys.add(input.nextInt());
			}
			rooms.add(new Rooms(i, keys, lock));
		}
			//listOfRooms.add(rooms);
            //print list of rooms
			for (Rooms rooms2 : rooms) {
				System.out.println(rooms2);
			}
			//traverse through rooms
		traverseRooms(rooms);
			
	}
}
