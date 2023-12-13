import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<Integer>();
    
        for(int num : arr) {
            if(num%divisor==0) list.add(num);
        }
        
        if (list.size()==0) {
            int[] answer = {-1};
            return answer;
        }
        else {
            int[] answer = list.stream().mapToInt(i->i).toArray();
            Arrays.sort(answer);
            return answer;
        }
        
    }
}