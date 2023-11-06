import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        String answer = "";
        
        for (int i=0 ; i < a.length() ; i++) {
            
            char c = a.charAt(i);                                       // String을 하나씩 char로 변환
            
            if(Character.isUpperCase(c)) {                              // 변환한 c가 대문자이면
                answer += Character.toLowerCase(c);                     // 소문자로 변환하여 추가
            } else {
                answer += Character.toUpperCase(c);                     // 대문자로 변환하여 추가
            } 
        }
        System.out.print(answer);
    }
}
