import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        int start=0, end=arr.length;
        for (int i=0 ; i < query.length ; i++) {
            if (i%2==0) { end = start + end - (end - query[i]); }
            else { start = start + query[i]; }
        }
        arr = Arrays.copyOfRange(arr, start, end+1);
        return arr;
    }
}