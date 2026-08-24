class Solution {
    public int reverse(int n) {
        long num = Math.abs((long) n);
        int sign = n < 0 ? -1 : 1;
        long rev = 0;

        while (num > 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }

        rev *= sign;

        if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE)
            return 0;

        return (int) rev;
    }
}