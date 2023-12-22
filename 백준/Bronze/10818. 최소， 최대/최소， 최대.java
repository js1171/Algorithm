import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int count = Integer.parseInt(br.readLine());
        int[] arr = new int[count];
        st = new StringTokenizer(br.readLine());

        for (int i=0 ; i < count; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        System.out.print(arr[0]);
        System.out.print(" ");
        System.out.println(arr[count-1]);
    }
}