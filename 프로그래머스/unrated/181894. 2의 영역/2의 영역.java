import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int start=0, end=0;
        
        for (int i=0 ; i < arr.length ; i++) {
            if (arr[i]==2) { start=i; break; }
        }
        for (int i=arr.length-1 ; i>=0 ; i--) {
            if (arr[i]==2) { end=i+1; break; }
        }
        
        if (start==0 & end == 0) {
            int[] answer = {-1};
            return answer;
        }
        else { return Arrays.copyOfRange(arr, start, end); }
    }
}