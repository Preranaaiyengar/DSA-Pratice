class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        Set<Integer> s = new HashSet<>();
        for (int n : nums) {
            s.add(n);
        }

        int longestsub = 1;

        for (int num : s) {

            if (!s.contains(num - 1)) {
                int currentnum = num;
                int currentsub = 1;

                while (s.contains(currentnum + 1)) {
                    currentnum++;
                    currentsub++;
                }

                longestsub = Math.max(longestsub, currentsub);
            }
        }
        return longestsub;
    }
}
