class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int ans = -1;
        while(right>=left) {
            int mid = (right+left)/2;
            if(nums[mid] == target) {
                ans=mid;
                break;
            } else if(nums[mid]<target){
                left = mid+1;
            } else {
                right = mid -1;
            }
        }
        if (ans==-1){
            return ans;
        } else {
            return ans;
        }
    }
}
