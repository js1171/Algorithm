class Solution {
    public int[] solution(int[] num_list) {
        int[] list = new int[(num_list.length)+1];
        int n = num_list.length ;
        int a=num_list[n-1], b=num_list[n-2] ;
        
        for (int i=0 ; i<n ; i++) {
            list[i] = num_list[i];
        }
        
        if (a > b) {
            list[n] = a-b;
        } else {
            list[n] = a*2;
        }
        return list;
    }
}