import java.util.*;
import java.io.*;

class Solution {
    static ArrayList<Integer>[] linkArr;
    static String[] strArr;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        for (int tc = 1 ; tc <= 10 ; tc++) {
            int nodeNum = Integer.parseInt(br.readLine());
            boolean isAvailable = true;

            // 연결 정보 저장할 arr 초기화
            linkArr = new ArrayList[nodeNum + 1];
            strArr = new String[nodeNum + 1];

            for (int i = 1 ; i <= nodeNum ; i++) {
                linkArr[i] = new ArrayList<>();
            }

            for (int i = 1 ; i <= nodeNum ; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int node = Integer.parseInt(st.nextToken());
                if (st.hasMoreTokens()) {
                    strArr[node] = st.nextToken();
                }
                if (st.hasMoreTokens()) {
                    if (!strArr[node].equals("+") && !strArr[node].equals("-") && !strArr[node].equals("*") && !strArr[node].equals("/")) {
                        isAvailable = false;
                    }
                    linkArr[node].add(Integer.parseInt(st.nextToken()));
                }
                if (st.hasMoreTokens()) {
                    linkArr[node].add(Integer.parseInt(st.nextToken()));
                }
            }

            sb.append("#").append(tc).append(" ");
            if (!isAvailable) {
                sb.append(0).append("\n");
                continue;
            }
            if(dfs(1)) {
                sb.append(1).append("\n");
            } else {
                sb.append(0).append("\n");
            }
        }
        System.out.println(sb);
    }

    static boolean dfs(int node) {
        // 마지막 노드이면 숫자인지 체크
        if (linkArr[node].isEmpty() && !strArr[node].equals("+") && !strArr[node].equals("-") && !strArr[node].equals("*") && !strArr[node].equals("/")) {
            return false;
        }
        // 아니면 자식 노드로 계속 진행
        for (int i : linkArr[node]) {
            dfs(i);
        }
        return true;
    }
}