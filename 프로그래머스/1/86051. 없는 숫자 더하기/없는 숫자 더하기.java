class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int[] sample = {0,1,2,3,4,5,6,7,8,9};
        
        for(int i=0 ; i < numbers.length ; i++) {
            sample[numbers[i]] = 0;
        }
        
        for (int j : sample) {
            answer += j;
        }
        return answer;
    }
}