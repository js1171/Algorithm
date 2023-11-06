class Solution {
    public int[] solution(int start_num, int end_num) {
        int num = 0;
        int[] list = new int[end_num-start_num+1];
        
        for (int i=start_num ; i<=end_num ; i++) {
                list[num] = i;
                num += 1 ;
        }
        return list;
    }
}