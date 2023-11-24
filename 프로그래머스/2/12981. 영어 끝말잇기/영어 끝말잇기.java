import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n, String[] words) {
        List<String> list = new ArrayList<String>();
        char lWord = words[0].charAt(0);
        
        for (int i=0 ; i < words.length ; i++) {
            if (words[i].charAt(0) != lWord || list.contains(words[i])) {
                int[] answer = {i%n+1 ,i/n+1};
                return answer;
            }
            else {
                list.add(words[i]);
                lWord = words[i].charAt(words[i].length()-1);
            }
        }
        int[] answer = {0, 0};
        return answer;
    }
}