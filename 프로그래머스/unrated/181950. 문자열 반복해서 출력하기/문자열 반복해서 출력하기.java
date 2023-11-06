import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        
        System.out.print(str.repeat(n));        // repeat함수 : str.repeat(n); "str을 n번 반복"
    }
}
