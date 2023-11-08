import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        String sb = new String();
        List<Integer> list = new ArrayList<Integer>();
        
        for (int i=0 ; i < intStrs.length ; i++) {
            sb = intStrs[i];
            if (Integer.parseInt(sb.substring(s,s+l)) > k) {
                list.add(Integer.parseInt(sb.substring(s,s+l)));
            }
        }
        
        int[] result = new int[list.size()];
        for (int j=0 ; j < list.size(); j++){
            result[j] = list.get(j);
        }
        return result;
    }
}