import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        int profit = 0;
        int last = score.length - (m * (score.length/m));
        Arrays.sort(score);
        
        for (int i=score.length-m ; i >= last ; i -= m) {
            profit = profit + score[i]*m;
        }
        return profit;
    }
}