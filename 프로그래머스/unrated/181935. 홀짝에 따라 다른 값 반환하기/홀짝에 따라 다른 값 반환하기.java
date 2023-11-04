class Solution {
    public int solution(int n) {
        int h=0, j=0 ;
        
        for (int i=0 ; i<=n ; i++) {
            if (i%2==0) {
                j += Math.pow(i,2);
            }
            else {
                h += i;
            }
        }
        return n%2==0 ? j : h;
    }
}