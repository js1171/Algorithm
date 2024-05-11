import java.util.*;
import java.io.*;

class Solution {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int caseN = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        for (int tc = 1 ; tc <= caseN ; tc++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
            int allStudent = Integer.parseInt(st.nextToken());
            int studentNum = Integer.parseInt(st.nextToken()) - 1;
            
            // 학생들의 총점 정보 저장 (구하려는 학생의 점수 따로 저장)
            double[] arr = new double[allStudent];
            double studentScore = 0;
            for (int i = 0 ; i < allStudent ; i++) {
            	st = new StringTokenizer(br.readLine());
                arr[i] = (Integer.parseInt(st.nextToken()) * 0.35) + (Integer.parseInt(st.nextToken()) * 0.45) + (Integer.parseInt(st.nextToken()) * 0.2);
                if (i == studentNum) {
                	studentScore = arr[i];
                }
            }
            
            // 학점 구하기
            int gradeNum = allStudent / 10;
            int studentIdx = 0;
            Arrays.sort(arr);
            for (int i = allStudent - 1 ; i >= 0 ; i--) {
            	if (arr[i] == studentScore) {
                	studentIdx = i / gradeNum;
                }
            }
            String grade = ""; 
            switch (studentIdx) {
                case 9 : grade = "A+"; break;
                case 8 : grade = "A0"; break;
                case 7 : grade = "A-"; break;
                case 6 : grade = "B+"; break;
                case 5 : grade = "B0"; break;
                case 4 : grade = "B-"; break;
                case 3 : grade = "C+"; break;
                case 2 : grade = "C0"; break;
                case 1 : grade = "C-"; break;
                case 0 : grade = "D0"; break;
            }
            sb.append("#").append(tc).append(" ").append(grade).append("\n");
        }
        System.out.print(sb);
	}
}