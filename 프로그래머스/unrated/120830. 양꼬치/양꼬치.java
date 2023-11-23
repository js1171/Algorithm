class Solution {
    public int solution(int n, int k) {
        int drink = k-(n/10);
        
        return n*12000 + drink*2000;
    }
}