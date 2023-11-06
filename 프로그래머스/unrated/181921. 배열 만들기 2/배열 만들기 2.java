import java.util.ArrayList;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> alist = new ArrayList<>();
        
        for (int i=l ; i <=r ; i++) {
            String ns = Integer.toString(i);
            boolean f = true;
            
            for (int ni=0 ; ni < ns.length() ; ni++) {
                char num = ns.charAt(ni);
                
                if (num != '0' && num!='5') {
                    f=false;
                    break;
                }
                
            }
            
            if (f) {
                alist.add(i);
            }
        }
        
        return alist.isEmpty() ? new int[]{-1} : alist.stream().mapToInt(Integer::intValue).toArray();
    }
}