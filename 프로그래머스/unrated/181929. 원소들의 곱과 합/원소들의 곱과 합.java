class Solution {
    public int solution(int[] num_list) {
        int sum = 0, pro = 1;
        
        for (int i=0 ; i < num_list.length ; i++) {
            sum += num_list[i];
            pro *= num_list[i];
        } 
        return pro < Math.pow(sum,2) ? 1 : 0;
    }
}