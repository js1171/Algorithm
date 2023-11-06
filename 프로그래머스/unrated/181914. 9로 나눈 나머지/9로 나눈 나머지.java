class Solution {
    public int solution(String number) {
        int sum=0;
        
        for (int i=0 ; i < number.length() ; i++){
            sum += Character.getNumericValue(number.charAt(i));
        }
        return sum%9;
    }
}


number 문자열에서 숫자 하나씩을 charAt으로 가져옴 → 하나하나 Char 형태가 됨
문자를 숫자 형태로 바꿔서 sum 변수에 저장
    
Character.getNumbericvValue(cha) : 주어진 문자의 숫자 값을 반환하는 메소드
