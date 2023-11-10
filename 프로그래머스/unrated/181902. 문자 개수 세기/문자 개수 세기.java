import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        String alpa = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        int[] arr = new int[52];
        Arrays.fill(arr, 0);

        for (char a : my_string.toCharArray()) arr[alpa.indexOf(a)] += 1;
        
        return arr;
    }
}