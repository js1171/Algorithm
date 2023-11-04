class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        int one = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
        int two = Integer.parseInt(Integer.toString(b) + Integer.toString(a));
        
        if (one > two) {
            return one;
        }
        else {
            return two;
        }
        
        
    }
}