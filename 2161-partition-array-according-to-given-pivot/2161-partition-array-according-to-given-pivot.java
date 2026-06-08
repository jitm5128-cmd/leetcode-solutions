class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        List<Integer> smaller = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        List<Integer> greater = new ArrayList<>();

        for(int num : nums){
            if(num < pivot){
                smaller.add(num);
            }else if (num == pivot){
                equal.add(num);
            }else{
                greater.add(num);
            }
        }

        int[] ans = new int[n];
        int idx = 0;
        for(int x : smaller) ans[idx++] = x;
        for(int x : equal) ans[idx++] = x;
        for(int x : greater) ans[idx++] = x;

        return ans;
    }
}