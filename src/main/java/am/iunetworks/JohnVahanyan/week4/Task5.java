package am.iunetworks.JohnVahanyan.week4;

public class Task5 {
    public static void main(String[] args) {
        shuffle(new int[]{2, 5, 1, 3, 4, 7}, 3);
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0)
                result[i] = nums[i / 2];
            else
                result[i] = nums[n + i / 2];
        }
        return result;
    }

}
