class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int ci=0, cj=0, i=0, j=0;
        
        for (int qi = 0 ; qi < queries.length ; qi++){
                i = queries[qi][0];
                j = queries[qi][1];
                ci = arr[i] ;
                cj = arr[j] ;
                arr[i] = cj;
                arr[j] = ci;
        }
        return arr;    
    }
}