class Solution {
    public int[] solution(int n) {
        int size = (n % 2 == 0) ? n/2 : (n/2)+1;
        int[] answer = new int[size];
        for(int i = 0, odd=1; i < size; i++,odd+=2) {
            answer[i] = odd;
        }
        return answer;
    }
}