// remove duplicates from sorted array

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int slow = 0;
        for (int fast = 1; fast < nums.length; fast++) {
            if (nums[fast] != nums[slow]) {
                slow++;
                nums[slow] = nums[fast];
            }
        }
        return slow + 1;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1, 1, 2, 2, 2, 3, 5, 5, 4};
        int newLength = sol.removeDuplicates(nums);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}

