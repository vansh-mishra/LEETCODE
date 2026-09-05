class Solution {
    public int missingNumber(int[] nums) {
        int mis = nums.length;
        for(int i = 0;i<nums.length;i++) {
            mis ^= i ^nums[i];
        }
        return mis;
    }
}