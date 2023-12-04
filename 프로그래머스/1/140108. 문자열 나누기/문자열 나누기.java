class Solution {
    public int solution(String s) {
        int answer = 0;
        
        char x = s.charAt(0);
        int xCount = 0;
        int nxCount = 0;
        
        for (int i=0 ; i < s.length() ; i++) {
            if (xCount == 0 && nxCount==0) {
                x = s.charAt(i);
                xCount++ ;
                continue;
            }
            
            if (s.charAt(i) == x) {
                xCount ++;
            }
            else {
                nxCount ++;
            }
            
            if (xCount == nxCount) {
                answer++;
                xCount = 0;
                nxCount = 0;
            }
              
        }
        if (xCount!=0 || nxCount!=0) {
            answer++;
        }
        return answer;
    }
}