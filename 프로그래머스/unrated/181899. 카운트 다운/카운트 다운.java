class Solution {
    public int[] solution(int start, int end) {
        int[] result = new int[start - end + 1];
        int n=0;
        
        for (int i=start ; i>=end ; i--) {
            result[n] = i;
            n ++;
        }
        return result;
    }
}