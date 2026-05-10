class Solution {
    public int maximumJumps(int[] nums, int target) {
        int n = nums.length;

        // dp[i] = maximum jumps to reach i
        int[] dp = new int[n];

        // initialize all as unreachable
        for(int i = 0; i < n; i++) {
            dp[i] = -1;
        }

        // starting index
        dp[0] = 0;

        // try reaching every index
        for(int i = 1; i < n; i++) {

            for(int j = 0; j < i; j++) {

                // check valid jump
                if(dp[j] != -1 &&
                   Math.abs(nums[i] - nums[j]) <= target) {

                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        return dp[n - 1];
    }
}