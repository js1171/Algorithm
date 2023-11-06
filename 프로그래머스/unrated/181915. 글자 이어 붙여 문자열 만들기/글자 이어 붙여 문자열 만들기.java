class Solution {
    public String solution(String my_string, int[] index_list) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0 ; i < index_list.length ; i++) {
            sb.append(my_string.charAt(index_list[i]));
        }
        return sb.toString();
    }
}





//다른 사람의 풀이
for (int 변수 : 리스트)로 사용이 가능한듯!!
    

class Solution {
    public String solution(String my_string, int[] index_list) {

        StringBuilder sb = new StringBuilder();

        for (int idx : index_list)
            sb.append(my_string.charAt(idx));

        return sb.toString();
    }
}
