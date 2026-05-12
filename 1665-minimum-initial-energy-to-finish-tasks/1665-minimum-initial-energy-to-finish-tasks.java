class Solution {
    public int minimumEffort(int[][] tasks) {
         Arrays.sort(tasks, (a, b) -> 
            (b[1] - b[0]) - (a[1] - a[0])
        );

        int energy = 0;
        int current = 0;

        for (int[] task : tasks) {

            int actual = task[0];
            int minimum = task[1];

            // If current energy is less than minimum required
            if (current < minimum) {

                // Add extra energy needed
                energy += (minimum - current);

                // Update current energy
                current = minimum;
            }

            // Complete the task
            current -= actual;
        }

        return energy;
    }
}