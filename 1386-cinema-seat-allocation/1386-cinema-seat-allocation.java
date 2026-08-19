import java.util.*;

class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int[] seat : reservedSeats) {
            int row = seat[0];
            int s = seat[1];

            if (s >= 2 && s <= 9) {
                map.put(row, map.getOrDefault(row, 0) | (1 << s));
            }
        }

        int ans = (n - map.size()) * 2;

        for (int mask : map.values()) {

            boolean left = true;
            boolean middle = true;
            boolean right = true;

            for (int s = 2; s <= 5; s++) {
                if ((mask & (1 << s)) != 0) {
                    left = false;
                    break;
                }
            }

            for (int s = 4; s <= 7; s++) {
                if ((mask & (1 << s)) != 0) {
                    middle = false;
                    break;
                }
            }

            for (int s = 6; s <= 9; s++) {
                if ((mask & (1 << s)) != 0) {
                    right = false;
                    break;
                }
            }

            if (left && right) {
                ans += 2;
            } 
            else if (left || middle || right) {
                ans += 1;
            }
        }

        return ans;
    }
}