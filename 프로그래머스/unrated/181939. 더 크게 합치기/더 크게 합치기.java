class Solution {
    public int solution(int a, int b) {
        String sa = Integer.toString(a);
        String sb = Integer.toString(b);
        
        return Integer.parseInt(sa+sb) < Integer.parseInt(sb+sa) ? Integer.parseInt(sb+sa) : Integer.parseInt(sa+sb);
        
    }
}