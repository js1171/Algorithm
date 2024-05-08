import java.util.*;
import java.io.*;

class Solution {
	public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int caseN = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int tc = 1 ; tc <= caseN ; tc++) {
            int[][] arr = new int[9][9];

            // arr에 스도쿠 값 저장
            for (int i = 0 ; i < 9 ; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0 ; j < 9 ; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            // 스도쿠 유효한지 검증
            sb.append("#").append(tc).append(" ").append(isAvailable(arr) ? 1 : 0).append("\n");
        }
        System.out.print(sb);
    }

    static boolean isAvailable(int[][] arr) {
        // 가로줄 체크
        for (int i = 0 ; i < 9 ; i++) {
            int[] checkArr = new int[9];
            for (int j : arr[i]) {
                checkArr[j - 1] = 1;
            }
            for (int j : checkArr) {
                if (j == 0) {
                    return false;
                }
            }
        }
        // 세로줄 체크
        for (int i = 0 ; i < 9 ; i++) {
            int[] checkArr = new int[9];
            for (int j = 0 ; j < 9 ; j++) {
                checkArr[arr[j][i] - 1] = 1;
            }
            for (int j : checkArr) {
                if (j == 0) {
                    return false;
                }
            }
        }

        // 9칸씩 체크
        for (int i = 0 ; i < 9 ; i += 3) {
            for (int j = 0 ; j < 9 ; j += 3) {
                int a = i + 3;
                int b = j + 3;

                int[] checkArr = new int[9];
                for (int x = i ; x < a ; x++) {
                    for (int y = j; y < b; y++) {
                        checkArr[arr[x][y] - 1] = 1;
                    }
                }
                for (int k : checkArr) {
                    if (k == 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}