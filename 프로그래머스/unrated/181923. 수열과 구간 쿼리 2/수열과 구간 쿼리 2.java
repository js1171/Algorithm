class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int rs=0, re=0, n=0, m=1000000;
        int[] a_list = new int[queries.length];
        
        for (int qi=0 ; qi < queries.length ; qi++) {
            rs= queries[qi][0];
            re=queries[qi][1];
            n= queries[qi][2];
            m = 1000000;
            
            for (int ai=rs ; ai <= re ; ai++) {
                if (arr[ai] > n && arr[ai] < m) {
                    m = arr[ai];
                }
            }
            a_list[qi] = m!=1000000 ? m : -1;
        }
        return a_list;
    }
}