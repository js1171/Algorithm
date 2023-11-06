class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        for (int qi=0 ; qi < queries.length ; qi++) {
            for (int i=queries[qi][0] ; i <= queries[qi][1] ; i++) {
                if (i % queries[qi][2] == 0) {
                    arr[i] += 1;
                }
            }
        }
        return arr;
    }
}