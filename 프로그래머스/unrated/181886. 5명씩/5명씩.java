class Solution {
    public String[] solution(String[] names) {
        String[] result = new String[names.length%5==0 ? names.length/5 : names.length/5+1];
        
        for (int i=0 ; i < names.length ; i+=5) {
            result[i/5] = names[i];
        }
        return result;
    }
}