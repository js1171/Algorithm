class Solution {
    boolean solution(String s) {
        int pc = 0, yc=0;
        
        for (int i=0 ; i < s.length() ; i++) {
            if (s.charAt(i)=='p' || s.charAt(i)=='P') {
                pc++;
            }
            else if (s.charAt(i)=='y' || s.charAt(i)=='Y') {
                yc++;
            }
        }
        return (pc==yc ? true : false);
    }
}