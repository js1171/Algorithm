class Solution {
    public String solution(String my_string, String letter) {
        StringBuilder sb = new StringBuilder(my_string);
        
        while ( sb.indexOf(letter) != -1) {
            sb.deleteCharAt(sb.indexOf(letter));
        }
        return sb.toString();
    }
}