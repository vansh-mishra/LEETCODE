import java.util.ArrayList;

class Solution {
    public int[] getConcatenation(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 2 * nums.length; i++) {
            list.add(nums[i % nums.length]);
        }

        int[] ans = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }
}
