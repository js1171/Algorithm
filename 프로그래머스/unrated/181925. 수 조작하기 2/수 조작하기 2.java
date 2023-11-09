class Solution {
    public String solution(int[] numLog) {
        StringBuilder result = new StringBuilder();
        
        for (int i=1 ; i < numLog.length ; i++) {
            switch (numLog[i] - numLog[i-1]) {
                case 1 : result.append("w"); break;
                case -1 : result.append("s"); break;
                case 10 : result.append("d"); break;
                case -10 : result.append("a"); break;
            }
        }
        return result.toString();
    }
}