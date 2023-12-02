import java.util.Arrays;

class Solution {
    public String[] solution(String[] str_list) {
        int index =0;
        String str = "";
        for (int i=0 ; i < str_list.length; i++) {
            if (str_list[i].equals("l")) {
                str ="l"; index=i; break;
            }
            else if (str_list[i].equals("r")) {
                str = "r"; index=i; break;
            }
        }
        if(str.equals("l")) {
            return Arrays.copyOfRange(str_list, 0, index);
        }
        else if (str.equals("r")) {
            return Arrays.copyOfRange(str_list, index+1, str_list.length);
        }
        else {
            String[] ex = {};
            return ex;
        }
    }
}