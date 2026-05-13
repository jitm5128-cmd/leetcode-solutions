class Solution {
    public int minMoves(int[] nums, int limit) {

        int n = nums.length;

        // Difference array
        int[] diff = new int[2 * limit + 2];

        for (int i = 0; i < n / 2; i++) {

            int a = nums[i];
            int b = nums[n - 1 - i];

            int low = Math.min(a, b);
            int high = Math.max(a, b);

            // Initially assume 2 moves for every sum
            diff[2] += 2;

            // 1 move range starts
            diff[low + 1] -= 1;

            // 0 move at exact sum
            diff[low + high] -= 1;

            // back to 1 move
            diff[low + high + 1] += 1;

            // back to 2 moves
            diff[high + limit + 1] += 1;
        }

        int ans = Integer.MAX_VALUE;
        int current = 0;

        for (int s = 2; s <= 2 * limit; s++) {
            current += diff[s];
            ans = Math.min(ans, current);
        }

        return ans;
    }
}