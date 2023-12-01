import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] result = Arrays.copyOf(Arrays.copyOfRange(num_list, n, num_list.length), num_list.length);
        
        for(int i=num_list.length-n ; i < num_list.length ; i++) {
            result[i] = num_list[i-(num_list.length-n)];
        }

        return result;
        
    }
}