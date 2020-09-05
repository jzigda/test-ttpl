package am.iunetworks.KinzangChedup.week5;

/**
 * Created by kinza on 9/2/2020.
 */
public class Q7RoomKey {
    static <T extends Comparable<T>, V extends T> boolean isInt(T x, V[] y) {
        for(int i = 0; i<y.length;i++) {
            if(x.equals(y[i])) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        boolean result = true;
        int arr[][] = {{3,1},{3,0,2,1},{3},{0}};
//                {{1},{2},{3},{4},{}};
        for(int i=0;i<arr.length-1;i++){
            Integer num[] = new Integer[arr[i].length];
            for(int j=0;j<arr[i].length;j++){
                num[j]=arr[i][j];
            }
            if(!Q7RoomKey.<Integer,Integer>isInt(i+1, num)) {
                result=false;
            }
        }
        System.out.println(result);
    }
}
//room 0 = 1 3
//room 1 = 3 0 1
//room 2 = 2
//room 3 = 0
