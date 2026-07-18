class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
         return gcd(nums[nums.length - 1], nums[0]);
    }
    public int gcd(int a, int b){
        if(b==0){
            return a;
        }
        return gcd(b,a % b);
    }
}