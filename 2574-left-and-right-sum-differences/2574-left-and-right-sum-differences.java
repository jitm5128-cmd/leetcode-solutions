class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] a = new int[n];

        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        int l = 0;

        for (int i = 0; i < n; i++) {
            int r = totalSum - l - nums[i];
            a[i] = Math.abs(l - r);
            l += nums[i];
        }

        return a;
    }
}