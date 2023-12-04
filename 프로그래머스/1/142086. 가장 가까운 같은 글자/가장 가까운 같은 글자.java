import java.util.Arrays;

class Solution {
    public int[] solution(String s) {
        int[] arr = new int[s.length()];
        Arrays.fill(arr, -1);
        int c = 1;
        for (int i=1 ; i < s.length() ; i++) {   
            for (int j=i-1 ; j >= 0 ; j--) {
                if(s.charAt(i)==s.charAt(j)) {
                    arr[c] = i - j;
                    break;
                }
            }
            c++;
        }
        return arr;
    }
}