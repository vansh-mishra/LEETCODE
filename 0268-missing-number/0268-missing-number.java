class Solution {
    public int missingNumber(int[] nums) {
        int mis = 0;
        for(int i = 1;i<=nums.length;i++) {
            mis ^= i;
        }
        for (int num: nums) {
            mis ^= num;
        }
        return mis;
    }
}