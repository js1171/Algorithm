class Solution {
    public double solution(int[] numbers) {
        int sum=0;
        double count=0;
        for (int i=0 ; i < numbers.length ; i++) {
            sum += numbers[i];
            count++;
        }
        double answer = sum/count;
        return answer;
    }
}