class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuilder sb = new StringBuilder(my_string);
        StringBuilder sc = new StringBuilder(my_string.substring(s, e+1));
        sb.replace(s, e+1, sc.reverse().toString());
        return sb.toString();
    }
}