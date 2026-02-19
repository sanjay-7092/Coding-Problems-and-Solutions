import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hmap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (hmap.containsKey(temp)) {
                return new int[] {i, hmap.get(temp)};
            }
            hmap.put(nums[i], i);
        }
        return null;
    }
	public static void main(String[] args) {
        TwoSum solution = new TwoSum();
        int[] result = solution.twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println("Output: [" + result[0] + ", " + result[1] + "]");
    }
}