package week5;

import java.util.ArrayList;
import java.util.List;

public class Rooms {
	private int roomId;
	private List<Integer> keys = new ArrayList<Integer>();
	private boolean lock = false;
	public int getRoomId() {
		return roomId;
	}
	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}
	public List<Integer> getKeys() {
		return keys;
	}
	public void setKeys(List<Integer> keys) {
		this.keys = keys;
	}
	public boolean isLock() {
		return lock;
	}
	public void setLock(boolean lock) {
		this.lock = lock;
	}
	public Rooms(int roomId, List<Integer> keys, boolean lock) {
		super();
		this.roomId = roomId;
		this.keys = keys;
		this.lock = lock;
	}
	@Override
	public String toString() {
		return "Rooms [roomId=" + roomId + ", keys=" + keys + ", lock=" + lock + "]";
	}
}
