class Solution {
    public int solution(int price) {
        int sale = 100;
        if (price >=500000 ) { sale = 80; }
        else if (price >=300000 ) { sale = 90;}
        else if (price >=100000 ) { sale = 95; }
        
        return price*sale/100;
    }
}