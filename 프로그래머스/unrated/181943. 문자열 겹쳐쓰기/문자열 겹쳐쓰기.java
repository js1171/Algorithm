class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        StringBuilder sb = new StringBuilder(my_string);                                  // StringBuilder 선언하고 my_string 넣어주기
        sb.replace(s,overwrite_string.length()+s,overwrite_string);                       // s부터 s+overwrite_string길이 까지 overwrite_string으로 대체
    return sb.toString();                                                                 // String으로 변환
    }
    
}

