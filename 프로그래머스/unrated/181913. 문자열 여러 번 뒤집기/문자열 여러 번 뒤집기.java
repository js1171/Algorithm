class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuilder sb = new StringBuilder(my_string);
        
        for (int qi=0 ; qi < queries.length ; qi++) {
            String ch = sb.substring(queries[qi][0],queries[qi][1]+1);
            StringBuilder chb = new StringBuilder(ch);
            sb.replace(queries[qi][0],queries[qi][1]+1,chb.reverse().toString());
        }
        return sb.toString();
    }
}