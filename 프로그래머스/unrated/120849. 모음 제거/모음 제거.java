class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder(my_string);
        
        while (sb.indexOf("a") != -1) {sb.deleteCharAt(sb.indexOf("a"));}
        while (sb.indexOf("e") != -1) {sb.deleteCharAt(sb.indexOf("e"));}
        while (sb.indexOf("i") != -1) {sb.deleteCharAt(sb.indexOf("i"));}
        while (sb.indexOf("o") != -1) {sb.deleteCharAt(sb.indexOf("o"));}
        while (sb.indexOf("u") != -1) {sb.deleteCharAt(sb.indexOf("u"));}
        
        return sb.toString();
    }
}