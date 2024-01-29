import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    // arr은 관계 확인, nodes는 입력 값 확인
    static ArrayList<Integer>[] arr;
    static int[] nodes;

    static int deleteNode, leafNode;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int nodeNum = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 배열 초기화
        arr = new ArrayList[nodeNum];
        for(int i=0 ; i<nodeNum ; i++) {
            arr[i] = new ArrayList<>();
        }

        // 자식 노드 연결
        int root=0;
        nodes = new int[nodeNum];
        for(int i=0 ; i<nodeNum ; i++) {
            int num = Integer.parseInt(st.nextToken());
            if(num==-1) {
                root=i;
                continue;
            }
            arr[num].add(i);
            nodes[i] = num;
        }

        deleteNode = Integer.parseInt(br.readLine());

        // 삭제할 노드와 루트 노드가 같으면 0 출력 후 종료
        if(deleteNode==root) {
            System.out.println(0);
            System.exit(0);
        }

        // 삭제할 노드를 관계 배열에서 제거
        arr[nodes[deleteNode]].remove(arr[nodes[deleteNode]].indexOf(deleteNode));

        DFS(root);
        System.out.println(leafNode);
    }

    public static void DFS(int node) {
        if (arr[node].isEmpty()) leafNode++;
        else {
            for (int i : arr[node]) {
                DFS(i);
            }
        }
    }
}