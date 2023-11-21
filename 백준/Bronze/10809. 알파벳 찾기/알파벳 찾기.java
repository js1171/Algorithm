import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        
        String[] arr = new String[26];
        Arrays.fill(arr, "-1");
        
        for (int i=0 ; i < word.length() ; i++) {
            int n = (int) word.charAt(i) - 97;
            
            if (arr[n] == "-1") {
                arr[n] = Integer.toString(i);
            }
        }
        System.out.print(String.join(" ", arr));
    } 
}