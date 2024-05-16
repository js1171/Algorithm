import java.util.Scanner;

class Solution {
    static int result;
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
        
        for (int tc = 1 ; tc <= 10 ; tc++) {
            int caseN = sc.nextInt();
            result = 1;
            calculate(sc.nextInt(), sc.nextInt());
            System.out.println("#" + caseN + " " + result);
        }
	}
    static void calculate(int num, int count) {
        if (count == 0) {
        	return;
        }
    	result *= num;
        calculate(num, count - 1);
    }
}