import java.util.*;
import java.io.*;

class Solution {
    static int[][] arr;

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        for (int tc = 1 ; tc <= 10 ; tc++) {
            int caseN = Integer.parseInt(br.readLine());

            // arr에 입력 값 저장
            arr = new int[100][100];
            for (int i = 0 ; i < 100 ; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0 ; j < 100 ; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            // 마지막 줄에서 2인 곳의 위치 구하기
            int endIndex = 0;
            for (int i = 0 ; i < 100 ; i++) {
                if (arr[99][i] == 2) {
                    endIndex = i;
                }
            }
            // 올라가면서 시작점 구하기
            sb.append("#").append(caseN).append(" ").append(findStartIndex(99, endIndex)).append("\n");
        }
        System.out.print(sb);
    }

    static int findStartIndex(int x, int y) {
        if (x == 0) {
            return y;
        }

        // 좌, 우, 위쪽 순서로 점검하여 이동
        if (y - 1 >= 0 && arr[x][y - 1] == 1) {
            arr[x][y - 1] = 2;
            return findStartIndex(x, y - 1);
        } else if (y + 1 < 100 && arr[x][y + 1] == 1) {
            arr[x][y + 1] = 2;
            return findStartIndex(x, y + 1);
        } else {
            arr[x - 1][y] = 2;
            return findStartIndex(x - 1, y);
        }
    }
}