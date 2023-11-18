import java.util.*;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int start = slicer[0], end = slicer[1], plus = 1;
        
        switch(n) {
            case 1 : start = 0; break;
            case 2 : end = num_list.length-1; break;
            case 3 : break;
            case 4 : plus = slicer[2]; break;
        }
        
        int[] answer = new int[(int)Math.ceil((double)(end-start+1)/plus)];
        
        for (int i=start, j=0 ; i <= end ; i += plus, j++) {
            answer[j] = num_list[i];
        }
        return answer;
    }
}