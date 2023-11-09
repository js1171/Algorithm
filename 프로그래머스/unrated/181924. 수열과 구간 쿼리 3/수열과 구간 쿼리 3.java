class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int ci=0, cj=0;
        
        for (int qi = 0 ; qi < queries.length ; qi++){
                ci = arr[queries[qi][0]] ;
                cj = arr[queries[qi][1]] ;
                arr[queries[qi][0]] = cj;
                arr[queries[qi][1]] = ci;
        }
        return arr;    
    }
}