class Solution {
    public String solution(String str1, String str2) {
        StringBuilder sb = new StringBuilder();               // StringBuilder 선언
        sb.setLength(str1.length()*2);                        // StringBuilder 길이 조정
        
        for (int i=0 ; i < str1.length() ; i++) {
            sb.setCharAt(i*2,str1.charAt(i));                 // sb의 인덱스 0,2,4,6,8에 str1 값 하나씩 넣어줌
            sb.setCharAt(i*2+1, str2.charAt(i));              // sb의 인덱스 1,3,5,7,9에 str2 값 하나씩 넣어줌
        }
        return sb.toString();                                 // String으로 변환하여 출력
    }
}
