import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

class Solution {
    public ArrayList<Integer> solution(int[] numbers) {
        Set<Integer> set = new HashSet<Integer>();
        
        for (int i=0 ; i < numbers.length-1 ; i++){
            for (int j=i+1 ; j < numbers.length ; j++) {
                set.add(numbers[i]+numbers[j]);   
            }
        }
        ArrayList<Integer> list = new ArrayList<Integer>(set);
        Collections.sort(list);
        return list;
    }
}