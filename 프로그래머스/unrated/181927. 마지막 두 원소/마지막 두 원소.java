import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int n = num_list.length ;
        int a = num_list[n-1], b = num_list[n-2] ;

        int[] list = Arrays.copyOf(num_list, n+1);
        
        list[n] = a > b ? a-b : a*2 ;
        return list;
    }
}