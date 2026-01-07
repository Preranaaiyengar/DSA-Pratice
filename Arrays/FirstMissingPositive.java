class Solution {
    public int firstMissingPositive(int[] nums) {

        int n = nums.length;
        int containsOne = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                containsOne++;
                break;
            }
        }

        if (containsOne==0) return 1;

        for (int i = 0; i < n; i++) {
            if (nums[i] <= 0 || nums[i] > n) {
                nums[i] = 1;
            }
        }

        for (int i = 0; i < n; i++) {
            int val = Math.abs(nums[i]);
            nums[val - 1] = -Math.abs(nums[val - 1]);
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                return i + 1;
            }
        }

        return n + 1;
    }
}
