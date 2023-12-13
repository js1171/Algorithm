class Solution {
    public boolean solution(int x) {
        String sx = Integer.toString(x);
        int sum = 0;
        
        for(int i=0 ; i < sx.length() ; i++) {
            sum += (int)(sx.charAt(i))-48;
        }
        
        if (x%sum==0) {
            return true;
        }
        return false;
    }
}