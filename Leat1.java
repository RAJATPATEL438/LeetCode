// Two Sum

import java.util.HashMap;
import java.util.Map;

public class Leat1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numIndices = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numIndices.containsKey(complement)) {
                return new int[] { numIndices.get(complement), i };
            }
            numIndices.put(nums[i], i);
        }
        return new int[0];
    }

    public static void main(String[] args) {
        Leat1 sol = new Leat1();
        
        // Example 1
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 13;
        int[] result1 = sol.twoSum(nums1, target1);
        System.out.println("[" + result1[0] + ", " + result1[1] + "]");
    }
}