class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        List<int[]> frequencyStore = new ArrayList<>();

        for (int number : nums) {
            map.put(number, map.getOrDefault(number, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            frequencyStore.add(new int[]{entry.getKey(), entry.getValue()});
        }

        frequencyStore.sort((a, b) -> b[1] - a[1]);

        int[] outputArray = new int[k];

        for (int i = 0; i < k; i++) {
            outputArray[i] = frequencyStore.get(i)[0];
        }

        return outputArray;
    }
}