class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        cumulative_sum = nums[0]
        max_sum = nums[0]
        for i in range(1, len(nums)):
            cumulative_sum = max(cumulative_sum+nums[i], nums[i])
            max_sum = max(max_sum, cumulative_sum)
        return max_sum