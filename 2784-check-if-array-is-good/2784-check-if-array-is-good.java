class Solution {
    public boolean isGood(int[] nums) {
              Arrays.sort(nums);

        int n = nums.length;

        // Largest element should be n-1
        if (nums[n - 1] != n - 1) {
            return false;
        }

        // Check sequence: 1,2,3,...,n-1
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] != i + 1) {
                return false;
            }
        }

        return true;
    }
}