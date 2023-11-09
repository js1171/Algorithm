class Solution {
    public int solution(int[] num_list) {
        StringBuilder j = new StringBuilder();
        StringBuilder h = new StringBuilder();
        
        for (int i=0 ; i < num_list.length ; i++) {
            if (num_list[i]%2==0) {
                j.append(num_list[i]);
            }
            else {
                h.append(num_list[i]);
            }
        }
        return Integer.parseInt(j.toString()) + Integer.parseInt(h.toString());
    }
}