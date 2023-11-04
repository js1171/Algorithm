class Solution {
    public int solution(int[] num_list) {
        String h="", j="";
        
        for (int i=0 ; i < num_list.length ; i++) {
            if (num_list[i]%2==0) {
                j += num_list[i];
            }
            else {
                h += num_list[i];
            }
        }
        return Integer.parseInt(j) + Integer.parseInt(h);
    }
}