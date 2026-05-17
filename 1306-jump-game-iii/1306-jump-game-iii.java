import java.util.*;

public class Solution {

    public static boolean canReach(int[] arr, int start) {
        int n = arr.length;

        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[n];

        queue.offer(start);

        while (!queue.isEmpty()) {
            int i = queue.poll();

            // Skip if already visited
            if (visited[i]) {
                continue;
            }

            // If value is 0, return true
            if (arr[i] == 0) {
                return true;
            }

            visited[i] = true;

            // Forward jump
            int forward = i + arr[i];
            if (forward < n) {
                queue.offer(forward);
            }

            // Backward jump
            int backward = i - arr[i];
            if (backward >= 0) {
                queue.offer(backward);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 3, 0, 3, 1, 2};
        int start = 5;

        System.out.println(canReach(arr, start));
    }
}