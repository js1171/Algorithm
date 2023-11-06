class Solution {
    public String solution(String str1, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.setLength(str1.length()*2);
        
        for (int i=0 ; i < str1.length() ; i++) {
            sb.setCharAt(i*2,str1.charAt(i));
            sb.setCharAt(i*2+1, str2.charAt(i));
        }
        return sb.toString();
    }
}