class Solution {
    public int countDigits(int num) {
        int count = 0;
        int nw = num;
        while(num>0) {
            int n = num%10;
            if(nw%n==0) {
                count++;
            } 
            num/=10;
        }
        return count;
    }
}