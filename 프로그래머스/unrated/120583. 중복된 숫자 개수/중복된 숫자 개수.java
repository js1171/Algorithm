import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        List<Integer> list = new ArrayList<Integer>();
        
        for (int value : array) {
            list.add(value);
        }
        
        int answer = Collections.frequency(list, Integer.valueOf(n));
        return answer;
    }
}